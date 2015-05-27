package com.sikuli.objectmanager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;

public class TextHelper extends ObjectHelper {
	public static String changedLetterCheck = "/inputScreens/TextHelper/changedLetterCheck.PNG";
	public static String relocationCheck = "/inputScreens/TextHelper/relocationCheck.PNG";
	public static String formatPainterUse = "/inputScreens/TextHelper/formatPainterUse.PNG";
	public static String undoAddingTextThroughContextMenuCheck = "/inputScreens/TextHelper/undoAddingTextThroughContextMenuCheck.PNG";
	public static String formatPainterCheck = "/inputScreens/TextHelper/formatPainterCheck.PNG";
	public static String dublicationCheck = "/inputScreens/TextHelper/dublicationCheck.PNG";
	public static String changedTextCheck = "/inputScreens/TextHelper/changedTextCheck.PNG";
	public static String highlightedString = "/inputScreens/TextHelper/highlightedString.PNG";
	public static String stringFinish = "/inputScreens/TextHelper/stringFinish.PNG";
	public static String stringStart = "/inputScreens/TextHelper/stringStart.PNG";
	public static String formattedStringStart = "/inputScreens/TextHelper/formattedStringStart.PNG";
	public static String formattedStringFinish = "/inputScreens/TextHelper/formattedStringFinish.PNG";
	public static String textRelocationFinish = "/inputScreens/TextHelper/textRelocationFinish.PNG";
	public static String textCheck = "/inputScreens/TextHelper/textCheck.PNG";
	public static String absoluteFontSizeBasic = "/inputScreens/TextHelper/TextStyle/absoluteFontSizeBasic.PNG";
	public static String absoluteFontChangedSize = "/inputScreens/TextHelper/TextStyle/absoluteFontChangedSize.PNG";
	public static String backgroundColorBasic = "/inputScreens/TextHelper/TextStyle/backgroundColorBasic.PNG";
	public static String backgroundColorPink = "/inputScreens/TextHelper/TextStyle/backgroundColorPink.PNG";
	public static String bigRelativeSize = "/inputScreens/TextHelper/TextStyle/bigRelativeSize.PNG";
	public static String bold = "/inputScreens/TextHelper/TextStyle/bold.PNG";
	public static String boldCheck = "/inputScreens/TextHelper/TextStyle/boldCheck.PNG";
	public static String colorPink = "/inputScreens/TextHelper/TextStyle/colorPink.PNG";
	public static String emptyStyleName = "/inputScreens/TextHelper/TextStyle/emptyStyleName.PNG";
	public static String fontColorBasic = "/inputScreens/TextHelper/TextStyle/fontColorBasic.PNG";
	public static String fontColorPink = "/inputScreens/TextHelper/TextStyle/fontColorPink.PNG";
	public static String fontNameBasic = "/inputScreens/TextHelper/TextStyle/fontNameBasic.PNG";
	public static String italic = "/inputScreens/TextHelper/TextStyle/italic.PNG";
	public static String italicCheck = "/inputScreens/TextHelper/TextStyle/italicCheck.PNG";
	public static String languageBasic = "/inputScreens/TextHelper/TextStyle/languageBasic.PNG";
	public static String lowerIndex = "/inputScreens/TextHelper/TextStyle/lowerIndex.PNG";
	public static String lowerIndexCheck = "/inputScreens/TextHelper/TextStyle/lowerIndexCheck.PNG";
	public static String newStyle = "/inputScreens/TextHelper/StylePanel/newStyle.PNG";
	public static String relativeSizeChecked = "/inputScreens/TextHelper/TextStyle/relativeSizeChecked.PNG";
	public static String relativeSizeUnchecked = "/inputScreens/TextHelper/TextStyle/relativeSizeUnchecked.PNG";
	public static String smallRelativeSize = "/inputScreens/TextHelper/TextStyle/smallRelativeSize.PNG";
	public static String styleName = "/inputScreens/TextHelper/TextStyle/styleName.PNG";
	public static String swedLanguage = "/inputScreens/TextHelper/TextStyle/swedLanguage.PNG";
	public static String timesNewRoman = "/inputScreens/TextHelper/TextStyle/timesNewRoman.PNG";
	public static String underline = "/inputScreens/TextHelper/TextStyle/underline.PNG";
	public static String underlineCheck = "/inputScreens/TextHelper/TextStyle/underlineCheck.PNG";
	public static String upperIndex = "/inputScreens/TextHelper/TextStyle/upperIndex.PNG";
	public static String upperIndexCheck = "/inputScreens/TextHelper/TextStyle/upperIndexCheck.PNG";
	public static String showStylePanel = "/inputScreens/TextHelper/StylePanel/showStylePanel.PNG";
	public static String create = "/inputScreens/TextHelper/StylePanel/create.PNG";
	public static String dublicate = "/inputScreens/TextHelper/StylePanel/dublicate.PNG";
	public static String edit = "/inputScreens/TextHelper/StylePanel/edit.PNG";
	public static String styleForEdit = "/inputScreens/TextHelper/StylePanel/styleForEdit.PNG";
	public static String styleToEditText = "/inputScreens/TextHelper/TextStyle/styleToEditText.PNG";
	public static String styleFromContextMenu = "/inputScreens/TextHelper/TextStyle/styleFromContextMenu.PNG";
	public static String use = "/inputScreens/TextHelper/StylePanel/use.PNG";
	
	public static void editStyleFromPanel() throws FindFailed {
		openContextMenu(styleForEdit);
		clickButton(edit);
	}
	
	public static void editStyleFromPanel(String style) throws FindFailed {
		openContextMenu(style);
		clickButton(edit);
	}
	
	public static void createStyleFromPanel() throws FindFailed {
		openContextMenu(styleForEdit);
		clickButton(create);
	}
	
	public static void dublicateStyleFromPanel() throws FindFailed {
		openContextMenu(styleForEdit);
		clickButton(dublicate);
	}

	public static void changeFont() throws FindFailed {
		clickButton(fontNameBasic);
		clickButton(timesNewRoman);
	}

	public static void changeRelativeSize() throws FindFailed {
		clickButton(smallRelativeSize);	
		clickButton(bigRelativeSize);
	}
	
	public static void changeFontColor() throws FindFailed {
		clickButton(fontColorBasic);
		clickButton(colorPink);	
		clickButtonInCertainArea(ObjectHelper.ok);
	}
	
	public static void changeBackgroundColour() throws FindFailed {
		clickButton(backgroundColorBasic);
		clickButton(colorPink);	
		clickButtonInCertainArea(ObjectHelper.ok);
	}
	
	public static void changeLanguage() throws FindFailed {
		clickButton(languageBasic);	
		clickButton(swedLanguage);
	}
	
	public static void changeAbsoluteSize() throws FindFailed {
		typeFieldValue(absoluteFontSizeBasic, "22");
	}

	public static void createStyleName() throws FindFailed {
		typeFieldValue(emptyStyleName,"New Style");
	}	
	
	
	public static void useFormatPainter(String borrowFormat, String applyFormat) throws FindFailed, AWTException {
		Robot robot = new Robot();
		clickButton(borrowFormat);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_C);
		
		clickButton(applyFormat);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_V);
	}
	
	
	
}
