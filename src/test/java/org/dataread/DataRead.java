package org.dataread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataRead {

	public static void main(String[] args) throws IOException {
		//Excel Read
		//file-> pre def class
		//in file we will give path of file
		File f = new File("C:\\Users\\sheel\\eclipse-workspace\\Frasher\\newex\\ExampleEx.xlsx");
		//we to convert excel file into program file
		//FileinputStream-pre def class 
		FileInputStream stream =new FileInputStream(f);
		//Workbook->interface 
		Workbook book = new XSSFWorkbook(stream);
		//To read one cell 
		//1. sheet -  get
		//2. row - get
		//3. colum/cell - get ---> can read one cell 
		
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(4);
		//System.out.println(cell);
		//all cell is based on index
		//array all data -for or nesed for
		//getPhysicalnumberofrow-method 
		//getPhysicalnumberofcell-method 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		//System.out.println(physicalNumberOfRows);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		//System.out.println(physicalNumberOfCells);
		// to read all datas in excel
		//i=0 0<8 - true 0+1=1
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			// getRow(0)
			Row row2 = sheet.getRow(i);
			String value =null;
			//j=0 0<8 0+1=1
			//j=1 1<8
			//j=8 8<8----false 
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				//0.getCell(0)
				//0.getcell(1)
				Cell cell2 = row2.getCell(j);
				//System.out.println(cell2);
				//input --> 2 types/logic
				//1.String/alp or 2.Number
				//To need to check which type of data is present in the cell
				CellType cellType = cell2.getCellType();
				//System.out.println(cellType);
				  //in case i'm going to read 1.getCell(6)
				//NUMERIC == STRING --> fales
				if(cellType==CellType.STRING) {
					value = cell2.getStringCellValue();
					//System.out.println(scv);
					
					
				}
				//NUMERIC == NUMERIC --> true
				if(cellType==CellType.NUMERIC) {
					double ncv = cell2.getNumericCellValue();
					//to store any phone number we will use long datatype
					//need to do casting
					long d = (long) ncv;
					//System.out.println(d);
					value = String.valueOf(d);
					//to pass phone number in the fb login
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.facebook.com/");
					
					driver.findElement(By.id("email")).sendKeys(value);
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
