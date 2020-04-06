package com.qklab.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qklab.base.TestBase;

public class HomePage extends TestBase {

	// Webelements
	@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
	WebElement usernamelable;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement contacts;
	
	@FindBy(xpath = "//a[text()='New Contact']")
	WebElement newContacts;
	
	
	
	@FindBy(xpath = "//a[text()='Deals']")
	WebElement deals;
	
	@FindBy(xpath = "//a[text()='Tasks']")
	WebElement task;
	
	public HomePage() {
		// initialization of web elements
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return usernamelable.isDisplayed();
		
	}
	public ContactsPage clickonContactslink() {
		contacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickonDealslink() {
		deals.click();
		return new DealsPage();
	}
	
	public TaskPage clickonTasklink() {
		task.click();
		return new TaskPage();
	}
	
	public void clickOnNewContacts() {
		
		contacts.click();
		
		Actions action= new Actions(driver);
		action.moveToElement(contacts);
		
		action.moveToElement(contacts);
//		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		driver.get(newContacts.getAttribute("href"));
		
		newContacts.click();
		
		
	
	}
	
		
}
