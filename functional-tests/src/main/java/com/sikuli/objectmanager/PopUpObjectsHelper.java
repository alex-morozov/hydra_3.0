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
	public static String popUpObjectText = "/inputScreens/PopUpObjectsHelper/popUpObjectText.PNG";
	public static String idLink = "/inputScreens/PopUpObjectsHelper/idLink.PNG";
	public static String idExternalLink = "/inputScreens/PopUpObjectsHelper/idExternalLink.PNG";
	public static String idPopUpArticle = "/inputScreens/PopUpObjectsHelper/idPopUpArticle.PNG";
	public static String idPopUpImage = "/inputScreens/PopUpObjectsHelper/idPopUpImage.PNG";
	public static String editPopUpArticleWindowTitle = "/inputScreens/PopUpObjectsHelper/editPopUpArticleWindowTitle.PNG";
	public static String editPopUpImageWindowTitle = "/inputScreens/PopUpObjectsHelper/editPopUpImageWindowTitle.PNG";
	public static String editLinkWindowTitle = "/inputScreens/PopUpObjectsHelper/editLinkWindowTitle.PNG";
	public static String editExternalLinkWindowTitle = "/inputScreens/PopUpObjectsHelper/editExternalLinkWindowTitle.PNG";
	public static String dublicationCheck = "/inputScreens/PopUpObjectsHelper/dublicationCheck.PNG";
	public static String relocationCheck = "/inputScreens/PopUpObjectsHelper/relocationCheck.PNG";
	public static String linkRelocationCheck = "/inputScreens/PopUpObjectsHelper/linkRelocationCheck.PNG";
	public static String linkDublicationCheck = "/inputScreens/PopUpObjectsHelper/linkDublicationCheck.PNG";
	public static String editLinkCheck = "/inputScreens/PopUpObjectsHelper/editLinkCheck.PNG";
	public static String undoAddingObjectCheck = "/inputScreens/PopUpObjectsHelper/undoAddingObjectCheck.PNG";
	public static String undoRelocationCheck = "/inputScreens/PopUpObjectsHelper/undoRelocationCheck.PNG";
	public static String urlEmptyAdress = "/inputScreens/PopUpObjectsHelper/urlEmptyAdress.PNG";
	public static String urlFilledAdress = "/inputScreens/PopUpObjectsHelper/urlFilledAdress.PNG";
	public static String urlChangedAdress = "/inputScreens/PopUpObjectsHelper/urlChangedAdress.PNG";
	public static String urlDublicationCheck = "/inputScreens/PopUpObjectsHelper/urlDublicationCheck.PNG";
	
	
	public static void addPopUpArticle(String stringStart, String stringFinish, String object) throws FindFailed, InterruptedException {
		screen.dragDrop(stringStart, stringFinish);
		AddHelper.addThroughContextMenu(object, AddHelper.addPopUpArticle);
		ObjectHelper.clickButtonInCertainArea(ArticleHelper.addImageArticle);					
	}
	
	public static void addPopUpImage(String stringStart2, String stringFinish2,	String object) throws FindFailed, InterruptedException, AWTException {
		screen.dragDrop(stringStart, stringFinish);
		AddHelper.addThroughContextMenu(object, AddHelper.addPopUpImage);
		ImageHelper.addImageFile();		
	}
	
	public static void addLink(String stringStart2, String stringFinish2, String object) throws FindFailed, InterruptedException, AWTException {
		screen.dragDrop(stringStart, stringFinish);
		AddHelper.addThroughContextMenu(object, AddHelper.addLink);
		ObjectHelper.clickButtonInCertainArea(ArticleHelper.addImageArticle);		
	}
	
	public static void addExternalLink(String stringStart2, String stringFinish2, String object) throws FindFailed, InterruptedException, AWTException {
		screen.dragDrop(stringStart, stringFinish);
		AddHelper.addThroughContextMenu(object, AddHelper.addExternalLink);
		ObjectHelper.typeFieldValue(urlEmptyAdress, "www.yandex.ru");		
	}
	
	public static void editPopUpArticle() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(popUpObjectText);
		EditHelper.editObject(idPopUpArticle, editPopUpArticleWindowTitle);							
	}		
	
	public static void editPopUpImage() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(popUpObjectText);
		EditHelper.editObject(idPopUpImage, editPopUpImageWindowTitle);							
	}
	
	public static void editLink() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(popUpObjectText);
		EditHelper.editObject(idLink, editLinkWindowTitle);							
	}
	
	public static void editExternalLink() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(popUpObjectText);
		EditHelper.editObject(idExternalLink, editExternalLinkWindowTitle);											
	}

	
	public static void changeUrlValue() throws FindFailed {
		ObjectHelper.typeFieldValue(urlFilledAdress, "www.google.com");
	}



}
