package com.sikuli.link;

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

public class EditLink extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void editLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		PopUpObjectsHelper.editLink();
		ObjectHelper.clickButton(ArticleHelper.linkArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		PopUpObjectsHelper.editLink();
		ObjectHelper.finalCheck(PopUpObjectsHelper.editLinkCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditLink(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		PopUpObjectsHelper.editLink();	
		ObjectHelper.clickButton(ObjectHelper.cancel);
		ObjectHelper.finalCheck(PopUpObjectsHelper.highlightedText);		
	}


}
