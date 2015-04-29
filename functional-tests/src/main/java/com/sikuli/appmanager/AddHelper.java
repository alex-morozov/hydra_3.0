package com.sikuli.appmanager;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class AddHelper {
	private AddHelper addHelper;	
	static Screen screen = new Screen();
	
	public static String addContextMenu = "/inputScreens/AddHelper/addContextMenu.PNG";
	public static String addAudio = "/inputScreens/AddHelper/addAudio.PNG";
	public static String addImage = "/inputScreens/AddHelper/addImage.PNG";
	public static String addPopUpArticle = "/inputScreens/AddHelper/addPopUpArticle.PNG";
	public static String addPopUpImage = "/inputScreens/AddHelper/addPopUpImage.PNG";
	public static String addText = "/inputScreens/AddHelper/addText.PNG";
	public static String addStyleName = "/inputScreens/AddHelper/addStyleName.PNG";
	public static String addSubObjectPlusButton = "/inputScreens/AddHelper/addSubObjectPlusButton.PNG";
	public static String addFileButton = "/inputScreens/AddHelper/addFileButton.PNG";
	public static String addSubObjectRectangleButton = "/inputScreens/AddHelper/addSubObjectRectangleButton.PNG";
		
	public static void addThroughToolbar(String object) throws FindFailed, InterruptedException{
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		Pattern objectToolbar = new Pattern (object);
		screen.wait(objectToolbar);
		screen.click(objectToolbar);		
	}
	
	public static void addThroughContextMenu(String object, String objectToAdd) throws FindFailed, InterruptedException{
		ArticleHelper.openContextMenu(object);
		
		Pattern addObjectButton = new Pattern (AddHelper.addContextMenu);
		screen.wait(addObjectButton);
		screen.click(addObjectButton);
		
		Pattern addSpecificObject = new Pattern (objectToAdd);
		screen.wait(addSpecificObject);
		screen.click(addSpecificObject);		
	}
	
	public AddHelper getAddHelper() {
				return addHelper;
	}

}
