package com.sikuli.appmanager;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.objectmanager.ObjectHelper;

public class RelocateHelper {
	static Screen screen = new Screen();
	
	public static void relocateObject (String object, String objectID, String finalPoint) throws FindFailed, AWTException{
		screen.hover(object);
		screen.wait(objectID);
		screen.dragDrop(objectID, finalPoint);
		}
	

}
