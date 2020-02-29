package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver driver;

	public WebDriver initialization() {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void getUrl(String Url) {
		driver.get(Url);
	}

}
