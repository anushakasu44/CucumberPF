package com.cucumberFramework_CSpages;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColdStorageDashboard {
WebDriver driver;
	
	
	@FindBy(xpath="//div[text()='Pending Farmer Orders']/../a/span")
	WebElement pendingFarmingOrders;
	
	@FindBy(xpath="//div[text()='Pending PC Orders']/../a")
	WebElement pendingPCOrders;
	
	@FindBy(xpath="//div[text()='CS/CAS Stock']/../a")
	WebElement CS_CASStock;
	
	
	public ColdStorageDashboard(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	
	 public CSfarmerOrders clickOnFarmingOrders()  {
		pendingFarmingOrders.click();
		return new CSfarmerOrders(driver);
		}
	
	 
     public void clickOnPCOrders() {
	   pendingPCOrders.click();
	   }
     
  
	 public CScasstock clickOnCS_CASStock() {
	   CS_CASStock.click();
	   return new CScasstock(driver);
	  }
  
   
   
}
