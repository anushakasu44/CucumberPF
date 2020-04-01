package com.cucumberFramework_CSpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectYourRole {

	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Cold Storage']")
	WebElement ColdStorage;
	
	@FindBy(xpath="//span[text()='Processing']")
	WebElement Processing;
	
	@FindBy(xpath="//span[text()='Distribution']")
	WebElement Distribution;
	
	@FindBy(xpath="//span[text()='buyer']")
	WebElement buyer;
	
	@FindBy(xpath="//button[text()=' next ']")
	WebElement Next;
	

    public SelectYourRole(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void coldStorage() {
		ColdStorage.click();
	}
	
	public void processing() {
		Processing.click();
	}
	
	public void distribution() {
		Distribution.click();
	}
	
	public void buyer() {
		buyer.click();
	}
	
	public void clickOnNext() {
		Next.click();
	}
	
	
	
	
}
