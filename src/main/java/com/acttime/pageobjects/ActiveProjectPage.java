package com.acttime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectPage extends BasePage
{
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement crtnew;
	@FindBy(xpath="//table[@id='SuccessMessages']//td//span[@class='successmsg']")
	private WebElement successMsg;
	@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href,'customer')]")
	private WebElement custLink;
	@FindBy(xpath="//select[@name='selectedCustomer']")
	private WebElement CustomerDrpdwn;
	@FindBy(css="input[value*='Show']")
	private WebElement showbtn;
	
	@FindBy (xpath="//input[@value='Create New Project']")
	private WebElement crtprjct;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement psccsmsg;
	@FindBy(xpath="//a[text()='Medical Software']")
	private WebElement projctlink;


	public ActiveProjectPage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCrtnew() 
	{
		return crtnew;
	}

	public WebElement getCustomerDrpdwn() {
		return CustomerDrpdwn;
	}

	

	public WebElement getShowbtn() {
		return showbtn;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getCustLink() {
		return custLink;
	}

	public WebElement getCrtprjct() {
		return crtprjct;
	}

	
	public WebElement getPsccsmsg() {
		return psccsmsg;
	}

	public WebElement getProjctlink() {
		return projctlink;
	}
	
	
	
	

}
