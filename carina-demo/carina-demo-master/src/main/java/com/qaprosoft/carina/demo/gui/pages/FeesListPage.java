package com.qaprosoft.carina.demo.gui.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class FeesListPage extends AbstractPage{
	
	
	
	//Fees Title
	//span[text()='Fees']
	@FindBy(xpath = "//span[text()='Fees']")
    private ExtendedWebElement feesTitle;
	
	
	//Inactive tab
		//span[text()='Inactive']
		@FindBy(xpath = "//span[text()='Inactive']")
	    private ExtendedWebElement inactiveTab;
		
		//In Progress tab
		//span[text()='In Progress']
		@FindBy(xpath = "//span[text()='In Progress']")
	    private ExtendedWebElement inprogressTab;
		
	
	
	
	//Enter Fee Code or Name
	//input[@placeholder='Fee Name or Code']
	@FindBy(xpath = "//input[@placeholder='Fee Name or Code']")
    private ExtendedWebElement entrFeeCodeOrName;
	
	//Auto Suggestion Entity
	//li[@class='AFAutoSuggestItem']
	@FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
    private ExtendedWebElement autoSuggEntity;
	
	//Filter By
	//span[text()='Filter By']
	@FindBy(xpath = "//span[text()='Filter By']")
    private ExtendedWebElement filterBy;
	
	//Click On Entire Row
	//tr[@role='row']
	@FindBy(xpath = "//tr[@role='row']")
    private ExtendedWebElement entireRow;
	
	//click On modify Icon
		//a[contains(@class,'editBtn af_link p_AFTextOnly')]
		 @FindBy(xpath = "//a[contains(@class,'editBtn af_link p_AFTextOnly') and contains(@role,'link')]")
		    private ExtendedWebElement modifyIcon;
		 
		// Select Date Icon
		    //a[@title='Select Date and Time']
		  	    @FindBy(xpath = " //a[@title='Select Date and Time']")
		  	    private ExtendedWebElement  selectDateAndTime;
		  	    
		  	    
		  	  //Selected Month
		  	//(//select[@class='af_chooseDate_choice-list-content'])[2]
		  	@FindBy(xpath = "(//select[@class='af_chooseDate_choice-list-content'])[2]")
		      private ExtendedWebElement selectedMonth;
		  	
		  	//Select Next Month
		  	//(//a[@title='Next Month'])[2]
		  	@FindBy(xpath = "(//a[@title='Next Month'])[2]")
		      private ExtendedWebElement nextMonth;
		  	
		  	//(//td[text()='5'])[2]
		  	@FindBy(xpath = "(//td[text()='%s'])[2]")
		      private ExtendedWebElement anyDate;
		  	
		  	
		  	//Todays date
		  	//td[@class='af_chooseDate_today']
		  	@FindBy(xpath = "//td[@class='af_chooseDate_today']")
		      private ExtendedWebElement todaysDate;
		  	
		  	  
		  	//Click On Reactivate Icon
			//span[text()='Re Activate']
			@FindBy(xpath = "//span[text()='Reactivate']")
		    private ExtendedWebElement reactivateIcon; 
			
			  //Select  End Date Icon
		    //a[@title='Select Date and Time']
		  	@FindBy(xpath = "//input[@placeholder='End Date & Time']")
		   private ExtendedWebElement  selectEndDateAndTime;
		  	
		 	 
			  // Checkbox
				  	//(//label[@class='p_OraHiddenLabel'])[2]
					//label[@class='p_OraHiddenLabel']
					  @FindBy(xpath = "//label[@class='p_OraHiddenLabel']")
					  private ExtendedWebElement  checkbox;
					  
					//Submit For Approval
						//span[text()='Submit For Approval']
						  @FindBy(xpath = "//span[text()='Submit For Approval']")
						  private ExtendedWebElement  submitForApprvl;
	
	
	//first Entity
	//td[@role='gridcell']/..
	 @FindBy(xpath = "//td[@role='gridcell']/..")
	    private ExtendedWebElement mouseHovrEntity;
	 
	 //Click on entity details page for deactivate
	//a[@class='infoBtn af_link p_AFTextOnly']
	 @FindBy(xpath = "//a[@class='infoBtn af_link p_AFTextOnly']")
	    private ExtendedWebElement deactivate;
	 
	 //Deactivate Entity Button
	//span[text()='Deactivate Entity']
	 @FindBy(xpath = "//span[text()='Deactivate Fee']/..")
	    private ExtendedWebElement deactivateFeeBTN;
	 
	 //Select Date for Deactivation
	//a[@aria-label='Select Date']
	 @FindBy(xpath = "//a[@aria-label='Select Date']")
	    private ExtendedWebElement deactivateFeeDateBTN;
	 
	 //Select Date for Deactivation
	 //td[@class='af_chooseDate_regular-day']
	 @FindBy(xpath = "//td[@class='af_chooseDate_regular-day']")
	    private ExtendedWebElement deactivateFeeDate;
	 
	 //Click On Deactivate
	//span[text()='Deactivate']
	 @FindBy(xpath = "//span[text()='Deactivate']")
	    private ExtendedWebElement deactivateBTN;
	 
	 //Confirm Button
	//span[text()='Confirm']
	 @FindBy(xpath = "//span[text()='Confirm']/..")
	    private ExtendedWebElement confirmBTN;
	 
	 //OK BTN
	//span[text()='OK']
	 @FindBy(xpath = "//span[text()='OK']")
	    private ExtendedWebElement okBTN;
	 
	   //OK Button for Reactivate Entity
		  //(//button[text()='OK'])[2]
		  @FindBy(xpath = "(//button[text()='OK'])[2]")
		    private ExtendedWebElement okBTN1;
	 
	  //Save Fee
	//span[text()='Save Fee']
	  @FindBy(xpath = "//span[text()='Save Fee']")
	  private ExtendedWebElement  saveFee; 
	  
	  
	//Fee Reactivate Successfull Message
	  	//(//td[@class='af_dialog_content'])[3]//span
	  	 @FindBy(xpath = "(//td[@class='af_dialog_content'])[3]//span")
	  	 private ExtendedWebElement  reaSuccMessage;
     
	 
	 
	 
	public FeesListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isFeesTitle()
	{
		 return feesTitle.isVisible();
	}
	
	public void clickOnInactiveTab()
	{
		inactiveTab.clickIfPresent();
	}
	
	public void clickOnInprogressTab()
	{
		inprogressTab.clickIfPresent();
	}
	public void typeEntrFeeCodeOrName(String fee_Name_EN)
	{
		entrFeeCodeOrName.type(fee_Name_EN);
	}
	
	public void clickOnAutoSuggItem()
	{
		     autoSuggEntity.clickIfPresent();
	}
	
	public void clickOnEntireRow()
	{
		     entireRow.clickIfPresent();
	}
	
	public void clickOnReactivateBTN()
	{
		reactivateIcon.clickIfPresent();
	}
	
	public NewFeePage clickOnModifyIcon()
	{
		modifyIcon.clickIfPresent();
		
		return new NewFeePage(getDriver());
	}
	
	public void clickOnSelectDateAndTime()
	{
		selectDateAndTime.clickIfPresent();
	}
	
	public void selectUpdateDateBTN()
	{
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		SimpleDateFormat month = new SimpleDateFormat("MMM");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		Calendar c = Calendar.getInstance();
		
		System.out.println( month.format(c.getTime()));
		
		  String currMonth = month.format(c.getTime());
		  
		  String selMonth = selectedMonth.getAttribute("title");
		  
		  String selMonth1 = selMonth.substring(0, 3);
		  
		  System.out.println(selMonth);
		
		
		while (!selMonth1.contains(currMonth)) {
						
			nextMonth.clickIfPresent();
			selMonth = selectedMonth.getAttribute("title");
			selMonth1 = selMonth.substring(0, 3);
			continue;			
		}
		
		       String todayDate = todaysDate.getText();
		       
		        int todaysIntDate = Integer.parseInt(todayDate);
		        
		       int nextDate = todaysIntDate+1;
		       
		       anyDate.format(nextDate).clickIfPresent();
		       
		       
		       
		       okBTN1.clickIfPresent();
		       
		       
		      		
		
	}
	
	public void clearEndDate()
	{
		selectEndDateAndTime.getElement().clear();
	}
	
	
	public void clickOnSaveFee()
	{
		saveFee.clickIfPresent();
	}
	
	public void clickOnCheckBox()
	{
		checkbox.clickIfPresent();
	}
	
	public void clickOnSubmitForApproval()
	{
		submitForApprvl.clickIfPresent();
	}
	
	public void mouseHoverOnEntity()
	{
		mouseHovrEntity.hover();
	}
	public void clickOnDeactivateIcon()
	{
		deactivate.clickIfPresent();
	}
	
	public void clickOnDeactivateFeeBTN()
	{
		deactivateFeeBTN.clickIfPresent();
	}
	
	public void clickOnDeactivateFeeDateBTN()
	{
		deactivateFeeDateBTN.clickIfPresent();
	}
	
	public void clickOnDeactivateFeeDate()
	{
		deactivateFeeDate.clickIfPresent();
	}
	
	public void clickOnDeactivateBTN()
	{
		deactivateBTN.clickIfPresent();
	}
	
	public void clickOnConfirmBTN()
	{
		confirmBTN.clickIfPresent();
	}
	
	public void clickOnOkBTN()
	{
		okBTN.clickIfPresent();
	}
	
	public void successfullMessageForReactivateFees()
	{
		System.out.println(reaSuccMessage.getText());
	}
	
	

}
