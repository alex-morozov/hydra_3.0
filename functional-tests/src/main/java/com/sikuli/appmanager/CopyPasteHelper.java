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

public static void copyPasteObject (String object) throws FindFailed, AWTException{
	ObjectHelper.findObject(object);
	screen.mouseMove(object);
	screen.mouseDown(Button.RIGHT);
	screen.mouseUp(Button.RIGHT);
	ObjectHelper.clickButton(copyObjectButton);	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	}



public CopyPasteHelper getCopePasteHelper() {
	return copePasteHelper;
}

public void setCopePasteHelper(CopyPasteHelper copePasteHelper) {
	this.copePasteHelper = copePasteHelper;
}

}
