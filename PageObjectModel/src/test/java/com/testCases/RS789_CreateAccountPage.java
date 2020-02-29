package com.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utils.TestBase;

public class RS789_CreateAccountPage extends TestBase{
	
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
	   driver=initialization();
		getUrl("http://automationpractice.com/index.php");
		Thread.sleep(3000);
	
	}
	@Test
	public void testCase_1() throws InterruptedException {
		//landing page
		LandingPage landingPage=new LandingPage(driver);
		landingPage.signin();
		
		LoginPage loginPage=new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.enterEmailId();
		loginPage.clickCreatAccount();
		CreateAccountPage createAccountPage=new CreateAccountPage(driver);
		Thread.sleep(3000);
		createAccountPage.gender();
		createAccountPage.firstName();
		createAccountPage.lastName();
		createAccountPage.password();
		createAccountPage.dateOfBirth();
		createAccountPage.addres();
		createAccountPage.city();
		createAccountPage.state();
		createAccountPage.pCode();
		createAccountPage.addInfo();
		createAccountPage.phno();
		createAccountPage.register();
		//login page 
		//create account page
		
	}

}
