package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProjectPage 
{
   @FindBy(name="customerId")
   private WebElement customerdrpdwn;
   @FindBy(name="name")
   private WebElement projctname;
   @FindBy(name="createProjectSubmit")
   private WebElement createprjct;

public CreateNewProjectPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getCustomerdrpdwn() {
	return customerdrpdwn;
}

public WebElement getProjctname() {
	return projctname;
}

public WebElement getCreateprjct() {
	return createprjct;
}

}
