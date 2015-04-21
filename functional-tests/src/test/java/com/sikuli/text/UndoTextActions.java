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
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class UndoTextActions extends TestBase  {
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddingTextThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);	
		AddHelper.addThroughContextMenu(TextHelper.stringStart, AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.confirmAction();
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(TextHelper.undoAddingTextThroughContextMenuCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddingTextDirectly(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		ArticleHelper.setCursor(TextHelper.stringStart);			  
		screen.paste("П");	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(TextHelper.undoAddingTextThroughContextMenuCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoCopyPasteFormattedText(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteFormattedText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.textRelocationFinish);	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ImageHelper.undoRelocationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoTextDeletion(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textArticle);
		ObjectHelper.highlightAndDeleteAllContent(TextHelper.textCheck);			
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoTextDublication(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		DublicateHelper.dublicateText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.highlightedString, TextHelper.textRelocationFinish);		
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ImageHelper.undoRelocationCheck);					
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoTextRelocation(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		RelocateHelper.relocateText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.highlightedString, TextHelper.textRelocationFinish);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ImageHelper.undoRelocationCheck);					
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoEditingTextThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textArticle);			
		ObjectHelper.openContextMenu(TextHelper.textCheck);
		ObjectHelper.clickButton(EditHelper.editObjectButton);
		ObjectHelper.clickButton(TextHelper.styleFromContextMenu);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}		

}
