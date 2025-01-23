package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelcont {

	public static void main(String[] args) throws IOException {
		File f = new File("newex\\ExampleEx.xlsx");
		
		FileInputStream stream =new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(stream);
		
		Sheet sheet = book.getSheet("Sheet1");
		//getPhysicalnumberofrow-->count
		//getPhysicalnumberofcel-->colum
		Row row2 = sheet.getRow(4);
		
		Cell cell2 = row2.getCell(3);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			String value = null; //instance variable
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				//System.out.println(cell);
				
				CellType cellType = cell.getCellType();
				//System.out.println(cellType);
				
				//input numeric-1, String-2
				
				switch(cellType) {
				case  STRING:
				     value= cell.getStringCellValue();
					//System.out.println(scv);
					break;
				case NUMERIC:	
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dcv = cell.getDateCellValue();
						//System.out.println(dcv);
						
						//SimpleDateFormat-pre def class-we customized the date output
						SimpleDateFormat s = new SimpleDateFormat("dd/MM/yy");
						 value = s.format(dcv);	
						
					}
					else {
						double ncv = cell.getNumericCellValue();
						long d = (long)ncv;
						System.out.println(d);
						value = String.valueOf(d);
						//to pass phone number into email field
						WebDriver driver = new ChromeDriver();
						driver.get("https://www.facebook.com");
						driver.findElement(By.id("email")).sendKeys(value);
						break;
					}
					
					default:
						break;
					
				
				
				
				
				
				}

				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
