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

public class AddTable extends TestBase{	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.table);	   
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void addTableThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		AddHelper.addThroughContextMenu(ArticleHelper.emptyArticle, AddHelper.addTable);		
		ObjectHelper.clickButton(ObjectHelper.ok);		
		ObjectHelper.finalCheck(TableHelper.table);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.cancel);		
	    ObjectHelper.finalCheck(ArticleHelper.emptyArticle);		    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBackgroundColourAndConfirm(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBackgroundColourCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderColourAndConfirm(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderColourCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderWidthAndConfirm(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderWidthCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBackgroundColourAndConfirm(TableHelper.rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBackgroundColourRowCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderColourAndConfirm(TableHelper.rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderColourRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderWidthAndConfirm(TableHelper.rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderWidthRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBackgroundColourAndConfirm(TableHelper.columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBackgroundColourColumnCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderColourAndConfirm(TableHelper.columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderColourColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderWidthAndConfirm(TableHelper.columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderWidthColumnCheck);	   
	}			
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBackgroundColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBackgroundColourAndConfirm(TableHelper.singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBackgroundColourSingleCellCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderColourAndConfirm(TableHelper.singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderColourSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithChangedBorderWidthForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderWidthAndConfirm(TableHelper.singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addTableBorderWidthSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithAddedRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.addCells(TableHelper.rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithAddedColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.addCells(TableHelper.columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.addColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithDeletedRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.deleteCells(TableHelper.rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.deleteRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableWithDeletedColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.deleteCells(TableHelper.columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.deleteColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinRows(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.addCells(TableHelper.rowCellStyle);
		TableHelper.joinCells(TableHelper.columnCellStyle, TableHelper.join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.joinRowsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinColumns(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.addCells(TableHelper.columnCellStyle);
		TableHelper.joinCells(TableHelper.rowCellStyle, TableHelper.join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.joinColumnsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinCellsDown(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.joinCells(TableHelper.singleCellStyle, TableHelper.joinCellsDown);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.joinCellsDownCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTableJoinCellsToRight(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.joinCells(TableHelper.singleCellStyle, TableHelper.joinCellsToRight);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.joinCellsToRightCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBackgroundColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBackgroundColour(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.table);	      
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderColour(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.table);  
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderWidth(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();		
		TableHelper.changeBorderWidth(TableHelper.allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(TableHelper.table); 
	}	
	
	

}
