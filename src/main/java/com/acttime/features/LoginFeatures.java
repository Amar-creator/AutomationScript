package com.acttime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.acttime.pageobjects.EnterTimeTrackPage;
import com.acttime.pageobjects.LoginPage;

public class LoginFeatures 
{
WebDriver driver;
LoginPage lp;
EnterTimeTrackPage ettp;

public LoginFeatures(WebDriver driver)
{
	this.driver=driver;
	lp=new LoginPage(driver);
	ettp=new EnterTimeTrackPage(driver);
}

//features

public void login(String username, String password)
{
	lp.getUnTxtBx().sendKeys(username);
	lp.getPwdTxtBx().sendKeys(password);
	lp.getLoginBtn().click();
}

public void verifyHomePage() 
{
	String actualText = ettp.getEttpPageTitle().getText();
	String expectedText = "Enter Time-Track";
	Assert.assertEquals(actualText, expectedText);
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "actiTIME - Enter Time-Track";
	Assert.assertEquals(actualTitle, expectedTitle);
	Reporter.log("Home page is verified successfully",true);
	

}

public void verifyInvalidLogin()
{
	String actualMsg = lp.getInvalidLoginMsgEle().getText();
	String expectedMsg = "Username or Password is invalid. Please try again.";
	Assert.assertEquals(actualMsg, expectedMsg);
	Reporter.log("Invalid login verify successfully",true);
}
}
