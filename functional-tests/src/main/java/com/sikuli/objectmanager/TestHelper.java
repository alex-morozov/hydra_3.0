package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.EditHelper;

public class TestHelper {
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
	
	public static String checkBoxTestType = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestType.PNG";
	public static String checkBoxTestWithFourVariants = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestWithFourVariants.PNG";
	public static String checkBoxTestWithTwoVariants = "/inputScreens/TestHelper/CheckBoxTest/checkBoxTestWithTwoVariants.PNG";
	
	public static String radioButtonTestType = "/inputScreens/TestHelper/RadioButtonTest/radioButtonTestType.PNG";
	public static String radioButtonTestWithThreeVariants = "/inputScreens/TestHelper/RadioButtonTest/radioButtonTestWithThreeVariants.PNG";
	public static String radioButtonTestWithFourVariants = "/inputScreens/TestHelper/RadioButtonTest/radioButtonTestWithFourVariants.PNG";
	
	public static String basicAnswer = "/inputScreens/TestHelper/FreeAnswerTest/basicAnswer.PNG";
	public static String correctAnswerField = "/inputScreens/TestHelper/FreeAnswerTest/correctAnswerField.PNG";
	public static String freeAnswerTestType = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswerTestType.PNG";
	public static String freeAnswer2 = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswer2.PNG";
	public static String freeAnswerTestTytle = "/inputScreens/TestHelper/FreeAnswerTest/freeAnswerTestTytle.PNG";	
	public static String deleteVariantFreeAnswerTestCheck = "/inputScreens/TestHelper/FreeAnswerTest/deleteVariantFreeAnswerTestCheck.PNG";	
	public static String addVariantFreeAnswerTestCheck = "/inputScreens/TestHelper/FreeAnswerTest/addVariantFreeAnswerTestCheck.PNG";	
	
	public static String reorderingTestType = "/inputScreens/TestHelper/ReorderingTest/reorderingTestType.PNG";
	public static String reordering2 = "/inputScreens/TestHelper/ReorderingTest/reordering2.PNG";
	public static String reorderingTestWithTwoVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithTwoVariants.PNG";
	public static String reorderingTestWithThreeVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithThreeVariants.PNG";
	public static String reorderingTestWithFiveVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithFiveVariants.PNG";
	

	public static void addTestWithVariantsThroughToolbar(String testType, String variant) throws FindFailed {
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		ObjectHelper.clickButton(addTestToolbar);
		screen.mouseMove(testType);
		ObjectHelper.clickButton(variant);
	}	
	
	public static void addFreeAnswerTestThroughToolbar() throws FindFailed {
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		ObjectHelper.clickButton(addTestToolbar);		
		ObjectHelper.clickButton(freeAnswerTestType);
	}
	
	public static void addRadioButtonTestThroughContextMenu() throws FindFailed {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    ObjectHelper.clickButton(AddHelper.addObjectContextMenu);
	    ObjectHelper.clickButton(AddHelper.addTest);	   
	}	
	
	public static void addCheckBoxTestThroughContextMenu(String value) throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    ObjectHelper.clickButton(AddHelper.addObjectContextMenu);
	    ObjectHelper.clickButton(AddHelper.addTest);
	    ObjectHelper.clickButton(checkBoxTestType);	    
	    changeNumberOfVariants(value); 
	}

	public static void changeNumberOfVariants(String value) throws FindFailed, AWTException {
		ObjectHelper.changeFieldValue(variantsField, value);
	}	
	
	public static void addFreeAnswerTestThroughContextMenu() throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    ObjectHelper.clickButton(AddHelper.addObjectContextMenu);
	    ObjectHelper.clickButton(AddHelper.addTest);
	    ObjectHelper.clickButton(freeAnswer2);	
	}	
	
	public static void addReorderingTestThroughContextMenu(String value) throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    ObjectHelper.clickButton(AddHelper.addObjectContextMenu);
	    ObjectHelper.clickButton(AddHelper.addTest);
	    ObjectHelper.clickButton(reordering2);	    
	    changeNumberOfVariants(value); 
	}	
	
	public static void editTest(String test) throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(test);
		EditHelper.editObject(idTest, editTestWindowTitle);							
	}

	public static void addAnswer() throws FindFailed {
		ObjectHelper.clickButton(answersTab);
		ObjectHelper.typeFieldValue(correctAnswerField, "test");
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);
	}

}
