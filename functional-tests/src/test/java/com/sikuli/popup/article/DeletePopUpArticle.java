package com.sikuli.popup.article;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class DeletePopUpArticle extends TestBase {
	@Parameters({ "sikuli" })
	@Test
	public void deletePopUpArticleThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndPopUpArticle,PopUpObjectsHelper.popUpArticleText);
		ObjectHelper.finalCheck(AudioHelper.audioDeletionCheck);
	}
}
