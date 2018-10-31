package com.automationFramework;

import java.util.concurrent.TimeUnit;





import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appModule.CreateAnApp;
import com.appModule.MessagingSendAnEmail;
import com.appModule.MessagingSendAnSms;
import com.exitApp.ExitApp;
import com.utility.ConfigProperties;
import com.utility.Constant;
import com.utility.TestBaseLog4j;

public class TestNgAction {
	
	public WebDriver driver;
	 
	@Test(priority=1)
   public void ApplicationLaunch() throws Exception {
 
		ConfigProperties.getPropertiesData();
	 	driver = new FirefoxDriver();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get(Constant.URL);
 		driver.manage().window().maximize();
 		
        }
	
	@Test (priority=2)
	public void clickOnAppCreation() throws Exception {
		
			CreateAnApp.appCreation(driver); 	 
	        }
	
	
	@Test (priority=3)
	public void sendAnSmsMethod() throws Exception {
		
		MessagingSendAnSms.sendAnSms(driver);	 
	        }
	
	@Test (priority=4)
	public void sendAnEmailMethod() throws Exception {
		
		MessagingSendAnEmail.sendAnEmail(driver);	 
	        }
	
	@Test(priority=5)
	public void ExitAppMethod() throws Exception {
		
		ExitApp.exitApplication(driver);
		
	        }
	
	 
	   @Test (priority=6)
	 
	  public void afterMethod() {
	 
		  
		   
		    driver.quit();
	 
	        }

}