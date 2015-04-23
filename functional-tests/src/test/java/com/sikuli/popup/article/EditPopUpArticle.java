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

public class EditPopUpArticle extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void editPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpArticle);
		PopUpObjectsHelper.editPopUpArticle();
		ObjectHelper.clickButton(ArticleHelper.linkArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		screen.mouseMove(PopUpObjectsHelper.highlightedText);		
		//невозможно сделать нормальную проверку в связи с https://redmine.etb-lab.com/issues/24572
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditPopUpArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpArticle);
		PopUpObjectsHelper.editPopUpArticle();	
		ObjectHelper.clickButton(ObjectHelper.cancel);
		ObjectHelper.finalCheck(PopUpObjectsHelper.highlightedText);		
	}

}
