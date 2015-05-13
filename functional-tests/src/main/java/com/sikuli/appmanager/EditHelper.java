package com.sikuli.appmanager;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import com.sikuli.objectmanager.ObjectHelper;

public class EditHelper {
	private EditHelper editHelper;	
	public static Screen screen = new Screen();
	
	public static String editSubObjectPencilButton = "/inputScreens/EditHelper/editSubObjectPencilButton.PNG";
	public static String editSubObjectRectangleButton = "/inputScreens/EditHelper/editSubObjectRectangleButton.PNG";
	public static String editObjectButton = "/inputScreens/EditHelper/editObjectButton.PNG";
	
	
public EditHelper getEditHelper() {
		return editHelper;
	}

	public void setEditHelper(EditHelper editHelper) {
		this.editHelper = editHelper;
	}

	public static void editObject(String object, String window) throws FindFailed, AWTException	{
	ObjectHelper.openContextMenu(object);
	ObjectHelper.clickButton(EditHelper.editObjectButton);	
	screen.wait(window);
	}

	public static void openBookAndEditObject(String article, String object, String window) throws FindFailed, AWTException, InterruptedException	{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(article);
		EditHelper.editObject(object, window);		
		}
	
	public static void cancelObjectHighlighting  (){
		screen.rightClick();	
	}



}
