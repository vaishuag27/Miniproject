package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read 
{
	
	

	@SuppressWarnings({ "unused", "unused" })
	public static void main(String[] args) throws IOException 
    {
		File loc = new File ("C:\\Users\\Anuj\\eclipse\\java project\\MiniProj\\Excel\\Amazonsheet.xlsx");
	    FileInputStream f =new FileInputStream(loc);
	    Workbook wb = new XSSFWorkbook(f);
	    Sheet s = wb.getSheet("Sheet1");
	     
	    String sh1 = s.getRow(1).getCell(0).getStringCellValue();
	    String sh2 = s.getRow(2).getCell(0).getStringCellValue();
	    String sh3 = s.getRow(3).getCell(0).getStringCellValue();
	     
	    String[] list = new String [] {sh1,sh2,sh3};
	    String[] input = new String [3];
	   
	    input[0] = list[0];
	    input[1] = list[1];
	    input[2] = list[2];
	    
	    for (int i=0;i<s.getPhysicalNumberOfRows();i++)
	    {
	    	Row r = s.getRow(i);
	    	for (int j=0;j<s.RightMargin;j++)
	    		
	    	{
	    		Cell c=r.getCell(j);
	    		System.out.println(c);
	    	}
	    }
    }
}