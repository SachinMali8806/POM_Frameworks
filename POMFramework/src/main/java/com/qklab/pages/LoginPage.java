package com.qklab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qklab.base.TestBase;

public class LoginPage extends TestBase{

	
	// Page factory or Object repositiory
	
	@FindBy(name="username")
	WebElement username; 
	
	@FindBy(name="password")
	WebElement password; 
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotpassword;
	
	public LoginPage() {
		// initializing the web elements or page objects
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions
	
	public String validateLoginpageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean SignUpButton() {
		return signup.isDisplayed();
	}
	
	public boolean ForgotPasswordLink() {
		return forgotpassword.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
	
	
}
