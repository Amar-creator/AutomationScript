package com.acttime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
			public static WebDriver launchBrowser(String browserName) 
					{
					WebDriver driver = null;	
				    if(browserName.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
				         driver=new ChromeDriver();
				    System.out.println("Chrome Launched");
				}
				    else if (browserName.equalsIgnoreCase("Firefox"))

				{
				System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
				driver= new FirefoxDriver();
				System.out.println("Firefox Launched");
				}
				return driver;
					}
                   }
