package com.sikuli.popup.image;

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
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class UndoPopUpImageActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddingPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);		
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.undoAddingObjectCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeletePopUpImageThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndPopUpImageArticle,PopUpObjectsHelper.popUpObjectText);
		UndoRedoHelper.undoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpImage);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDublicationPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImageArticle);
		DublicateHelper.dublicateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpImage, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(AudioHelper.textString);			
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocationPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImageArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpImage, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.relocationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoEditPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImageArticle);
		PopUpObjectsHelper.editPopUpImage();
		ImageHelper.changeImageSizeManually();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);	
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabSize);
		}

}
