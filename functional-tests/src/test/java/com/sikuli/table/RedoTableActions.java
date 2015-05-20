package com.sikuli.table;

import static com.sikuli.objectmanager.TableHelper.*;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TableHelper;

public class RedoTableActions extends TestBase{		
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(table);	   
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDeleteTableThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		DeleteHelper.deleteThroughId(table, idTable);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoDublicateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTableArticle);
		DublicateHelper.dublicateObject(bigTable, idTable, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(tableDublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoEditTableChangeBackgroundColourForAllCells(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.tableArticle);	
		editTable(table);	
		changeBackgroundColourAndConfirm(allTableCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(BackgroundColourCheck);	   
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void redoRelocateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTableArticle);
		RelocateHelper.relocateObject(bigTable, idTable, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(tableRelocationCheck);			
	}

}
