package com.qaprosoft.carina.demo.gui.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class NewEntityPage extends AbstractPage{
	
	//New Entity Page Title
	//(//span[text()='New Entity'])[2]
	@FindBy(xpath = "(//span[text()='New Entity'])[2]")
    private ExtendedWebElement newEntityPageTitle;
	
	    //FMIS Entity Code Input Field
	    @FindBy(xpath = "//label[text()='FMIS Entity Code']/../../../tr[2]//input")
	    private ExtendedWebElement FMISInput;
	    
	    //Any  FMIS Code
	    //123- Ministry of Planning & International Cooperation code
	    @FindBy(xpath = "//li[text()='%s']")
	    private ExtendedWebElement anyFMISEntityCode;
	    
	    //Auto Suggested Item
	  //li[@class='AFAutoSuggestItem']
	    @FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
	    private ExtendedWebElement autoSuggItem; 
	    
	    //Entity Name EN
	    //input[@placeholder='Entity Name EN']
	    @FindBy(xpath = "//input[@placeholder='Entity Name EN']")
	    private ExtendedWebElement entityNameEN;
	    
	  //label[text()='Nationality']/../../../tr[2]//input
	    @FindBy(xpath = "//label[text()='Nationality']/../../../tr[2]//input")
	    private ExtendedWebElement Nationality; 
	    
	    
	    	    
	    //Select Type
	  //select[@title='Select Type']
	    @FindBy(xpath = " //select[@title='Select Type']")
	    private ExtendedWebElement selectType; 
	    
	    
	    //Select E11 Operations
	  //option[@title='E11 Operations']
	    @FindBy(xpath = "  //option[@title='%s']")
	    private ExtendedWebElement anyEntityType; 
	    
	    //Select Federal Government
	  //option[@title='Federal Government']
	    @FindBy(xpath = "  //option[@title='Federal Government']")
	    private ExtendedWebElement federalGovernment; 
	    
	    //Local Government 
	  //option[@title='Local Government']
	    @FindBy(xpath = "  //option[@title='Local Government']")
	    private ExtendedWebElement localGovernment; 
	    
	    //Bank
	  //option[@title='Bank']
	    @FindBy(xpath = "//option[@title='Bank'] ")
	    private ExtendedWebElement bank;  
	    
	    //Private Sector
	    //option[@title='Private Sector']
	    @FindBy(xpath = "//option[@title='Private Sector']")
	    private ExtendedWebElement privateSector;
	    
	   //Commercial Registration Number 
	  //input[@placeholder='Commercial Registration Number']
	    @FindBy(xpath = "//input[@placeholder='Commercial Registration Number']")
	    private ExtendedWebElement  commercialRegNum;
	    
	    //Select Date Icon
	   //a[@title='Select Date']
	    @FindBy(xpath = " //a[@title='Select Date']")
	    private ExtendedWebElement  selectDate;
	    
	    //Select Todays Date
	  //td[@class='af_chooseDate_today p_AFSelected']
	    @FindBy(xpath = "//td[@class='af_chooseDate_today p_AFSelected']")
	    private ExtendedWebElement  selectTodaysDate;
	    
	    //Parent Entity Input 
	  //label[text()='Parent Entity']/../../../tr[2]//input
	    @FindBy(xpath = "//label[text()='Parent Entity']/../../../tr[2]//input")
	    private ExtendedWebElement  parentEntityInput; 
	    
	  //Any Parent Entity
	  //li[text()='This is a Super Entity']
	  //li[text()='This is a Super Entity']
	    @FindBy(xpath = "//li[text()='%s']")
	    private ExtendedWebElement  anyParentEntity;  
	    
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
	    
	    
	   //Select Category
	  //select[@title='Select Category']
	    @FindBy(xpath = "//select[@title='Select Category']")
	    private ExtendedWebElement  selectCategory; 
	    
	  //Select Ministry 
	  //option[@title='Ministry']
	  @FindBy(xpath = "//option[@title='%s']")
	  private ExtendedWebElement  selecAnyCategory; 
	  
	  //Select Authority 
	//option[@title='Authority']
	  @FindBy(xpath = "//option[@title='Authority']")
	  private ExtendedWebElement  selectAuthority; 
	  
	//Select Company  
	//option[@title='Company']
	  @FindBy(xpath = "//option[@title='Company']")
	  private ExtendedWebElement  selectCompany; 
	  
	  //Tax Registration Number
	//input[@placeholder='Tax Registration Number']
	  @FindBy(xpath = "//input[@placeholder='Tax Registration Number']")
	  private ExtendedWebElement  TaxRegNum;
	  
	 //Contact Information Button 
	//span[text()='Contact Information']
	  @FindBy(xpath = "//span[text()='Contact Information']")
	  private ExtendedWebElement  contactInforBTN; 
	  
	  //Message After Submit Button
	//table[@class='af_message_container']//div
	  @FindBy(xpath = "//table[@class='af_message_container']//div")
	  private ExtendedWebElement  mssgAfterSubmit;
	  
	//OK Button for Confirmation
	  //span[text()='OK']
	  @FindBy(xpath = "//span[text()='OK']")
	  private ExtendedWebElement  OKBTN; 
	  
	  //Confirmation Received Message
	  ////div[@title='Confirmation Received']
	  @FindBy(xpath = "//div[@title='Confirmation Received']")
	  private ExtendedWebElement  confReceived;
	    
	public NewEntityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isNewEntityPageTitleDisplayed()
	{
		   
		return newEntityPageTitle.isVisible();
	}
	
	public void typeFMISInput(String fMIS_Entity_Code)
	{
		      String entityCode = fMIS_Entity_Code.substring(0, 3);
		FMISInput.type(entityCode);
		//anyFMISEntityCode.format(fMIS_Entity_Code).clickIfPresent();
		autoSuggItem.clickIfPresent();
		
	}
	
	
	
	public void typeEntityNameEN(String entity_Name_EN)
	{
		 String str = RandomStringUtils.randomAlphanumeric(5);
		
		  entityNameEN.type(entity_Name_EN);
	}
	
	public void typeNationality(String nationality2)
	{
		 Nationality.type(nationality2);
	}
	
	public void selectEntityType(String entity_Type)
	{
		 selectType.clickIfPresent();
		 
		 anyEntityType.format(entity_Type).clickIfPresent();
		 
	}
	
	
	
	public void clickOnFederalGovernment()
	{
		federalGovernment.clickIfPresent();
	}
	

	public void clickOnLocalGovernment()
	{
		localGovernment.clickIfPresent();
	}
	
	public void clickOnBank()
	{
		bank.clickIfPresent();
	}
	
	public void typeCommercialRegNum(String comm_Reg_Num)
	{
		commercialRegNum.type(comm_Reg_Num);
	}
	
	public void clickOnSelectDate()
	{
		selectDate.clickIfPresent();
	}
	
	public void clickOnTodaysDate()
	{
		selectTodaysDate.clickIfPresent();
	}
	
	public void selectParentEntityInput(String parent_Entity)
	{
		parentEntityInput.type(parent_Entity);
		
		anyParentEntity.format(parent_Entity).clickIfPresent();
	}
	

	
	public void typeEntityNameAR(String entity_Name_AR)
	{
		entityNameAR.type(entity_Name_AR);
	}
	
	public void selectLocation(String location)
	{
		String entityLoacation = location.substring(0, 3);
		selectLocation.type(entityLoacation);
	    //selectAnyLocation.format(location).clickIfPresent();
		autoSuggItem.clickIfPresent();
	}
	
	public void selectEntityCategory(String entity_Category)
	{
		selectCategory.clickIfPresent();
		
		selecAnyCategory.format(entity_Category).clickIfPresent();
	}
	
	
	
	
	public void typeTaxRegNum(String tax_Reg_Num)
	{
		TaxRegNum.type(tax_Reg_Num);
		
	}
	
	public void getMessageAfterSubmit()
	{
		
		System.out.println(mssgAfterSubmit.getText());
	}
	
	public EntityContactInformationPage clickOnContactInforBTN()
	{
		contactInforBTN.clickIfPresent();
		
		return new EntityContactInformationPage(driver);
		
	}
	
	public void clickOnOkBTN()
	{
		OKBTN.clickIfPresent();
	}
	
	
	public void isconfirmationMessageDisplayed()
	{
		if(confReceived.isVisible())
		{
			System.out.println("Entities are approved and shall be activated based on the identified EntityType");
		}
	}
	
	
	
	
	

}
