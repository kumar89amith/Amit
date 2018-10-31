package com.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigProperties;
import com.utility.Constant;
import com.utility.TestBaseLog4j;

public class MessagingSendAnSms {
	
	public static final Logger Log=Logger.getLogger(TestBaseLog4j.class.getName());
	
	public static void sendAnSms(WebDriver driver) throws Exception
	{
	Log.info("Message sending SMS");
    driver.findElement(By.xpath(ConfigProperties.pro.getProperty("Messaging"))).click();
		
		Actions drag=new Actions(driver);
		
		WebElement dragele1=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("SendAnSms")));
	
		
		Thread.sleep(3000);
		
		drag.clickAndHold(dragele1).moveByOffset(650, 10).release().build().perform();
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("mobNo"))).sendKeys(Constant.phoneNo);
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("messageText"))).sendKeys(Constant.msgText);
		
        WebElement node1=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectStart")));
		
		WebElement node2 =driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectSendAnSms")));
		
		
		Thread.sleep(2000);
		drag.dragAndDrop(node1, node2).build().perform();
		
		
		
		Thread.sleep(3000);
	}

}
