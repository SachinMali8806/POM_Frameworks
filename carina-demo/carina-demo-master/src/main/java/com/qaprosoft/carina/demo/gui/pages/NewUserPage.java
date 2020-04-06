package com.qaprosoft.carina.demo.gui.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class NewUserPage extends AbstractPage{
	
	    //Select Title
	    @FindBy(xpath = "//select[@title='Select Title']")
	    private ExtendedWebElement selectTitle;
	    
	    
	    //Select Any Title
	    @FindBy(xpath = "//option[@title='%s']")
	    private ExtendedWebElement anyTitle;
	    
	    //First Name EN
	  //input[@placeholder='First Name EN']
	    @FindBy(xpath = "//input[@placeholder='First Name EN']")
	    private ExtendedWebElement firstName;
	    
	    //Middle Name EN
	  //input[@placeholder='Middle Name EN']
	    @FindBy(xpath = "//input[@placeholder='Middle Name EN']")
	    private ExtendedWebElement middleName;
	    
	    //Last Name EN
	  //input[@placeholder='Last Name EN']
		    @FindBy(xpath = "//input[@placeholder='Last Name EN']")
		    private ExtendedWebElement lastName;
		    
		    //Designation
		  //input[@placeholder='Designation']
		    @FindBy(xpath = "//input[@placeholder='Designation']")
		    private ExtendedWebElement designation;
		    
		    //Male Radio button
		    //(//label[text()='Female']/..//input)[1]
		    @FindBy(xpath = "(//label[text()='Female']/..//input)[1]")
		    private ExtendedWebElement maleBTN;
		    
		  //Female Radio button
		    //(//label[text()='Female']/..//input)[2]
		    @FindBy(xpath = "(//label[text()='Female']/..//input)[2]")
		    private ExtendedWebElement femaleBTN;
		   
		    //Select User Type
		  //select[@title='Select User Type']
		    @FindBy(xpath = "//select[@title='Select User Type']")
		    private ExtendedWebElement selUserType; 
		   
		    //Any User Type
		  //option[@title='External']
		    @FindBy(xpath = "//option[@title='%s']")
		    private ExtendedWebElement anyUserType; 
		    
		    
		    
		    
		   
		    
		    //Emirates ID
		  //input[@placeholder='Emirates ID']
		    @FindBy(xpath = "//input[@placeholder='Emirates ID']")
		    private ExtendedWebElement emirateID;
		    
		   //Preferred Contact Channel 
		  //select[@title='Select Channel']
		    @FindBy(xpath = "//select[@title='Select Channel']")
		    private ExtendedWebElement selectChannel;
		    
		    //Any Channel
		  //option[@title='%s']
		    @FindBy(xpath = "//option[@title='%s']")
		    private ExtendedWebElement anyChannel;
		    
		    
		    
		    
		   // First Name AR
		  //input[@placeholder='First Name AR']
		    @FindBy(xpath = "//input[@placeholder='First Name AR']")
		    private ExtendedWebElement firstNameAR;
		    
		    //Middle Name AR
		  //input[@placeholder='Middle Name AR']
		    @FindBy(xpath = "//input[@placeholder='Middle Name AR']")
		    private ExtendedWebElement middleNameAR;
		    
		    //Last Name AR
		  //input[@placeholder='Last Name AR']
		    @FindBy(xpath = "//input[@placeholder='Last Name AR']")
		    private ExtendedWebElement lastNameAR;  
		    
		    //Select Nationality
		  //input[@placeholder='Select Nationality']
		    @FindBy(xpath = "//input[@placeholder='Select Nationality']")
		    private ExtendedWebElement selectNationality;
		    
		    //click Perticular Nationality
		  //li[@class='AFAutoSuggestItem']
		    @FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
		    private ExtendedWebElement perNationality;
		    
		    //Select Preferred Language
		  //select[@title='Select Preferred Language']
		    @FindBy(xpath = "//select[@title='Select Preferred Language']")
		    private ExtendedWebElement selectPreffLang; 
		   
		    //English
		  //option[@title='English']
		    @FindBy(xpath = "//option[@title='%s']")
		    private ExtendedWebElement anyDispLang;
		    
		    //Select Preferred Time
		  //select[@title='Select Preferred Time']
		    @FindBy(xpath = "//select[@title='Select Preferred Time']")
		    private ExtendedWebElement selPreffTime;
		    
		    
		    //Select Any Preff Time
		  //option[@title='%s']
		    @FindBy(xpath = "//option[@title='%s']")
		    private ExtendedWebElement selAnyPreffTime;
		    
		    
		   
		    
		   // Select Entity
		  //input[@placeholder='Select Entity']
		    @FindBy(xpath = "//input[@placeholder='Select Entity']")
		    private ExtendedWebElement selEntity; 
		    
		  //li[@class='AFAutoSuggestItem']
		    @FindBy(xpath = "//li[@class='AFAutoSuggestItem']")
		    private ExtendedWebElement autosuggItem; 
		    
		    
		    
		    
		    
		    
		    
		    //Contact Information Button 
			//span[text()='Contact Information']
			  @FindBy(xpath = "//span[text()='Contact Information']")
			  private ExtendedWebElement  contactInforBTN; 
		   
		    //Select Country
			//input[@placeholder='Select Country']
			  @FindBy(xpath = "//input[@placeholder='Select Country']")
			  private ExtendedWebElement  selCountry; 
		    
			  
			  
			 //City 
			//input[@placeholder='City']
			  @FindBy(xpath = "//input[@placeholder='City']")
			  private ExtendedWebElement  city; 
			  
			  //Address Line 1
			//textarea[@placeholder='Address Line 1']
			  @FindBy(xpath = "//textarea[@placeholder='Address Line 1']")
			  private ExtendedWebElement  addrLine1; 
			  
			  //State
			//input[@placeholder='State']
			  @FindBy(xpath = "//input[@placeholder='State']")
			  private ExtendedWebElement  state; 
			  
			  //Primary Email Address
			  //(//input[@placeholder='mail@domain.com'])[1]			   
			  @FindBy(xpath = "(//input[@placeholder='mail@domain.com'])[1]")
			  private ExtendedWebElement  primaryEmailAdd; 
			  
			  //Mobile Number
			//input[@placeholder='Mobile Number']
			  @FindBy(xpath = "//input[@placeholder='Mobile Number']")
			  private ExtendedWebElement  mobNo;
			  
			  //Access Permissions
			//span[text()='Access Permissions']
			  @FindBy(xpath = "//span[text()='Access Permissions']")
			  private ExtendedWebElement  accessPer;
			  
			 //Save & Continue Later 
			//span[text()='Save & Continue Later']
			  @FindBy(xpath = "//span[text()='Save & Continue Later']")
			  private ExtendedWebElement  saveAndContinue;
			  
			  //Get User Id
			//div[@class='af_messages_detail']
			  @FindBy(xpath = "//div[@class='af_messages_detail']")
			  private ExtendedWebElement  getMsgDetail;
			  
			  //OK Click
			//span[text()='OK']
			  @FindBy(xpath = "//span[text()='OK']")
			  private ExtendedWebElement  okBTN;
			  
			  
			    
			   
			   
			  
			  //Select ISD code
			  //(//select[@title='ISD Code'])[2]
			  @FindBy(xpath = "(//select[@title='ISD Code'])[2]")
			  private ExtendedWebElement  isdCode;
			  
			  //Select ISD code  
			//option[@title='974']
			  @FindBy(xpath = "//option[@title='%s']")
			  private ExtendedWebElement  anyIsdCode;
			  
			  
			  
			   
			  
			  
			  
			  //Click on Add Button for Module List
			//a[@class='addItem distIcons af_link p_AFTextOnly']
			  @FindBy(xpath = "//a[@class='addItem distIcons af_link p_AFTextOnly']")
			  private ExtendedWebElement  addBTNModuleList;
			  
			 //Select Module List 
			//span[text()='Call Center']/../../..//input[@class='af_selectBooleanCheckbox_native-input']
			  @FindBy(xpath = "//span[text()='%s']/../../..//input[@class='af_selectBooleanCheckbox_native-input']")
			  private ExtendedWebElement  anyModuleList;
			 
			  //Add Module
			//span[text()='Add Module']
			  @FindBy(xpath = "//span[text()='Add Module']")
			  private ExtendedWebElement  addModule;
			  
			  //Add Button for Related Roles
			  //(//a[@class='addItem distIcons af_link p_AFTextOnly'])[2]
			  @FindBy(xpath = "(//a[@class='addItem distIcons af_link p_AFTextOnly'])[2]")
			  private ExtendedWebElement  addBTNRelRole;
			  
			 //Select Module Role 
			//span[text()='E11 User']/../../..//input[@class='af_selectBooleanCheckbox_native-input']
			  @FindBy(xpath = "//span[text()='%s']/../../..//input[@class='af_selectBooleanCheckbox_native-input']")
			  private ExtendedWebElement  anyModuleRole;
			   
			  
			  //Add Module Role
			//span[text()='Add Module Roles']
			  @FindBy(xpath = "//span[text()='Add Module Roles']")
			  private ExtendedWebElement  addModuleRoles;
			  
			  
			  //Functions Add Button
			  // (//a[@class='addItem distIcons af_link p_AFTextOnly'])[3]
			  @FindBy(xpath = "(//a[@class='addItem distIcons af_link p_AFTextOnly'])[3]")
			  private ExtendedWebElement  addBTNFunction;
			  
			  
			  //Functions Add Btn
			  //(//span[text()='E11 User']/../../..//input[@class='af_selectBooleanCheckbox_native-input'])[2]
			  @FindBy(xpath = "(//span[text()='%s']/../../..//input[@class='af_selectBooleanCheckbox_native-input'])[2]")
			  private ExtendedWebElement  anyFunction;
			  
			 //Add Functions 
			//span[text()='Add Functions']
			  @FindBy(xpath = "//span[text()='Add Functions']")
			  private ExtendedWebElement  addFunctions;
			 
			  //Submit
			//span[text()='Submit']
			  @FindBy(xpath = "//span[text()='Submit']")
			  private ExtendedWebElement  submit;
			  
			  //click on OK
			//span[text()='OK']
			  @FindBy(xpath = "//span[text()='OK']")
			  private ExtendedWebElement  ok;  
			  
			   
			  
			  
			  
			  
			   
			  
	    
	   
	    
	public NewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public void selectTitle(String title)
	{
		selectTitle.clickIfPresent();
		anyTitle.format(title).clickIfPresent();
		
		
	}
	
	
	
	public void typeFullNameEN(String firstName1,String middleName1, String lastName1)
	{
		 firstName.type(firstName1);
		 
		 middleName.type(middleName1);
		 
		 lastName.type(lastName1);
		 
	}
	
	public void typeDesignation(String designation1)
	{
		 designation.type(designation1);
		 
	}
	
	public void selectGender(String gender1)
	{
		 if (gender1.contains("Male")) {
			 
			 maleBTN.clickIfPresent();
			
		}
		 else {
			 
			 femaleBTN.clickIfPresent();
		 }
		 
	}
	
	public void selectUserType(String userType)
	{
		 selUserType.clickIfPresent();
		anyUserType.format(userType).clickIfPresent();
	}
	
	
	

	public void typeEmirateID(String emirateID1)
	{
		emirateID.type(emirateID1);
	}
	
	public void selectPreffContactChannel(String channel)
	{
		selectChannel.clickIfPresent();
		
		anyChannel.format(channel).clickIfPresent();
	}
	
	public void typeFullNameAR(String firstName2,String middleName2, String lastName2)
	{
		 firstNameAR.type(firstName2);
		 
		 middleNameAR.type(middleName2);
		 
		 lastNameAR.type(lastName2);
		 
	}
	
	public void selectNationality(String nationality)
	{
		selectNationality.type(nationality);
		
		perNationality.clickIfPresent();
		
		
	}
	
	public void selectDisplayLanguage(String dispLang)
	{
	
		selectPreffLang.clickIfPresent();
		
		anyDispLang.format(dispLang).clickIfPresent();
		
		
	}
	
	
	
	public void selectPreffContactTime(String contactTime)
	{
	
		selPreffTime.clickIfPresent();
		
		selAnyPreffTime.format(contactTime).clickIfPresent();
		
		
		
		
	}
	
	public void selectEntityOftheUser(String entity)
	{
	
		selEntity.type(entity);
		
		autosuggItem.clickIfPresent();
		
		
		
	}
	
	public void clickOnContactInforBTN()
	{
	
		
		contactInforBTN.clickIfPresent();
		
	}
	
	public void selectCountryOfResidence(String countryRes)
	{
	
		
		selCountry.type(countryRes);
		
		autosuggItem.clickIfPresent();
		
	}
	
	public void typeCity(String city1)
	{
	
		
		city.type(city1);
		
		
		
	}
	
	public void typeAddressLine1(String addLine1)
	{
	
		
		addrLine1.type(addLine1);
		
		
	}
	
	public void typePrimaryEmailAddress(String priEmail)
	{
	
		primaryEmailAdd.type(priEmail);
				
	}
	
	public void selectISDCode(String isdCode1)
	{
	
		isdCode.clickIfPresent();
		
		anyIsdCode.format(isdCode1).clickIfPresent();
		
		
	}
	
	public void typeMobileNumber(String mobNo1)
	{
	
		mobNo.type(mobNo1);
				
	}
	
	public void clickOnAccessPermission()
	{
	
		
		accessPer.clickIfPresent();
		
	}
	
	
	public void addModuleList(String moduleList)
	{
	
		addBTNModuleList.clickIfPresent();
		
		anyModuleList.format(moduleList).clickIfPresent();
		
		addModule.clickIfPresent();
	}
	
	
	public void addRelatedRoles(String RelatdRoles)
	{
	
		addBTNRelRole.clickIfPresent();
		
		anyModuleRole.format(RelatdRoles).clickIfPresent();
		
		addModuleRoles.clickIfPresent();
		
			
	}
	
	public void addFunctions(String functions)
	{
	
		addBTNFunction.clickIfPresent();
		
		anyFunction.format(functions).clickIfPresent();
		
		addFunctions.clickIfPresent();
		
		
		
		
			
	}
	
	public void clickOnSubmit()
	{
	
		
		submit.clickIfPresent();
		
	}
	
	public void clickOnOK()
	{
	
		
		ok.clickIfPresent();
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	

}
