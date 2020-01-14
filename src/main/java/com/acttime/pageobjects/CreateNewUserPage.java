package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {
	
	@FindBy(name="username")
	private WebElement usrname;
	@FindBy(name="passwordText")
    private WebElement pswrd;
	@FindBy(name="passwordTextRetype")
    private WebElement pswrdTxtRetype;
	@FindBy(name="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(name="email")
	private WebElement email;
	@FindBy(xpath="//input[@value='   Create User   ']")
	private WebElement cnfrmbtn;
	
	public CreateNewUserPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPswrd() {
		return pswrd;
	}

	public WebElement getPswrdTxtRetype() {
		return pswrdTxtRetype;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCnfrmbtn() {
		return cnfrmbtn;
	}
	
	
}
