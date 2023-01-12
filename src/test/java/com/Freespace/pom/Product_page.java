package com.Freespace.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Freespace_Assessment.Baseclass;

public class Product_page extends Baseclass{
	private static WebDriver driver;

	public Product_page(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//a[text()='ALL RUNNING SHOES']")
	private WebElement click_AllRunning_shoes;

	public WebElement click_AllRunning_shoes() {
		return click_AllRunning_shoes;
	}

	public void homeclick_AllRunning_shoestn() {
		waitforElementVisiblity(click_AllRunning_shoes);
		click_AllRunning_shoes.click();
}
	
	
	@FindBy(xpath = "")
	private WebElement search_input;
	public WebElement search_input() {
		return search_input;
	}
	
	public void set_search_input(String value) {
		waitforElementVisiblity(search_input);
		search_input.sendKeys(value);
	}
	
	
	
}
