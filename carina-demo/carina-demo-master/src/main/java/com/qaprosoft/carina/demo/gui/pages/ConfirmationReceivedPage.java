package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ConfirmationReceivedPage extends AbstractPage {
	
    //Confirmation Received
    @FindBy(xpath = "//h1[text()='Confirmation Received']")
    private ExtendedWebElement confirmatnMsg;
    
    //Code
  //label[text()='Code']/../../..//span
    @FindBy(xpath = "//label[text()='Code']/../../..//span")
    private ExtendedWebElement code;
    
    //Name
  //label[text()='Name']/../../..//span
    @FindBy(xpath = "//label[text()='Name']/../../..//span")
    private ExtendedWebElement name;
    
    //Contact ID
  //label[text()='Contact ID']/../../../tr[2]//span
    @FindBy(xpath = "//label[text()='Contact ID']/../../../tr[2]//span")
    private ExtendedWebElement contactIDUser;
    
    //Username
  //label[text()='Username']/../../../tr[2]//span
    @FindBy(xpath = "//label[text()='Username']/../../../tr[2]//span")
    private ExtendedWebElement userNAme;
    
    //Code for Reactivate Services
    //(//span[@class='af_inputText_content'])[1]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[1]")
    private ExtendedWebElement codeSerReactvn;
    
    //Group Code
    //(//span[@class='af_inputText_content'])[1]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[1]")
    private ExtendedWebElement groupCode;
    
    //Fee Code
    //(//span[text()='Code']/../../../../../../..//span[@class='af_inputText_content'])[1]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[1]")
    private ExtendedWebElement codeforFee;
    
  //Service Name for Reactivate Services
    //(//span[@class='af_inputText_content'])[2]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[2]")
    private ExtendedWebElement reactivatedServiceName;
    
    //Fee Name
    //(//span[@class='af_inputText_content'])[2]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[2]")
    private ExtendedWebElement feeName;
    
  //Group Name
    //(//span[@class='af_inputText_content'])[2]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[2]")
    private ExtendedWebElement groupName;
    
    //Type for Reactivate Services
    //(//span[@class='af_inputText_content'])[3]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[3]")
    private ExtendedWebElement reactivatedtype;
    
  //Type for Reactivate Services
    //(//span[@class='af_inputText_content'])[3]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[3]")
    private ExtendedWebElement feetype;
    
  //Group Start Date
    //(//span[@class='af_inputText_content'])[3]
    @FindBy(xpath = "(//span[@class='af_inputText_content'])[3]")
    private ExtendedWebElement groupStartDate;
    
    
    

	public ConfirmationReceivedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void getConfirmationMsg()
	{
		if(confirmatnMsg.isVisible())
		{
			System.out.println(confirmatnMsg.getText());
			System.out.println(code.getText());
			System.out.println(name.getText());
		}
	}
	
	public boolean isConfirmationMsgDisplayed()
	{
		return confirmatnMsg.isVisible();
	}
	
	public void getUserApprovedDetails()
	{
		if(confirmatnMsg.isVisible())
		{
			System.out.println(confirmatnMsg.getText());
			System.out.println(contactIDUser.getText());
			System.out.println(userNAme.getText());
		}
	}
	
	public void reactivateServiceDetails()
	{
		if(confirmatnMsg.isVisible())
		{
			System.out.println(confirmatnMsg.getText());
			System.out.println(reactivatedServiceName.getText());
			System.out.println(reactivatedtype.getText());
		}
	}
	
	public void getFeeDetails()
	{
		if(confirmatnMsg.isVisible())
		{
			System.out.println(confirmatnMsg.getText());
			System.out.println(codeforFee.getText());
			System.out.println(feeName.getText());
			System.out.println(feetype.getText());
		}
	}
	
	public void getGroupDetails()
	{
		if(confirmatnMsg.isVisible())
		{
			System.out.println(confirmatnMsg.getText());
			System.out.println(groupCode.getText());
			System.out.println(groupName.getText());
			System.out.println(groupStartDate.getText());
		}
	}
	
	
}
