package com.acttime.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTaskPage
{
  @FindBy(name="customerId")
  private WebElement custdropdwn;
  @FindBy(name="projectId")
  private WebElement projectdrpdwn;
  //@FindBy(xpath="//input[@name='projectName']")
 // private WebElement projectNamee;
  @FindBy(xpath="//input[starts-with(@name,'task[0].name')]")
  private List<WebElement> entertaskname;
  
@FindBy(xpath="//img[@id='ext-gen7']")
  private WebElement selDate;
@FindBy(xpath="//button[@id='ext-gen136']")
private WebElement Deadline;
  
  @FindBy(name="task[0].billingType")
  private WebElement Billabledrpdwn;
  
  @FindBy(xpath="//input[starts-with(@name,'task[0].m')]")
  private List<WebElement> chckbox;
  @FindBy(xpath="//input[@value='Create Tasks']")
  private WebElement createtask;
	
	public CreateNewTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCustdropdwn() {
		return custdropdwn;
	}

	public WebElement getProjectdrpdwn() {
		return projectdrpdwn;
	}

	

	

	public WebElement getSelDate() {
		return selDate;
	}

	public WebElement getDeadline() {
		return Deadline;
	}

	public WebElement getBillabledrpdwn() {
		return Billabledrpdwn;
	}

	public List<WebElement> getChckbox() {
		return chckbox;
	}

	public WebElement getCreatetask() {
		return createtask;
	}
	
	public List<WebElement> getEntertaskname() {
		return entertaskname;
}
}