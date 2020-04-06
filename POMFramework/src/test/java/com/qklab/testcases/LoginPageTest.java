package com.qklab.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qklab.base.TestBase;
import com.qklab.pages.HomePage;
import com.qklab.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage ;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		}
	
//	@Test(priority = 1)
	public void LoginPageTitleTest() {
		
		String title = loginpage.validateLoginpageTitle();
		String ActualTItle = "CRMPRO  - CRM software for customer relationship management, sales, and support.";
		Assert.assertEquals(title,title.contains(ActualTItle));
	}
	
	
	@Test(priority = 2)
	public void validateForgotPasswordLinkTest() {
		boolean flag=loginpage.ForgotPasswordLink();
		Assert.assertTrue(flag);
	}
	
//	@Test(priority = 3)
	public void loginTest() {
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@AfterClass
	public void SebdEmailReports() {
		
		System.out.println("Email Sent........................");
	}

}


