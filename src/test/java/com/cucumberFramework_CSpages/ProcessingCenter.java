package com.cucumberFramework_CSpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessingCenter {
WebDriver driver;
	
	@FindBy(xpath="//div[text()='Pending CS/CAS Orders']/../a/span")
	WebElement pendingCSCSOrders;
	
	@FindBy(xpath="//div[text()='Pending DC Orders']/../a/span")
	WebElement pendingDCOrders;
	
	@FindBy(xpath="//div[text()='CS/CAS Stock']/../a/span")
	WebElement CSCASStock;

	
	public ProcessingCenter(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnCSCSOrders() {
		pendingCSCSOrders.click();
		
		
	}
   public void clickOnDCOrders() {
	   pendingDCOrders.click();
	
	  
	}
   
    public void clickOnCSCASStock() {
	   CSCASStock.click();
	//return new CScasstock(driver);
	
	   
}

}


