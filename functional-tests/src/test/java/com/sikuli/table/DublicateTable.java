package com.sikuli.table;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.CheckBoxTestHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TestHelper;

import static com.sikuli.objectmanager.TableHelper.*;

public class DublicateTable extends TestBase {	
	@Parameters({ "sikuli" })
	@Test
	public void dublicateTable(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openMainBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTest);
		DublicateHelper.dublicateObject(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest, AudioHelper.textString);
		ObjectHelper.finalCheck(tableDublicationCheck);			
	}
}
