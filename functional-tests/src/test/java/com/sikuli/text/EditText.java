package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class EditText extends TestBase {
	@Parameters({ "sikuli" })	
	@Test
		public void editTextThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textArticle);			
		ObjectHelper.openContextMenu(TextHelper.textCheck);
		ObjectHelper.clickButton(EditHelper.editObjectButton);
		ObjectHelper.clickButton(TextHelper.styleFromContextMenu);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.finalCheck(TextHelper.changedLetterCheck);
	}	

	@Parameters({ "sikuli" })	
	@Test
		public void formatPainter(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.formattedTextAndImageArticle);			
		TextHelper.useFormatPainter(TextHelper.formattedStringFinish, TextHelper.formatPainterUse);
		ObjectHelper.finalCheck(TextHelper.formatPainterCheck);
	}	
}
