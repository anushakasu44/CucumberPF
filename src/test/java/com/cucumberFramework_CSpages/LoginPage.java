package com.cucumberFramework_CSpages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	WebDriver driver;

	@FindBy(xpath="//*[@id='mat-input-0']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Create a new Account']")
	WebElement CreateNewAccount;
	
//	@FindBy(xpath="//mat-error[@id='mat-error-0']")
//	WebElement emailreq;
//	
//	@FindBy(xpath="//mat-error[@id='mat-error-1']")
//	WebElement pswdreq;
	
	
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void enterusername(String value) {
		username.sendKeys(value);
	}
	
	public void enterPassword(String value) {
		password.sendKeys(value);
	}
	
	public void clickonsubmit() {
			login.click();
	}
	
	public void CreatenewAccount() {
		CreateNewAccount.click();
	}
	
	
	
//	public void validateemailreq() {
//	username.click();
//	boolean bool=emailreq.isDisplayed();
//	System.out.println(bool);
//}
//public void validatepswdreq() {
//password.click();
//boolean bool=emailreq.isDisplayed();
//System.out.println(bool);
//}

}
