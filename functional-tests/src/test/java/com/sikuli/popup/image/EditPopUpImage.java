package com.sikuli.popup.image;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class EditPopUpImage extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void editPopUpImageChangeImageSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		PopUpObjectsHelper.editPopUpImage();
		ImageHelper.changeImageSizeManually();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editPopUpImageChangeImageSizeProportionally(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		PopUpObjectsHelper.editPopUpImage();
		ImageHelper.changeImageSizeProportionallyImageCreation();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageFile(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		PopUpObjectsHelper.editPopUpImage();
		ImageHelper.changeImageFile(AddHelper.addFileButton);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickComplexObject(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(ImageHelper.firefoxImage);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImage);
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ObjectHelper.cancel);
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpImage);
	}

}
