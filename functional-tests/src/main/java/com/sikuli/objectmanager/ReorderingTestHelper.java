package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;

public class ReorderingTestHelper extends TestHelper{

	public static String reorderingTestType = "/inputScreens/TestHelper/ReorderingTest/reorderingTestType.PNG";
	public static String reordering2 = "/inputScreens/TestHelper/ReorderingTest/reordering2.PNG";
	public static String reorderingTestWithTwoVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithTwoVariants.PNG";
	public static String reorderingTestWithThreeVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithThreeVariants.PNG";
	public static String reorderingTestWithFiveVariants = "/inputScreens/TestHelper/ReorderingTest/reorderingTestWithFiveVariants.PNG";
	public static String changeOrderCheck = "/inputScreens/TestHelper/ReorderingTest/changeOrderCheck.PNG";	
	
	public static void addReorderingTestThroughContextMenu(String value) throws FindFailed, AWTException {
		ArticleHelper.openContextMenu(ArticleHelper.emptyArticle);		
	    clickButton(AddHelper.addObjectContextMenu);
	    clickButton(AddHelper.addTest);
	    clickButton(reordering2);	    
	    changeNumberOfVariants(value); 
	}
	
	public static void changeCorrectOrder() throws FindFailed {
		clickButton(TestHelper.answersTab);
		clickButton(newVariant);
		clickButton(ObjectHelper.down);
	}

}
