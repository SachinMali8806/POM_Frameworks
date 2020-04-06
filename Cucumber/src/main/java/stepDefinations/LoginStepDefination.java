package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	static WebDriver driver;
	@Given("^User is already on login page$")    // ^exact given_statement from .feature file$  --> So that cucumber can understand this pericular line (This is the standard form)
	public void User_Already_On_Login_Page() {
		 
		
		System.setProperty("webdriver.chrome.driver", "E:\\sachinLearnings\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
		
	@When("^title of login page is Facebook – log in or sign up$")
	public void Title_Of_The_Login_Page_Is_FacebookLoginOrSignUp() {
		
		String title= driver.getTitle();
		System.out.println(title);
		
	}
	
	@Then("^enters username and password$")
	public void Enter_UserName_And_Password() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("malisachin502@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sachin@1234");
		
		
		}
	
	@Then("^click on Login button$")
	public void Click_On_Login_Button() {
		driver.findElement(By.id("u_0_b")).click();

		
		
	}
	
//	@Then("^user is on home page$")
//	public void User_On_Home_Page() {
//		
//		System.out.println("User is on Home page");
//		Assert.assertEquals(true, true);
//	}
	
	
	
}
