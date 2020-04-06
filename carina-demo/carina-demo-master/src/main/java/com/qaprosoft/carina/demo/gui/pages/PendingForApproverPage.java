package com.qaprosoft.carina.demo.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;


public class PendingForApproverPage extends AbstractPage {
	
	//*[@id="T:dclay:oc_8416619227ryVt9e1:approve"]/a
	//span[text()='Approve']
	//span[text()='Approve']/../..
	@FindBy(xpath = "//span[text()='Approve']/..")
    private ExtendedWebElement approveBTN;
	
	//Click on checkbox
	//(//span[@class='af_selectBooleanCheckbox_content-input'])[2]
	@FindBy(xpath = "(//span[@class='af_selectBooleanCheckbox_content-input'])[2]//input")
    private ExtendedWebElement checkboXClick;
	
	//Submit Review Result
	//span[text()='Submit Review Result']
	@FindBy(xpath = "//span[text()='Submit Review Result']")
    private ExtendedWebElement submitReviewRes;
	
	//(//input[@type='checkbox'])[2]
	
	//Message After Submit for Approval 
	//div[@class='af_messages_detail']
	  @FindBy(xpath = "//div[@class='af_messages_detail']")
	  private ExtendedWebElement  MssgAftersubmitForApprvl;
	  
	  //Click On View All
	//span[text()='View All']
	  @FindBy(xpath = "//span[text()='View All']")
	  private ExtendedWebElement  viewAllBTN;
	  
	  //OK Button
	//span[text()='OK']
	  @FindBy(xpath = "//span[text()='OK']")
	  private ExtendedWebElement  okBTN;
	  
	//Close Button
	//a[@title='Close']
	  @FindBy(xpath = "//a[@title='Close']")
	  private ExtendedWebElement  closeBTN;
	  
   
	public PendingForApproverPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnApproveBTN()
	{
		 approveBTN.clickIfPresent(5);
		 if (approveBTN.isVisible()) {
			 approveBTN.clickIfPresent(5);

		}
		 
		 
	}
	
	public boolean isApproveBTNDisplayed()
	{
		 
		return approveBTN.isPresent();
		 
	}
	
	public void clickOnCheckBoxClick()
	{
		checkboXClick.clickIfPresent();
	}
	
	public void clickOnSubmitReviewResul()
	{
		submitReviewRes.clickIfPresent();
	}
	
	public boolean isSubmitReviewResulDisplayed()
	{
		return submitReviewRes.isPresent();
	}

	public void getMssgAfterSubmitforApproval()
	{
		 String str11 = MssgAftersubmitForApprvl.getText();
		 
		 System.out.println(str11);
	}
	
	public void clickOnViewAll()
	{
		viewAllBTN.clickIfPresent();
	}
	public ConfirmationReceivedPage clickOnOKBTN()
	{
		okBTN.clickIfPresent();
		
		return new ConfirmationReceivedPage(getDriver());
	}

}
