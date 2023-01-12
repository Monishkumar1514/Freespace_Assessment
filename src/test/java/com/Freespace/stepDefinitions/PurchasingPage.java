package com.Freespace.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Freespace.pom.Product_page;
import com.Freespace_Assessment.Baseclass;

import cucumber.api.java.en.When;

public class PurchasingPage extends Baseclass{
	//public static WebDriver driver;
	//Product_page productpage = null;
	Product_page productpage = new Product_page(driver);
	
	
	@When("^User Click the All Running Shoe button and its navigated to the All running shoe page$")
	public void user_Click_the_All_Running_Shoe_button_and_its_navigated_to_the_All_running_shoe_page() throws Throwable {
		Product_page productpage = new Product_page(driver);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
//		js.executeScript("arguments[0].scrollIntoView(true);", productpage.click_AllRunning_shoes());
//		
	Baseclass.clickonWebelement(productpage.click_AllRunning_shoes());
	

	
	}
	@When("^User \"([^\"]*)\" the Velocity Nitro  Men Running shoe$")
	public void user_the_Velocity_Nitro_Men_Running_shoe(String arg1) throws Throwable {
//productpage.set_search_input(arg1);
		
		driver.findElement(By.xpath("//input[@type='search']"))
		.sendKeys("Velocity Nitro 2 Men's Running Shoes");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


//	@When("^User search the Velocity Nitro (\\d+) Men's Running Shoes$")
//	public void user_search_the_Velocity_Nitro_Men_s_Running_Shoes(String arg1) throws Throwable {
//
//		
//		
//		//Baseclass.clickonWebelement(productpage.selecvelocityshoe());
//	}
	@When("^USer click the selected shoe and customise the shoe colour to blue colour in the colour selection field$")
	public void user_click_the_selected_shoe_and_customise_the_shoe_colour_to_blue_colour_in_the_colour_selection_field() throws Throwable {
		driver.findElement(By.xpath("//h3[text()=\"Velocity Nitro 2 Men's Running Shoes\"]")).click();
	}

	@When("^User Select the shoe color as blue in the color selection field$")
	public void user_Select_the_shoe_color_as_blue_in_the_color_selection_field() throws Throwable {
	
		driver.findElement(By.xpath("//label[@data-color='09']")).click();
	}

	@When("^User Select Shoe Size as (\\d+) in the size selection options$")
	public void user_Select_Shoe_Size_as_in_the_size_selection_options(int arg1) throws Throwable {
		driver.findElement(By.xpath("//span[@class='text-sm'][text()='11']")).click();
	
	}
	
	
}
