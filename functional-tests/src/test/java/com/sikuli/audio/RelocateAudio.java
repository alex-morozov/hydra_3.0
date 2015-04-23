package com.sikuli.audio;

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

public class RelocateAudio extends TestBase {
	
	@Parameters({ "sikuli" })
	@Test
	public void relocateAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndAudioArticle);
		RelocateHelper.relocateObject(AudioHelper.audio, AudioHelper.idAudio, AudioHelper.textString);
		ObjectHelper.finalCheck(AudioHelper.relocationCheck);				
	}

}