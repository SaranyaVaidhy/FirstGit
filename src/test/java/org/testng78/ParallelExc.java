package org.testng78;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelExc {
	@Test(invocationCount = 2)
	private void browser2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();

	}
	@Test(enabled = false)
	private void browser3() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();


	}

}
