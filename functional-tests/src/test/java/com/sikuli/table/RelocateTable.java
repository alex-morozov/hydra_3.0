package com.sikuli.table;

import static com.sikuli.objectmanager.TableHelper.*;
import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class RelocateTable extends TestBase {	
	@Parameters({ "sikuli" })
	@Test
	public void relocateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.textAndTable);
		RelocateHelper.relocateObject(bigTable, idTable, AudioHelper.textString);
		ObjectHelper.finalCheck(tableRelocationCheck);			
	}

}
