package com.acttime.scripts;

import org.testng.annotations.Test;
import com.acttime.features.LoginFeatures;
import com.acttime.features.TaskFeatures;
import com.acttime.features.UserFeatures;
import com.acttime.generic.BaseLib;
import com.acttime.generic.ExcelUtilities;

public class UserTest extends BaseLib
{
	
@Test
public void createNewUser()
{
	
	ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
    String Username = eu.readData("Sheet1",9,1);
    String Password = eu.readData("Sheet1",9,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(Username, Password);
    
    String username=eu.readData("Sheet1", 9, 3);
    String password=eu.readData("Sheet1", 9, 4);
    String retypepassword=eu.readData("Sheet1", 9, 5);
    String firstname=eu.readData("Sheet1", 9, 6);
    String lastname=eu.readData("Sheet1", 9, 7);
    String emailid=eu.readData("Sheet1", 9, 8);
    UserFeatures uf=new UserFeatures(driver);
    uf.createNewUser(username,password,retypepassword,firstname,lastname,emailid);
    TaskFeatures tf=new TaskFeatures(driver);
    tf.clickLogout();
	
}
	
	@Test(dependsOnMethods= {"createNewUser"})
	public void checkFuncUser()
	{
		ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
	    String Username = eu.readData("Sheet1",10,1);
	    String Password = eu.readData("Sheet1",10,2);
	    LoginFeatures lf=new LoginFeatures(driver);
	    lf.login(Username, Password);
	    TaskFeatures tf=new TaskFeatures(driver);
	    tf.clickLogout();
	}
	
	@Test(dependsOnMethods= {"checkFuncUser"})
	public void funcDelUsr()
	{
		ExcelUtilities eu = new ExcelUtilities  ("./testdata/testdata.xlsx");
	    String Username = eu.readData("Sheet1",11,1);
	    String Password = eu.readData("Sheet1",11,2);
	    LoginFeatures lf=new LoginFeatures(driver);
	    lf.login(Username, Password);
	    TaskFeatures tf=new TaskFeatures(driver);
	    tf.clickLogout();
		
	}

}
