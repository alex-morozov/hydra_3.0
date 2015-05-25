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

public class EditTest extends TestBase {
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		TestHelper.editTest(TestHelper.checkBoxTestWithFourVariants);
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(TestHelper.checkBoxTestWithFourVariants);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsRadioButtonTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.radioButtonTestArticle);
		TestHelper.editTest(TestHelper.radioButtonTestWithThreeVariants);
		TestHelper.changeNumberOfVariants("4");
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.radioButtonTestWithFourVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsCheckBoxTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		TestHelper.editTest(TestHelper.checkBoxTestWithFourVariants);
		TestHelper.changeNumberOfVariants("2");
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.checkBoxTestWithTwoVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsReorderingTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.reorderingTestArticle);
		TestHelper.editTest(TestHelper.reorderingTestWithFiveVariants);
		TestHelper.changeNumberOfVariants("3");
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(TestHelper.reorderingTestWithThreeVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addCorrectAnswerFreeAnswerTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.freeAnswerTestArticle);
		TestHelper.editTest(TestHelper.freeAnswerTestTytle);
		TestHelper.addAnswer();
		ObjectHelper.clickButton(ObjectHelper.ok);
		TestHelper.editTest(TestHelper.freeAnswerTestTytle);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(TestHelper.addVariantFreeAnswerTestCheck);	    
	}

}
