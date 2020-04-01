package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework_CSpages.CSaccountLogin;
import com.cucumberFramework_CSpages.CSaccountRegistration;
import com.cucumberFramework_CSpages.LoginPage;
import com.cucumberFramework_CSpages.SelectYourRole;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CSRegisterWebapp {
	WebDriver driver;
	


@Given("^user clicks 'Create new Account'$")
public void user_clicks_Create_new_Account() throws Throwable {
	LoginPage lp=new LoginPage(this.driver);
   lp.CreatenewAccount();
  }

@When("^user selects Cold storage and clik next$")
public void user_selects_Cold_storage_and_clik_next() throws Throwable {
	SelectYourRole syr=new SelectYourRole(driver);
	   syr.coldStorage();
	   syr.clickOnNext();
}

@When("^user adds all his details and click next$")
public void user_adds_all_his_details_and_click_next() throws Throwable {
    CSaccountRegistration caar=new CSaccountRegistration(driver);
    caar.adminfirstname("Anudeep");
    caar.adminLastname("kota");
    caar.telephone("4389265489");
    caar.email("anudeepkota@gmail.com");
    caar.clickOnNext();
}

@When("^user inputs user name and password and clik submit$")
public void user_inputs_user_name_and_password_and_clik_submit() throws Throwable {
    CSaccountLogin csal=new CSaccountLogin(driver);
    csal.enterUsername("AnudeepKota");
    csal.enterPassword("AnudeepKota");
    csal.enterRepassword("AnudeepKota");
    csal.clickOnSubmit();
}

@When("^OTP will be send to user phone number$")
public void otp_will_be_send_to_user_phone_number() throws Throwable {
    System.out.println("otp");
}

@When("^dFarm will either approve or hold his aacount$")
public void dfarm_will_either_approve_or_hold_his_aacount() throws Throwable {
    System.out.println("approve or hold");
}
}
