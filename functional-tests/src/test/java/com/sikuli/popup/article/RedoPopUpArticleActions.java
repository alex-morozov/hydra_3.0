package com.sikuli.popup.article;

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
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class RedoPopUpArticleActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddingPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpArticle(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpArticle);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeletePopUpArticleThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndPopUpArticle,PopUpObjectsHelper.popUpArticleText);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(AudioHelper.audioDeletionCheck);
	}	

	@Parameters({ "sikuli" })
	@Test
	public void undoDublicatePopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpArticle);
		DublicateHelper.dublicateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpArticle, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.dublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoEditPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpArticle);
		PopUpObjectsHelper.editPopUpArticle();
		ObjectHelper.clickButton(ArticleHelper.linkArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocatePopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpArticle, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.relocationCheck);			
	}

}
