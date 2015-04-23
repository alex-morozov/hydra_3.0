package com.sikuli.audio;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class DeleteAudio extends TestBase {
	@Parameters({ "sikuli" })
	@Test
	public void DeleteAudioThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndAudioArticle,AudioHelper.audio);
		ObjectHelper.finalCheck(AudioHelper.audioDeletionCheck);
	}
}
