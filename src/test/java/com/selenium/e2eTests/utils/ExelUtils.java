package com.selenium.e2eTests.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtils {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile(String path, String sheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
		}catch(Exception e) {
			throw (e);
		}
	}
	
	public static String getCellData(int rowNum, int colNum) {
		try {
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			String cellData = Cell.getStringCellValue();
			return cellData;
		}catch(Exception e) {
			return "";
		}
	}
	
	public static void setCellData(String result, int rowNum, int colNum) throws Exception {
		try {
			Row = ExcelWSheet.getRow(rowNum);
			Cell = Row.getCell(colNum, Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(colNum);
				Cell.setCellValue(result);
			}else {
				Cell.setCellValue(result);
			}
			
			
			FileOutputStream fileOut = new FileOutputStream(Constant.path_TestData + Constant.file_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e) {
			throw(e);
		}
	}
}
