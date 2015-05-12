package com.sikuli.objectmanager;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;

import com.sikuli.appmanager.AddHelper;
import com.sikuli.appmanager.DeleteHelper;

public class TableHelper {
	
	public static String addTableToolbar = "/inputScreens/TableHelper/addTableToolbar.PNG";
	public static String addColumnCheck = "/inputScreens/TableHelper/addColumnCheck.PNG";
	public static String addRowCheck = "/inputScreens/TableHelper/addRowCheck.PNG";
	public static String deleteRowCheck = "/inputScreens/TableHelper/deleteRowCheck.PNG";
	public static String deleteColumnCheck = "/inputScreens/TableHelper/deleteColumnCheck.PNG";
	public static String addTableBackgroundColourCheck = "/inputScreens/TableHelper/addTableBackgroundColourCheck.PNG";
	public static String addTableBackgroundColourRowCheck = "/inputScreens/TableHelper/addTableBackgroundColourRowCheck.PNG";
	public static String addTableBackgroundColourColumnCheck = "/inputScreens/TableHelper/addTableBackgroundColourColumnCheck.PNG";
	public static String addTableBackgroundColourSingleCellCheck = "/inputScreens/TableHelper/addTableBackgroundColourSingleCellCheck.PNG";
	public static String addTableBorderColourCheck = "/inputScreens/TableHelper/addTableBorderColourCheck.PNG";
	public static String addTableBorderColourRowCheck = "/inputScreens/TableHelper/addTableBorderColourRowCheck.PNG";
	public static String addTableBorderColourColumnCheck = "/inputScreens/TableHelper/addTableBorderColourColumnCheck.PNG";
	public static String addTableBorderColourSingleCellCheck = "/inputScreens/TableHelper/addTableBorderColourSingleCellCheck.PNG";
	public static String allTableCellStyle = "/inputScreens/TableHelper/allTableCellStyle.PNG";
	public static String backgroundColour = "/inputScreens/TableHelper/backgroundColour.PNG";
	public static String borderColour = "/inputScreens/TableHelper/borderColour.PNG";
	public static String borderWidth = "/inputScreens/TableHelper/borderWidth.PNG";
	public static String borderWidthBasic = "/inputScreens/TableHelper/borderWidthBasic.PNG";
	public static String addTableBorderWidthCheck = "/inputScreens/TableHelper/addTableBorderWidthCheck.PNG";
	public static String addTableBorderWidthRowCheck = "/inputScreens/TableHelper/addTableBorderWidthRowCheck.PNG";
	public static String addTableBorderWidthColumnCheck = "/inputScreens/TableHelper/addTableBorderWidthColumnCheck.PNG";
	public static String addTableBorderWidthSingleCellCheck = "/inputScreens/TableHelper/addTableBorderWidthSingleCellCheck.PNG";
	public static String columnCellStyle = "/inputScreens/TableHelper/columnCellStyle.PNG";
	public static String rowCellStyle = "/inputScreens/TableHelper/rowCellStyle.PNG";
	public static String singleCellStyle = "/inputScreens/TableHelper/singleCellStyle.PNG";
	public static String style = "/inputScreens/TableHelper/style.PNG";
	public static String table = "/inputScreens/TableHelper/table.PNG";
	public static String join = "/inputScreens/TableHelper/join.PNG";
	public static String joinCellsDown = "/inputScreens/TableHelper/joinCellsDown.PNG";
	public static String joinCellsToRight = "/inputScreens/TableHelper/joinCellsToRight.PNG";
	public static String joinColumnsCheck = "/inputScreens/TableHelper/joinColumnsCheck.PNG";
	public static String joinRowsCheck = "/inputScreens/TableHelper/joinRowsCheck.PNG";
	public static String joinCellsDownCheck = "/inputScreens/TableHelper/joinCellsDownCheck.PNG";
	public static String joinCellsToRightCheck = "/inputScreens/TableHelper/joinCellsToRightCheck.PNG";
	

	public static void addTableThroughToolbar() throws FindFailed, InterruptedException, AWTException{				
		AddHelper.addThroughToolbar(TableHelper.addTableToolbar);				
	}

	public static void changeBackgroundColourAndConfirm(String cell) throws FindFailed {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(backgroundColour);		
		ObjectHelper.clickButton(TextHelper.colorPink);	
		ObjectHelper.clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBackgroundColour(String cell) throws FindFailed {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(backgroundColour);		
		ObjectHelper.clickButton(TextHelper.colorPink);					
	}
	
	public static void changeBorderColourAndConfirm(String cell) throws FindFailed {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(borderColour);		
		ObjectHelper.clickButton(TextHelper.colorPink);	
		ObjectHelper.clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBorderColour(String cell) throws FindFailed {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(borderColour);		
		ObjectHelper.clickButton(TextHelper.colorPink);				
	}
	
	public static void changeBorderWidthAndConfirm(String cell) throws FindFailed, AWTException {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(borderWidth);		
		ObjectHelper.changeFieldValue(borderWidthBasic, "10");
		ObjectHelper.clickButtonInCertainArea(ObjectHelper.ok);		
	}
	
	public static void changeBorderWidth(String cell) throws FindFailed, AWTException {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(style);
		ObjectHelper.clickButton(borderWidth);		
		ObjectHelper.changeFieldValue(borderWidthBasic, "10");				
	}
	
	public static void addCells(String cell) throws FindFailed, AWTException {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(AddHelper.addContextMenu);			
	}
	
	public static void deleteCells(String cell) throws FindFailed, AWTException {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(DeleteHelper.deleteObjectButton);			
	}
	
	public static void joinCells(String cell, String joinType) throws FindFailed, AWTException {
		ObjectHelper.openContextMenu(cell);
		ObjectHelper.clickButton(joinType);			
	}
}
