package com.cucumberFramework_CSpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;


public class Logout {
WebDriver driver;

	@FindBy(xpath="//span[text()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath="//span[text()='Settings']")
	WebElement Settings;
	
	@FindBy(xpath="//span[text()='Help']")
	WebElement Help;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement logout;
	
	
	public Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void clickonMyAccount()  {
		  MyAccount.click();
		   }
	 
	 public void clickonSettings()  {
		Settings.click();
		   }
	 
	 public void clickonHelp() {
		 Help.click();
		   }
	 
	
	 public void clickonlogout() throws InterruptedException {
		logout.click();
		   }
}
