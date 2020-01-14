package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement prjctcst;
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
    private WebElement crtnewtask;
	
	@FindBy(xpath="//a[text()='amar']")
	private WebElement tasklink;
	

	
	public OpenTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrjctcst() {
		return prjctcst;
	}

	public WebElement getCrtnewtask() {
		return crtnewtask;
	}

	public WebElement getTasklink() {
		return tasklink;
	}

	
    
	
    
	
}
