package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.EditHelper;

public class PopUpObjectsHelper {
	static Screen screen = new Screen();
	
	public static String highlightedText = "/inputScreens/PopUpObjectsHelper/highligtedText.PNG";
	public static String stringFinish = "/inputScreens/PopUpObjectsHelper/stringFinish.PNG";
	public static String stringStart = "/inputScreens/PopUpObjectsHelper/stringStart.PNG";
	public static String popUpArticleText = "/inputScreens/PopUpObjectsHelper/popUpArticleText.PNG";
	public static String idPopUpArticle = "/inputScreens/PopUpObjectsHelper/idPopUpArticle.PNG";
	public static String editPopUpArticleWindowTitle = "/inputScreens/PopUpObjectsHelper/editPopUpArticleWindowTitle.PNG";
	
	public static void addPopUpArticle(String stringStart, String stringFinish, String object) throws FindFailed, InterruptedException {
		screen.dragDrop(stringStart, stringFinish);
		AddHelper.addThroughContextMenu(object, AddHelper.addPopUpArticle);
		ObjectHelper.clickButtonInCertainArea(ArticleHelper.addImageArticle);					
	}
	
	public static void editPopUpArticle() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(popUpArticleText);
		EditHelper.editObject(idPopUpArticle, editPopUpArticleWindowTitle);							
	}

}