package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.CSfarmerOrders;
import com.cucumberFramework_CSpages.ColdStorageDashboard;

import Utilities.ReadPropertiesFile;
import cucumber.api.java.en.When;

public class CSLoginWebapp{

	
	WebDriver driver2;
	


@When("^user clicks on Farmer pending orders viewdetails$")
public void user_clicks_on_Farmer_pending_orders_viewdetails() throws Throwable {
  ColdStorageDashboard CSD=new ColdStorageDashboard(this.driver2);
  CSD.clickOnFarmingOrders();
}

@When("^user clicks on farmer accepted orders viewdetails$")
public void user_clicks_on_farmer_accepted_orders_viewdetails() throws Throwable {
	CSfarmerOrders csfo=new CSfarmerOrders(this.driver2);
    csfo.clickaccepted();
 
   
}

@When("^user clicks on farmer completed orders viewdetails$")
public void user_clicks_on_farmer_completed_orders_viewdetails() throws Throwable {
	CSfarmerOrders csfo=new CSfarmerOrders(this.driver2);
   csfo.clickcompleted();
  
   csfo.gettablerows("Gala");
  
}

@When("^user clicks on rejected orders viewdetails$")
public void user_clicks_on_rejected_orders_viewdetails() throws Throwable {
  System.out.println("rejected orders");
}

@When("^accept orders and wait for produce$")
public void accept_orders_and_wait_for_produce() throws Throwable {
  System.out.println("accept");
}
}
