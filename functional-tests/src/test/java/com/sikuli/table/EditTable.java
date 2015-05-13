package com.sikuli.table;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import static com.sikuli.objectmanager.TableHelper.*;


public class EditTable extends TestBase{
	@Parameters({ "sikuli" })	
	@Test
		public void cancelEditTable(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTableArticle);	
		editTable(bigTable);
		ObjectHelper.clickButton(ObjectHelper.cancel);		
	    ObjectHelper.finalCheck(bigTable);		    
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBackgroundColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBackgroundColourAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderColourAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderWidthForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);			
		changeBorderWidthAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBackgroundColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		changeBackgroundColourAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourRowCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderColourForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		changeBorderColourAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderWidthForTableRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderWidthAndConfirm(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBackgroundColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		changeBackgroundColourAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourColumnCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderColourForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);			
		changeBorderColourAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderWidthForTableColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderWidthAndConfirm(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthColumnCheck);	   
	}			
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBackgroundColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBackgroundColourAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BackgroundColourSingleCellCheck);	   
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderColourForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderColourAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderColourSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableChangeBorderWidthForSingleCell(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		changeBorderWidthAndConfirm(singleCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(BorderWidthSingleCellCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableAddRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		addCells(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(addRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableAddColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		addCells(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(addColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableDeleteRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		deleteCells(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(deleteRowCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableDeleteColumn(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		deleteCells(columnCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(deleteColumnCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableJoinRows(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		addCells(rowCellStyle);
		joinCells(columnCellStyle, join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinRowsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableJoinColumns(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		addCells(columnCellStyle);
		joinCells(rowCellStyle, join);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinColumnsCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableJoinCellsDown(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		joinCells(singleCellStyle, joinCellsDown);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinCellsDownCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void editTableJoinCellsToRight(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);		
		joinCells(singleCellStyle, joinCellsToRight);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(joinCellsToRightCheck);	   
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBackgroundColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBackgroundColour(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);	      
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderColour(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderColour(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);  
	}	
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelChangingBorderWidth(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBorderWidth(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.cancel);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table); 
	}		

	

}
