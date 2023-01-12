package com.Freespace.stepDefinitions;

import com.Freespace.pom.HomePage;
import com.Freespace_Assessment.Baseclass;

import cucumber.api.java.en.When;

public class Homepage extends Baseclass {
HomePage homepage=new HomePage(driver);;
	
	
	
	@When("^User landed on the HomePage and user click the Home Button$")
	public void user_landed_on_the_HomePage_and_user_click_the_Home_Button() throws Throwable {
		 Baseclass.clickonWebelement(homepage.click_Home_Button());
		
	
	}


}
