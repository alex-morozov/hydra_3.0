package com.sikuli.image;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;


public class DeleteImage extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public void DeleteImageThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.editImageArticle,ImageHelper.image);	
		ObjectHelper.finalCheck(ArticleHelper.emptyArticle);
	}

}
