package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;

public class FreeAnswerTestHelper extends TestHelper{

	public static String basicAnswer = "/inputScreens/TestHelper/FreeAnswerTest/basicAnswer.PNG";
	public static String correctAnswerField = "/inputScreens/TestHelper/FreeAnswerTest/correctAnswerField.PNG";
	public static String freeAnswerTestType = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswerTestType.PNG";
	public static String freeAnswer2 = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswer2.PNG";
	public static String freeAnswerTestTytle = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswerTestTytle.PNG";
	public static String deleteVariantFreeAnswerTestCheck = "/inputScreens/TestHelper/FreeAnswerTest/deleteVariantFreeAnswerTestCheck.PNG";
	public static String addVariantFreeAnswerTestCheck = "/inputScreens/TestHelper/FreeAnswerTest/addVariantFreeAnswerTestCheck.PNG";
	public static void addFreeAnswerTestThroughToolbar() throws FindFailed {
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		clickButton(TestHelper.addTestToolbar);		
		clickButton(freeAnswerTestType);
	}
	public static void addFreeAnswerTestThroughContextMenu() throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    clickButton(AddHelper.addObjectContextMenu);
	    clickButton(AddHelper.addTest);
	    clickButton(freeAnswer2);	
	}
	public static void addAnswer() throws FindFailed {
		clickButton(TestHelper.answersTab);
		typeFieldValue(correctAnswerField, "test");
		clickButton(AddHelper.addSubObjectRectangleButton);
	}
	public static void deleteAnswer() throws FindFailed {
		clickButton(TestHelper.answersTab);
		clickButton(basicAnswer);
		clickButton(DeleteHelper.deleteSubObjectRectangleButton);
	}

}
