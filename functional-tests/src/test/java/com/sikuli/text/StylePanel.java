package com.sikuli.text;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TextHelper;

public class StylePanel extends TestBase{
	
	@Parameters({ "sikuli" })	
	@Test
		public void editFontName(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();
		TextHelper.changeFont();
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.timesNewRoman);		
	}

	@Parameters({ "sikuli" })	
	@Test
		public void makeFontBold(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();
		TextHelper.changeFont();
		ObjectHelper.clickButton(TextHelper.bold);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.boldCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void makeFontItalic(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.italic);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.italicCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void makeFontUnderlined(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.underline);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.underlineCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addUpperIndex(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.upperIndex);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.upperIndexCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addLowerIndex(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.lowerIndex);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.lowerIndexCheck);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeFontColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		TextHelper.changeFontColor();
		ObjectHelper.findObject(TextHelper.fontColorPink);
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.fontColorPink);		
	}	
	
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeBackgroundColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		TextHelper.changeBackgroundColour();
		ObjectHelper.findObject(TextHelper.backgroundColorPink);
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.backgroundColorPink);		
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void makeSizeRelative(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.relativeSizeUnchecked);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.relativeSizeChecked);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeRelativeSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(TextHelper.relativeSizeUnchecked);
		TextHelper.changeRelativeSize();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.bigRelativeSize);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeAbsoluteSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		TextHelper.changeAbsoluteSize();		
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.absoluteFontChangedSize);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeLanguage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		TextHelper.changeLanguage();	
		ObjectHelper.clickButton(ObjectHelper.ok);
		TextHelper.editStyleFromPanel();
		ObjectHelper.finalCheck(TextHelper.swedLanguage);		
	}			
		
	@Parameters({ "sikuli" })	
	@Test
		public void createStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.createStyleFromPanel();
		TextHelper.createStyleName();
		TextHelper.changeFont();	
		TextHelper.changeBackgroundColour();
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.finalCheck(TextHelper.newStyle);
	}		
	
	@Parameters({ "sikuli" })	
	@Test
		public void dublicateStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.dublicateStyleFromPanel();
		TextHelper.createStyleName();
		TextHelper.changeFont();	
		TextHelper.changeBackgroundColour();
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.finalCheck(TextHelper.newStyle);
	}		
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTextThroughStylePanel(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.text);		
		ObjectHelper.highlightAllContent(TextHelper.textCheck);
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		ObjectHelper.clickButton(TextHelper.styleToEditText);		
		ObjectHelper.finalCheck(TextHelper.changedTextCheck);
	}		
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelCreateStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.createStyleFromPanel();		
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(TextHelper.styleForEdit);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.editStyleFromPanel();		
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(TextHelper.styleForEdit);		
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelDublicateStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);	
		ObjectHelper.clickButton(TextHelper.showStylePanel);
		TextHelper.dublicateStyleFromPanel();		
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.finalCheck(TextHelper.styleForEdit);		
	}
	
	
}
