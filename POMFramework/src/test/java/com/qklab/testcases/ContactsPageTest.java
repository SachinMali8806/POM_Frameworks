package com.qklab.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qklab.base.TestBase;
import com.qklab.pages.ContactsPage;
import com.qklab.pages.HomePage;
import com.qklab.pages.LoginPage;
import com.qklab.util.TestUtil;

public class ContactsPageTest extends TestBase{

	String SheetName = "contacts";
	LoginPage login;
	HomePage homepage;
	ContactsPage contacts;
	TestUtil testutil;
	
	public ContactsPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new LoginPage();
		contacts = new ContactsPage();
		testutil = new TestUtil();
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.SwitchToFrame();
		contacts = homepage.clickonContactslink();
		
	}
	
	@Test(priority=1)
	public void verifyContactsLabelTest() {
		Assert.assertTrue(contacts.verifycontactsLabel());
	}
	
//	@Test(priority = 2)
	public void clickOnCheckBoxByNameTest() {
		contacts.SelectContactCheckBoxByName("A30 ydv");
			}
	
	
	@DataProvider
	public Object[][] GeCRMTestData() {
		Object[][] data =  testutil.getTestData(SheetName);
		return data;
	}
	
//	@Test(priority = 3, dataProvider = "GeCRMTestData")
	public void validateCreateNewContactTest(String title, String Fname, String Lname, String company) {
		homepage.clickOnNewContacts();
		contacts.CreateNewContactsPage(title,Fname, Lname,company);
		}
	
	
//	@Test(priority = 3)
//	public void validateCreateNewContactTest() {
//		homepage.clickOnNewContacts();
//		contacts.CreateNewContactsPage("Mr.", "abc", "xyz", "Testing");
//		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
