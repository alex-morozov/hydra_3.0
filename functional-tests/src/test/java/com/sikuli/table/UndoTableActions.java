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

public class UndoTableActions extends TestBase{		
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddTableThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.addImage);	
		TableHelper.addTableThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);  
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeleteTableThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.table);	
		DeleteHelper.deleteThroughId(table, idTable);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(table);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDublicateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTable);
		DublicateHelper.dublicateObject(bigTable, idTable, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(undoTableRelocationOrDublicationCheck);			
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTable);
		RelocateHelper.relocateObject(bigTable, idTable, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(undoTableRelocationOrDublicationCheck);			
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoEditTableAddRow(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.table);	
		editTable(table);	
		addCells(rowCellStyle);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.finalCheck(table);	   
	}	
}
