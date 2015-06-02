package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class AddText extends TestBase {
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTextThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		AddHelper.addThroughContextMenu(ArticleHelper.empty, AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.confirmAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTextDirectly(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);			  
		screen.paste("Пример текста");		
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		AddHelper.addThroughContextMenu(ArticleHelper.empty, AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.clickButton(EditHelper.editSubObjectPencilButton);
		TextHelper.changeAbsoluteSize();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		App.focusedWindow().click();
		ObjectHelper.confirmAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		AddHelper.addThroughContextMenu(ArticleHelper.empty, AddHelper.addText);	  
		screen.paste("Пример текста");
		ObjectHelper.clickButton(AddHelper.addSubObjectPlusButton);
		TextHelper.createStyleName();
		TextHelper.changeAbsoluteSize();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		App.focusedWindow().click();
		ObjectHelper.confirmAction();
		ObjectHelper.finalCheck(TextHelper.textCheck);
	}

}
