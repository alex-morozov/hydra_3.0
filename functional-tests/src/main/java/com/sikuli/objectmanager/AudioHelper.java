package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;

public class AudioHelper {
	public static String addAudioToolbar = "/inputScreens/AudioHelper/addAudioToolbar.PNG";
	public static String audioFile = "/inputScreens/AudioHelper/audioFile.PNG";
	public static String audio = "/inputScreens/AudioHelper/audio.PNG";
	
	public static String audioFilePath = "C:/Users/alexey_morozov/Documents/AutotestsHydra/Image/source";
	
	public static void addAudioThroughToolbar() throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);			
		AddHelper.addThroughToolbar(AudioHelper.addAudioToolbar);
		ObjectHelper.clickButton(AddHelper.addFileButton);	
		ObjectHelper.openFile(AudioHelper.audioFilePath, AudioHelper.audioFile);			
	}

}
