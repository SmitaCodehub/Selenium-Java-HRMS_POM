package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass{
	// verify whole application
	public static void verifyTitle(String title)
	{
		if(driver.getTitle().equals(title)) {
			Reporter.log("Tiltle matched");
		}
		else {
			Reporter.log("Tiltle Not matched");
			Reporter.log(driver.getTitle());
		}
		
	}

}
