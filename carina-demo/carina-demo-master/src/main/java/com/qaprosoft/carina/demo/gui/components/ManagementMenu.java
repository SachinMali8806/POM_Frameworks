package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.EntityListPage;
import com.qaprosoft.carina.demo.gui.pages.FeesListPage;

import com.qaprosoft.carina.demo.gui.pages.NewEntityPage;
import com.qaprosoft.carina.demo.gui.pages.NewFeePage;
import com.qaprosoft.carina.demo.gui.pages.NewServiceGroup;
import com.qaprosoft.carina.demo.gui.pages.NewUserPage;
import com.qaprosoft.carina.demo.gui.pages.ServiceListPage;
import com.qaprosoft.carina.demo.gui.pages.UserListPage;


public class ManagementMenu extends AbstractUIObject{
	
	    //Entity List
	   //span[text()='Entity List'] 
	   @FindBy(xpath = "//span[text()='Entity List']")
        private ExtendedWebElement entityList;
	 
	    //New Entity
	    //span[text()='New Entity']
	    @FindBy(xpath = "//span[text()='New Entity']")
	    private ExtendedWebElement newEntity;
	    
	  //User List 
	  //span[text()='User List']
	    @FindBy(xpath = "//span[text()='User List']")
	    private ExtendedWebElement userList;
	    
	    @FindBy(xpath = "//span[text()='Services List']")
	    private ExtendedWebElement servicesList;
	    
	    //New Service
	  //span[text()='New Service']
	    @FindBy(xpath = "//span[text()='New Service']")
	    private ExtendedWebElement newService;
	    
	    //New Service Group
	   //span[text()='New Service Group']
	    @FindBy(xpath = "//span[text()='New Service Group']")
	    private ExtendedWebElement newServiceGroup;
	 
	  //Fees List
	  //span[text()='Fees List']
	    @FindBy(xpath = "//span[text()='Fees List']")
	    private ExtendedWebElement feesList;
	    
	  //New Fee
	  //span[text()='New Fee']
	    @FindBy(xpath = "//span[text()='New Fee']")
	    private ExtendedWebElement newFee; 
	    
	    
	    //Service Request List
	  //span[text()='Service Request List']
	    @FindBy(xpath = "//span[text()='Service Request List']")
	    private ExtendedWebElement serviceRequestList;
	    
	    //New User
	    ////span[text()='New User']
	    @FindBy(xpath = "//span[text()='New User']")
	    private ExtendedWebElement newUser;
	    
	    
	    
	    
	public ManagementMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		
	}
	
	
	 
	 public NewEntityPage clickOnNewEntity() {
	      
          newEntity.clickIfPresent();
		return new  NewEntityPage(driver);
}
	 
	 public boolean isNewEntityFieldVisible() {
	      
       return  newEntity.isVisible();
		
}
	 public EntityListPage clickOnEntityList() {
	      
		 entityList.clickIfPresent();
		return new  EntityListPage(driver);
}
	 
	 public ServiceListPage clickOnServiceList() {
	      
		 servicesList.clickIfPresent();
		return new  ServiceListPage(driver);
}
	 
	 public Boolean isNewServiceDisplayed() {
	      
		return  newService.isVisible();
		 
}
	 public Boolean isServiceListDisplayed() {
	      
			return  servicesList.isVisible();
			 
	}
	 
	 public com.qaprosoft.carina.demo.gui.pages.NewServicePage clickOnNewService() {
	      
		 newService.clickIfPresent();
		return new  com.qaprosoft.carina.demo.gui.pages.NewServicePage(driver);
}
	 
	 public NewServiceGroup clickOnNewServiceGroup() {
	      
		newServiceGroup.clickIfPresent();
		return new  NewServiceGroup(getDriver());
}
	
	 
	 public NewFeePage clickOnNewFee() {
	      
		 newFee.clickIfPresent();
		return new  NewFeePage(driver);
}
	 
	 public boolean isNewFeeDisplayed() {
	      
		return newFee.isPresent();
		
}
	 
	 public FeesListPage clickOnFeesList() {
	      
		 feesList.clickIfPresent();
		return new  FeesListPage(driver);
}
	 
	 public boolean isFeesListDisplayed() {
	      
		return feesList.isVisible();
}
	 
	 public NewUserPage clickOnNewUser() {
	      
		newUser.clickIfPresent();
		
		return new  NewUserPage(driver);
		
}
	 
	 public UserListPage clickOnUserList() {
	      
			userList.clickIfPresent();
			
			return new  UserListPage(driver);
			
	}

	
	
	

}
