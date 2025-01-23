package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		//1 to mention the path of excel file
		
		
				File f = new File("newex\\ExampleEx.xlsx");
				
				//2 to read the file as input -> FileInput Stream
				FileInputStream input = new FileInputStream(f);
				//3 to mention the type of excel file
				//XSSFWORKBOOK OR HSSFWORKBOOK
				Workbook book = new XSSFWorkbook(input);
				
				//4 to get the sheet to read->workbook-->Sheet Abs
				
				Sheet sheet = book.getSheet("Sheet1");

				for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
					Row row = sheet.getRow(i);
					String value = null;
					for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
						Cell data = row.getCell(j);
						//1.getCell(6)--->numberic
						//System.out.println(data);
						//2 logic-> 1.String or 2.Number
						//cellType-> what of type of value store
						CellType cellType = data.getCellType();
						//incase return type is in int datatype 
						//u can use nested if
						//System.out.println(cellType);
						
						
						switch(cellType) {
						case STRING:
							 value = data.getStringCellValue();
							 //System.out.println(value);
							   
							break;
							
						case NUMERIC:
							//DateUtil->pre def class
							//isCellDateFormatted-->method
							if(DateUtil.isCellDateFormatted(data))
							{
							Date dcv = data.getDateCellValue();
							
							//System.out.println(dcv);
							//simpledateformat->pre def dd/MM/yy or dd/MMM/yy
							SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
							value = sim.format(dcv);
							//System.out.println(format);
							
							}
							else {
								double ncv = data.getNumericCellValue();
								long l = (long) ncv;
								//System.out.println(l);
//								value = String.valueOf(l);
//								//to pass phone numbet to login id
//								 WebDriver driver = new ChromeDriver();
//								 driver.get("https://www.facebook.com/");
//								 WebElement mail = driver.findElement(By.id("email"));
//								 mail.sendKeys(value);
//								 System.out.println(value);
//						
								
								
							}
						
						
						
						
						
						
						
						
						
						}
						
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
					}
				}
				

	}

}
