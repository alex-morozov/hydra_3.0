package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.EditHelper;

public class TestHelper extends ObjectHelper{
	static Screen screen = new Screen();
	
	public static String addTestToolbar = "/inputScreens/TestHelper/addTestToolbar.PNG";
	public static String answersTab = "/inputScreens/TestHelper/answersTab.PNG";
	public static String idTest = "/inputScreens/TestHelper/idTest.PNG";
	public static String twoVariants = "/inputScreens/TestHelper/twoVariants.PNG";
	public static String threeVariants = "/inputScreens/TestHelper/threeVariants.PNG";
	public static String fourVariants = "/inputScreens/TestHelper/fourVariants.PNG";
	public static String fiveVariants = "/inputScreens/TestHelper/fiveVariants.PNG";
	public static String otherVariantsQuantity = "/inputScreens/TestHelper/otherVariantsQuantity.PNG";
	public static String basicVariantsQuantity = "/inputScreens/TestHelper/basicVariantsQuantity.PNG";
	public static String editTestWindowTitle = "/inputScreens/TestHelper/editTestWindowTitle.PNG";
	public static String variantsField = "/inputScreens/TestHelper/variantsField.PNG";

	public static String newVariant = "/inputScreens/TestHelper/RadioButtonTest/newVariant.PNG";
	
	public static void addTestWithVariantsThroughToolbar(String testType, String variant) throws FindFailed {
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		clickButton(addTestToolbar);
		screen.mouseMove(testType);
		clickButton(variant);
	}	
	
	public static void changeNumberOfVariants(String value) throws FindFailed, AWTException {
		changeFieldValue(variantsField, value);
	}	
	
	public static void editTest(String test) throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(test);
		EditHelper.editObject(idTest, editTestWindowTitle);							
	}

	

}
