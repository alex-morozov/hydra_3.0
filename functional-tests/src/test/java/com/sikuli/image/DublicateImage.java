package com.sikuli.image;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class DublicateImage extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public static void dublicateImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		DublicateHelper.dublicateObject(ImageHelper.image, ImageHelper.idImage, ImageHelper.textString);
		ObjectHelper.finalCheck(ImageHelper.dublicationCheck);				
	}

}