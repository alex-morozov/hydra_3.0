package com.sikuli.external.link;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ObjectHelper;
import com.sikuli.objectmanager.PopUpObjectsHelper;

public class DeleteExternalLink extends TestBase {
	@Parameters({ "sikuli" })
	@Test
	public void deleteExternalLinkThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndExternalLinkArticle,PopUpObjectsHelper.popUpObjectText);
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}

}
