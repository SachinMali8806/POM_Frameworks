package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.PendingForApproverPage;

public class NotificationMenu extends AbstractUIObject{
	
	//Notification Menu
	//span[@class='notification-texten']
	 @FindBy(xpath = "//span[@class='notification-texten']")
	    private ExtendedWebElement notificatn;

	public NotificationMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}
	
	public PendingForApproverPage clickOnNotification() {
		
		notificatn.clickIfPresent();
		
		return  new  PendingForApproverPage (driver);
		
	}
	
public void getNotificationText() {
		
		String str = notificatn.getText();
		
		System.out.println(str);
		
		
	}
	
	
	
	
	

}
