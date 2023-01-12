package com.Freespace.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Freespace_Assessment.Baseclass;

public class HomePage extends Baseclass {
	private static WebDriver driver;

	public HomePage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement home_btn;

	public WebElement click_Home_Button() {
		return home_btn;
	}

	public void homebtn() {
		waitforElementVisiblity(home_btn);
		home_btn.click();
	}
	
	
	
	
	
	
	
	
}
