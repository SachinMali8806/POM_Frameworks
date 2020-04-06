package com.qaprosoft.carina.demo.gui.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.NewEntityPage;

public class NewServiceGroup extends AbstractPage {
	
	//Group Details
	//h2[text()='Group Details']
	  @FindBy(xpath = "//h2[text()='Group Details']")
	    private ExtendedWebElement groupDetails;
	
	  
	  
	
	 //Service Group Name
	//input[@placeholder='Service Group Name EN']
    @FindBy(xpath = "//input[@placeholder='Service Group Name EN']")
    private ExtendedWebElement serviceGroupName;
    
    
    
    //Printable Description EN
  //input[@placeholder='Printable Description EN']
    @FindBy(xpath = "//input[@placeholder='Printable Description EN']")
    private ExtendedWebElement printableDescriptionEN;
    
    //Service Type
  //label[text()='Service Type']/../../../tr[2]//input
    @FindBy(xpath = "//label[text()='Service Type']/../../../tr[2]//input")
    private ExtendedWebElement serviceType; 
    
    
  //Select Date Icon
  //a[@title='Select Date and Time']
	    @FindBy(xpath = " //a[@title='Select Date and Time']")
	    private ExtendedWebElement  selectDateAndTime;
	    
	    //Select Todays Date
	  //td[@class='af_chooseDate_today p_AFSelected']
	    @FindBy(xpath = "(//td[@class='af_chooseDate_today p_AFSelected'])[2]")
	    private ExtendedWebElement  selectTodaysDate;
	    
	  //Select Any Date
	  //td[text()='%s']
		    @FindBy(xpath = "//td[text()='%s']")
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
		    
		    
		    
	    
	    //Increment hour
	    //(//a[@title='Increment'])[6]
	    //(//div[@class='af_chooseDate_increment-cell']/a)[6]
	    @FindBy(xpath = "(//a[@title='Increment'])[6]")
	    private ExtendedWebElement  incrementHour;
	    
	    //Increment Minute
	    //(//a[@title='Increment'])[7]
	    @FindBy(xpath = "(//a[@title='Increment'])[7]")
	    private ExtendedWebElement  incrementMinute;
	    
	    //OK Button
	    //button[text()='OK']
	    @FindBy(xpath = "//button[text()='OK']")
	    private ExtendedWebElement  okBTN;
	    
	    
	    
	  
	  //Service Group Name AR
	  //input[@placeholder='Service Group Name AR']
	    @FindBy(xpath = "//input[@placeholder='Service Group Name AR']")
	    private ExtendedWebElement serviceGroupNameAR;
	    
	  //Printable Description AR
	     //input[@placeholder='Printable Description AR']
	    @FindBy(xpath = "//input[@placeholder='Printable Description AR']")
	    private ExtendedWebElement printableDescriptionAR; 
    
    //Notes
	  //label[text()='Notes']/../../../tr[2]/td
    @FindBy(xpath = " //label[text()='Notes']/../../../tr[2]/td/textarea")
    private ExtendedWebElement notes; 
    
    ////Maximum Number of Services
  //label[text()='Maximum Number of Services']/../../..//input
    @FindBy(xpath = " //label[text()='Maximum Number of Services']/../../..//input")
    private ExtendedWebElement maxNumServices;
    
   // Select Service
  //input[@placeholder='Select Service']
    @FindBy(xpath = " //input[@placeholder='Select Service']")
    private ExtendedWebElement selectServices;
    
    //Autosuggested Item for select Services 
  //li[@class='AFAutoSuggestItem']
    @FindBy(xpath = " //li[@class='AFAutoSuggestItem']")
    private ExtendedWebElement autoSuggItem;
    
   //Delete Icon
  //a[@class='fa fa-trash-o distIcons af_link p_AFTextOnly']
    @FindBy(xpath = " //a[@class='fa fa-trash-o distIcons af_link p_AFTextOnly']")
    private ExtendedWebElement deleteIcon; 
    
    //Save Service Group
  //span[text()='Save Service Group']/..
    @FindBy(xpath = "//span[text()='Save Service Group']/..")
    private ExtendedWebElement saveSerGroup;
    
    
    //Service Owner Input
  //label[text()='Service Owner']/../../../tr[2]/td/input
    @FindBy(xpath = " //label[text()='Service Owner']/../../../tr[2]/td/input")
    private ExtendedWebElement serviceOwner;  
    
    
     //Any Service Owner
     //li[text()='%s']
      @FindBy(xpath = "//li[text()='%s']")
      private ExtendedWebElement anyServiceOwnr;
      
      
      //Service Name AR
      //input[@placeholder='Service Name AR']
       @FindBy(xpath = " //input[@placeholder='Service Name AR']")
       private ExtendedWebElement serviceNameAR;
    
    
    
    
       //Select Category
	  //select[@title='Select Category']
	    @FindBy(xpath = "//select[@title='Select Category']")
	    private ExtendedWebElement  selectCategory; 
    
