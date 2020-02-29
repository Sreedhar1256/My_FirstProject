package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		}
	public void gender() {
		driver.findElement(By.id("id_gender1")).click();
		}
	public void firstName() {
		driver.findElement(By.id("customer_firstname")).sendKeys("Sreene");
	}
	public void lastName() {
		driver.findElement(By.id("customer_lastname")).sendKeys("Kedasu");
	}
   public void password() {
	   driver.findElement(By.id("passwd")).sendKeys("Sreene@123");
   }
   public void dateOfBirth() {
	   new Select(driver.findElement(By.id("days"))).selectByValue("6");
	   new Select(driver.findElement(By.id("months"))).selectByValue("4");
	   new Select(driver.findElement(By.id("years"))).selectByValue("1990");
   }
   public void addres() {
	   driver.findElement(By.id("address1")).sendKeys("aesrdyfguuio,54656,esrdyfugih");
   }
   public void city() {
	   driver.findElement(By.id("city")).sendKeys("NewYork");
   }
   public void state() {
	 new Select(driver.findElement(By.id("id_state"))).selectByValue("32");
   }
   public void pCode() {
	   driver.findElement(By.id("postcode")).sendKeys("56789");
   }
   public void addInfo() {
	   driver.findElement(By.id("other")).sendKeys("srdtghjiozrtdryf");
   }
   public void phno() {
	   driver.findElement(By.id("phone_mobile")).sendKeys("7845621309");
   }
   public void register() {
	   driver.findElement(By.id("submitAccount")).click();
   }
   
   
   
}
  