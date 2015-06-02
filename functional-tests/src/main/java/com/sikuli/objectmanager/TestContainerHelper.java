package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.EditHelper;


public class TestContainerHelper extends ObjectHelper{
	
	public static String id = "/inputScreens/TestContainerHelper/id.PNG";
	public static String addTestContainerWindowTitle = "/inputScreens/TestContainerHelper/addTestContainerWindowTitle.PNG";
	public static String editTestContainerWindowTitle = "/inputScreens/TestContainerHelper/editTestContainerWindowTitle.PNG";	
	public static String twoTestsInContainer = "/inputScreens/TestContainerHelper/twoTestsInContainer.PNG";
	public static String oneTestInContainer = "/inputScreens/TestContainerHelper/oneTestInContainer.PNG";
	public static String freeAnswerTestInContainer = "/inputScreens/TestContainerHelper/freeAnswerTestInContainer.PNG";
	
	public static void addTestContainer() throws FindFailed, InterruptedException {
		screen.dragDrop(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish);
		AddHelper.addThroughContextMenu(PopUpObjectsHelper.highlightedText, AddHelper.addTestContainer);
		screen.wait(addTestContainerWindowTitle);
	}
	
	public static void addTestToContainer(String testArticle) throws FindFailed {
		clickButton(AddHelper.addSubObjectRectangleButton);	
		clickButtonInCertainArea(testArticle);
		confirm();
	}
	
	public static void editTestInContainer(String testArticle) throws FindFailed {
		editSubObject();
		clickButtonInCertainArea(testArticle);
		confirm();
	}
	
	public static void editTestContainer() throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(PopUpObjectsHelper.popUpObjectText);
		EditHelper.editObject(id, editTestContainerWindowTitle);							
	}		

}
