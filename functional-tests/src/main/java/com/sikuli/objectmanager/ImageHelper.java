package com.sikuli.objectmanager;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.ArticleHelper;
import com.sikuli.appmanager.BookHelper;
import com.sikuli.appmanager.BookManager;


public class ImageHelper {
private ImageHelper imageHelper;

public static String addImageMenu = "/inputScreens/ImageHelper/addImageMenu.PNG";
public static String addImageToolbar = "/inputScreens/ImageHelper/addImageToolbar.PNG";
public static String addImageWindowGeneral = "/inputScreens/ImageHelper/addImageWindowGeneral.PNG";
public static String imageFile = "/inputScreens/ImageHelper/imageFile.PNG";
public static String image = "/inputScreens/ImageHelper/image.PNG";
public static String tabAreas = "/inputScreens/ImageHelper/addImageTabAreas.PNG";
public static String tabSize = "/inputScreens/ImageHelper/addImageTabSize.PNG";
public static String tabText = "/inputScreens/ImageHelper/addImageTabText.PNG";
public static String imageWidth = "/inputScreens/ImageHelper/imageWidth.PNG";
public static String imageHeight = "/inputScreens/ImageHelper/imageHeight.PNG";
public static String imageWithChangedSize = "/inputScreens/ImageHelper/imageWithChangedSize.PNG";
public static String proportionalChangeButton = "/inputScreens/ImageHelper/proportionalChangeButton.PNG";
public static String imageSignText = "/inputScreens/ImageHelper/imageSignText.PNG";
public static String imageWithChangedSignText = "/inputScreens/ImageHelper/imageWithChangedSignText.PNG";
public static String imageWithChangedSignStyle = "/inputScreens/ImageHelper/imageWithChangedSignStyle.PNG";
public static String editWindowTabSize = "/inputScreens/ImageHelper/editWindowTabSize.PNG";
public static String editWindowTabChangedSize = "/inputScreens/ImageHelper/editWindowTabChangedSize.PNG";
public static String editWindowTabChangedSignText = "/inputScreens/ImageHelper/editWindowTabChangedSignText.PNG";
public static String editWindowTabChangedSignStyle = "/inputScreens/ImageHelper/editWindowTabChangedSignStyle.PNG";
public static String editWindowTabAreas = "/inputScreens/ImageHelper/editWindowTabAreas.PNG";
public static String createImageAreaStart = "/inputScreens/ImageHelper/createImageAreaStart.PNG";
public static String createImageAreaFinish = "/inputScreens/ImageHelper/createImageAreaFinish.PNG";
public static String editImageAreaButton = "/inputScreens/ImageHelper/editImageAreaButton.PNG";
public static String editImageAreaLinkButton = "/inputScreens/ImageHelper/editImageAreaLinkButton.PNG";
public static String addedImageAreaCheck = "/inputScreens/ImageHelper/addedImageAreaCheck.PNG";
public static String imageAreaListElementEditImageWindow = "/inputScreens/ImageHelper/imageAreaListElementEditImageWindow.PNG";
public static String setImageAreaCoordinatesFirstValueEmpty = "/inputScreens/ImageHelper/setImageAreaCoordinatesFirstValueEmpty.PNG";
public static String setImageAreaCoordinatesSecondValueEmpty = "/inputScreens/ImageHelper/setImageAreaCoordinatesSecondValueEmpty.PNG";
public static String setImageAreaSizeFirstValueEmpty = "/inputScreens/ImageHelper/setImageAreaSizeFirstValueEmpty.PNG";
public static String setImageAreaSizeSecondValueEmpty = "/inputScreens/ImageHelper/setImageAreaSizeSecondValueEmpty.PNG";
public static String imageAreaEditCancelCheck = "/inputScreens/ImageHelper/imageAreaEditCancelCheck.PNG";
public static String imageAreaListElementAddImageWindow = "/inputScreens/ImageHelper/imageAreaListElementAddImageWindow.PNG";
public static String editImageAreaStart = "/inputScreens/ImageHelper/editImageAreaStart.PNG";
public static String editImageAreaFinish = "/inputScreens/ImageHelper/editImageAreaFinish.PNG";
public static String editedImageAreaCheck = "/inputScreens/ImageHelper/editedImageAreaCheck.PNG";
public static String editImageAreaCoordinatesFirstValue = "/inputScreens/ImageHelper/editImageAreaCoordinatesFirstValue.PNG";
public static String editImageAreaCoordinatesSecondValue = "/inputScreens/ImageHelper/editImageAreaCoordinatesSecondValue.PNG";
public static String editImageAreaSizeFirstValue = "/inputScreens/ImageHelper/editImageAreaSizeFirstValue.PNG";
public static String editImageAreaSizeSecondValue = "/inputScreens/ImageHelper/editImageAreaSizeSecondValue.PNG";
public static String imageAreaEmptyListElement = "/inputScreens/ImageHelper/imageAreaEmptyListElement.PNG";
public static String idImage = "/inputScreens/ImageHelper/idImage.PNG";
public static String textString = "/inputScreens/ImageHelper/textString.PNG";
public static String relocationCheck = "/inputScreens/ImageHelper/relocationCheck.PNG";
public static String copyPasteCheck = "/inputScreens/ImageHelper/copyPasteCheck.PNG";
public static String dublicationCheck = "/inputScreens/ImageHelper/dublicationCheck.PNG";
public static String undoRelocationCheck = "/inputScreens/ImageHelper/undoRelocationCheck.PNG";

public static String imageFilePath = "C:/Users/alexey_morozov/Documents/AutotestsHydra/Image/source";


public static void addImageThroughToolbar() throws FindFailed, InterruptedException, AWTException{
	BookHelper.openBook(BookManager.image, BookManager.openBook);
	ArticleHelper.openArticle(ArticleHelper.addImageArticle);			
	AddHelper.addThroughToolbar(ImageHelper.addImageToolbar);
	ObjectHelper.clickButton(AddHelper.addFileButton);	
	ObjectHelper.openFile(ImageHelper.imageFilePath, ImageHelper.imageFile);			
}

public static void createHighlightedImageArea() throws FindFailed, InterruptedException, AWTException{
	ObjectHelper.screen.dragDrop(ImageHelper.createImageAreaStart, ImageHelper.createImageAreaFinish);		
}

public static void setImageAreaCoordinates() throws FindFailed, InterruptedException, AWTException{
	ObjectHelper.screen.paste(ImageHelper.setImageAreaCoordinatesFirstValueEmpty, "10");
	ObjectHelper.screen.paste(ImageHelper.setImageAreaCoordinatesSecondValueEmpty, "22");
	ObjectHelper.screen.paste(ImageHelper.setImageAreaSizeFirstValueEmpty, "21");
	ObjectHelper.screen.paste(ImageHelper.setImageAreaSizeSecondValueEmpty, "53");	
}

public static void editHighlightedImageArea() throws FindFailed, InterruptedException, AWTException{
	ObjectHelper.screen.dragDrop(ImageHelper.editImageAreaStart, ImageHelper.editImageAreaFinish);		
}

public static void editImageAreaCoordinates() throws FindFailed, InterruptedException, AWTException{
	ObjectHelper.changeFieldValue(ImageHelper.editImageAreaCoordinatesFirstValue, "68");
	ObjectHelper.changeFieldValue(ImageHelper.editImageAreaCoordinatesSecondValue, "16");
	ObjectHelper.changeFieldValue(ImageHelper.editImageAreaSizeFirstValue, "16");
	ObjectHelper.changeFieldValue(ImageHelper.editImageAreaSizeSecondValue, "52");	
}

public ImageHelper getImageHelper(){
	return imageHelper;
}

}
