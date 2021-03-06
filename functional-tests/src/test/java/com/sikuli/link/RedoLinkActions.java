package com.sikuli.link;

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

public class RedoLinkActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addLink(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idLink);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDeleteLinkThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndLinkArticle,PopUpObjectsHelper.popUpObjectText);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDublicateLink(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		DublicateHelper.dublicateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idLink, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.linkDublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoEditLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		PopUpObjectsHelper.editLink();
		ObjectHelper.clickButton(ArticleHelper.linkArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		PopUpObjectsHelper.editLink();
		ObjectHelper.finalCheck(PopUpObjectsHelper.editLinkCheck);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoRelocateLink(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idLink, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.linkRelocationCheck);			
	}
	
	
	

}
