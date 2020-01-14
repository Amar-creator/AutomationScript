package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustInfoPage
{
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement dltcst;
	@FindBy(xpath="//input[@id='deleteButton']")
	private WebElement deltcust;
    
    public EditCustInfoPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getDltcst() {
		return dltcst;
	}

	public WebElement getDeltcust() {
		return deltcust;
	}

	
    
}
