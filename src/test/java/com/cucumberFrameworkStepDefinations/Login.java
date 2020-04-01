package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.LoginPage;
import com.cucumberFramework_CSpages.Logout;
import com.cucumberFramework_CSpages.UserImageicons;

import Utilities.ReadPropertiesFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	LoginPage page;


	
	@Given("^user launche the browser$")
	public void user_launche_the_browser() throws Throwable {

}
@When("^user enters \"(.*?)\" and \"(.*?)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	 page=new LoginPage(driver);
	page.enterusername(username);
	page.enterPassword(password);	
}

@When("^user clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
   page.clickonsubmit();
  
}

@Then("^user can able to login sucessfully$")
public void user_can_able_to_login_sucessfully() throws Throwable {
    System.out.println("logged in sucessfully");
}

@Then("^\"(.*?)\" can able to login sucessfully$")
public void can_able_to_login_sucessfully(String user) throws Throwable {
	//assertTrue(driver.getCurrentUrl().contains(user));
}
	

}
