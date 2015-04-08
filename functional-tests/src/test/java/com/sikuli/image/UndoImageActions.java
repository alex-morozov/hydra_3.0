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
import com.sikuli.appmanager.EditHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class UndoImageActions extends TestBase {
	/*
	@Parameters({ "sikuli" })
	@Test
	public void undoAddImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);		
		UndoRedoHelper.undoAction();
		ImageHelper.image.isEmpty();	
	}
*/
	
	@Parameters({ "sikuli" })
	@Test
	public void undoCopyPasteImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteObject(ImageHelper.image);	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ImageHelper.relocationCheck);				
	}
	
	/*
	@Parameters({ "sikuli" })
	@Test
	public void undoEditImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.changeFieldValue(ImageHelper.imageWidth, "700");	
		ObjectHelper.clickButton(ImageHelper.imageHeight);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ImageHelper.image);
	}
	*/
	
	
}
