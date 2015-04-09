package com.sikuli.image;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.CopyPasteHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class RedoImageActions extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public void redoAddImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);		
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ImageHelper.image);			
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDeleteImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.editImageArticle,ImageHelper.image);
		UndoRedoHelper.undoRedoAction();
		ImageHelper.image.isEmpty();	
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoCopyPasteImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteObject(ImageHelper.image);	
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ImageHelper.copyPasteCheck);				
	}	
	
	@Parameters({ "sikuli" })
	@Test
	public void redoEditImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.changeFieldValue(ImageHelper.imageWidth, "700");	
		ObjectHelper.clickButton(ImageHelper.imageHeight);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		UndoRedoHelper.undoRedoAction();
		EditHelper.editObject(ImageHelper.imageWithChangedSize, ImageHelper.editWindowTabChangedSize);
	}	
	
	@Parameters({ "sikuli" })
	@Test
	public void redoRelocateImage(String sikuli) throws FindFailed, InterruptedException, AWTException{				
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		RelocateHelper.relocateObject(ImageHelper.image, ImageHelper.idImage, ImageHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ImageHelper.relocationCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDublicationImage(String sikuli) throws FindFailed, InterruptedException, AWTException{				
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		DublicateHelper.dublicateObject(ImageHelper.image, ImageHelper.idImage, ImageHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ImageHelper.dublicationCheck);
	}
}
