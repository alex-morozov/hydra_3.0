package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.CopyPasteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class CopyPasteText extends TestBase{
	
	@Parameters({ "sikuli" })
	@Test
	public static void copyPasteFormattedText(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteFormattedText(TextHelper.stringStart, TextHelper.stringFinish, TextHelper.textRelocationFinish);				
		ObjectHelper.finalCheck(TextHelper.dublicationCheck);	
		ObjectHelper.finalCheck(TextHelper.relocationCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public static void copyPasteNonFormattedText(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.formattedTextAndImageArticle);
		CopyPasteHelper.copyPasteNonFormattedText(TextHelper.formattedStringStart, TextHelper.formattedStringFinish, TextHelper.textRelocationFinish);				
		ObjectHelper.finalCheck(TextHelper.dublicationCheck);	
		ObjectHelper.finalCheck(TextHelper.relocationCheck);
	}

}
