package org.testng78;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basicofte {
WebDriver driver;  //instance variable
	
	@BeforeSuite
	public void browser4() {
		driver = new ChromeDriver();
	}
	@BeforeTest
	private void urlpass() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}
	@BeforeClass
	private void wait7() throws IOException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sheel\\eclipse-workspace\\Frasher\\photo\\login.png");
		FileUtils.copyFile(scr, des);

	}
	@BeforeMethod
	private void login() {
		System.out.println("Login into flipkart");

	}
	
	
	@Test
       private void tc_01() {
		
		WebElement mob = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		mob.sendKeys("mobiles");
		
		
		
	     }
	
	
	

	@AfterMethod
	private void screen() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sheel\\eclipse-workspace\\Frasher\\photo\\purches.png");
		FileUtils.copyFile(scr, des);
		

	}
	
	@AfterClass
	private void title2() {
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);

	}
	@AfterTest
	private void delehistory() {
		driver.manage().deleteAllCookies();

	}
	@AfterSuite
	private void logout6() {
		driver.close();

	}

}
