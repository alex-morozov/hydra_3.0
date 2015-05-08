package com.sikuli.external.link;

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

public class RedoExternalLinkActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addExternalLink(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idExternalLink);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDeleteExternalLinkThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndExternalLinkArticle,PopUpObjectsHelper.popUpObjectText);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDublicateExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndExternalLinkArticle);
		DublicateHelper.dublicateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idExternalLink, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.urlDublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoEditExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndExternalLinkArticle);
		PopUpObjectsHelper.editExternalLink();	
		PopUpObjectsHelper.changeUrlValue();
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		PopUpObjectsHelper.editExternalLink();
		ObjectHelper.finalCheck(PopUpObjectsHelper.urlChangedAdress);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoRelocateExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndExternalLinkArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idExternalLink, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.relocationCheck);			
	}


}
