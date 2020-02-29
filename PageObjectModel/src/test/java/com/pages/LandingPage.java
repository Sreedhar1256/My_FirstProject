package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
WebDriver driver;

    public LandingPage(WebDriver driver) {
    	this.driver=driver;
    }
	public LoginPage signin() {
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		return new LoginPage(driver);
	}
}
