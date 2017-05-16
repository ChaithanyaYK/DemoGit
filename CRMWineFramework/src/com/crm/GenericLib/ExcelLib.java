package com.crm.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	String fpath="C:\\Users\\LENOVO\\workspace\\SeleniumSample\\CRMWineFramework\\TestDataXML\\testdata.xlsx";
	public String getExcelData(String Sheetname, int rowNum, int colNum) throws Throwable{
		FileInputStream fis= new FileInputStream(fpath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Sheetname);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(colNum).getStringCellValue();
		return data;
		
	}
	public void setExcelData(String Sheetname, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis=new FileInputStream(fpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Sheetname);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(fpath);
		wb.write(fos);
		wb.close();
	
	}

}
