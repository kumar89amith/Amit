package com.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.appModule.CreateAnApp;
import com.appModule.MessagingSendAnEmail;
import com.appModule.MessagingSendAnSms;
import com.exitApp.ExitApp;
import com.utility.Constant;

public class ModuleTc {

	 private static WebDriver driver = null;
	 
	public static void main(String[] args) throws Exception {
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		CreateAnApp.appCreation(driver);
		MessagingSendAnSms.sendAnSms(driver);
		MessagingSendAnEmail.sendAnEmail(driver);
		ExitApp.exitApplication(driver);
		
	//	Thread.sleep(5000);
	//	driver.quit();
		
	}

}
