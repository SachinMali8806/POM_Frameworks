package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class EntityListPage extends AbstractPage{
	
	
	//Enter Entity Code or Name
	//input[@placeholder='Enter Entity Code or Name']
	@FindBy(xpath = "//input[@placeholder='Enter Entity Code or Name']")
    private ExtendedWebElement entrEntityCodeOrName;
	
	//Auto Suggestion Entity
	//li[@class='AFAutoSuggestItem']
	@FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
    private ExtendedWebElement autoSuggEntity;
	
	//Filter By
	//span[text()='Filter By']
	@FindBy(xpath = "//span[text()='Filter By']")
    private ExtendedWebElement filterBy;
	
	//Click On Entire Row
	//span[contains(@class,'af_inputText_content')]/../../../..
	@FindBy(xpath = "//span[contains(@class,'af_inputText_content')]/../../../..")
    private ExtendedWebElement entireRow;
	
	
	//first Entity
	//td[@role='gridcell']/..
	 @FindBy(xpath = "//td[@role='gridcell']/..")
	    private ExtendedWebElement mouseHovrEntity;
	 
	 //Click on entity details page for deactivate
	//a[@class='infoBtn af_link p_AFTextOnly']
	 @FindBy(xpath = "//a[@class='infoBtn af_link p_AFTextOnly']")
	    private ExtendedWebElement deactivate;
	 
	 //click On modify Icon
		//a[contains(@class,'editBtn af_link p_AFTextOnly')]
		 @FindBy(xpath = "//a[contains(@class,'editBtn af_link p_AFTextOnly') and contains(@role,'link')]")
		    private ExtendedWebElement modifyIcon;
	 
	 //Deactivate Entity Button
	//span[text()='Deactivate Entity']
	 @FindBy(xpath = "//span[text()='Deactivate Entity']/..")
	    private ExtendedWebElement deactivateEntityBTN;
	 
	 //Confirm Button
	//span[text()='Confirm']
	 @FindBy(xpath = "//span[text()='Confirm']/..")
	    private ExtendedWebElement confirmBTN;
	 
	 //OK BTN
	//span[text()='OK']
	 @FindBy(xpath = "//span[text()='OK']")
	    private ExtendedWebElement okBTN;
	 
	//Entity Name EN
	    //input[@placeholder='Entity Name EN']
	    @FindBy(xpath = "//input[@placeholder='Entity Name EN']")
	    private ExtendedWebElement entityNameEN;
	    
	    //Nationality
	  //label[text()='Nationality']/../../../tr[2]//input
	    @FindBy(xpath = "//label[text()='Nationality']/../../../tr[2]//input")
	    private ExtendedWebElement Nationality; 
	    
	  //Entity Name AR Input
		  //input[@placeholder='Entity Name AR']
		    @FindBy(xpath = "//input[@placeholder='Entity Name AR']")
		    private ExtendedWebElement  entityNameAR;
		    
		  //Select Location 
			  //input[@placeholder='Select Location']
			    @FindBy(xpath = "//input[@placeholder='Select Location']")
			    private ExtendedWebElement  selectLocation; 
			    
			    //Select Particular Location Dubai
			  //li[contains(text(),'102')]
			  //li[text()='102 - Dubai']
			    @FindBy(xpath = "//li[contains(text(),'%s')]")
			    private ExtendedWebElement  selectAnyLocation; 
			    
	 
	 
	 
	public EntityListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void typeEntrEntityCodeOrName(String entity_Name_EN)
	{
		entrEntityCodeOrName.type(entity_Name_EN);
	}
	//li[contains(text(),'abc')]
	public void clickOnEntity()
	{
		     WebElement ele = driver.findElement(By.xpath("//li[contains(text(),'abc')]"));
		     
		   ele.click();
	}
	
	public void clickOnAutoSuggItem()
	{
		     autoSuggEntity.clickIfPresent();
	}
	
	public void clickOnEntireRow()
	{
		     entireRow.clickIfPresent();
	}
	
	
	
	public void mouseHoverOnEntity()
	{
		mouseHovrEntity.hover();
	}
	
	public NewEntityPage clickOnModifyIcon()
	{
		modifyIcon.clickIfPresent();
		
		return new NewEntityPage(getDriver());
	}
	
	public void clickOnDeactivateIcon()
	{
		deactivate.clickIfPresent();
	}
	
	public void clickOnDeactivateEntityBTN()
	{
		deactivateEntityBTN.clickIfPresent();
		
		deactivateEntityBTN.clickIfPresent();
	}
	
	public void clickOnConfirmBTN()
	{
		confirmBTN.clickIfPresent();
	}
	
	public void clickOnOkBTN()
	{
		okBTN.clickIfPresent();
	}
	

}
