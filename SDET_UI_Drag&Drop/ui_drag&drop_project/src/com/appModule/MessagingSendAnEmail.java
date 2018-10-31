package com.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigProperties;
import com.utility.TestBaseLog4j;

public class MessagingSendAnEmail {
	
	public static final Logger Log=Logger.getLogger(TestBaseLog4j.class.getName());
	
	public static void sendAnEmail(WebDriver driver) throws Exception{
		
		 Log.info("Message sending Email");
		
		WebElement sendAnEmailElement=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("sendAnEmail")));
		Actions drag=new Actions(driver);
		
		drag.clickAndHold(sendAnEmailElement).moveByOffset(900, 130).release().build().perform();
		
		// Input field
		
		/***************
	
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='module-2']/div[1]/div[3]/div/div[1]/div[1]/div[2]/input")).sendKeys("Am1234kr");
		driver.findElement(By.xpath(".//*[@id='module-2']/div[1]/div[3]/div/div[1]/div[3]/div[2]/input")).sendKeys("Mangal");
		driver.findElement(By.xpath(".//*[@id='module-2']/div[1]/div[3]/div/div[1]/div[4]/div[2]/input")).sendKeys("1234@#$");
		driver.findElement(By.xpath(".//*[@id='module-2']/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/textarea")).sendKeys("abc@tctmail.com");
	*****************************/	
		
		
		WebElement notSendNode=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectSendAnSmsNotSent")));
		
		 WebElement sendAnEMailnode=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectSendAnEmail")));
				
	drag.dragAndDrop(notSendNode,sendAnEMailnode).build().perform();
	
	Thread.sleep(3000);
		
	}

}
