package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.DCdcstock;
import com.cucumberFramework_CSpages.DistributionCenter;
import com.cucumberFramework_CSpages.LoginPage;
import com.cucumberFramework_CSpages.Logout;
import com.cucumberFramework_CSpages.UserImageicons;

import Utilities.ReadPropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Distributioncenter {

	
	WebDriver driver;

      
	
	
	@When("^user clicks on PCorders viewdetails$")
		public void user_clicks_on_PCorders_viewdetails() throws Throwable {
			System.out.println("click");
		   
		}

		@When("^user  clicks on Buyerorders viewdetails$")
		public void user_clicks_on_Buyerorders_viewdetails() throws Throwable {
			
			System.out.println("click");
		}

		@When("^user  clicks on DStock viewdetails$")
		public void user_clicks_on_DStock_viewdetails() throws Throwable {
			DistributionCenter dcs=new DistributionCenter(this.driver);
			dcs.clickOnDStock();
			 DCdcstock dcp=new DCdcstock(driver);
			 dcp.selectvarietes("Empire");
			   
			
		}
	

	}

