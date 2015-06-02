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

public class RedoPopUpImageActions extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpImage);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeletePopUpImageThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndPopUpImage,PopUpObjectsHelper.popUpObjectText);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDublicatePopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		DublicateHelper.dublicateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpImage, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.dublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoEditPopUpImageChangeImageSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		PopUpObjectsHelper.editPopUpImage();
		ImageHelper.changeImageSizeManually();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocatePopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpImage, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(PopUpObjectsHelper.relocationCheck);			
	}

}
