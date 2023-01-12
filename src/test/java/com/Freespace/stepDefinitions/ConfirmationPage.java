package com.Freespace.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.Freespace_Assessment.Baseclass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfirmationPage extends Baseclass {

	
	


@When("^user need to click on place order and validate the order rejected popup$")
public void user_need_to_click_on_place_order_and_validate_the_order_rejected_popup() throws Throwable {
	String errorMessage = "Sorry, something went wrong with your payment. Please try a different payment method or contact your payments provider. If issue continues you can contact customer service.";
	 String getMessage = driver.findElement(By.xpath("//span[@data-test-id='payment-form-error']")).getText();
	System.out.println(errorMessage);
	
	if(errorMessage.equals(getMessage)) {
		System.out.println("Alert message verification");
	}
	
}

@When("^user need to navigate to the cart again and check whether the product is available in the cart\\.$")
public void user_need_to_navigate_to_the_cart_again_and_check_whether_the_product_is_available_in_the_cart() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,0);");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@data-test-id='checkout-breadcrumb-0']")).click();
}

@When("^user need to remove the product from the cart and verify that the cart is empty\\.$")
public void user_need_to_remove_the_product_from_the_cart_and_verify_that_the_cart_is_empty() throws Throwable {
	driver.findElement(By.xpath("(//*[name()='svg' and @class='text-2xl w-[1em] h-[1em] fill-current'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='confirm-button']")).click();
}

@Then("^user logout from the application\\.$")
public void user_logout_from_the_application() throws Throwable {
	driver.findElement(By.xpath("(//*[name()='svg' and @class='text-3xl w-[1em] h-[1em] fill-current'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("logout")).click();
}



}
