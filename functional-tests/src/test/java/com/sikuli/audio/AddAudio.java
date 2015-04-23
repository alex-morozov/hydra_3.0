package com.sikuli.audio;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class AddAudio extends TestBase{
	
	@Parameters({ "sikuli" })	
	@Test
		public void addAudioThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		AudioHelper.addAudioThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);		
	    ObjectHelper.finalCheck(AudioHelper.audio);		    
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void addAudioThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);
		AddHelper.addThroughContextMenu(ArticleHelper.emptyArticle, AddHelper.addAudio);
		ObjectHelper.clickButton(AddHelper.addFileButton);	
		ObjectHelper.openFile(AudioHelper.audioFilePath, AudioHelper.audioFile);
		ObjectHelper.clickButton(ObjectHelper.ok);		
		ObjectHelper.finalCheck(AudioHelper.audio);			
	}

}
