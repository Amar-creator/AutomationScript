package com.acttime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib 
{
public static WebDriver driver;//global driver

@BeforeMethod
@Parameters({"browser","baseurl"})
public void preCondition(String browserName,String url)
{
driver=BrowserFactory.launchBrowser(browserName);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(url);
}
@AfterMethod
public void postCondition()
{
	driver.close();
	Reporter.log("Browser closed",true);
}
}
