package com.sikuli.link;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class RelocateLink extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public void relocateLink(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndLinkArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idLink, AudioHelper.textString);
		ObjectHelper.finalCheck(PopUpObjectsHelper.linkRelocationCheck);			
	}

}
