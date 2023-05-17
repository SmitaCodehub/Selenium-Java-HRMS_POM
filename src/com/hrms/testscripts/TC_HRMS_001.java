package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_HRMS_001 {
	//Test case steps
	@Test
	public static void tc001() throws Exception
	{
	BaseClass.openApplication();
	VerifyPage.verifyTitle("hrms");
	LoginPage.login("Admin", "6@@OZ1Mr@eoG");
	VerifyPage.verifyTitle("OrangeHRM");
	LogoutPage.logoutApp();
	BaseClass.closeApplication();
	}

}
