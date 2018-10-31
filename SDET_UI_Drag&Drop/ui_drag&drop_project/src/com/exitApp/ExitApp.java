package com.exitApp;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.ConfigProperties;
import com.utility.TestBaseLog4j;

public class ExitApp {
	
	public static final Logger Log=Logger.getLogger(TestBaseLog4j.class.getName());
	
	public static void exitApplication(WebDriver driver) throws Exception
	{
		
		
		driver.findElement(By.xpath(ConfigProperties.pro.getProperty("Basic"))).click();;
		
		WebElement exitElemnet1=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("HangUpExit")));
		
		Actions drag=new Actions(driver);
		
		drag.clickAndHold(exitElemnet1).moveByOffset(300, 50).release().build().perform();
	
	// First Exit App conneection with Send an SMS for sent
		
	WebElement ele1=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectSendAnSmsSENT")));
	WebElement ele2=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectExitApp1")));
	Thread.sleep(2000);
	drag.dragAndDrop(ele1,ele2).build().perform();
		
	// Second Exit App connection with Send an Email for Sent
	
	
	drag.clickAndHold(exitElemnet1).moveByOffset(600, 400).release().build().perform();
		
	WebElement ele3=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("ConnectSendAnEmail2")));
	WebElement ele4=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectExitApp2")));
	Thread.sleep(2000);
	drag.dragAndDrop(ele3,ele4).build().perform();
	
	// Third Exit App connection with Send an Email for Sent
	
	drag.clickAndHold(exitElemnet1).moveByOffset(1200, 400).release().build().perform();
		
	WebElement ele5=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("ConnectSendAnEmailNotSent1")));
	WebElement ele6=driver.findElement(By.xpath(ConfigProperties.pro.getProperty("connectExitApp3")));
	Thread.sleep(2000);
	drag.dragAndDrop(ele5,ele6).build().perform();
	
	Thread.sleep(4000);
	
	 Log.info("Test execution close");
	}

}
