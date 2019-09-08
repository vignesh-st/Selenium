package com.leafBot.testcases;


import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {

	
	@Test(dataProvider="fetchData")
	public void TC002CreateLead(String username, String password)
	{
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFALink()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickSubmit()
		.verifyLastname();
	}
	
}
