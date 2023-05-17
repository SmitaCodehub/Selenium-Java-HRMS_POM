package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass {
	//Driver
	public  static WebDriver driver;
	public static ChromeOptions options;
	
	//OppenApplication
	public static void openApplication()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		System.out.println("Application opened");// Console outut
		Reporter.log("Application opened");//Html file 
	}
	
	//Close application
	public static void closeApplication()
	{
	
		driver.close();
		Reporter.log("Application Closed");
	}

}
