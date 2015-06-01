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

public class EditTest extends TestBase {
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		TestHelper.editTest(CheckBoxTestHelper.checkBoxTestWithFourVariants);
		ObjectHelper.cancel();		
		ObjectHelper.finalCheck(CheckBoxTestHelper.checkBoxTestWithFourVariants);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsRadioButtonTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.radioButtonTestArticle);
		TestHelper.editTest(RadioButtonTestHelper.testWithThreeVariants);
		TestHelper.changeNumberOfVariants("4");
		ObjectHelper.confirm();
		screen.mouseMove(RadioButtonTestHelper.testWithFourVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}

	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsCheckBoxTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		TestHelper.editTest(CheckBoxTestHelper.checkBoxTestWithFourVariants);
		TestHelper.changeNumberOfVariants("2");
		ObjectHelper.confirm();
		screen.mouseMove(CheckBoxTestHelper.checkBoxTestWithTwoVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeNumberOfVariantsReorderingTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.reorderingTestArticle);
		TestHelper.editTest(ReorderingTestHelper.reorderingTestWithFiveVariants);
		TestHelper.changeNumberOfVariants("3");
		ObjectHelper.confirm();
		screen.mouseMove(ReorderingTestHelper.reorderingTestWithThreeVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editCorrectAnswerFreeAnswerTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.freeAnswerTestArticle);
		TestHelper.editTest(FreeAnswerTestHelper.freeAnswerTestTytle);
		FreeAnswerTestHelper.addAnswer();
		ObjectHelper.confirm();
		TestHelper.editTest(FreeAnswerTestHelper.freeAnswerTestTytle);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(FreeAnswerTestHelper.addVariantFreeAnswerTestCheck);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void deletetAnswerFreeAnswerTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.freeAnswerTestArticle);
		TestHelper.editTest(FreeAnswerTestHelper.freeAnswerTestTytle);
		FreeAnswerTestHelper.deleteAnswer();
		ObjectHelper.confirm();
		TestHelper.editTest(FreeAnswerTestHelper.freeAnswerTestTytle);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(FreeAnswerTestHelper.deleteVariantFreeAnswerTestCheck);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeCorrectAnswerRadioButtonTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.radioButtonTestArticle);
		TestHelper.editTest(RadioButtonTestHelper.testWithThreeVariants);
		RadioButtonTestHelper.changeCorrectAnswer();
		ObjectHelper.confirm();		
		ObjectHelper.cancelHighlighting();
		TestHelper.editTest(RadioButtonTestHelper.testWithThreeVariants);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(RadioButtonTestHelper.changeVariantCheck);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeCorrectAnswerCheckBoxTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		TestHelper.editTest(CheckBoxTestHelper.checkBoxTestWithFourVariants);
		CheckBoxTestHelper.changeCorrectAnswer();
		ObjectHelper.confirm();		
		ObjectHelper.cancelHighlighting();
		TestHelper.editTest(CheckBoxTestHelper.checkBoxTestWithFourVariants);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(CheckBoxTestHelper.addCorrectVariantCheck);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeCorrectAnswerReorderingTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.reorderingTestArticle);
		TestHelper.editTest(ReorderingTestHelper.reorderingTestWithFiveVariants);
		ReorderingTestHelper.changeCorrectOrder();
		ObjectHelper.confirm();		
		ObjectHelper.cancelHighlighting();
		TestHelper.editTest(ReorderingTestHelper.reorderingTestWithFiveVariants);
		ObjectHelper.clickButton(TestHelper.answersTab);
		ObjectHelper.finalCheck(ReorderingTestHelper.changeOrderCheck);	    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeVariantText(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);		
		TestHelper.changeVariantText();	    
		ObjectHelper.finalCheck(TestHelper.changedVariantText);	  
	}
	
	

}
