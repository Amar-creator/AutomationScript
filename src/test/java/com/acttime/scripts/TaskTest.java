package com.acttime.scripts;

import org.testng.annotations.Test;

import com.acttime.features.LoginFeatures;
import com.acttime.features.TaskFeatures;
import com.acttime.generic.BaseLib;
import com.acttime.generic.ExcelUtilities;

public class TaskTest extends BaseLib
{
@Test
public void createCustomer()
{
	ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	String Username = eu.readData("Sheet1", 3, 1);
	String Password = eu.readData("Sheet1", 3, 2);
	LoginFeatures lf=new LoginFeatures(driver);
	lf.login(Username, Password);
	
	String customerName = eu.readData("Sheet1", 3, 3);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.createCustomer(customerName);
	tf.verifyCreateCustomer(customerName);
	tf.clickLogout();
}
@Test (dependsOnMethods= {"deleteProject"})
public void deleteCustomer()
{
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",4,1);
    String Password = eu.readData("Sheet1",4,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
    String customerName=eu.readData("Sheet1", 4, 3);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.deleteCustomer(customerName);
	tf.VerifyDeleteCustomer(customerName);
	tf.clickLogout();
}

@Test (dependsOnMethods= {"createCustomer"})
public void createProject()
{
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",5,1);
    String Password = eu.readData("Sheet1",5,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
	String customerName=eu.readData("Sheet1", 5, 3);
	String projectName=eu.readData("Sheet1", 5, 4);
	TaskFeatures tf=new TaskFeatures(driver);
	tf.createProject(customerName, projectName);
	tf.verifycreateProject(projectName);
	
	tf.clickLogout();

}

@Test(dependsOnMethods= {"createTask"})
public void deleteProject()
{
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",5,1);
    String Password = eu.readData("Sheet1",5,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
    String customerName = eu.readData("Sheet1", 5, 3);
    String projectName=eu.readData("Sheet1", 5, 4);
   	TaskFeatures tf=new TaskFeatures(driver);
   	tf.deleteProject(customerName);
   	tf.verifyDeleteProject(projectName);
   	tf.clickLogout();
   	
}
@Test(dependsOnMethods= {"createCustomer"})
public void createTask()
{
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",7,1);
    String Password = eu.readData("Sheet1",7,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
    
    String customerName=eu.readData("Sheet1", 7, 3);
    String projectName=eu.readData("Sheet1", 7, 4);
    String TaskName=eu.readData("Sheet1",7,5);
    //String DeadLine=eu.readData("Sheet1",7, 6);
    
    
    
    TaskFeatures tf=new TaskFeatures(driver);
    tf.createNewTask(customerName,projectName,TaskName);
   //	tf.verifyCreateTask(customerName,projectName);
   	tf.clickLogout();
   
	
}

@Test
public void deleteTask()
{
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",7,1);
    String Password = eu.readData("Sheet1",7,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
    TaskFeatures tf=new TaskFeatures(driver);
    tf.clickLogout();
    
}
	

	
}


