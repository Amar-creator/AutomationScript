package com.acttime.scripts;

import org.testng.annotations.Test;

import com.acttime.features.LoginFeatures;
import com.acttime.generic.BaseLib;
import com.acttime.generic.ExcelUtilities;

public class LoginTest extends BaseLib
{
@Test(priority=1)
public void validLogin()
{
ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 1, 1);
	String password = eu.readData("Sheet1", 1, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
    lf.verifyHomePage();
}
  @Test(priority=2)
  public void InvalidLogin()
  {
  	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String username = eu.readData("Sheet1", 2, 1);
	String password = eu.readData("Sheet1", 2, 2);

	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(username, password);
	
	lf.verifyInvalidLogin();
}

}