	  //Any Service Category
	    //option[@title='%s']
	    @FindBy(xpath = "//option[@title='%s']")
	    private ExtendedWebElement  anyServiceCat;
	    
	    
	    //Select  End Date Icon
	    //a[@title='Select Date and Time']
	  	    @FindBy(xpath = " (//a[@title='Select Date and Time'])[2]")
	  	    private ExtendedWebElement  selectEndDateAndTime;
	  	    
	  	//Selected Month
	  		//(//select[@class='af_chooseDate_choice-list-content'])[2]
	  		@FindBy(xpath = "(//select[@class='af_chooseDate_choice-list-content'])[2]")
	  	    private ExtendedWebElement selectedMonth;
	  		
	  	//Todays date
	  		//td[@class='af_chooseDate_today']
	  		@FindBy(xpath = "//td[@class='af_chooseDate_today']")
	  	    private ExtendedWebElement todaysDate;
	  		
	  	//Select Next Month
	  		//(//a[@title='Next Month'])[2]
	  		@FindBy(xpath = "(//a[@title='Next Month'])[2]")
	  	    private ExtendedWebElement nextMonth;

	  	  
	  	    //Select OK button 2 Date
	  	    //(//button[text()='OK'])[2]
	  	  @FindBy(xpath = " (//button[text()='OK'])[2]")
	  	    private ExtendedWebElement okBTN2;
	  	  
	  	  
	  	  //Click on Price Type(Fixed Amount)
	  	//select[@title='Fixed Amount']
	  	 @FindBy(xpath = " //select[@title='Fixed Amount']")
	  	    private ExtendedWebElement priceType;
	  	 
	  	 //Select Any Price Type
	  	//option[contains(text(),'%s')]
	  	@FindBy(xpath = " //option[contains(text(),'%s')]")
  	    private ExtendedWebElement anyPriceType;
	  	
	  	//Percent
	  //input[@placeholder='%']
	  	@FindBy(xpath = " //input[@placeholder='%']")
  	    private ExtendedWebElement percent;
	  	
	  	//Amount Per Unit
	  //input[@placeholder='Amount Per Unit']
	  	@FindBy(xpath = " //input[@placeholder='Amount Per Unit']")
  	    private ExtendedWebElement amountPerUnit;
	  	
	  	//Min Amount
	  //input[@placeholder='Min. Amount']
	  	@FindBy(xpath = " //input[@placeholder='Min. Amount']")
  	    private ExtendedWebElement minAmount;
	  	
	  //Max Amount
	  //input[@placeholder='Max. Amount']
		  	@FindBy(xpath = "//input[@placeholder='Max. Amount']")
	  	    private ExtendedWebElement maxAmount;
		  	
	  	
	  	  
	  	  //Price Amount
	  	  //input[@placeholder='Price Amount']
	  	@FindBy(xpath = "//input[@placeholder='Price Amount']")
  	    private ExtendedWebElement priceAmount;
	  	
	  	//Share Type
	  	//(//select[contains(@title,'Fixed Amount')])[2]
	  	@FindBy(xpath = "(//select[contains(@title,'Fixed Amount')])[2]")
  	    private ExtendedWebElement shareType;
	  	
	  	//Any Share Type
	  //option[contains(text(),'%s')]
	  	@FindBy(xpath = "//option[contains(text(),'%s')]")
  	    private ExtendedWebElement anyShareType;
	  	
	  	//Share Percentage
	  //input[@placeholder='Share Percentage']
	  	@FindBy(xpath = "//input[@placeholder='Share Percentage']")
  	    private ExtendedWebElement SharePercentage;
	  	
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

	  	
	  	//Add Fee
	  //span[text()=' Add Fee']
	  	@FindBy(xpath = "//span[text()=' Add Fee']")
  	    private ExtendedWebElement addFee;
	  	
	  	//Type Fee Name
	  //input[@placeholder='Filter by Fee Name']
	  	@FindBy(xpath = "//input[@placeholder='Filter by Fee Name']")
  	    private ExtendedWebElement filrByFeeName;
	  	
	  	//Click On Checkbox for Fee Selection
	  //input[@type='checkbox']
	  	@FindBy(xpath = "//input[@type='checkbox']")
  	    private ExtendedWebElement feeCheckbox;
	  	
