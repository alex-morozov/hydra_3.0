package com.sikuli.appmanager;

import java.awt.AWTException;
import java.io.IOException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class StartHydra {
	protected static final Integer waitTime = 30;
	protected static StartHydra app;
	public static Process p;
	public static String File = "/inputScreens/Common_folder/File.PNG";
	
	public static  StartHydra getInstance(String sikuli)
			throws Exception, IOException, AWTException, FindFailed  {
		app=null;
		if (app == null) {
			//пока не удалось зашить приложение в проект и обращаться по абсолютным путям. Соответственно, приложение должны лежать именно в этой директории
			p  = Runtime.getRuntime().exec("C:\\Users\\alexey_morozov\\Downloads\\Hydra\\Hydra_Application.exe");			
			Screen screen = new Screen();							
			Pattern openFile = new Pattern(File);
			openFile.similar((float)0.99);
			screen.wait(openFile);
			screen.click(openFile, 0);	
			}				
			return app;
		}
	
	
	
	}



	

