package com.qaprosoft.carina.demo.gui.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class NewFeePage extends AbstractPage{
	
	  //Fee Details text
	  //h2[text()='Fee Details']
	@FindBy(xpath = "//h2[text()='Fee Details']")
    private ExtendedWebElement feeDetails;
	
	    //Fee FMIS Code
	    @FindBy(xpath = "//label[text()='Fee FMIS Code']/../../../tr[2]//input")
	    private ExtendedWebElement feeFMISCode;
	    
	    //416105 - Accrued Salaries-Ministry of Foreign Affairs
	     //li[text()='%s']
	    @FindBy(xpath = "//li[text()='%s']")
	    private ExtendedWebElement anyfeeFMISCode;
	    
	    //Fee Name EN
	  //input[@placeholder='Fee Name EN']
	    @FindBy(xpath = "//input[@placeholder='Fee Name EN']")
	    private ExtendedWebElement feeNameEN;
	    
	    //Printable Description EN
	    //input[@placeholder='Printable Description EN']
	      @FindBy(xpath = "//input[@placeholder='Printable Description EN']")
	      private ExtendedWebElement printableDescriptionEN;
	      
	      
	    //Select Date and Time
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
	  	  
	    //Select Todays Date
	  //td[@class='af_chooseDate_today p_AFSelected']
	  	//(//td[@class='af_chooseDate_today p_AFSelected'])[2]
	    @FindBy(xpath = "(//td[@class='af_chooseDate_today p_AFSelected'])[2]")
	    private ExtendedWebElement  selectTodaysDate;
	    
	    //Increment hour
	    //(//a[@title='Increment'])[6]
	    //(//div[@class='af_chooseDate_increment-cell']/a)[6]
	    @FindBy(xpath = "(//a[@title='Increment'])[6]")
	    private ExtendedWebElement  incrementHour;
	    
	  //Increment Minute
	    //(//a[@title='Increment'])[7]
	    @FindBy(xpath = "(//a[@title='Increment'])[7]")
	    private ExtendedWebElement  incrementMinute;
	    
	    //Select OK button 2 Date
  	    //(//button[text()='OK'])[2]
  	  @FindBy(xpath = " (//button[text()='OK'])[2]")
  	    private ExtendedWebElement okBTN2;
  	  
  	     //Select OK button 2 Date
  	    //textarea[@placeholder='Notes']
  	 @FindBy(xpath = " //textarea[@placeholder='Notes']")
	    private ExtendedWebElement notes;
  	  
	    //Select Fee Type 
  	//select[@title='Select Fee Type']
	    @FindBy(xpath = "//select[@title='Select Fee Type']")
	    private ExtendedWebElement  selectFeeType; 
	    
	  //Any Fee
	  //option[@title='%s']
	    @FindBy(xpath = "//option[@title='%s']")
	    private ExtendedWebElement  anyFee;  
	    
	    //Fee Name AR
	  //input[@placeholder='Fee Name AR']
	    @FindBy(xpath = "//input[@placeholder='Fee Name AR']")
	    private ExtendedWebElement  feeNameAR;
	    
	  //Printable Description AR
	     //input[@placeholder='Printable Description AR']
	    @FindBy(xpath = "//input[@placeholder='Printable Description AR']")
	    private ExtendedWebElement printableDescriptionAR; 
	    
	  //Select  End Date Icon
	    //a[@title='Select Date and Time']
	  	@FindBy(xpath = " (//a[@title='Select Date and Time'])[2]")
	   private ExtendedWebElement  selectEndDateAndTime;
	  	
	  //Click on Fee Calculation Type(Fixed Amount)
	  	//select[@title='Fixed Amount']
	  	 @FindBy(xpath = " //select[@title='Fixed Amount']")
	  	    private ExtendedWebElement feeCalculatnType;
	  	 
	  	 //Select Any Fee Calculation Type
	  	//option[contains(text(),'%s')]
	  	@FindBy(xpath = " //option[contains(text(),'%s')]")
  	    private ExtendedWebElement anyFeeCalType;
	  	  
	  	  //Fee Amount
	  //input[@placeholder='Fee Amount']
	  	@FindBy(xpath = "//input[@placeholder='Fee Amount']")
  	    private ExtendedWebElement feeAmount;
	  	
	 	//Percent
		  //input[@placeholder='%']
		  	@FindBy(xpath = " //input[@placeholder='%']")
	  	    private ExtendedWebElement percent;
		  	
		  //Amount Per Unit
		  //input[@placeholder='Unit Value']
			  	@FindBy(xpath = " //input[@placeholder='Unit Value']")
		  	    private ExtendedWebElement unitValue;
		  	
		  //Min Amount
			  //input[@placeholder='Min. Amount']
			  	@FindBy(xpath = " //input[@placeholder='Min. Amount']")
		  	    private ExtendedWebElement minAmount;
			  	
			  //Max Amount
			  //input[@placeholder='Max. Amount']
				  	@FindBy(xpath = "//input[@placeholder='Max. Amount']")
			  	    private ExtendedWebElement maxAmount;
				  	
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
	  /*	@FindBy(xpath = "//input[@placeholder='Amount']")
  	    private ExtendedWebElement amount;*/
	  	//.//td[@title='Amount (Required)']//input
	  	
	  //.//td[@title='Amount (Required)']//input
		  @FindBy(xpath = "//input[@placeholder='Amount']")
	  	    private ExtendedWebElement amount;
		//Share Percentage
		  //input[@placeholder='Share Percentage']
		  	@FindBy(xpath = "//input[@placeholder='Share Percentage']")
	  	    private ExtendedWebElement SharePercentage;
		  	
	  	
	  	
	   //Share Rule Type
	  //select[@title='Specific Entity']
	  	@FindBy(xpath = "//select[@title='Specific Entity']")
  	    private ExtendedWebElement shareRule;
	  	
	  //Select Any Share Rule Type	
	  //option[text()='%s']
	  	@FindBy(xpath = "//option[text()='%s']")
  	    private ExtendedWebElement anyShareRuleTyp;
	  	
	  	//Share Entity
	  //input[@placeholder='Share Entity']
	  	@FindBy(xpath = " (//input[@placeholder='Select Entity'])[2]")
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
	  	 @FindBy(xpath = " //select[@title='Select VAT Type']")
	  	 private ExtendedWebElement  selectVAT;  
	  	 
	  	//Select Any VAT
	  	//option[@title='%s']
	  	 @FindBy(xpath = "//option[@title='%s']")
	  	 private ExtendedWebElement  anyVAT;  
		  	
		   
	
	  //Save Fee
	//span[text()='Save Fee']
	  @FindBy(xpath = "//span[text()='Save Fee']")
	  private ExtendedWebElement  saveFee; 
      
	  //Fee Created Successfully !
	//td[@class='af_dialog_content']/span
	  @FindBy(xpath = "//td[@class='af_dialog_content']/span")
	  private ExtendedWebElement  feeSuccMsg; 
	  
	  //OK Button for Confirmation
	  //span[text()='OK']
	  @FindBy(xpath = "//span[text()='OK']")
	  private ExtendedWebElement  OKBTN; 
	  
	  //OK BTN for updated date
	  //(//button[text()='OK'])[2]
	  @FindBy(xpath = "(//button[text()='OK'])[2]")
	  private ExtendedWebElement  OKBTN1; 
	  
	  //Entire Row
	//input[@type='checkbox']/../../../../../..
	//tr[@role='row']
	  @FindBy(xpath = "//tr[@role='row']")
	  private ExtendedWebElement  entireRow;
	  
   
	  
	//tr[contains(@class,'af_table_data-row')]
	  @FindBy(xpath = "//input[@type='checkbox']/../../../../../..")
	  private ExtendedWebElement  entireRow1;
	  
    // Checkbox
	//label[@class='p_OraHiddenLabel']
	  @FindBy(xpath = "(//label[@class='p_OraHiddenLabel'])[1]")
	  private ExtendedWebElement  checkbox;
	  
	  //Submit For Approval
	//span[text()='Submit For Approval']
	  @FindBy(xpath = "//span[text()='Submit For Approval']")
	  private ExtendedWebElement  submitForApprvl;
	  
	  
	  
	public NewFeePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isFeeDetailsPageDisplayed()
	{
		return feeDetails.isPresent();
		
	}
	
	public void typeAnyFeeFMISCode(String fee_FMIS_Code)
	{
		feeFMISCode.type(fee_FMIS_Code);
		anyfeeFMISCode.format(fee_FMIS_Code).clickIfPresent();
		
	}
	
	
	public void typeFeeNameEN(String fee_Name_EN)
	{
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		
		 feeNameEN.type(fee_Name_EN);
	}
	
	public void typePrintableDescriptionEN(String printable_Description_EN)
	{
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		
		 printableDescriptionEN.type(printable_Description_EN);
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
	
	public void clickOnSelectTodaysDate()
	{
		selectTodaysDate.clickIfPresent();
	}
	
	public void clickOnIncrementHour()
	{
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
	}
	
	public void clickOnOkBTN()
	{
		okBTN2.clickIfPresent();
	}
	
	public void typeNotes(String notes2)
	{
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		
		notes.type(notes2);
	}
	
	
	public void selectFeeType(String fee_Type)
	{
		selectFeeType.clickIfPresent();
		anyFee.format(fee_Type).clickIfPresent();
	}
	
	
	
	
	public void typeFeeNameAR(String fee_Name_AR)
	{
		feeNameAR.type(fee_Name_AR);
		
	}
	
	public void typePrintableDescriptionAR(String printable_Description_AR)
	{
		 //String str = RandomStringUtils.randomAlphanumeric(5);
		 printableDescriptionAR.type(printable_Description_AR);
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
		   WebElement endDate = driver.findElement(By.xpath("//td[text()='"+nexDate+"']"));
		    endDate.click();
		   
		    
	}
	
	public void clickOnOkBTN1()
	{
		OKBTN.clickIfPresent();
	}
	
	
	public void clickOnOkBTN2()
	{
		okBTN2.clickIfPresent();
	}
	
	public void selectFeeCalculanType(String fee_Calculation_Type)
	{
		feeCalculatnType.clickIfPresent();
		anyFeeCalType.format(fee_Calculation_Type).clickIfPresent();
		
	}
	
	public void typeFeeAmount(String fee_Amount)
	{
		 //String str = RandomStringUtils.randomNumeric(5);
		
		 feeAmount.type(fee_Amount);
		
		
		
	}
	
	public boolean isFeeAmountVisible()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
		
		 
		
		return feeAmount.isVisible();
		
	}
	
	public void typePercent(String percent2)
	{
		
			percent.type(percent2);
		
	}
	
	public boolean isPercentVisible()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
	
		return percent.isVisible();
		
	}
	
	public void typeUnitValue(String unit_Value)
	{
		
		unitValue.type(unit_Value);
		
		
	}
	
	public boolean isUnitValueVisible()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
	
		return unitValue.isVisible();
		
	}
	
	public void typeMinAmount(String min_Amount)
	{
		
		minAmount.type(min_Amount);
			
		
		
		 
	}
	
	public boolean isMinAmountVisible()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
	
		return minAmount.isVisible();
		
	}
	
	public void typeMaxAmount(String max_Amount)
	{
	
		
			maxAmount.type(max_Amount);
		
		
	}
	
	public boolean isMaxAmountVisible()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
	
		return maxAmount.isVisible();
		
	}
	
	
	public void selectShareType(String share_Type)
	{
		
			
			shareType.clickIfPresent();
			 anyShareType.format(share_Type).clickIfPresent();
			
		
		 
		 
	}
	
	public boolean isShareTypeClickable()
	{
		 //String str = RandomStringUtils.randomNumeric(5);
	
		return shareType.isClickable();
		
	}
	
	public void typeAmount(String amount2) throws Exception
	{
//		Thread.sleep(10000);
//		WebElement amount = driver.findElement(By.xpath(".//td[@title='Amount (Required)']//input"));
		/*amount.pause(2);
		amount.scrollTo();
		amount.pause(2);
		amount.ty*/
		 //amount.type(amount2);
		
		amount.clickIfPresent(3);
		amount.type(amount2);
	
		
	}
	
	public boolean isAmountVisible()
	{
	       return amount.isVisible();
	    	  
		
		
		
	}
	public void typeSharePercentage(String share_Percentage)
	{
	       
	    	   SharePercentage.click();
	    	   SharePercentage.type(share_Percentage);	
	
		
		
	}
	
	public boolean isSharePercentageVisible()
	{
	       return SharePercentage.isVisible();
	    	  
		
		
		
	}
	
	public void selectShareRuleType(String share_Rule_Type)
	{
		shareRule.clickIfPresent();
		
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
	
	
	
	public void clickOnSaveFee()
	{
		saveFee.clickIfPresent();
	}
	
	public void getFeeSuccMsg()
	{
		String successMsg = feeSuccMsg.getText();
		System.out.println(successMsg);
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
	
	public boolean isSubmitForApprovalDisplayed()
	{
		return submitForApprvl.isPresent();
	}

	
	
	
	
	
	
	
	
	

}
