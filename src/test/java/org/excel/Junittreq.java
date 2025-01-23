package org.excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittreq {
	static WebDriver  driver;//instance variable
	@BeforeClass
	public static void tc_01() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
	}
	@Before
	public void tc_02() {
		driver.manage().window().maximize();
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}

	@Test
	public void tc_03() {
		driver.findElement(By.id("email")).sendKeys("gugan@gmail.com");
	}
	@Test
	public void tc_04() {
		driver.findElement(By.id("pass")).sendKeys("897gtrey");

	}
	@Test
	public void tc_05() {
		driver.findElement(By.name("login")).click();

	}
	
	@After
	public void tc_o6() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("\\newex\\screen.png");
		FileUtils.copyFile(scr, des);
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
		

	}
	
	@AfterClass
	public static void tc_07() {
		driver.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
