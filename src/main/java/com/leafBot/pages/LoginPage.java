package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage  extends ProjectSpecificMethods {
	
	public  LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username") WebElement eleUsername;
	@FindBy(id="password") WebElement elePassword;
	@FindBy(className="decorativeSubmit") WebElement eleclickLogin;
	
	public LoginPage enterUsername(String username) {
		clearAndType(eleUsername,username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		clearAndType(elePassword,password );
		return this;
	}

	public HomePage clickLogin() {
		click(eleclickLogin);
		return new HomePage();
	}
}
