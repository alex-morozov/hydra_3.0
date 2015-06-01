package com.sikuli.test;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.CheckBoxTestHelper;
import com.sikuli.objectmanager.FreeAnswerTestHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.RadioButtonTestHelper;
import com.sikuli.objectmanager.TestHelper;

public class UndoTestActions extends TestBase{		
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddFreeAnswerTestThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		FreeAnswerTestHelper.addFreeAnswerTestThroughToolbar();	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);     
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeleteTestThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		DeleteHelper.deleteThroughId(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(CheckBoxTestHelper.checkBoxTestWithFourVariants);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDublicateTest(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		DublicateHelper.dublicateObject(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ObjectHelper.undoDublicationOrRelocationCheck);			
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocateTest(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		RelocateHelper.relocateObject(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ObjectHelper.undoDublicationOrRelocationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoChangeNumberOfVariantsRadioButtonTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.radioButtonTestArticle);
		TestHelper.editTest(RadioButtonTestHelper.testWithThreeVariants);
		TestHelper.changeNumberOfVariants("4");
		ObjectHelper.confirm();
		UndoRedoHelper.undoAction();		
		ObjectHelper.finalCheck(RadioButtonTestHelper.testWithThreeVariants);	    
	}

}
