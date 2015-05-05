package com.sikuli.audio;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.DublicateHelper;
import com.sikuli.appmanager.RelocateHelper;
import com.sikuli.appmanager.UndoRedoHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.AudioHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class RedoAudioActions extends TestBase{
	
	@Parameters({ "sikuli" })	
	@Test
		public void redoAddingAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{
		AudioHelper.addAudioThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);
		UndoRedoHelper.undoRedoAction();
	    ObjectHelper.finalCheck(AudioHelper.audio);		    
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void DeleteAudioThroughContextMenu (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndAudioArticle,AudioHelper.audio);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void dublicateAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndAudioArticle);
		DublicateHelper.dublicateObject(AudioHelper.audio, AudioHelper.idAudio, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(AudioHelper.dublicationCheck);				
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void relocateAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndAudioArticle);
		RelocateHelper.relocateObject(AudioHelper.audio, AudioHelper.idAudio, AudioHelper.textString);
		UndoRedoHelper.undoRedoAction();
		ObjectHelper.finalCheck(AudioHelper.relocationCheck);				
	}

}
