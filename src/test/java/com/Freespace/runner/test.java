package com.Freespace.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class test {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.get("https://in.puma.com/in/en/account/login?from=account");
		
		driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-hidden='true'])[7]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("monishkumar0012@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12021998Febu*");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		//Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@class='tw-74syqm tw-1ttqgb1']//li)[1]")).click();
//		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		//driver.findElement(By.cssSelector("a[class='group flex items-center font-bold border-1 border-white rounded-sm px-2 focus:border-neutral-100 focus:ring hover:text-neutral-80']")).click();
	
		//driver.findElement(By.xpath("//a[text()='Home']")).click();
		//Thread.sleep(5000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		WebElement element =driver.findElement(By.xpath("//a[text()='ALL RUNNING SHOES']"));
		//Actions a = new Actions(driver);
		//a.moveToElement(element).click();
		element.click();
		 
		
		driver.findElement(By.xpath("//input[@type='search']"))
.sendKeys("Velocity Nitro 2 Men's Running Shoes");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//h3[text()=\"Velocity Nitro 2 Men's Running Shoes\"]")).click();
		//Thread.sleep(4000);
		//js.executeScript("window.scrollBy(0,1200)");
		//driver.findElement(By.xpath("(//input[@name='swatch'])[3]")).click();

		
		driver.findElement(By.xpath("//label[@data-color='09']")).click();
		driver.findElement(By.xpath("//span[@class='text-sm'][text()='11']")).click();
		
		driver.findElement(By.xpath("//div[text()='Add to Cart']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='View cart (1) & checkout']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
	}
}
