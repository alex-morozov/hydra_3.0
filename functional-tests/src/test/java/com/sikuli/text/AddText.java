package com.sikuli.text;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class AddText extends TestBase {
	
	@Parameters({ "sikuli" })	
	@Test
		public void addThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);	
		AddHelper.addThroughContextMenu(AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTextDirectly(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);			  
		screen.paste("Пример текста");
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}

}
