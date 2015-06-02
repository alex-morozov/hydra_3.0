package com.sikuli.table;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TableHelper;
import static com.sikuli.objectmanager.TableHelper.*;

public class AddTable extends TestBase{	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);	   
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void addTableThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);
		ArticleHelper.setCursor(ArticleHelper.empty);
		AddHelper.addThroughContextMenu(ArticleHelper.empty, AddHelper.addTable);		
		ObjectHelper.clickButton(ObjectHelper.ok);		
		ObjectHelper.finalCheck(table);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.cancel);		
	    ObjectHelper.finalCheck(ArticleHelper.empty);		    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBackgroundColourAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderColourAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderWidthAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBackgroundColourAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourRowCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderColourAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderWidthAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBackgroundColourAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourColumnCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderColourAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderWidthAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthColumnCheck);	   
	}			
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBackgroundColourAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourSingleCellCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderColourAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderWidthAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithAddedRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		addCells(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(addRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithAddedColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		addCells(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(addColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithDeletedRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		deleteCells(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(deleteRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithDeletedColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		deleteCells(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(deleteColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinRows(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		addCells(rowCellStyle);
		joinCells(columnCellStyle, join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinRowsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinColumns(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		addCells(columnCellStyle);
		joinCells(rowCellStyle, join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinColumnsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinCellsDown(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		joinCells(singleCellStyle, joinCellsDown);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinCellsDownCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinCellsToRight(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		joinCells(singleCellStyle, joinCellsToRight);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinCellsToRightCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBackgroundColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBackgroundColour(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);	      
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderColour(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);  
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderWidth(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();		
		changeBorderWidth(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table); 
	}		

}
