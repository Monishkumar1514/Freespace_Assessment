package com.Freespace.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Freespace_Assessment.Baseclass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart_Page extends Baseclass{

	

@When("^User add the product to cart\\.$")
public void user_add_the_product_to_cart() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//div[text()='Add to Cart']")).click();
}

@When("^user need to check the product details in the viewcart and click on checkout$")
public void user_need_to_check_the_product_details_in_the_viewcart_and_click_on_checkout() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;	
	driver.findElement(By.xpath("//a[@data-test-id='minicart-cart-link']")).click();
}

@When("^User need to check the product details in the shopping cart page\\.$")
public void user_need_to_check_the_product_details_in_the_shopping_cart_page() throws Throwable {
	//driver.findElement(By.xpath("//a[text()='Checkout']")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	Baseclass.robot();
}

@When("^User need to checkout the selected product$")
public void user_need_to_checkout_the_selected_product() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//a[text()='Checkout']")).click();
}

@When("^user need to enter the shipping details such as address, billing address etc\\.$")
public void user_need_to_enter_the_shipping_details_such_as_address_billing_address_etc() throws Throwable {
	//driver.findElement(By.xpath("//div[text()='Continue to payment method']")).click();
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	Thread.sleep(10000);
	WebElement paymentMethod = driver.findElement(By.xpath("//button[@data-test-id='continue-to-payment']"));
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.visibilityOf(paymentMethod));
	paymentMethod.click();
	
}
@When("^user need to check the payment methods and click on mode of payment as credit card$")
public void user_need_to_check_the_payment_methods_and_click_on_mode_of_payment_as_credit_card() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//input[@id='scheme-radio-input']")).click();
}

@When("^user need to enter the \"([^\"]*)\" and \"([^\"]*)\" details in the respective field\\.$")
public void user_need_to_enter_the_and_details_in_the_respective_field(String arg1, String arg2) throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);			
}

@When("^user need to enter the \"([^\"]*)\" in the credit card name  field$")
public void user_need_to_enter_the_in_the_credit_card_name_field(String arg1) throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("document.getElementById('holder-name').value = 'JCB';");
	driver.findElement(By.id("holder-name")).sendKeys("Visa");
}

@When("^user need to enter the \"([^\"]*)\" in the credit card number field$")
public void user_need_to_enter_the_in_the_credit_card_number_field(String arg1) throws Throwable {
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe for secured card number']")));
	
	WebElement cardno = driver.findElement(By.id("encryptedCardNumber"));
	
	cardno.sendKeys("4263982640269299");
	driver.switchTo().defaultContent();
}

@When("^user need to enter the \"([^\"]*)\" in the credit card Date and  Month field$")
public void user_need_to_enter_the_in_the_credit_card_Date_and_Month_field(String arg1) throws Throwable {
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe for secured card expiry date']")));
	driver.findElement(By.xpath("//input[@id='encryptedExpiryDate']")).sendKeys("02/23");
	driver.switchTo().defaultContent();
}

@When("^user need to enter the \"([^\"]*)\"in the credit card cvv field$")
public void user_need_to_enter_the_in_the_credit_card_cvv_field(String arg1) throws Throwable {
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe for secured card security code']")));
	driver.findElement(By.xpath("//input[@id='encryptedSecurityCode']")).sendKeys("837");
	driver.switchTo().defaultContent();
}

@When("^user click the place order button in the payment page$")
public void user_click_the_place_order_button_in_the_payment_page() throws Throwable {
	driver.findElement(By.xpath("//div[text()='Place order']")).click();
	
	
}




}
