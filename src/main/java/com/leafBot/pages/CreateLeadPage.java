package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public  CreateLeadPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement eleCompanyName;
	@FindBy(id="createLeadForm_firstName") WebElement eleFirstName;
	@FindBy(id="createLeadForm_lastName") WebElement eleLastName;
	@FindBy(className="smallSubmit") WebElement eleClickSubmit;
	
	public CreateLeadPage enterCompanyName()
	{
		clearAndType(eleCompanyName, "Cognizant");
		return this;
	}
	public CreateLeadPage enterFirstName()
	{
		clearAndType(eleFirstName, "Vignesh");
		return this;
	}
	public CreateLeadPage enterLastName()
	{
		clearAndType(eleLastName, "Thangavel");
		return this;
	}
	public ViewLeadPage clickSubmit()
	{
		click(eleClickSubmit);
		return new ViewLeadPage ();
	}

}
