package com.qklab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qklab.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactslabel;
	
	@FindBy(id = "first_name")
	WebElement fiNamerst;
	
	@FindBy(id = "surname")
	WebElement lastname;
	
	@FindBy(name = "client_lookup")
	WebElement companyName;
	
	@FindBy(xpath = "//input[@value='Save' and @type='submit']")
	WebElement saveButton;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectContactCheckBoxByName(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']/../preceding-sibling::td/input")).click();
	}
	
	
	public boolean verifycontactsLabel() {
		return contactslabel.isDisplayed();
		
	}
	
	public void CreateNewContactsPage(String title, String Fname, String lName, String CompName) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByValue(title);	
		
		fiNamerst.sendKeys(Fname);
		lastname.sendKeys(lName);
		companyName.sendKeys(CompName);
		
		saveButton.click();
		
		
	}
	
}
