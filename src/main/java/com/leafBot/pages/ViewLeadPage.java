package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	
	public  ViewLeadPage(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="viewLead_lastName_sp") WebElement eleLatname;
	public ViewLeadPage verifyLastname()
	{
		String text = getElementText(eleLatname);
		if(text.equals("Thangavel"))
		{
			System.out.println("Last Name is verified ");
		}
		else
		{
			System.out.println("last name is incorrect");
		}
		
		return new ViewLeadPage();
	}
}
