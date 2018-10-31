package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigProperties {
	
	public static Properties pro;
	 public static void getPropertiesData() throws IOException {
	

		File src=new File(System.getProperty("user.dir")+"\\resources\\config.properties");
		
		FileInputStream fis=new FileInputStream(src);
	    pro=new Properties();
		pro.load(fis);
		
	
		
				
	}

}
