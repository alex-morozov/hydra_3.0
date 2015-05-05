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

public class AddPopUpImage extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void addPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpImage);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddingPopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.cancel);
		ObjectHelper.finalCheck(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.undoAddingArticleCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSizeProportionally(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ImageHelper.changeImageSizeProportionally();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	} 
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ImageHelper.changeImageSizeManually();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editPopUpImage();
		ObjectHelper.clickButton(ImageHelper.tabSize);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageFile(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpImage(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ImageHelper.changeImageFile(AddHelper.changedAddFileButton);		
		ObjectHelper.clickButton(ObjectHelper.ok);		
		PopUpObjectsHelper.editPopUpImage();
	}
	
}
