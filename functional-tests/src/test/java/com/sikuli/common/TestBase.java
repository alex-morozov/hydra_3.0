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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.sikuli.appmanager.StartHydra;



public class TestBase extends TestListenerAdapter {
	public StartHydra app;
	protected static Screen screen = new Screen();
		
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
			String failureImageFileName = result.getMethod().getMethodName()
					+ ".jpg";
			File file = new File("");
			Reporter.setCurrentTestResult(result);
			Reporter.log(file.getAbsolutePath());
			if (file.delete());
			try {
				BufferedImage image = new Robot()
						.createScreenCapture(new Rectangle(Toolkit
								.getDefaultToolkit().getScreenSize()));
				ImageIO.write(image, "jpg", new File(file.getAbsolutePath()
						+ "\\failureScreens\\" + failureImageFileName));
				System.out.println("Test failed - see screenshot "
						+ failureImageFileName + " in "
						+ file.getAbsolutePath() + "\\failureScreens\\");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	 @AfterMethod(alwaysRun = true)
         public static void toKillProcess() throws InterruptedException, IOException {
		 Runtime.getRuntime().exec("TASKKILL /F /IM Hydra_Application.exe");
			Thread.sleep(1000);			 
		}
	
}
