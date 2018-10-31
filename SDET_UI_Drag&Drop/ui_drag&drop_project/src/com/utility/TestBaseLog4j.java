package com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class TestBaseLog4j {
	
	public static final Logger Log=Logger.getLogger(TestBaseLog4j.class.getName());
	
	@BeforeTest
	public void loadlog4j()
	{
		String log4jConfPath=System.getProperty("user.dir")+"log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

}
