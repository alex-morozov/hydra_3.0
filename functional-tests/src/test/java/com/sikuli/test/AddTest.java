package com.sikuli.test;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.CheckBoxTestHelper;
import com.sikuli.objectmanager.FreeAnswerTestHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.RadioButtonTestHelper;
import com.sikuli.objectmanager.ReorderingTestHelper;
import com.sikuli.objectmanager.TestHelper;

public class AddTest extends TestBase{		
	@Parameters({ "sikuli" })	
	@Test
		public void addFreeAnswerTestThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		FreeAnswerTestHelper.addFreeAnswerTestThroughToolbar();	
		screen.mouseMove(FreeAnswerTestHelper.freeAnswerTestTytle);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTestWithTwoVariantsThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		TestHelper.addTestWithVariantsThroughToolbar(ReorderingTestHelper.reorderingTestType, TestHelper.twoVariants);	
		screen.mouseMove(ReorderingTestHelper.reorderingTestWithTwoVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addRadioButtonTestWithThreeVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		RadioButtonTestHelper.addTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(RadioButtonTestHelper.testWithThreeVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addCheckBoxTestWithFourVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		CheckBoxTestHelper.addCheckBoxTestThroughContextMenu("4");	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(CheckBoxTestHelper.checkBoxTestWithFourVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addFreeAnswerTestThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		FreeAnswerTestHelper.addFreeAnswerTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(FreeAnswerTestHelper.freeAnswerTestTytle);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addReorderingTestWithFiveVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ReorderingTestHelper.addReorderingTestThroughContextMenu("5");	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(ReorderingTestHelper.reorderingTestWithFiveVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddTestThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		RadioButtonTestHelper.addTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(ArticleHelper.empty);	    
	}	

}
