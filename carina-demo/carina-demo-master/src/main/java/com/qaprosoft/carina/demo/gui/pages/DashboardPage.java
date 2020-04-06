package com.qaprosoft.carina.demo.gui.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.ManagementMenu;
import com.qaprosoft.carina.demo.gui.components.NotificationMenu;

public class DashboardPage extends AbstractPage {

    Logger LOGGER = Logger.getLogger(DashboardPage.class);
    
    //Dashboard
    //span[text()='Dashboard']
    @FindBy(xpath = " //span[text()='Dashboard']")
    private ExtendedWebElement  dashboard;
    
    //Entity Management Tab
    @FindBy(xpath = "//span[text()='Entity Management']")
    private ExtendedWebElement  entityManagement;
    
  //Entity Management Tab
    @FindBy(xpath = "//span[text()='Service Management']")
    private ExtendedWebElement  serviceManagement;
    
    //Fee Management tab
  //span[text()='Fee Management']
    @FindBy(xpath = "//span[text()='Fee Management']")
    private ExtendedWebElement  feeManagement; 
    
  //User Management tab
  //span[text()='User Management']
    @FindBy(xpath = "//span[text()='User Management']")
    private ExtendedWebElement  userManagement; 
    
    //Support Center tab 
  //span[text()='Support Center']
    @FindBy(xpath = "//span[text()='Support Center']")
    private ExtendedWebElement  supportCenter;
    
  //Reports tab 
  //span[text()='Reports']
    @FindBy(xpath = "//span[text()='Reports']")
    private ExtendedWebElement  reports;
    
    
    //Notification Icon
    //a[@class='notificationIcon af_link p_AFTextOnly']
    @FindBy(xpath = "//a[@class='notificationIcon af_link p_AFTextOnly']")
    private ExtendedWebElement  notifitnIcon;
    
    //Management Menu
  //span[@class='af_link_text']
    @FindBy(xpath = "//span[@class='af_link_text']")
    private ManagementMenu  managMenu;
    
  //Notification Menu
  	//span[@class='notification-texten']
  	 @FindBy(xpath = "//span[@class='notification-texten']")
  	    private NotificationMenu notificatn1;
  	 
  	 //Log out of WebCenter Portal
  	//a[@title='Log out of WebCenter Portal']
  	@FindBy(xpath = "//a[@title='Log out of WebCenter Portal']")
	    private ExtendedWebElement logOutBTN;
  	 
    
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 
	 public Boolean isDashboardDisplayed() {
	      
		return dashboard.isVisible();
          
          
}
	 public ManagementMenu clickOnEntityManagement() {
	      
         entityManagement.clickIfPresent();
         
         return  managMenu;
}
	 
	 public NotificationMenu clickOnNotificationIcon() {
	      
           notifitnIcon.hover();
           
           return notificatn1;
           
           
}
	 
	 public boolean isNotificationIconDisplayed() {
	      
        
		return notifitnIcon.isVisible();
         
}
	 public ManagementMenu clickOnServiceManagement() {
		 
		 
	      
         serviceManagement.clickIfPresent();
         
         return  managMenu;
}
	 
	 public ManagementMenu clickOnFeeManagement() {
		 
		 
	      
         feeManagement.clickIfPresent();
         
         return  managMenu;
}
	 public ManagementMenu clickOnUserManagement() {
		 
		 
	      
         userManagement.clickIfPresent();
         
         return  managMenu;
}
	
	 public ManagementMenu clickOnSupportCenter() {
		 
		 
	      
		 supportCenter.clickIfPresent();
         
         return  managMenu;
}
	 
	 public ManagementMenu clickOnReports() {
		 
		 
	      
		 reports.clickIfPresent();
         
         return  managMenu;
}
	 
	 public void clickOnLogOut() {
		 
		 logOutBTN.clickIfPresent(2);
	

}
	 
 public boolean isLogOutBTNVisible() {
		 
		return logOutBTN.isPresent();
	

}
}
