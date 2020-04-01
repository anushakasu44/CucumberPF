package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.LoginPage;
import com.cucumberFramework_CSpages.Logout;
import com.cucumberFramework_CSpages.UserImageicons;

import Utilities.MySharedClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonPageStepDefination  {
	WebDriver  driver;


	
	 @Given("^user launch the browser$")
		public void user_launch_the_browser() throws Throwable {

	}
	 @Given("^user enters <\"(.*?)\"> and <\"(.*?)\"> and clicks on login button$")
		public void user_enters_and_and_clicks_on_login_button(String username, String password) throws Throwable {
		LoginPage lp1=  new LoginPage(driver);
	    lp1.enterusername(username);
	    lp1.enterPassword(password);
	    lp1.clickonsubmit();
		}
		
	 
	   @When("^user logout from the site$")
	   public void user_logout_from_the_site() throws Throwable {
		  UserImageicons uimgic=new UserImageicons(driver);
		   Logout logt=new Logout(driver);
			uimgic.clickOnuserimg();
			logt.clickonlogout();
			
	}
}
