package com.sikuli.image;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.CopyPasteHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class CopyPasteImage extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public static void copyPasteImage(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndImageArticle);
		CopyPasteHelper.copyPasteObject(ImageHelper.image);		
		ObjectHelper.finalCheck(ImageHelper.copyPasteCheck);				
	}

}
