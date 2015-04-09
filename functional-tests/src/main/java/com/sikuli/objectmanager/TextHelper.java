package com.sikuli.objectmanager;

import org.sikuli.script.FindFailed;

public class TextHelper {
	public static String textCheck = "/inputScreens/TextHelper/textCheck.PNG";
	public static String absoluteFontSizeBasic = "/inputScreens/TextHelper/TextStyle/absoluteFontSizeBasic.PNG";
	public static String backgroundBasic = "/inputScreens/TextHelper/TextStyle/backgroundBasic.PNG";
	public static String bigRelativeSize = "/inputScreens/TextHelper/TextStyle/bigRelativeSize.PNG";
	public static String bold = "/inputScreens/TextHelper/TextStyle/bold.PNG";
	public static String boldCheck = "/inputScreens/TextHelper/TextStyle/boldCheck.PNG";
	public static String colorBasic = "/inputScreens/TextHelper/TextStyle/colorBasic.PNG";
	public static String fontNameBasic = "/inputScreens/TextHelper/TextStyle/fontNameBasic.PNG";
	public static String italic = "/inputScreens/TextHelper/TextStyle/italic.PNG";
	public static String italicCheck = "/inputScreens/TextHelper/TextStyle/italicCheck.PNG";
	public static String languageBasic = "/inputScreens/TextHelper/TextStyle/languageBasic.PNG";
	public static String lowerIndex = "/inputScreens/TextHelper/TextStyle/lowerIndex.PNG";
	public static String lowerIndexCheck = "/inputScreens/TextHelper/TextStyle/lowerIndexCheck.PNG";
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
	public static String use = "/inputScreens/TextHelper/StylePanel/use.PNG";
	
	public static void editStyleFromPanel() throws FindFailed {
		ObjectHelper.openContextMenu(styleForEdit);
		ObjectHelper.clickButton(edit);
	}

	public static void changeFont() throws FindFailed {
		ObjectHelper.clickButton(fontNameBasic);
		ObjectHelper.clickButton(timesNewRoman);
	}

	public static void changeRelativeSize() throws FindFailed {
		ObjectHelper.clickButton(smallRelativeSize);	
		ObjectHelper.clickButton(bigRelativeSize);
	}
	
	
	
}
