package com.cucumberFramework_CSpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSaccountLogin {
WebDriver driver;
	
@FindBy(xpath="//input[@formcontrolname='username']")
WebElement username;

@FindBy(xpath="//input[@formcontrolname='password']")
WebElement password;

@FindBy(xpath="//input[@formcontrolname='repassword']")
WebElement repassword;

@FindBy(xpath="//button[text()=' submit ']")
WebElement Submit;

@FindBy(xpath="//button[text()=' Back ']")
WebElement Back;


	public CSaccountLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String name) {
		password.sendKeys(name);
	}
	
	public void enterRepassword(String name) {
		repassword.sendKeys(name);
	}
	
	public void clickOnSubmit() {
		Submit.click();
	}
	
	public void clickOnBack() {
		Back.click();
	}
	
}
