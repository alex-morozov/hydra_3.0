package com.sikuli.objectmanager;

import java.awt.AWTException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.DeleteHelper;
import com.sikuli.appmanager.EditHelper;

public class TableHelper extends ObjectHelper {
	
	static Screen screen = new Screen();
	
	public static String addTableToolbar = "/inputScreens/TableHelper/addTableToolbar.PNG";
	public static String addColumnCheck = "/inputScreens/TableHelper/addColumnCheck.PNG";
	public static String addRowCheck = "/inputScreens/TableHelper/addRowCheck.PNG";
	public static String deleteRowCheck = "/inputScreens/TableHelper/deleteRowCheck.PNG";
	public static String deleteColumnCheck = "/inputScreens/TableHelper/deleteColumnCheck.PNG";
	public static String BackgroundColourCheck = "/inputScreens/TableHelper/BackgroundColourCheck.PNG";
	public static String BackgroundColourRowCheck = "/inputScreens/TableHelper/BackgroundColourRowCheck.PNG";
	public static String BackgroundColourColumnCheck = "/inputScreens/TableHelper/BackgroundColourColumnCheck.PNG";
	public static String BackgroundColourSingleCellCheck = "/inputScreens/TableHelper/BackgroundColourSingleCellCheck.PNG";
	public static String BorderColourCheck = "/inputScreens/TableHelper/BorderColourCheck.PNG";
	public static String BorderColourRowCheck = "/inputScreens/TableHelper/BorderColourRowCheck.PNG";
	public static String BorderColourColumnCheck = "/inputScreens/TableHelper/BorderColourColumnCheck.PNG";
	public static String BorderColourSingleCellCheck = "/inputScreens/TableHelper/BorderColourSingleCellCheck.PNG";
	public static String allTableCellStyle = "/inputScreens/TableHelper/allTableCellStyle.PNG";
	public static String backgroundColour = "/inputScreens/TableHelper/backgroundColour.PNG";
	public static String borderColour = "/inputScreens/TableHelper/borderColour.PNG";
	public static String borderWidth = "/inputScreens/TableHelper/borderWidth.PNG";
	public static String borderWidthBasic = "/inputScreens/TableHelper/borderWidthBasic.PNG";
	public static String BorderWidthCheck = "/inputScreens/TableHelper/BorderWidthCheck.PNG";
	public static String BorderWidthRowCheck = "/inputScreens/TableHelper/BorderWidthRowCheck.PNG";
	public static String BorderWidthColumnCheck = "/inputScreens/TableHelper/BorderWidthColumnCheck.PNG";
	public static String BorderWidthSingleCellCheck = "/inputScreens/TableHelper/BorderWidthSingleCellCheck.PNG";
	public static String columnCellStyle = "/inputScreens/TableHelper/columnCellStyle.PNG";
	public static String rowCellStyle = "/inputScreens/TableHelper/rowCellStyle.PNG";
	public static String singleCellStyle = "/inputScreens/TableHelper/singleCellStyle.PNG";
	public static String style = "/inputScreens/TableHelper/style.PNG";
	public static String idTable = "/inputScreens/TableHelper/idTable.PNG";
	public static String table = "/inputScreens/TableHelper/table.PNG";
	public static String bigTable = "/inputScreens/TableHelper/bigTable.PNG";
	public static String join = "/inputScreens/TableHelper/join.PNG";
	public static String joinCellsDown = "/inputScreens/TableHelper/joinCellsDown.PNG";
	public static String editTableWindowTitle = "/inputScreens/TableHelper/editTableWindowTitle.PNG";
	public static String joinCellsToRight = "/inputScreens/TableHelper/joinCellsToRight.PNG";
	public static String joinColumnsCheck = "/inputScreens/TableHelper/joinColumnsCheck.PNG";
	public static String joinRowsCheck = "/inputScreens/TableHelper/joinRowsCheck.PNG";
	public static String joinCellsDownCheck = "/inputScreens/TableHelper/joinCellsDownCheck.PNG";
	public static String joinCellsToRightCheck = "/inputScreens/TableHelper/joinCellsToRightCheck.PNG";
	public static String tableDublicationCheck = "/inputScreens/TableHelper/tableDublicationCheck.PNG";
	public static String tableRelocationCheck = "/inputScreens/TableHelper/tableRelocationCheck.PNG";
	public static String undoTableRelocationOrDublicationCheck = "/inputScreens/TableHelper/undoTableRelocationOrDublicationCheck.PNG";
	

	public static void addTableThroughToolbar() throws FindFailed, InterruptedException, AWTException{				
		AddHelper.addThroughToolbar(TableHelper.addTableToolbar);				
	}

	public static void changeBackgroundColourAndConfirm(String cell) throws FindFailed {
		changeBackgroundColour(cell);		
		clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBackgroundColour(String cell) throws FindFailed {
		openContextMenu(cell);
		clickButton(style);
		clickButton(backgroundColour);		
		clickButton(TextHelper.colorPink);					
	}
	
	public static void changeBorderColourAndConfirm(String cell) throws FindFailed {
		changeBorderColour(cell);	
		clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBorderColour(String cell) throws FindFailed {
		openContextMenu(cell);
		clickButton(style);
		clickButton(borderColour);		
		clickButton(TextHelper.colorPink);				
	}
	
	public static void changeBorderWidthAndConfirm(String cell) throws FindFailed, AWTException {
		changeBorderWidth(cell);
		clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBorderWidth(String cell) throws FindFailed, AWTException {
		openContextMenu(cell);
		clickButton(style);
		clickButton(borderWidth);		
		changeFieldValue(borderWidthBasic, "10");				
	}
	
	public static void addCells(String cell) throws FindFailed, AWTException {
		openContextMenu(cell);
		clickButton(AddHelper.addContextMenu);			
	}
	
	public static void deleteCells(String cell) throws FindFailed, AWTException {
		openContextMenu(cell);
		clickButton(DeleteHelper.deleteObjectButton);			
	}
	
	public static void joinCells(String cell, String joinType) throws FindFailed, AWTException {
		openContextMenu(cell);
		clickButton(joinType);			
	}
	
	public static void editTable(String table) throws FindFailed, InterruptedException, AWTException {
		screen.mouseMove(table);
		EditHelper.editObject(idTable, editTableWindowTitle);							
	}
}
