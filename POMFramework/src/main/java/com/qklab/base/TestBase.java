package com.qklab.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qklab.util.TestUtil;
import com.qklab.util.WebEventListener;

// all the vasic initializartion like launching the chrome, maximising window, page load timeout, implicit wait, getURl, deleteAllCoocies

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("E:\\sachinLearnings\\CucumberWorkspace\\POMFramework\\src\\main\\java\\com\\qklab\\config"
					+ "\\config.properties");
			prop.load(ip);
				} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
		 	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
		public void initialization() {
			
			String BrowserName =prop.getProperty("browser");
			if(BrowserName.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "E:\\sachinLearnings\\chromedriver_win32_80\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(BrowserName.equals("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "");
				driver = new ChromeDriver();
			}
			
			
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
			
			
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		System.out.println(prop.getProperty("url"));
		
		driver.get(prop.getProperty("url"));
		
		
		
		
			
		
		
	}

}
