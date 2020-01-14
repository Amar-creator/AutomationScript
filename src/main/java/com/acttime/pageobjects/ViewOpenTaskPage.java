package com.acttime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOpenTaskPage
{
   @FindBy(xpath="//input[@value='Delete This Task']")
   private WebElement deleteTask;
   
   @FindBy(xpath="//input[@id='deleteButton']")
   private WebElement cnfrmdlttask;
 
   
   public ViewOpenTaskPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }


public WebElement getDeleteTask() {
	return deleteTask;
}


public WebElement getCnfrmdlttask() {
	return cnfrmdlttask;
}
   
   

}
   
   
