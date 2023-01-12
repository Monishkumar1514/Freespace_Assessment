package com.Freespace.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Freespace_Assessment.Baseclass;


public class LoginPage extends Baseclass {
	private static WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//div[contains(text(),'Email')]")
	private WebElement login_with_Email;

	public WebElement login_with_Email() {
		return login_with_Email;
	}

	public void clickLoginwithEmail() {
		waitforElementVisiblity(login_with_Email);
		login_with_Email.click();
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_input;

	public WebElement email_input() {
		return email_input;
	}
	public void set_email_input(String value) {
		waitforElementVisiblity(email_input);
		email_input.sendKeys(value);
	}
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_input;

	public WebElement password_input() {
		return password_input;
	}
	public void set_password_input(String value) {
		waitforElementVisiblity(password_input);
		password_input.sendKeys(value);
	}

	
	@FindBy(xpath = "//button[@id='login-submit']")
	private WebElement login_btn;

	public WebElement login_btn() {
		return login_btn;
	}

	public void clickLoginbtn() {
		waitforElementVisiblity(login_btn);
		login_btn.click();
	}
}
