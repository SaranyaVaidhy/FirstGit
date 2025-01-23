package org.setDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetDefi2 {
	WebDriver driver;
	
	@Given("user should enter the facebook page")
	public void user_should_enter_the_facebook_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}
	@When("user should enter the login and password")
	public void user_should_enter_the_login_and_password() {
		driver.findElement(By.id("email")).sendKeys("arun@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("uyuyfjjg");
	   
	}
	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		
		driver.findElement(By.name("login")).click();
	
	}
	    
	@Then("user should verify the success message")
	public void user_should_verify_the_success_message() {
		System.out.println("Successfully messaged");
		driver.close();
	    
	}




}
