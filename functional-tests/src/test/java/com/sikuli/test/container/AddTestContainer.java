package com.sikuli.test.container;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;
import com.sikuli.objectmanager.TestContainerHelper;

public class AddTestContainer extends TestBase {
	@Parameters({ "sikuli" })	
	@Test
		public void addTestContainerWithOneTest(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();
		TestContainerHelper.addTestToContainer(ArticleHelper.firstTest);
		ObjectHelper.confirm();
		TestContainerHelper.editTestContainer();
		ObjectHelper.finalCheck(TestContainerHelper.oneTestInContainer);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void cancelAddTestContainer(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();		
		ObjectHelper.cancel();
		screen.mouseMove(PopUpObjectsHelper.highlightedText);
		ObjectHelper.finalCheck(PopUpObjectsHelper.undoAddingObjectCheck);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void addTestContainerWithTwoTests(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();
		TestContainerHelper.addTestToContainer(ArticleHelper.firstTest);
		TestContainerHelper.addTestToContainer(ArticleHelper.secondTest);
		ObjectHelper.confirm();
		TestContainerHelper.editTestContainer();
		ObjectHelper.finalCheck(TestContainerHelper.twoTestsInContainer);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void deleteTestDuringAddingTestContainer(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();
		TestContainerHelper.addTestToContainer(ArticleHelper.firstTest);
		TestContainerHelper.addTestToContainer(ArticleHelper.secondTest);
		ObjectHelper.deleteSubObject();
		ObjectHelper.confirm();
		TestContainerHelper.editTestContainer();
		ObjectHelper.finalCheck(TestContainerHelper.oneTestInContainer);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeTestOrderDuringAddingTestContainer(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();
		TestContainerHelper.addTestToContainer(ArticleHelper.secondTest);
		TestContainerHelper.addTestToContainer(ArticleHelper.firstTest);		
		ObjectHelper.moveUp();
		ObjectHelper.confirm();
		TestContainerHelper.editTestContainer();
		ObjectHelper.finalCheck(TestContainerHelper.twoTestsInContainer);
	}
	
	@Parameters({ "sikuli" })	
	@Test
		public void changeTestDuringAddingTestContainer(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openTestBook);
		ArticleHelper.openArticle(ArticleHelper.addPopUpObject);
		TestContainerHelper.addTestContainer();
		TestContainerHelper.addTestToContainer(ArticleHelper.secondTest);		
		TestContainerHelper.editTestInContainer(ArticleHelper.thirdTest);	
		ObjectHelper.confirm();
		TestContainerHelper.editTestContainer();
		ObjectHelper.finalCheck(TestContainerHelper.freeAnswerTestInContainer);
	}

}
