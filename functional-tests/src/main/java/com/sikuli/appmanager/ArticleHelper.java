package com.sikuli.appmanager;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.sikuli.objectmanager.ObjectHelper;

public class ArticleHelper {
private ArticleHelper articleHelper;

public static String editImageArticle = "/inputScreens/ArticleHelper/editImageArticle.PNG";
public static String imageAreaArticle = "/inputScreens/ArticleHelper/imageAreaArticle.PNG";
public static String formattedTextAndImageArticle = "/inputScreens/ArticleHelper/formattedTextAndImageArticle.PNG";
public static String emptyArticle = "/inputScreens/ArticleHelper/emptyArticle.PNG";
public static String tableArticle = "/inputScreens/ArticleHelper/tableArticle.PNG";
public static String textAndImageArticle = "/inputScreens/ArticleHelper/textAndImageArticle.PNG";
public static String textAndAudioArticle = "/inputScreens/ArticleHelper/textAndAudioArticle.PNG";
public static String textAndLinkArticle = "/inputScreens/ArticleHelper/textAndLinkArticle.PNG";
public static String textAndTableArticle = "/inputScreens/ArticleHelper/textAndTableArticle.PNG";
public static String textAndExternalLinkArticle = "/inputScreens/ArticleHelper/textAndExternalLinkArticle.PNG";
public static String textAndPopUpArticle = "/inputScreens/ArticleHelper/textAndPopUpArticle.PNG";
public static String textAndPopUpImageArticle = "/inputScreens/ArticleHelper/textAndPopUpImageArticle.PNG";
public static String textArticle = "/inputScreens/ArticleHelper/textArticle.PNG";
public static String addImageArticle = "/inputScreens/ArticleHelper/addImageArticle.PNG";
public static String addPopUpObjectArticle = "/inputScreens/ArticleHelper/addPopUpObjectArticle.PNG";
public static String linkArticle = "/inputScreens/ArticleHelper/linkArticle.PNG";
public static String checkBoxTestArticle = "/inputScreens/ArticleHelper/checkBoxTestArticle.PNG";
public static String radioButtonTestArticle = "/inputScreens/ArticleHelper/radioButtonTestArticle.PNG";
public static String freeAnswerTestArticle = "/inputScreens/ArticleHelper/freeAnswerTestArticle.PNG";
public static String reorderingTestArticle = "/inputScreens/ArticleHelper/reorderingTestArticle.PNG";



static Screen screen = new Screen();

public static void openArticle(String articleName) throws FindFailed{
ObjectHelper.clickButton(articleName);
}

public static void setCursor(String emptyArticle) throws FindFailed{
	ObjectHelper.clickButton(emptyArticle);
}

public static void openContextMenu(String object) throws FindFailed{	
	screen.wait(object);
	screen.rightClick(object);
}

public ArticleHelper getArticleHelper() {
	return articleHelper;
}

}
