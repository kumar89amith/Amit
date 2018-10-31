package com.appModule;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.ConfigProperties;
import com.utility.TestBaseLog4j; 

public class CreateAnApp {
	
	public static final Logger Log=Logger.getLogger(TestBaseLog4j.class.getName());
	
	public static void appCreation(WebDriver driver) throws IOException{
		
        driver.findElement(By.xpath(ConfigProperties.pro.getProperty("createAnApp"))).click();
        
       
        Log.info("Clicked on Create an App");
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("LetGetStarted"))).click();
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("NewPage"))).click();
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("NewPageText"))).sendKeys("MyPage");
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("NewPageCreate"))).click();
		
	}

}
