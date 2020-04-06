package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class EntityContactInformationPage extends AbstractPage {
	
	//Entity Contact Information Details
	//h1[text()='Entity Contact Information']
	@FindBy(xpath = "//h1[text()='Entity Contact Information']")
    private ExtendedWebElement  entityContactInfoDetails ;
	
	//Country
	//label[text()='Country']/../../../tr[2]//input
    @FindBy(xpath = "//label[text()='Country']/../../../tr[2]//input")
    private ExtendedWebElement  country ;
    
  //India/Any Country
  //li[text()='India']
      @FindBy(xpath = "//li[text()='%s']")
      private ExtendedWebElement  anyCountry;
    
    
    //City
    //input[@placeholder='City']
    @FindBy(xpath = " //input[@placeholder='City']")
    private ExtendedWebElement  typeCity; 
    
    
    //Address Line 1
  //textarea[@placeholder='Address Line 1']
    @FindBy(xpath = "//textarea[@placeholder='Address Line 1']")
    private ExtendedWebElement  addresLine1; 
    
    //Submit Button
  //span[text()='Submit']
    @FindBy(xpath = "//span[text()='Submit']")
    private ExtendedWebElement  submitBTN; 

	public EntityContactInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void typeCountry(String country2)
	{
		country.type(country2);
		
		anyCountry.format(country2).clickIfPresent();
		
	}
	
	public boolean isEntityContactInfoPage()
	{
		   return entityContactInfoDetails.isVisible();
		
	}
	
	
	
	public void sendCity(String city)
	{
		typeCity.type(city);
		
	}
	
	public void typeAddresLine1(String address_Line_1)
	{
		addresLine1.type(address_Line_1);
	}
	
	public void clickOnSubmitBTN()
	{
		submitBTN.clickIfPresent();
	}
	

}
