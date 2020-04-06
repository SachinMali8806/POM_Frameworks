package com.qaprosoft.carina.demo.gui.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ServiceListPage extends AbstractPage{
	
	//Services and Service Groups Title
	//span[text()='Services and Service Groups']
	@FindBy(xpath = "//span[text()='Services and Service Groups']")
    private ExtendedWebElement servceAndServiceGrp;
	
	//Inactive tab
	//span[text()='Inactive']
	@FindBy(xpath = "//span[text()='Inactive']")
    private ExtendedWebElement inactiveTab;
	
	//In Progress tab
	//span[text()='In Progress']
	@FindBy(xpath = "//span[text()='In Progress']")
    private ExtendedWebElement inprogressTab;
	
	//Service Groups
	//span[text()='Service Groups']/..
	@FindBy(xpath = "//span[text()='Service Groups']/..")
    private ExtendedWebElement serviceGroups;
	
	
	//Enter Entity Code or Name
	//input[@placeholder='Enter Entity Code or Name']
	@FindBy(xpath = "//input[@placeholder='Service Name or Code']")
    private ExtendedWebElement entrServiceCodeOrName;
	

	//Enter Group Name or Code
	//input[@placeholder='Group Name or Code']
	@FindBy(xpath = "//input[@placeholder='Group Name or Code']")
    private ExtendedWebElement entrGroupCodeOrName;
	
	//Auto Suggestion Entity
	//li[@class='AFAutoSuggestItem']
	@FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
    private ExtendedWebElement autoSuggEntity;
	
	//Filter By
	//span[text()='Filter By']
	@FindBy(xpath = "//span[text()='Filter By']")
    private ExtendedWebElement filterBy;
	
	//Click On Entire Row
	//tr[@class='af_table_data-row']
	@FindBy(xpath = "//tr[@class='af_table_data-row']")
    private ExtendedWebElement entireRow;
	
	//Click On Reactivate Icon
	//span[text()='Re Activate']
	@FindBy(xpath = "//span[text()='Re Activate']")
    private ExtendedWebElement reactivateIcon;
	
	
	
			
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
	
	
	
	
	
	//Click On Row for modify Service
	//tr[@role='row']
	@FindBy(xpath = "//tr[@role='row']")
    private ExtendedWebElement entireRowForModify;
	
	
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
	 @FindBy(xpath = "//span[text()='Deactivate service']")
	    private ExtendedWebElement deactivateServiceBTN;
	 
	 //Deactive Service Group
	 ////span[text()='Deactive Service Group']/..
	 @FindBy(xpath = "//span[text()='Deactive Service Group']/..")
	    private ExtendedWebElement deactivateServiceGroupBTN;
	 
	 
	 //Select Date for Deactivation
	//a[@aria-label='Select Date']
	 @FindBy(xpath = "//a[@aria-label='Select Date']")
	    private ExtendedWebElement deactivateServiceDateBTN;
	 
	 //Select Date for Deactivation
	 //td[@class='af_chooseDate_regular-day']
	 @FindBy(xpath = "//td[@class='af_chooseDate_regular-day']")
	    private ExtendedWebElement deactivateServiceDate;
	 
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
	 
	
	  
	    //Save Service
	//span[text()='Save Service']
	  @FindBy(xpath = " //span[text()='Save Service']")
	    private ExtendedWebElement  saveService;
	  
	  //Save Service
	//span[text()='Save Service Group']
		  @FindBy(xpath = " //span[text()='Save Service Group']")
		    private ExtendedWebElement  saveServiceGroup;
	  
	  
	  //Service Name EN
	  //input[@placeholder='Service Name EN']
	    @FindBy(xpath = "//input[@placeholder='Service Name EN']")
	    private ExtendedWebElement serviceNameEN;
	 
	    //Select Date Icon
	    //a[@title='Select Date and Time']
	  	    @FindBy(xpath = " //a[@title='Select Date and Time']")
	  	    private ExtendedWebElement  selectDateAndTime;
	  	  
	  	 //Select Date Icon for deactivate date   
	  	//a[@title='Select Date']
	  	  @FindBy(xpath = " //a[@title='Select Date']")
	  	    private ExtendedWebElement  selectDate;
	  	  
	  	//OK BTN for updated date
		  //(//button[text()='OK'])[2]
		  @FindBy(xpath = "(//button[text()='OK'])[2]")
		  private ExtendedWebElement  OKBTN1; 
	  	  
	
	  	    
	  	    
	  	    //Select Todays Date
	  	  //td[@class='af_chooseDate_today p_AFSelected']
	  	    @FindBy(xpath = "(//td[@class='af_chooseDate_today p_AFSelected'])[2]")
	  	    private ExtendedWebElement  selectTodaysDate;
	  	    
	  	  //Select Any Date
	  	  //td[text()='%s']
	  		    @FindBy(xpath = "//td[text()='18']")
	  		    private ExtendedWebElement  selectAnyDate;
	  		    
	  	    //Hour Input
	  		  //label[text()='Select Hours']/../input
	  		    @FindBy(xpath = "//label[text()='Select Hours']/../input")
	  		    private ExtendedWebElement  hourInput;
	  		    
	  		    //AM
	  		    //(//input[@type='radio'])[3]
	  		    @FindBy(xpath = "(//input[@type='radio'])[3]")
	  		    private ExtendedWebElement amBTN;
	  		    
	  		  //AM
	  		    //(//input[@type='radio'])[4]
	  		    @FindBy(xpath = "(//input[@type='radio'])[4]")
	  		    private ExtendedWebElement pmBTN;
	  		    
	  		    
	  		    //OK Button for Reactivate Entity
	  		  //(//button[text()='OK'])[2]
	  		  @FindBy(xpath = "(//button[text()='OK'])[2]")
	  		    private ExtendedWebElement okBTN1;
	  		    
	  		 //Service Activation – End Date & Time   
	  		//input[@placeholder='Service Activation – End Date & Time']   
	  		  @FindBy(xpath = "//input[@placeholder='Service Activation – End Date & Time']")
	  		    private ExtendedWebElement endDateTime;   
	  		  
	  		  //End Date And Time For service Group
	  		//input[@placeholder='Service Activation – End Date & Time']   
	  		  @FindBy(xpath = "//input[@placeholder='Service Group Activation – End Date & Time']")
	  		    private ExtendedWebElement serviceGroupEndDateTime;
	  		  
	  	    
	  	    //Increment hour
	  	    //(//a[@title='Increment'])[6]
	  	    //(//div[@class='af_chooseDate_increment-cell']/a)[6]
	  	    @FindBy(xpath = "(//a[@title='Increment'])[6]")
	  	    private ExtendedWebElement  incrementHour;
	  	    
	  	    
	      
	      //Notes
	  	  //label[text()='Notes']/../../../tr[2]/td
	      @FindBy(xpath = " //label[text()='Notes']/../../../tr[2]/td/textarea")
	      private ExtendedWebElement notes; 
	      
	      

		  	//Share Type
		  	//(//select[contains(@title,'Fixed Amount')])[2]
		  	@FindBy(xpath = "(//select[contains(@title,'Fixed Amount')])[2]")
	  	    private ExtendedWebElement shareType;
		  	
		  	//Any Share Type
		  //option[contains(text(),'%s')]
		  	@FindBy(xpath = "//option[contains(text(),'%s')]")
	  	    private ExtendedWebElement anyShareType;
		  	
		   //Amount
		  //input[@placeholder='Amount']
		  	@FindBy(xpath = "//input[@placeholder='Amount']")
	  	    private ExtendedWebElement amount;
		  	
		   //Share Rule Type
		  //select[@title='Specific Entity']
		  	@FindBy(xpath = "//select[@title='Specific Entity']")
	  	    private ExtendedWebElement specificEntity;
		  	
		  //Select Any Share Rule Type	
		  //option[text()='%s']
		  	@FindBy(xpath = "//option[text()='%s']")
	  	    private ExtendedWebElement anyShareRuleTyp;
		  	
		  	//Share Entity
		  //input[@placeholder='Share Entity']
		  	@FindBy(xpath = " //input[@placeholder='Share Entity']")
	  	    private ExtendedWebElement shareEntity;
		  	
		  	//Any Share Entity
		       //li[text()='%S']
			  	@FindBy(xpath = "//li[text()='%s']")
		  	    private ExtendedWebElement anyShareEntity;
		  	
		   //Select Revenue Account Type	
		  //input[@placeholder='Select Revenue Account Type']
		  	@FindBy(xpath = "//input[@placeholder='Select Revenue Account Type']")
	  	    private ExtendedWebElement selectRevAccType;
		  	
		  //Select Any Revenue Account Reference
		  //li[text()='%s']
		  	@FindBy(xpath = "//li[text()='%s']")
	  	    private ExtendedWebElement selectAnyRevAccRef;
		  	
		  	//Select Account Type
		  //select[@title='Select Account Type']
		  	@FindBy(xpath = "//select[@title='Select Account Type']")
	  	    private ExtendedWebElement selAccType;
		  	
		  //Select Any Account Type
		  //option[@title='%s']
		  	@FindBy(xpath = "//option[@title='%s']")
	  	    private ExtendedWebElement selAnyAccType;
		  	
		 	
		  	 
		  	//Select VAT
		  	//select[@title='Select VAT']
		  	 @FindBy(xpath = " //select[@title='Select VAT']")
		  	 private ExtendedWebElement  selectVAT;  
		  	 
		  	//Select Any VAT
		  	//option[@title='%s']
		  	 @FindBy(xpath = "//option[@title='%s']")
		  	 private ExtendedWebElement  anyVAT;
		  	 
		  	 //Service Reactivate Successfull Message
		  	//(//td[@class='af_dialog_content'])[3]//span
		  	 @FindBy(xpath = "(//td[@class='af_dialog_content'])[3]//span")
		  	 private ExtendedWebElement  reaSuccMessage;
		  	 
		  // Checkbox
			  	//(//label[@class='p_OraHiddenLabel'])[2]
				//label[@class='p_OraHiddenLabel']
				  @FindBy(xpath = "(//label[@class='p_OraHiddenLabel'])[2]")
				  private ExtendedWebElement  checkbox;
				  
				//Submit For Approval
					//span[text()='Submit For Approval']
					  @FindBy(xpath = "//span[text()='Submit For Approval']")
					  private ExtendedWebElement  submitForApprvl;
					  
					  //Message After Submit for Approval
					  ////div[contains(text(),'The request has been initiated, we will keep you updated on the progress.')]
					  @FindBy(xpath = "//div[contains(text(),'The request has been initiated, we will keep you updated on the progress.')]")
					  private ExtendedWebElement  MssgsubmitForApprvl;
					  
					  
					  //Click On Entire Row for Submit for Approval
					//tr[@role='row']
					  @FindBy(xpath = "//tr[@role='row']")
					  private ExtendedWebElement  rowForApprovl; 
					  
	                 
	 
	 
	public ServiceListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isServceAndServiceGrp()
	{
		 return servceAndServiceGrp.isVisible();
	}
	
	public void clickOnInactiveTab()
	{
		inactiveTab.clickIfPresent();
	}
	public void clickOnInprogressTab()
	{
		inprogressTab.clickIfPresent();
	}
	
	public void clickOnServiceGroupTab()
	{
		serviceGroups.clickIfPresent();
	}
	public void typeEntrServiceCodeOrName(String service_Group_Name_EN)
	{
		entrGroupCodeOrName.type(service_Group_Name_EN);
	}
	
	public void typeEntrGroupNameOrCode(String group_Name_EN)
	{
		entrGroupCodeOrName.type(group_Name_EN);
	}
	
	public void clickOnAutoSuggItem()
	{
		     autoSuggEntity.clickIfPresent();
	}
	
	public void clickOnEntireRow()
	{
		     entireRow.clickIfPresent();
	}
	
	public void clickOnEntireRowForModify()
	{
		entireRowForModify.clickIfPresent();
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
		
		String todayDate=null ;
		
		      if (todaysDate.isElementPresent()) {
		    	  
		    	  todayDate =todaysDate.getText();
				
			} else {
				
				todayDate = selectTodaysDate.getText();
			}
		
		      
		       
		       
		       
		        int todaysIntDate = Integer.parseInt(todayDate);
		        
		       int nextDate = todaysIntDate+1;
		       
		       anyDate.format(nextDate).clickIfPresent();
		       
		       
		       
		       OKBTN1.clickIfPresent();
		       
		       
		      		
		
	}
	
	public void mouseHoverOnEntity()
	{
		mouseHovrEntity.hover();
	}
	public void clickOnDeactivateIcon()
	{
		deactivate.clickIfPresent();
	}
	
	public NewServicePage clickOnModifyIcon()
	{
		modifyIcon.clickIfPresent();
		
		return new NewServicePage(getDriver());
	}
	
	public NewServiceGroup clickOnModifyIcon1()
	{
		modifyIcon.clickIfPresent();
		
		return new NewServiceGroup(getDriver());
	}
	
	
	public void clickOnDeactivateServiceBTN()
	{
		deactivateServiceBTN.clickIfPresent();
	}
	
	public void clickOnDeactivateServiceGroupBTN()
	{
		deactivateServiceGroupBTN.clickIfPresent();
	}
	
	public void clickOnDeactivateServiceDateBTN()
	{
		deactivateServiceDateBTN.clickIfPresent();
	}
	
	public void clickOnDeactivateServiceDate()
	{
		deactivateServiceDate.clickIfPresent();
	}
	
	public void clickOnDeactivateBTN()
	{
		deactivateBTN.clickIfPresent();
	}
	
	public void clickOnReactivateBTN()
	{
		reactivateIcon.clickIfPresent();
	}
	
	public void selectReactivateDateBTN()
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
		endDateTime.type("");
	}
	
	public void clearGroupEndDate()
	{
		serviceGroupEndDateTime.type("");
		
		
	}
	
	
	
	public void successfullMessageForReactivateService()
	{
		System.out.println(reaSuccMessage.getText());
	}
	
	
	
	
	
	public void clickOnConfirmBTN()
	{
		confirmBTN.clickIfPresent();
	}
	
	public void clickOnOkBTN()
	{
		okBTN.clickIfPresent();
	}
	
	public void typeServiceNameEN(String Service_Name_EN)
	{
		
		 serviceNameEN.type(Service_Name_EN);
	}
	public void clickOnSaveService()
	{
		saveService.clickIfPresent();
	}
	
	public void clickOnSaveServiceGroup()
	{
		saveServiceGroup.clickIfPresent();
	}
	
	public void clickOnSelectDate()
	{
		selectDate.clickIfPresent();
	}
	public void clickOnSelectDateAndTime()
	{
		selectDateAndTime.clickIfPresent();
	}
	

	public void clickOnIncrementHour()
	{
		/*hourInput.clickIfPresent();
		String currHour = hourInput.getText();
		System.out.println(currHour);
		Integer currHour1 = Integer.valueOf(currHour);
		
		if(currHour1>=11)
		{
			incrementHour.clickIfPresent();
			if(amBTN.isChecked())
			{
				pmBTN.clickIfPresent();
			}
			else
			{
				if(pmBTN.isChecked())
				{
					amBTN.clickIfPresent();
				}
				
			}
		}
		else
		{
		incrementHour.clickIfPresent();
		}*/
		
		incrementHour.clickIfPresent();
	}
	
	public void typeNotes(String notes2)
	{
		 String str = RandomStringUtils.randomAlphanumeric(5);
		
		notes.type(notes2);
	}
	
	public void typeAmount(String amount2)
	{
		 amount.click();
		 amount.type(amount2);
	}
	
	public void selectShareType(String share_Type)
	{
		 shareType.clickIfPresent();
		 anyShareType.format(share_Type).clickIfPresent();
		 
	}
	
	public void selectShareRuleType(String share_Rule_Type)
	{
		specificEntity.clickIfPresent();
		
		anyShareRuleTyp.format(share_Rule_Type).clickIfPresent();
	}
	public void selectAnyShareEntity(String share_Entity)
	{
		shareEntity.type(share_Entity);
		anyShareEntity.format(share_Entity).clickIfPresent();

	}
	
	public void SelectAnyRevAccReference(String revenue_Account_Reference)
	{
		selectRevAccType.type(revenue_Account_Reference);
		selectAnyRevAccRef.format(revenue_Account_Reference).clickIfPresent();
	}
	
	public void clickOnAnySelAccType(String settlement_Account_Type)
	{
		selAccType.clickIfPresent();
		selAnyAccType.format(settlement_Account_Type).clickIfPresent();
	}
	
	
	public void SelectVAT(String vAT)
	{
		selectVAT.clickIfPresent();
		anyVAT.format(vAT).clickIfPresent();
	}
	
	public void clickOnCheckBox()
	{
		checkbox.clickIfPresent();
	}
	
	public void clickOnSubmitForApproval()
	{
		submitForApprvl.clickIfPresent();
	}
	
	public void getMssgSubmitforApproval()
	{
		 String str11 = MssgsubmitForApprvl.getText();
		 
		 System.out.println(str11);
	}
	
	public void clickOnRowForApproval()
	{
		 rowForApprovl.clickIfPresent();
	}
	
	
	
	
}
