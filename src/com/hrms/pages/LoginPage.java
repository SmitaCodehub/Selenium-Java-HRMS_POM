package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;


public class LoginPage extends BaseClass {
	//objects
	static By txt_username=By.name("txtUsername");
	static By txt_password=By.name("txtPassword");
	static By btn_login= By.name("Submit");
	
	//Method
	public static void login(String un, String pw) throws Exception
	{
		driver.findElement(txt_username).sendKeys(un);
		//driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
		driver.findElement(txt_password).sendKeys(pw);	
		driver.findElement(btn_login).click();
		Thread.sleep(2000);
		Reporter.log("Login completed");
	}

}
