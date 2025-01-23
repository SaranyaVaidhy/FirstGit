package org.testng78;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datapa {
	//Parameters-> to send more then one datas
	WebDriver driver;
	@BeforeMethod
	private void setDe() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
   @Parameters({"email2","pass2","email1","pass1"})
	@Test
	private void login(String user,String pass) {
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

}
