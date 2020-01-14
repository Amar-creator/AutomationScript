package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserSettingPage 
{
    @FindBy(xpath="//input[@value='Delete This User']")
    private WebElement deleteuser;
    
    public EditUserSettingPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getDeleteuser() {
		return deleteuser;
	}
    
    
}
