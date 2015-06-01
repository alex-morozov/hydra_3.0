package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;

public class CheckBoxTestHelper extends TestHelper{

	public static String checkBoxTestType = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestType.PNG";
	public static String checkBoxTestWithFourVariants = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestWithFourVariants.PNG";
	public static String checkBoxTestWithTwoVariants = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestWithTwoVariants.PNG";
	public static String moveAllVariantsToLeft = "/inputScreens/TestHelper/CheckBoxTest/moveAllVariantsToLeft.PNG";
	public static String moveAllVariantsToRight = "/inputScreens/TestHelper/CheckBoxTest/moveAllVariantsToRight.PNG";
	public static String moveVariantToRight = "/inputScreens/TestHelper/CheckBoxTest/moveVariantToRight.PNG";
	public static String moveVariantToLeft = "/inputScreens/TestHelper/CheckBoxTest/moveVariantToLeft.PNG";	
	public static String addCorrectVariantCheck = "/inputScreens/TestHelper/CheckBoxTest/addCorrectVariantCheck.PNG";	
	
	public static void addCheckBoxTestThroughContextMenu(String value) throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    clickButton(AddHelper.addObjectContextMenu);
	    clickButton(AddHelper.addTest);
	    clickButton(checkBoxTestType);	    
	    TestHelper.changeNumberOfVariants(value); 
	}
	
	public static void changeCorrectAnswer() throws FindFailed {
		clickButton(TestHelper.answersTab);
		clickButton(newVariant);
		clickButton(moveVariantToRight);
	}

}