	  	//Click On Add Selected Fees
	  //span[text()='Add Selected Fees']/..
	  	@FindBy(xpath = "//span[text()='Add Selected Fees']/..")
  	    private ExtendedWebElement addSelectedFeesBTN;
	  	
	  	
	  	    //Save Service
	  	//span[text()='Save Service']
	  	  @FindBy(xpath = " //span[text()='Save Service']")
	  	    private ExtendedWebElement  saveService;
	  	  
	  	//Select VAT
	  	//select[@title='Select VAT']
	  	 @FindBy(xpath = " //select[@title='Select VAT']")
	  	 private ExtendedWebElement  selectVAT;  
	  	 
	  	//Select Any VAT
	  	//option[@title='%s']
	  	 @FindBy(xpath = "//option[@title='%s']")
	  	 private ExtendedWebElement  anyVAT;
	  	 
	  	 //Click On OK button after Saving
	  	//span[text()='OK']
	  	@FindBy(xpath = "//span[text()='OK']")
	  	 private ExtendedWebElement  oKBTN;
	  	
	  //OK BTN for updated date
		  //(//button[text()='OK'])[2]
		  @FindBy(xpath = "(//button[text()='OK'])[2]")
		  private ExtendedWebElement  OKBTN1; 
	  	
	  	//Service Saved Success Message
	  //td[@class='af_dialog_content']/span
	  	@FindBy(xpath = "//td[@class='af_dialog_content']/span")
	  	 private ExtendedWebElement serviceSaveSucc;
	  	
	  //(//td[text()='5'])[2]
	  	@FindBy(xpath = "(//td[text()='%s'])[2]")
	      private ExtendedWebElement anyDate;
	  	
	  	//Click On 
	  		      	
	    // Checkbox
	  	//(//label[@class='p_OraHiddenLabel'])[2]
		//label[@class='p_OraHiddenLabel']
		  @FindBy(xpath = "(//label[@class='p_OraHiddenLabel'])[2]")
		  private ExtendedWebElement  checkbox;
		// Checkbox 1
		//label[@class='p_OraHiddenLabel']/../input[@type='checkbox']
		  @FindBy(xpath = "//label[@class='p_OraHiddenLabel']/../input[@type='checkbox']")
		  private ExtendedWebElement  checkbox1;
		  
		  //Focused Table Row
		//tr[@class='p_AFSelected p_AFFocused af_table_data-row']
		  
		  
		//tr[@class='af_table_data-row']
		  @FindBy(xpath = "//tr[@role='row']")
		  private ExtendedWebElement  entireRow;
		  
		  //Select Checkbox according to Name
		//span[text()='kjfdwfhiq']/../../td//label[@class='p_OraHiddenLabel']
		 //nzxbfcsjdfs
		  @FindBy(xpath = "//span[text()='kjfdwfhiq']/../../td//label[@class='p_OraHiddenLabel']")
		  private ExtendedWebElement  checkboxByName;
	  	 
			//Submit For Approval
			//span[text()='Submit For Approval']
			  @FindBy(xpath = "//span[text()='Submit For Approval']")
			  private ExtendedWebElement  submitForApprvl;
			  
			  //Message After Submit for Approval
			  ////div[contains(text(),'The request has been initiated, we will keep you updated on the progress.')]
			  @FindBy(xpath = "//div[contains(text(),'The request has been initiated, we will keep you updated on the progress.')]")
			  private ExtendedWebElement  MssgsubmitForApprvl;
	  	  

	public NewServiceGroup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean serviceGroupDetailsDisplayed()
	{
		 return groupDetails.isVisible();
		
	}
	
	
	
	public void typeServiceGroupNameEN(String Service_Group_Name_EN)
	{
		
		serviceGroupName.type(Service_Group_Name_EN);
	}
	
	public void typePrintableDescriptionEN(String Printable_Description_EN)
	{
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		
		 printableDescriptionEN.type(Printable_Description_EN);
	}
	
	public void typeServiceType(String service_Type)
	{
		
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		
		 serviceType.type(service_Type);
	}
	
		
	public void clickOnSelectDateAndTime()
	{
		selectDateAndTime.clickIfPresent();
	}
	
