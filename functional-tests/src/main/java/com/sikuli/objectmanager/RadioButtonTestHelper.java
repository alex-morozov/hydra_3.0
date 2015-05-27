package com.sikuli.objectmanager;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;

public class RadioButtonTestHelper extends TestHelper {
	static Screen screen = new Screen();
	public static String testType = "/inputScreens/TestHelper/RadioButtonTest/testType.PNG";
	public static String testWithThreeVariants = "/inputScreens/TestHelper/RadioButtonTest/testWithThreeVariants.PNG";
	public static String testWithFourVariants = "/inputScreens/TestHelper/RadioButtonTest/testWithFourVariants.PNG";
	public static String mark = "/inputScreens/TestHelper/RadioButtonTest/mark.PNG";
	public static String changeVariantCheck = "/inputScreens/TestHelper/RadioButtonTest/changeVariantCheck.PNG";
	
	public static void addTestThroughContextMenu() throws FindFailed {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    clickButton(AddHelper.addObjectContextMenu);
	    clickButton(AddHelper.addTest);	   
	}

	public static void changeCorrectAnswer() throws FindFailed {
		clickButton(TestHelper.answersTab);
		clickButton(newVariant);
		clickButton(mark);				
	}
	

}
