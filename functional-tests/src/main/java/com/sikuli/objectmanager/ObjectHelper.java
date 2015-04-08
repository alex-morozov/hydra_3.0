package com.sikuli.objectmanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.StartHydra;

public class ObjectHelper {
	private ObjectHelper objectHelper;
	
	public static Screen screen = new Screen();
	
	public static String ok = "/inputScreens/ObjectHelper/OK.PNG";
	public static String cancel = "/inputScreens/ObjectHelper/cancel.PNG";
	public static String styleItalic = "/inputScreens/ObjectHelper/styleItalic.PNG";
	public static String chooseData="/inputScreens/Common_folder/ChooseData.PNG";
	
	public static void clickButton(String button) throws FindFailed	{
	screen.wait(button);
	screen.click(button);
	}
	
	public static void clickButtonInCertainArea(String button) throws FindFailed	{
		App.focusedWindow().highlight(1); 
		App.focusedWindow().click(button); 	
		}
	
	public static void findObject(String object) throws FindFailed	{
		screen.wait(object);			
		}
	
	public static void finalCheck(String object) throws FindFailed	{
		Pattern check = new Pattern (object);
		check.similar((float) 1.00);		
		}
	
	public static void changeFieldValue(String field,String value) throws FindFailed, AWTException	{
		ObjectHelper.clickButton(field);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		screen.paste(value);
	}
	

	public static void openFile (String fileAdress, String fileImage) throws FindFailed, InterruptedException, AWTException{
		Robot robot = new Robot();		
		screen.wait(chooseData);
		screen.paste(chooseData, fileAdress);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER); 	
		
		Pattern openBook = new Pattern(fileImage);
		screen.wait(openBook);
		screen.click(openBook);		
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);	
		
		}

	public ObjectHelper getObjectHelper() {
		return objectHelper;
	}

}
