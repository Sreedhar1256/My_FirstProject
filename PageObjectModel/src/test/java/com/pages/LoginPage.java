package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void enterEmailId() {
		driver.findElement(By.id("email_create")).sendKeys("sreeni1@gmail.com");
	}
	public void clickCreatAccount() {
		driver.findElement(By.id("SubmitCreate")).click();
	}

}
