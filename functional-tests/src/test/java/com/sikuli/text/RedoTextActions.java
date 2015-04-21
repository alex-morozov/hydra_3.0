package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.CopyPasteHelper;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class RedoTextActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddingTextThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);	
		AddHelper.addThroughContextMenu(ArticleHelper.emptyArticle, AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.confirmAction();
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddTextDirectly(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);			  
		screen.paste("Пример текста");	
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	    public void redoCopyPasteFormattedText(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteFormattedText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.textRelocationFinish);		
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.dublicationCheck);	
		ObjectHelper.finalCheck(TextHelper.relocationCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoTextDeletion(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textArticle);
		ObjectHelper.highlightAndDeleteAllContent(TextHelper.textCheck);
		UndoRedoHelper.undoRedoAction();
		TextHelper.textCheck.isEmpty();
	}
	
	@Parameters({ "sikuli" })
	@Test
	    public void redoTextDublication(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		DublicateHelper.dublicateText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.highlightedString, TextHelper.textRelocationFinish);	
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.dublicationCheck);	
		ObjectHelper.finalCheck(TextHelper.relocationCheck);				
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoTextEditionThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textArticle);			
		ObjectHelper.openContextMenu(TextHelper.textCheck);
		ObjectHelper.clickButton(EditHelper.editObjectButton);
		ObjectHelper.clickButton(TextHelper.styleFromContextMenu);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.changedLetterCheck);
	}	
	
	@Parameters({ "sikuli" })
	@Test
	public void redoTextRelocation(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		RelocateHelper.relocateText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.highlightedString, TextHelper.textRelocationFinish);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(TextHelper.relocationCheck);				
	}

}
