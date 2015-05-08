package com.sikuli.external.link;

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

public class EditExternalLink extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void editExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndExternalLinkArticle);
		PopUpObjectsHelper.editExternalLink();	
		PopUpObjectsHelper.changeUrlValue();
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editExternalLink();
		ObjectHelper.finalCheck(PopUpObjectsHelper.urlChangedAdress);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditExternalLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndExternalLinkArticle);
		PopUpObjectsHelper.editExternalLink();	
		ObjectHelper.clickButton(ObjectHelper.cancel);
		ObjectHelper.finalCheck(PopUpObjectsHelper.highlightedText);		
	}

}
