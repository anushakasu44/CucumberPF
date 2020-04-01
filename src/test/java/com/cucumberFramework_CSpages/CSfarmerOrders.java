package com.cucumberFramework_CSpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSfarmerOrders {
	WebDriver driver;

	@FindBy(xpath="//button[text()='Pending']")
	WebElement pending;
	
	@FindBy(xpath="//button[text()='Accepted']")
	WebElement accepted;
	
	@FindBy(xpath="//button[text()='Compelted']")
	WebElement completed;
	
//	@FindBy(xpath="//*[@id=\"table\"]/thead/tr/['th[1]/div/div' or ''th[2]/div/div' or 'th[3]/div/div' or 'th[4]/div/div' or 'th[5]/div/div' or 'th[6]/div/div' or 'th[7]/div/div']")
//	List<WebElement> tableheaderXpathAlls;

@FindBy(xpath="//table/thead/tr[1]/th")
List<WebElement> tablecolumns;

@FindBy(xpath="//table/tbody/tr")
List<WebElement> tablerows;
	
	
	public CSfarmerOrders(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void clickpending() {
		pending.click();
		}
	
   public void clickaccepted() {
	   accepted.click();
		}

   public void clickcompleted() throws InterruptedException {
	 
//	 WebDriverWait wdw=new WebDriverWait(driver, 10);
//	 		wdw.until(ExpectedConditions.elementToBeClickable(completed));
	   completed.click();
	}
   
   

	   
	  public void gettablerows(String value) {
		  
		  String rowbeforexpath="//table/tbody/tr[";
		  String rowafterxpath="]/td[3]";
		  for(int i=2;i<=tablerows.size();i++) {
			  System.out.println(tablerows.size());
	WebElement allrows=driver.findElement(By.xpath(rowbeforexpath+i+rowafterxpath));
	System.out.println(allrows.getText());
	if(allrows.getText().equals(value)) {
		//System.out.println("row name is"+allrows.getText()+"found" +"at index"+i);
		WebElement rowside=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[7]"));//mat-icon[text()='more_vert']
		rowside.click();
		 driver.findElement(By.xpath("//span[text()='View']")).click();
				  break;
				  
			  }
	  }


	  }
         
   

 
	

	 
  }
    

