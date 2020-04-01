package com.cucumberFramework_CSpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserImageicons {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='header-user-info-icon']")
	WebElement userimg;
	
	public UserImageicons(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnuserimg() throws InterruptedException {
		Thread.sleep(3000);
		//WebDriverWait wdw=new WebDriverWait(driver, 10);
		//wdw.until(ExpectedConditions.elementToBeClickable(userimg));
		userimg.click();
		   }
}
