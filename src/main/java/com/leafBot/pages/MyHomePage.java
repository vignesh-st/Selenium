package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public  MyHomePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Create Lead") WebElement eleClickCreateLead;
	
	public CreateLeadPage clickCreateLead() 
	{
		click(eleClickCreateLead);
		return new CreateLeadPage();
	}

}
