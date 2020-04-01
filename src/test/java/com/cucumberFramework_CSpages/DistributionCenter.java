
package com.cucumberFramework_CSpages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistributionCenter {
WebDriver driver;
	
	@FindBy(xpath="//div[text()='Pending PC Orders']/../a/span")
	WebElement pendingPcOrders;
	
	@FindBy(xpath="//div[text()='Pending Buyer Orders']/../a/span")
	WebElement pendingBuyerOrders;
	
	@FindBy(xpath="//div[text()='DC Stock']/../a/span")
	WebElement DStock;
	
	
	 public DistributionCenter(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnPcOrders() {
		pendingPcOrders.click();
		
		
	}
   public void clickOnBuyerOrders() {
	   pendingBuyerOrders.click();
	  
	
	}
  
   public DCdcstock clickOnDStock() {
	   DStock.click();
	return new DCdcstock(driver);
	  
	  
}

}



