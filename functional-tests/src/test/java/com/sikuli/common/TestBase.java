package com.sikuli.common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.imageio.ImageIO;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;
import com.sikuli.appmanager.StartHydra;



public class TestBase extends TestListenerAdapter {
	public StartHydra app;
	protected static Screen screen = new Screen();
	String failureScreensFolder = "\\test-output\\failureScreens\\";
		
	@Parameters({"sikuli"})
	@BeforeMethod(alwaysRun = true)
	public void setUp(String sikuli) throws Exception {
		app = StartHydra.getInstance(sikuli);
		Settings.MinSimilarity = 0.96; 	
		Settings.MoveMouseDelay = 0;
			}

			
	@AfterMethod(alwaysRun = true)	
	public void tearDown(ITestResult result) throws IOException {
		if (!result.isSuccess()) {
			String failureImageFileName = "failureScreen.jpg";
			File file = new File("");
			Reporter.setCurrentTestResult(result);
			Reporter.log(file.getAbsolutePath());
			
			
			new File(file.getAbsolutePath()
					 + failureScreensFolder).mkdir();
			
			String packageFolder = getClass().getPackage().getName();
			 new File(file.getAbsolutePath()
					 + failureScreensFolder
					  + packageFolder).mkdir();
						
			String classFolder = getClass().getSimpleName();			
			 new File(file.getAbsolutePath()
					 + failureScreensFolder
					  + packageFolder
					   + "\\" + classFolder).mkdir();
			 
			 String methodFolder = result.getMethod().getMethodName();
			  new File(file.getAbsolutePath()
					  + failureScreensFolder
					   + packageFolder
					    + "\\"  + classFolder
					     + "\\" + methodFolder).mkdir();
			try {
				BufferedImage image = new Robot()
						.createScreenCapture(new Rectangle(Toolkit
								.getDefaultToolkit().getScreenSize()));
				ImageIO.write(image, "jpg", new File(file.getAbsolutePath()
						+ failureScreensFolder 
						  + packageFolder
						   + "\\" + classFolder
						    + "\\" + methodFolder
						     + "\\" + failureImageFileName));
				System.out.println("Test failed - see screenshot "
						+ failureImageFileName + " in "
						 + file.getAbsolutePath() + failureScreensFolder
						  + packageFolder
						   + "\\" + classFolder
						    + "\\" + methodFolder
						     + "\\" + failureImageFileName);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	 @AfterMethod(alwaysRun = true)
         public static void zKillProcess() throws InterruptedException, IOException {
		 Runtime.getRuntime().exec("TASKKILL /F /IM Hydra_Application.exe");
			Thread.sleep(1000);			 
		}
	 
	 /*//насколько я понял, копировать можно только через абсолютные пути, что не очень изящно
	 @AfterSuite
	 public void copyLog() throws  IOException {
		 File FROM = new File("\\test-output\\index.html");
		 File TO = new File(failureScreensFolder + "\\index.html");		    
		    Files.copy(FROM, TO);
		  }
		 		
		 		 */
		}
	 
	 
	

