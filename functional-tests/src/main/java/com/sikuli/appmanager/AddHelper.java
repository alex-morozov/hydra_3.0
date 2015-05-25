package com.sikuli.appmanager;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import com.sikuli.objectmanager.ObjectHelper;


public class AddHelper {
	private AddHelper addHelper;	
	static Screen screen = new Screen();
	
	public static String addContextMenu = "/inputScreens/AddHelper/addContextMenu.PNG";
	public static String addObjectContextMenu = "/inputScreens/AddHelper/addObjectContextMenu.PNG";
	public static String addAudio = "/inputScreens/AddHelper/addAudio.PNG";
	public static String addImage = "/inputScreens/AddHelper/addImage.PNG";
	public static String addPopUpArticle = "/inputScreens/AddHelper/addPopUpArticle.PNG";
	public static String addPopUpImage = "/inputScreens/AddHelper/addPopUpImage.PNG";
	public static String addText = "/inputScreens/AddHelper/addText.PNG";
	public static String addTable = "/inputScreens/AddHelper/addTable.PNG";
	public static String addLink = "/inputScreens/AddHelper/addLink.PNG";
	public static String addExternalLink = "/inputScreens/AddHelper/addExternalLink.PNG";
	public static String addTest = "/inputScreens/AddHelper/addTest.PNG";
	public static String addStyleName = "/inputScreens/AddHelper/addStyleName.PNG";
	public static String addSubObjectPlusButton = "/inputScreens/AddHelper/addSubObjectPlusButton.PNG";
	public static String addFileButton = "/inputScreens/AddHelper/addFileButton.PNG";
	public static String changedAddFileButton = "/inputScreens/AddHelper/changedAddFileButton.PNG";
	public static String addSubObjectRectangleButton = "/inputScreens/AddHelper/addSubObjectRectangleButton.PNG";
		
	public static void addThroughToolbar(String object) throws FindFailed, InterruptedException{
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		ObjectHelper.clickButton(object);				
	}
	
	public static void addThroughContextMenu(String object, String objectToAdd) throws FindFailed, InterruptedException{
		ArticleHelper.openContextMenu(object);		
	    ObjectHelper.clickButton(addObjectContextMenu);
	    ObjectHelper.clickButton(objectToAdd);				
	}
	
	public AddHelper getAddHelper() {
				return addHelper;
	}

}
