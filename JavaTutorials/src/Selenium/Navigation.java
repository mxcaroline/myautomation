package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	// step 1 -  call webdriver and create a vairable of webdriver 
	public static WebDriver driver;
			
	public static void main(String[] args) {
		// step 2 - instantiate your browser - google chrome
		driver = new ChromeDriver();
		
		//step 3 - load application
		//driver.get("https://www.houseoffraser.co.uk/");
		driver.navigate().to("https://www.houseoffraser.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		driver.close();
		
	}
	
	
}// main class
