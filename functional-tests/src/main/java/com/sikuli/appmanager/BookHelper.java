package com.sikuli.appmanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sikuli.objectmanager.ObjectHelper;


public class BookHelper {
	private BookHelper bookHelper;
	static Screen screen = new Screen();
	public static String maximize="/inputScreens/Common_folder/Maximize.PNG";
	

	
public static void openBook (String bookAdress, String bookImage) throws FindFailed, InterruptedException, AWTException{
	ObjectHelper.openFile(bookAdress, bookImage);	
	screen.wait(maximize);
	screen.click(maximize);	
	}


public BookHelper getBookHelper() {
		return bookHelper;
}


}
