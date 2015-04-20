package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class RelocateText extends TestBase{
	@Parameters({ "sikuli" })
	@Test
	public static void relocateText(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		RelocateHelper.relocateText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.highlightedString, TextHelper.textRelocationFinish);
		ObjectHelper.finalCheck(TextHelper.relocationCheck);				
	}


}
