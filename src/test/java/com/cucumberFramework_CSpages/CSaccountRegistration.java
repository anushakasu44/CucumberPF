package com.cucumberFramework_CSpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSaccountRegistration {
WebDriver driver;

@FindBy(xpath="//input[@formcontrolname='firstname']")
WebElement AdminFirstname;

@FindBy(xpath="//input[@formcontrolname='lastname']")
WebElement AdminLastname;

@FindBy(xpath="//input[@formcontrolname='phone']")
WebElement Telephone;

@FindBy(xpath="//input[@formcontrolname='email']")
WebElement Email;

@FindBy(xpath="//button[text()=' Back ']")
WebElement Back;

@FindBy(xpath="//button[text()=' next ']")
WebElement Next;

	public CSaccountRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adminfirstname(String name) {
		AdminFirstname.sendKeys(name);
	}
	
	public void adminLastname(String name) {
		AdminLastname.sendKeys(name);
	}
	
	public void telephone(String name) {
		Telephone.sendKeys(name);
	}
	
	public void email(String name) {
		Email.sendKeys(name);
	}
	
    public void clickOnBack() {
    	Back.click();
    }
    public void clickOnNext() {
    	
    	if(Next.isEnabled()) {
    		System.out.println("enabled");
    	}
    	else {
    		System.out.println("not enabled");
    	}
    	Next.click();
    }
	
}
