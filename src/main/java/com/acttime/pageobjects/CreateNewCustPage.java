package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustPage 
{
	@FindBy(name="name")
	private WebElement name;
	@FindBy(name="createCustomerSubmit")
	private WebElement crtcust;
	
	public CreateNewCustPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getName() {
		return name;
	}


	public WebElement getCrtcust() {
		return crtcust;
	}

	
	
}
