package com.sikuli.appmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class RelocateHelper {
	static Screen screen = new Screen();
	
	
	public static void relocateObject(String object, String objectID, String finalPoint) throws FindFailed, AWTException{
		screen.hover(object);
		screen.wait(objectID);
		screen.dragDrop(objectID, finalPoint);
		}
	
	public static void relocateText(String stringStart, String stringFinish, String object, String finalPoint) throws FindFailed, AWTException{		
		screen.dragDrop(stringStart, stringFinish);
		screen.dragDrop(object, finalPoint);
		}
	

}
