package org.testng78;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exdatapro {
	WebDriver driver;
	@BeforeMethod
	private void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	}
	
    @Parameters
	@Test ()
	private void login(String user, String password) {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(user);
		mail.sendKeys(Keys.ENTER);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		mail.sendKeys(Keys.ENTER);

	}
	
	

}
