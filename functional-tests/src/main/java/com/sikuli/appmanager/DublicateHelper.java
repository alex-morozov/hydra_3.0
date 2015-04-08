package com.sikuli.appmanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class DublicateHelper {
static Screen screen = new Screen();
	
	public static void dublicateObject (String object, String objectID, String finalPoint) throws FindFailed, AWTException{
		screen.hover(object);
		screen.wait(objectID);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);			
		screen.dragDrop(objectID, finalPoint);
		robot.keyRelease(KeyEvent.VK_CONTROL);	
		}
}
