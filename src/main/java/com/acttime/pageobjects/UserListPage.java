package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage 
{
      @FindBy(xpath="//span[text()='Create New User']")
      private WebElement createNewusr;
      @FindBy(xpath="//a[text()='Devgan, Ajay (Ajay_Dev)']")
      private WebElement newuserlink;
      
      public UserListPage(WebDriver driver)
  	{
  		PageFactory.initElements(driver, this);
  	}

	public WebElement getCreateNewusr() {
		return createNewusr;
	}

	public WebElement getNewuserlink() {
		return newuserlink;
	}
      
      
}
