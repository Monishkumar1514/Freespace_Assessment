package com.Freespace.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Freespace.pom.LoginPage;
import com.Freespace_Assessment.Baseclass;

public class Loginpage extends Baseclass {
	LoginPage loginpage = null;

	
	
	
	@Given("^User landed into the Application\\.$")
	public void user_landed_into_the_Application() throws Throwable {
		loginpage = new LoginPage(driver);
		test = Baseclass.extent.createTest("Test One").info("User landed into the Application");
	}

	@When("^User click the Login with Email button and it navigate to Login page$")
	public void user_click_the_Login_with_Email_button_and_it_navigate_to_Login_page() throws Throwable {
		driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[7]")).click();
		loginpage.clickLoginwithEmail();

	}
	
	@When("^User landed on the Login page and User Enter the \"([^\"]*)\" in the email field$")
	public void user_landed_on_the_Login_page_and_User_Enter_the_in_the_email_field(String arg1) throws Throwable {
loginpage.set_email_input(arg1);
test.info("User inputs the email field : "+arg1);
	
	}

	@When("^User Enter the \"([^\"]*)\" in th password Field$")
	public void user_Enter_the_in_th_password_Field(String arg1) throws Throwable {
loginpage.set_password_input(arg1);
	}

	@Then("^User click the Login Button and User is navigated to the HomePage$")
	public void user_click_the_Login_Button_and_User_is_navigated_to_the_HomePage() throws Throwable {
		Baseclass.robot();
		loginpage.clickLoginbtn();
		
	
	}

}
