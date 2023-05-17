package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
	
	//objects
	static By id_welcome=By.id("welcome");
	static By link_logout= By.linkText("Logout");
	// Methods
	public static void logoutApp() throws Exception
	{
	driver.findElement(id_welcome).click();
	Thread.sleep(1000);
	driver.findElement(link_logout).click();
	Thread.sleep(1000);
	}
}
