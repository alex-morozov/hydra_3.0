package com.sikuli.popup.article;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;


public class AddPopUpArticle extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void addPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpArticle(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpArticle);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddingPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObjectArticle);
		PopUpObjectsHelper.addPopUpArticle(PopUpObjectsHelper.stringStart, PopUpObjectsHelper.stringFinish, PopUpObjectsHelper.highlightedText);	
		ObjectHelper.clickButton(ObjectHelper.cancel);
		ObjectHelper.finalCheck(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.idPopUpArticle);
	}
}
