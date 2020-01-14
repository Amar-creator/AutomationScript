package com.acttime.features;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.acttime.pageobjects.ActiveProjectPage;
import com.acttime.pageobjects.CreateNewUserPage;
import com.acttime.pageobjects.EditUserSettingPage;
import com.acttime.pageobjects.EnterTimeTrackPage;
import com.acttime.pageobjects.UserListPage;

public class UserFeatures  {
	
		 WebDriver driver;
		 ActiveProjectPage app;
		 EnterTimeTrackPage ettp;
	     CreateNewUserPage cnup;
		 UserListPage ulp;
		 EditUserSettingPage eusp;

		
		 public UserFeatures(WebDriver driver)
			{
			
			 this.driver=driver;
			 app=new ActiveProjectPage(driver);
			 ettp=new EnterTimeTrackPage(driver);
			 cnup=new CreateNewUserPage(driver);
			 ulp=new UserListPage(driver);
			 eusp=new EditUserSettingPage(driver);
			}
	
	public void createNewUser(String username, String password, String retypepassword, String firstname, String lastname, String emailid)
	{
		ettp.getUser().click();
		ulp.getCreateNewusr().click();
		cnup.getUsrname().sendKeys(username);
		cnup.getPswrd().sendKeys(password);
		cnup.getPswrdTxtRetype().sendKeys(retypepassword);
		cnup.getFirstName().sendKeys(firstname);
		cnup.getLastName().sendKeys(lastname);
		cnup.getEmail().sendKeys(emailid);
		cnup.getCnfrmbtn().click();
		
	}
	
	public void checkFuncUser()
	{
		
	}
	
	
	public void funcDelUsr()
	{
		ettp.getUser().click();	
		ulp.getNewuserlink().click();
		eusp.getDeleteuser().click();
		Alert alt=driver.switchTo().alert();
		String alertText=alt.getText();
		Reporter.log(alertText,true);
		alt.accept();
	}

}
