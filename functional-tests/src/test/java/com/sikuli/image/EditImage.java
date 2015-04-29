package com.sikuli.image;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.EditHelper;
import com.sikuli.common.TestBase;
import com.sikuli.objectmanager.ImageHelper;
import com.sikuli.objectmanager.ObjectHelper;

public class EditImage extends TestBase{
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSizeProportionally(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ImageHelper.changeImageSizeProportionally();		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.cancelObjectHighlighting();
		EditHelper.editObject(ImageHelper.imageWithChangedSize, ImageHelper.editWindowTabChangedSize);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSize(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ImageHelper.changeImageSizeManually();		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.cancelObjectHighlighting();
		EditHelper.editObject(ImageHelper.imageWithChangedSize, ImageHelper.editWindowTabChangedSize);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void changeImageSignText(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabText);			
		ObjectHelper.changeFieldValue(ImageHelper.imageSignText, "ChangedSign");				
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.cancelObjectHighlighting();
		EditHelper.editObject(ImageHelper.imageWithChangedSignText , ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabText);
		screen.wait(ImageHelper.editWindowTabChangedSignText);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void cancelImageAreaAdd(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);					
		ObjectHelper.clickButton(ObjectHelper.cancel);		
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.cancelObjectHighlighting();
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		screen.wait(ImageHelper.editWindowTabAreas);						
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaAddThroughHighlighting(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
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
		EditHelper.cancelObjectHighlighting();		
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		screen.wait(ImageHelper.imageAreaListElementEditImageWindow);					
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaAddThroughCoordinates(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.editImageArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(AddHelper.addSubObjectRectangleButton);		
		ImageHelper.setImageAreaCoordinates();	
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButton(ArticleHelper.linkArticle);
		ObjectHelper.clickButton(ObjectHelper.ok);
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);			
		EditHelper.cancelObjectHighlighting();		
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		screen.wait(ImageHelper.imageAreaListElementEditImageWindow);					
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaEditThroughHighlighting(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.imageAreaArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);	
		ObjectHelper.clickButton(ImageHelper.editImageAreaButton);
		ImageHelper.editHighlightedImageArea();
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.cancelObjectHighlighting();	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);
		screen.wait(ImageHelper.editedImageAreaCheck);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaEditThroughCoordinates(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.imageAreaArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);		
		ImageHelper.editImageAreaCoordinates();				
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.cancelObjectHighlighting();	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);
		screen.wait(ImageHelper.editedImageAreaCheck);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaCancelEditThroughCoordinates(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.imageAreaArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(DeleteHelper.deleteSubObjectRectangleButton);		
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.cancelObjectHighlighting();	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);		
		screen.wait(ImageHelper.imageAreaEmptyListElement);		
	}
	
	@Parameters({ "sikuli" })
	@Test
	public void imageAreaDelete(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.imageAreaArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(DeleteHelper.deleteSubObjectRectangleButton);		
		ObjectHelper.clickButton(ObjectHelper.ok);		
		EditHelper.cancelObjectHighlighting();	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);		
		screen.wait(ImageHelper.imageAreaEmptyListElement);		
	}
	
	@Parameters({ "sikuli" })
	@Test  ( groups = ("not finished"))
	public void imageAreaEditLinkArticle(String sikuli) throws FindFailed, InterruptedException, AWTException{
		EditHelper.openBookAndEditObject(ArticleHelper.imageAreaArticle,ImageHelper.image, ImageHelper.editWindowTabSize);
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);		
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.clickButtonInCertainArea(ArticleHelper.imageAreaArticle);		
		ObjectHelper.clickButton(ObjectHelper.ok);			
		ObjectHelper.clickButton(ObjectHelper.ok);	
		ObjectHelper.clickButton(ObjectHelper.ok);	
		EditHelper.cancelObjectHighlighting();	
		EditHelper.editObject(ImageHelper.image, ImageHelper.editWindowTabSize);		
		ObjectHelper.clickButton(ImageHelper.tabAreas);
		ObjectHelper.clickButton(ImageHelper.imageAreaListElementEditImageWindow);
		ObjectHelper.clickButton(EditHelper.editSubObjectRectangleButton);		
		ObjectHelper.clickButton(ImageHelper.editImageAreaLinkButton);
		ObjectHelper.finalCheck(ArticleHelper.imageAreaArticle);		
	}

}
