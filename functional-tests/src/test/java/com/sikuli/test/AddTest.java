package com.sikuli.test;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TestHelper;

public class AddTest extends TestBase{		
	@Parameters({ "sikuli" })	
	@Test
		public void addFreeAnswerTestThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addFreeAnswerTestThroughToolbar();	
		screen.mouseMove(TestHelper.freeAnswerTestTytle);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTestWithTwoVariantsThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addTestWithVariantsThroughToolbar(TestHelper.reorderingTestType, TestHelper.twoVariants);	
		screen.mouseMove(TestHelper.reorderingTestWithTwoVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addRadioButtonTestWithThreeVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addRadioButtonTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.radioButtonTestWithThreeVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addCheckBoxTestWithFourVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addCheckBoxTestThroughContextMenu("4");	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.checkBoxTestWithFourVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addFreeAnswerTestThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addFreeAnswerTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.freeAnswerTestTytle);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addReorderingTestWithFiveVariantsThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addReorderingTestThroughContextMenu("5");	
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.reorderingTestWithFiveVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddTestThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addRadioButtonTestThroughContextMenu();	
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(ArticleHelper.emptyArticle);	    
	}	

}