	public void clickOnSelectNextDate()
	{
//		String str1 = selectTodaysDate.getText();
//	    Integer currDate = Integer.valueOf(str1);
//	    System.out.println(str1);
//	    int nexDate = currDate+1;
//	    String nexDate1 = String.valueOf(nexDate);
//	    System.out.println(nexDate1);
//	    selectAnyDate.format(nexDate1).clickIfPresent();
		selectAnyDate.clickIfPresent();
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
	
	public void clickOnIncrementMinute()
	{
		
		
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
		incrementMinute.clickIfPresent();
	}
	
	public void clickOnOkBTN()
	{
		okBTN.clickIfPresent();
	}
	
	public void typeServiceGroupNameAR(String Service_Group_Name_AR)
	{
		
		serviceGroupNameAR.type(Service_Group_Name_AR);
	}
	
	
	public void selectService(String assign_service1)
	{
		
		selectServices.type(assign_service1);
		
		autoSuggItem.clickIfPresent();
		
	}
	
	public void clickOnDeleteIcon()
	{
		
		deleteIcon.clickIfPresent();
		
		deleteIcon.clickIfPresent();
		
		deleteIcon.clickIfPresent();
		
	}
	public void typeNotes(String notes2)
	{
		 String str = RandomStringUtils.randomAlphanumeric(5);
		
		notes.type(notes2);
	}
	
	public void typeServiceOwner(String service_Owner)
	{
	     String serviceOwnr = service_Owner.substring(0, 9);
		serviceOwner.type(service_Owner);
		anyServiceOwnr.format(service_Owner).clickIfPresent();
		
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
	
	
	
	public void typeServiceNameAR(String service_Name_AR)
	{
		 String str = RandomStringUtils.randomAlphanumeric(5);
		 serviceNameAR.type(service_Name_AR);
	}
	
	public void typePrintableDescriptionAR(String printable_Description_AR)
	{
		 String str = RandomStringUtils.randomAlphanumeric(5);
		 printableDescriptionAR.type(printable_Description_AR);
	}
	
	public void clickOnSelectCategory(String service_Category)
	{
		selectCategory.clickIfPresent();
		anyServiceCat.format(service_Category).clickIfPresent();
	}
	
	public void clickOnSaveServiceGroup()
	{
		saveSerGroup.clickIfPresent();
	}
	

	
	public void clickOnSelectEndDateAndTime()
	{
		selectEndDateAndTime.clickIfPresent();
	}
	
	public void clickOnEndDate()
	{
		    String str1 = selectTodaysDate.getText();
		    Integer currDate = Integer.valueOf(str1);
		    int nexDate = currDate+1;
		  
		   selectAnyDate.format(nexDate).clickIfPresent();
		   
		    
	}
	
	

	public void clickOnOkBTN2()
	{
		okBTN2.clickIfPresent();
	}
	
	public void selectPriceType(String price_Type)
	{
		priceType.clickIfPresent();
		anyPriceType.format(price_Type).clickIfPresent();
	}
	
	public void typePercent(String percent2)
	{
		if (percent.isVisible()) {
			percent.type(percent2);
		}
		
	}
	public void typeAmountPerUnit(String amount_Per_Unit)
	{
		if (amountPerUnit.isVisible()) {
			amountPerUnit.type(amount_Per_Unit);
			
		}
		
	}
	
	public void typeMinAmount(String min_Amount)
	{
		if (minAmount.isVisible()) {
			
			minAmount.type(min_Amount);
			
		}
		
		 
	}
	
	public void typeMaxAmount(String max_Amount)
	{
	
		if (maxAmount.isVisible()) {
			maxAmount.type(max_Amount);
		}
		
	}
	

	
	public void typePriceAmount(String price_Amount)
	{
	
		if (priceAmount.isVisible()) {
			priceAmount.type(price_Amount);	
		}
		 
	}
	
	
	
	public void typeAmount(String amount2)
	{
		if (amount.isVisible()) {
			amount.click();
			 amount.type(amount2);
			
		}
		
	}
	
	public void selectShareType(String share_Type)
	{
		 shareType.clickIfPresent();
		 anyShareType.format(share_Type).clickIfPresent();
		 
	}
	
	public void typeSharePercentage(String share_Percentage)
	{
	       if (SharePercentage.isVisible()) {
	    	   SharePercentage.click();
	    	   SharePercentage.type(share_Percentage);	
		}
		
		
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
	
	public void clickOnAddFee(String add_Fee)
	{
		if(!add_Fee.contains(""))
		{
		addFee.clickIfPresent();
		filrByFeeName.type(add_Fee);
		feeCheckbox.clickIfPresent();
		addSelectedFeesBTN.clickIfPresent();
		}
	}
	
	
	
	
	public void getSuccMessageAfterSave()
	{
		
		
		String str = serviceSaveSucc.getText();
		
		System.out.println(str);
	}
	
	public void clickOnOkAfterSaveService()
	{
		oKBTN.clickIfPresent();
	}
	public void clickOnEntireRow()
	{
		entireRow.clickIfPresent();
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
	public void clickOnOkAfterSubmitforApproval()
	{
		oKBTN.clickIfPresent();
	}

	
	


}
