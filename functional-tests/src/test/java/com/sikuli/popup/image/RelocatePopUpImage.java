package com.sikuli.popup.image;

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

public class RelocatePopUpImage extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public void relocatePopUpImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndPopUpImageArticle);
		RelocateHelper.relocateObject(PopUpObjectsHelper.highlightedText, PopUpObjectsHelper.idPopUpImage, AudioHelper.textString);
		ObjectHelper.finalCheck(PopUpObjectsHelper.relocationCheck);			
	}

}
