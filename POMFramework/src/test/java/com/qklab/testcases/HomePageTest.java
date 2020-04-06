package com.qklab.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qklab.base.TestBase;
import com.qklab.pages.ContactsPage;
import com.qklab.pages.HomePage;
import com.qklab.pages.LoginPage;
import com.qklab.util.TestUtil;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	ContactsPage contacts;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		testutil = new TestUtil();
		contacts = new ContactsPage();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verfyHomePageTitleTest() {
		String title = homepage.verifyHomepageTitle();
		Assert.assertEquals(title, "CRMPRO", "Title not matched");
	}
	
//	@Test(priority = 2)
	public void verfyUssernameTest() {
		testutil.SwitchToFrame();
		Assert.assertTrue( homepage.verifyCorrectUserName());
	}
	
//	@Test
	public void ClickonContactsLinkTest() {
		testutil.SwitchToFrame();
		contacts = homepage.clickonContactslink();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
