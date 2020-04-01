package com.cucumberFrameworkStepDefinations;


import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.CScasstock;

import com.cucumberFramework_CSpages.ColdStorageDashboard;
import com.cucumberFramework_CSpages.LoginPage;
import com.cucumberFramework_CSpages.Logout;

import com.cucumberFramework_CSpages.UserImageicons;

import Utilities.ReadPropertiesFile;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ColdStorage  {
	WebDriver driver;
	
	
	


   @When("^user clicks on farmingorders viewdetails$")
   public void user_clicks_on_farmingorders_viewdetails() throws Throwable {
	ColdStorageDashboard cs1=new ColdStorageDashboard(driver);
	cs1.clickOnFarmingOrders();

	
}

   @When("^user  clicks on PCorders viewdetails$")
   public void user_clicks_on_PCorders_viewdetails() throws Throwable {
	   ColdStorageDashboard cs1=new ColdStorageDashboard(driver);
	cs1.clickOnPCOrders();
	
}

   @When("^user  clicks on CAS Stock viewdetails$")
   public void user_clicks_on_CAS_Stock_viewdetails() throws Throwable {
	  ColdStorageDashboard cs1=new ColdStorageDashboard(driver);
    cs1.clickOnCS_CASStock();
    CScasstock csca=new CScasstock(driver);
	csca.selectvarieties("Gala");

  

}


	
}


