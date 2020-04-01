package com.cucumberFramework_CSpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CScasstock {
WebDriver driver;

	@FindBy(xpath="//h4[text()='Varietes']/following-sibling::ul[1]/li")
	List<WebElement> varietes;
	
    @FindBy(xpath="//h4[text()='Varietes']/following-sibling::ul[1]/li/label")
    List<WebElement> varieteslabel;
	
public CScasstock(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void selectvarieties(String name)  {
	
	for(int i=0;i<=varietes.size();i++) {
		
		if(varietes.get(i).getText().equals(name)) {
			System.out.println(varietes.get(i).getText());
			varieteslabel.get(i).click();
			break;
			
			
		}
	}

}

}