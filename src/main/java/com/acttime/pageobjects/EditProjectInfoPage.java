package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjectInfoPage {
	
	@FindBy(xpath="//input[@value='Delete This Project']")
	private WebElement dltprjct;
	@FindBy(xpath="//input[@id='deleteButton']")
	private WebElement cnfrmdlt;
	
	
	
	public EditProjectInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDltprjct() {
		return dltprjct;
	}
	public WebElement getCnfrmdlt() {
		return cnfrmdlt;
	}

	
	
	
	
}

