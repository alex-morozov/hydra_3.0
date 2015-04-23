package com.sikuli.appmanager;

import java.awt.AWTException;
import java.io.File;

import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import com.sikuli.objectmanager.ObjectHelper;

public class DeleteHelper {
	public static String deleteSubObjectRectangleButton = "/inputScreens/DeleteHelper/deleteSubObjectRectangleButton.PNG";
	public static String deleteObjectButton = "/inputScreens/DeleteHelper/deleteObjectButton.PNG";
	static Screen screen = new Screen();
	
	public static void deleteThroughContextMenu (String article, String object) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(article);
		ObjectHelper.findObject(object);
		screen.mouseMove(object);
		screen.mouseDown(Button.RIGHT);
		screen.mouseUp(Button.RIGHT);
		ObjectHelper.clickButton(DeleteHelper.deleteObjectButton);			
	}
	
	/*
	 public static boolean checkDelete(String object)
	    {
	      try{
	    	   ObjectHelper.findObject(object);
	           return false;
	         }
	       catch(Exception e)
	        {
	           return true;	           
	        }
	    }
	 */
	 public static void deleteFile(String path2) {
		    try {
		              File userData = new File(path2);
		            if(userData.exists() && userData.isFile()){
		                boolean success = userData.delete();
		                if (success) {
		                    System.out.println("File " + userData.getPath() + " has been deleted");
		                } else {
		                    System.err.println("File " + userData.getPath() + " has not been deleted");
		                }
		            } else {
		                System.out.println("File " + userData.getPath() + " doesn't exist");
		            }
		        } catch (SecurityException e) {
		            System.err.println("Deleting a file is denied!");
		            e.printStackTrace();
		        }
		  }
	
}
