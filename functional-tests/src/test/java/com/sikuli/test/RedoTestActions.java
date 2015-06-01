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
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.ReorderingTestHelper;
import com.sikuli.objectmanager.TestHelper;

public class RedoTestActions extends TestBase{
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddTestWithTwoVariantsThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		TestHelper.addTestWithVariantsThroughToolbar(ReorderingTestHelper.reorderingTestType, TestHelper.twoVariants);	
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(ReorderingTestHelper.reorderingTestWithTwoVariants);
		ObjectHelper.finalCheck(TestHelper.idTest);	    
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDeleteTestThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		DeleteHelper.deleteThroughId(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDublicateTest(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		DublicateHelper.dublicateObject(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TestHelper.dublicationCheck);			
	}
	

	
	@Parameters({ "sikuli" })
	@Test
	public void redoRelocateTest(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		RelocateHelper.relocateObject(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest, AudioHelper.textString);
		ObjectHelper.cancelHighlighting();
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TestHelper.dublicationCheck);
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}


}
