package com.sikuli.test;


import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.CheckBoxTestHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.TestHelper;

public class DeleteTest extends TestBase {
	@Parameters({ "sikuli" })
	@Test
	public void deleteTestThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.checkBoxTestArticle);
		DeleteHelper.deleteThroughId(CheckBoxTestHelper.checkBoxTestWithFourVariants, TestHelper.idTest);
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}

}
