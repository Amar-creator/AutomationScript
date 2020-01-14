package com.acttime.features;

import java.util.List;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.acttime.pageobjects.ActiveProjectPage;
import com.acttime.pageobjects.CreateNewCustPage;
import com.acttime.pageobjects.CreateNewProjectPage;
import com.acttime.pageobjects.CreateNewTaskPage;
import com.acttime.pageobjects.CreateNewUserPage;
import com.acttime.pageobjects.EditCustInfoPage;
import com.acttime.pageobjects.EditProjectInfoPage;
import com.acttime.pageobjects.EditUserSettingPage;
import com.acttime.pageobjects.EnterTimeTrackPage;
import com.acttime.pageobjects.OpenTaskPage;
import com.acttime.pageobjects.UserListPage;
import com.acttime.pageobjects.ViewOpenTaskPage;

public class TaskFeatures 
{
 WebDriver driver;

 ActiveProjectPage app;
 CreateNewCustPage cncp;
 EnterTimeTrackPage ettp;
 OpenTaskPage otp;
 EditCustInfoPage ecip;
 CreateNewProjectPage cnpp;
 EditProjectInfoPage epip;
 CreateNewTaskPage cntp;
 ViewOpenTaskPage votp;
 CreateNewUserPage cnup;
 UserListPage ulp;
 EditUserSettingPage eusp;

 public TaskFeatures(WebDriver driver)
	{
	
	 this.driver=driver;
	 
	 app=new ActiveProjectPage(driver);
	 cncp=new CreateNewCustPage(driver);
	 ettp=new EnterTimeTrackPage(driver);
	 otp=new OpenTaskPage(driver);
	 ecip=new EditCustInfoPage(driver);
	 cnpp=new CreateNewProjectPage(driver);
	 epip=new EditProjectInfoPage(driver);
	 cntp =new CreateNewTaskPage(driver);
	 votp=new ViewOpenTaskPage(driver);
	 cnup=new CreateNewUserPage(driver);
	 ulp=new UserListPage(driver);
	 eusp=new EditUserSettingPage(driver);
	}
	
 
//features
	public void createCustomer(String customerName)
	{
		ettp.getTask().click();
		otp.getPrjctcst().click();
		app.getCrtnew().click();
		cncp.getName().sendKeys(customerName);
		cncp.getCrtcust().click();
		
	}
	
	public void deleteCustomer(String customerName)
	{
		ettp.getTask().click();
		otp.getPrjctcst().click();
		Select sel = new Select(app.getCustomerDrpdwn());
		sel.selectByVisibleText(customerName);
		app.getShowbtn().click();
		if (app.getCustLink().getText().equalsIgnoreCase(customerName))
		{
			app.getCustLink().click();
		}
		ecip.getDltcst().click();
		ecip.getDeltcust().click();
		
		
		
	}
 
	public void verifyCreateCustomer(String customerName)
	{
		String actualMsg = app.getSuccessMsg().getText();
		String expectedMsg = "Customer \""+customerName+"\" has been successfully created.";
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log(expectedMsg,true);
	}
	public void clickLogout()
	{
		app.getLogout().click();
	}
	
	public void VerifyDeleteCustomer(String expCustName)
	{
		Select sel = new Select(app.getCustomerDrpdwn());
		List<WebElement> allOps = sel.getOptions();
		for (int i = 0; i < allOps.size(); i++) 
		{
			String actualCustName = allOps.get(i).getText();
			Assert.assertNotEquals(actualCustName, expCustName);
		}
		String actualMsg = app.getSuccessMsg().getText();
		String expectedMsg = "Customer has been successfully deleted.";
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log(expectedMsg,true);
	}
	public void createProject(String customerName,String projectName)
	{
		ettp.getTask().click();
		otp.getPrjctcst().click();
		app.getCrtprjct().click();
		Select sel=new Select(cnpp.getCustomerdrpdwn());
		sel.selectByVisibleText(customerName);
		cnpp.getProjctname().sendKeys(projectName);
		cnpp.getCreateprjct().click();
		
	}
	public void verifycreateProject(String projectName)
	{
	    String actualMsg = app.getSuccessMsg().getText();
		String expectedMsg = "Project \""+projectName+"\" has been successfully created.";
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log(expectedMsg,true);	
	}
	
	public void deleteProject(String customerName )
	{
		ettp.getTask().click();
		otp.getPrjctcst().click();
		Select sel=new Select(app.getCustomerDrpdwn());
	
		sel.selectByVisibleText(customerName);
		app.getShowbtn().click();
		app.getProjctlink().click();
		epip.getDltprjct().click();
		epip.getCnfrmdlt().click();
		
		
	}
	
	public void verifyDeleteProject(String projectName)
	{
		String actualMsg=app.getSuccessMsg().getText();
		String expectedMsg = "Project has been successfully deleted.";
	Assert.assertEquals(actualMsg, expectedMsg);
	
	try
	{
		if(app.getProjctlink().getText().equalsIgnoreCase(projectName))
		{
		Assert.assertTrue(false);
		}
	}
	
	
	catch(NoSuchElementException e)
	{
		Assert.assertTrue(true);
	}
	
	}
	
	public void createNewTask(String customerName ,String projectName, String TaskName) 
	{
		
		ettp.getTask().click();
		otp.getCrtnewtask().click();
		Select sel=new Select(cntp.getCustdropdwn());
		sel.selectByVisibleText(customerName);
		Select sel1=new Select(cntp.getProjectdrpdwn());
		sel1.selectByVisibleText(projectName);
		cntp.getEntertaskname().get(0).sendKeys(TaskName);
		cntp.getSelDate().click();
		cntp.getDeadline().click();
		Select sel2=new Select(cntp.getBillabledrpdwn());
		sel2.selectByVisibleText("Billable");
		cntp.getChckbox().get(0).click();
		cntp.getCreatetask().click();
		
		
	}
	
	public void deleteTask()
	{
		ettp.getTask().click();
		otp.getTasklink().click();
		votp.getDeleteTask().click();
		votp.getCnfrmdlttask().click();
		
	}
	
	
}
	
	
