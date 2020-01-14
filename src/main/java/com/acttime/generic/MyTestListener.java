package com.acttime.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.acttime.generic.BaseLib;
import com.google.common.io.Files;

public class MyTestListener implements ITestListener
{
public static int executionCount,passCount,failCount,skipCount;
	
	public void onTestStart(ITestResult result) 
	{
		executionCount++;
		Reporter.log(result.getName()+"Script execution starts"+new Date(),true);
		
	}

	
	public void onTestSuccess(ITestResult result) 
	{
		passCount++;
		Reporter.log(result.getName()+"Script passed :)",true);
		
		
	}

	
	public void onTestFailure(ITestResult result) 
	{
		failCount++;
		
		Reporter.log(result.getName()+"Script is failed:(",true);
		TakesScreenshot ts=(TakesScreenshot) BaseLib.driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/"+result.getName()+".png");
		
	
			try 
			{
				Files.copy(srcFile,destFile);
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		
		
		Reporter.log("Screenshot has been taken",true);
		
	}

	
	public void onTestSkipped(ITestResult result) 
	{
		skipCount++;
		Reporter.log(result.getName()+"Script is skipped",true);
		
		
		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}


	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
		
	}

	
	public void onStart(ITestContext context) 
	{
		
		
	}

	
	public void onFinish(ITestContext context) 
	{
		Reporter.log("Suite Execution ends:"+new Date(),true);
		Reporter.log("Suite Execution executed:"+executionCount,true);
		Reporter.log("Suite Execution passed:"+passCount,true);
		Reporter.log("Suite Execution failed:"+failCount,true);
		Reporter.log("Suite Execution skipped:"+skipCount,true);
		
	}
   
}
