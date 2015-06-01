package com.sikuli.image;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;


public class AddImage extends TestBase{	
	
	@Parameters({ "sikuli" })	
	@Test
		public void addImageThroughToolbar(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ObjectHelper.ok);		
	    EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		    
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void addImageThroughContextMenu(String sikuli) throws FindFailed, InterruptedException, AWTException{
		BookHelper.openBook(BookManager.image, BookManager.openBook);
		ArticleHelper.openArticle(ArticleHelper.addImageArticle);
		ArticleHelper.setCursor(ArticleHelper.emptyArticle);	
		AddHelper.addThroughContextMenu(ArticleHelper.emptyArticle, AddHelper.addImage);
		ImageHelper.addImageFile();
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);			
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();		
		ImageHelper.changeImageSizeManually();	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.editObject(ImageHelper.imageWithChangedSize, ImageHelper.editWindowTabChangedSize);	
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}

	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSizeProportionally(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ImageHelper.changeImageSizeProportionallyImageCreation();			
		ObjectHelper.clickButton(ObjectHelper.ok);
		EditHelper.editObject(ImageHelper.imageWithChangedSize, ImageHelper.editWindowTabChangedSize);	
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSize);
	}

	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSignText(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabText);			
		ObjectHelper.changeFieldValue(ImageHelper.imageSignText, "ChangedSign");				
		ObjectHelper.clickButton(ObjectHelper.ok);						
		EditHelper.editObject(ImageHelper.imageWithChangedSignText , ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabText);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSignText);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSignStyle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabText);
		ObjectHelper.clickButton(AddHelper.addSubObjectPlusButton);						
		screen.paste(AddHelper.addStyleName, "Новый стиль");
		ObjectHelper.clickButton(ObjectHelper.ok);		
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.imageWithChangedSignText , ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabText);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabChangedSignStyle);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void cancelImageAreaAdd(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);					
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.finalCheck(ImageHelper.editWindowTabAreas);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaAddThroughHighlighting(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ObjectHelper.clickButton(ImageHelper.editImageAreaButton);
		ImageHelper.createHighlightedImageArea();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.finalCheck(ImageHelper.imageAreaListElementEditImageWindow);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaAddThroughCoordinates(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ImageHelper.setImageAreaCoordinates();			
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.finalCheck(ImageHelper.imageAreaListElementEditImageWindow);
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void cancelImageAreaEdit(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ImageHelper.setImageAreaCoordinates();			
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementAddImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);					
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.finalCheck(ImageHelper.imageAreaEditCancelCheck);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaEditThroughHighlighting(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ObjectHelper.clickButton(ImageHelper.editImageAreaButton);
		ImageHelper.createHighlightedImageArea();
		ObjectHelper.clickButton(ObjectHelper.ok);		
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementAddImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);	
		ObjectHelper.clickButton(ImageHelper.editImageAreaButton);
		ImageHelper.editHighlightedImageArea();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);
		ObjectHelper.finalCheck(ImageHelper.editedImageAreaCheck);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaEditThroughCoordinates(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ImageHelper.setImageAreaCoordinates();			
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementAddImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);			
		ImageHelper.editImageAreaCoordinates();				
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);
		ObjectHelper.finalCheck(ImageHelper.editedImageAreaCheck);		
	}

	@Parameters({ "sikuli" })
	@Test  ( )
	public void imageAreaEditLinkArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ImageHelper.setImageAreaCoordinates();			
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementAddImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);		
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButtonInCertainArea(ArticleHelper.imageAreaArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);			
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);		
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.finalCheck(ArticleHelper.imageAreaArticle);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaDelete(String sikuli) throws FindFailed, InterruptedException, AWTException{
		ImageHelper.addImageThroughToolbar();
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);	
		ImageHelper.setImageAreaCoordinates();			
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementAddImageWindow);
		ObjectHelper.clickButton(DeleteHelper.deleteSubObjectRectangleButton);			
		ObjectHelper.clickButton(ObjectHelper.ok);					
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);		
		ObjectHelper.finalCheck(ImageHelper.imageAreaEmptyListElement);		
	}
	
	
	
}
