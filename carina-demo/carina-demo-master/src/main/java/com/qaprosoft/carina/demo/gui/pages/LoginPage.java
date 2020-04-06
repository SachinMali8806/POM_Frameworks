package com.qaprosoft.carina.demo.gui.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;



public class LoginPage extends AbstractPage {
	
    Logger LOGGER = Logger.getLogger(LoginPage.class);
    
 
    @FindBy(xpath = "//input[@name='username']")
    private ExtendedWebElement userName;
    
    @FindBy(xpath = "//input[@name='password']")
    private ExtendedWebElement passWord;
    
    //Login Button
    //input[@name='Login']
    @FindBy(xpath = "//input[@name='Login']")
    private ExtendedWebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public void typeUserName(String User1) {
        
        userName.type(User1);
        
        LOGGER.info("Username is Typed:"+User1);
        
    }

     
    public void typePassWord(String Pass1) {
        
        passWord.type(Pass1);
    }
    
    public boolean isLoginBTNPresent() {
       
      return  login.isElementPresent();
    }
    public DashboardPage clickOnLogin() {
        assertElementPresent(login);
        login.clickIfPresent();
        
        return new DashboardPage(getDriver());
        
        
    }

    
    
   
}
