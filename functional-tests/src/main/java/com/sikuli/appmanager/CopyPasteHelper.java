package com.sikuli.appmanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import com.sikuli.objectmanager.ObjectHelper;

public class CopyPasteHelper {
	
private CopyPasteHelper copePasteHelper;
static Screen screen = new Screen();

public static String copyObjectButton = "/inputScreens/CopyPasteHelper/copyObjectButton.PNG";
public static String pasteAstext = "/inputScreens/CopyPasteHelper/pasteAstext.PNG";

public static void copyPasteObject (String object) throws FindFailed, AWTException{
	ObjectHelper.findObject(object);
	screen.mouseMove(object);
	screen.rightClick();
	ObjectHelper.clickButton(copyObjectButton);	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	}

public static void copyPasteFormattedText (String stringStart, String stringFinish,String finalPoint) throws FindFailed, AWTException{
	screen.dragDrop(stringStart, stringFinish);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);	
	ObjectHelper.clickButton(finalPoint);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	}

public static void copyPasteNonFormattedText(String stringStart, String stringFinish, String finalPoint) throws FindFailed, AWTException {
	screen.dragDrop(stringStart, stringFinish);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	ObjectHelper.clickButton(finalPoint);
	ObjectHelper.openContextMenu(finalPoint);
	ObjectHelper.clickButton(CopyPasteHelper.pasteAstext);	
}

public CopyPasteHelper getCopePasteHelper() {
	return copePasteHelper;
}

public void setCopePasteHelper(CopyPasteHelper copePasteHelper) {
	this.copePasteHelper = copePasteHelper;
}



}
