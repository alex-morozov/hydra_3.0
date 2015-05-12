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

public class UndoAudioActions  extends TestBase{
	
	@Parameters({ "sikuli" })	
	@Test
		public void undoAddingImage(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);	
		AudioHelper.addAudioThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		UndoRedoHelper.undoAction();
	    ObjectHelper.finalCheck(ArticleHelper.emptyArticle);		    
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDeleteAudio (String sikuli) throws FindFailed, InterruptedException, AWTException{
		DeleteHelper.deleteThroughContextMenu(ArticleHelper.textAndAudioArticle,AudioHelper.audio);
		ObjectHelper.finalCheck(ObjectHelper.deletionCheck);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(AudioHelper.audio);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoDublicateAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndAudioArticle);
		DublicateHelper.dublicateObject(AudioHelper.audio, AudioHelper.idAudio, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(AudioHelper.undoRelocationCheck);				
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void undoRelocateAudio(String sikuli) throws FindFailed, InterruptedException, AWTException{		
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.textAndAudioArticle);
		RelocateHelper.relocateObject(AudioHelper.audio, AudioHelper.idAudio, AudioHelper.textString);
		UndoRedoHelper.undoAction();
		ObjectHelper.finalCheck(AudioHelper.undoRelocationCheck);				
	}

}
