package com.cucumberFramework_CSpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DCdcstock {

	WebDriver driver;
	
	
	@FindBy(xpath="//h4[text()='Varietes']/following-sibling::ul[1]/li")
	List<WebElement> varietes;
	
	@FindBy(xpath="//h4[text()='Varietes']/following-sibling::ul[1]/li/input")
	List<WebElement> varietesinput;
	
	
	 public DCdcstock(WebDriver driver2){
			this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}
	 
	 
	 public void selectvarietes(String name) {
			for(int i=0;i<=varietes.size();i++) {
				
				if(varietes.get(i).getText().equals(name)) {
					System.out.println(varietes.get(i).getText());
					varietesinput.get(i).click();
					break;		
					
				}
			}
	 }
	 

}
















