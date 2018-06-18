package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {
	
	public static WebDriver runner;
	
	public static void main(String[] args) {
		
		runner = new ChromeDriver();
		runner.navigate().to("https://www.indeed.co.uk/");
		runner.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//runner.findElement(By.id("text-input-what")).sendKeys("Project Manager");
		//runner.findElement(By.id("text-input-where")).sendKeys("London");
		//runner.findElement(By.xpath("//*[@id=\"whatWhere\"]/form/div[3]/button")).click();
		//System.out.println("List of PM job available in London");
		
		// webelement help create variables for my locators - Textbox, button...
		 //Webelements helps you to identify the web locators with the help of a more discriptive name 
		 
		WebElement whatInput = runner.findElement(By.xpath("//input[@id=\"text-input-where\"]"));
		whatInput.clear();
		whatInput.sendKeys("London");
		// list is used to store multiple webelemnts to be used 
		List<WebElement> link = runner.findElements(By.tagName("a"));
		List<WebElement> iButton = runner.findElements(By.tagName("button"));
		List<WebElement> images = runner.findElements(By.tagName("image"));
		List<WebElement> iForm = runner.findElements(By.tagName("form"));
		// to get the list of Tagnames on the page use 'list'
		
		// here counting the tags on the web page and put it in a vairable of int
		int getLink = link.size();
		System.out.println("the is showing the number of links on indeed " + "" + getLink);
	     
		int getiButton = iButton.size();
	    System.out.println("this is showing the number of buttons on the indeed website" + " " + getiButton);
		
	    int getimage = images.size();
	    System.out.println("this is showing the number of images on the indeed page" + " " + getimage);
		
	    int getiForms = iForm.size();
	    System.out.println("this is showing the number of forms on the indeed page" + " " + getiForms);
		
	    // how confirm a logo is present on  a website 
	    WebElement myLogo = runner.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/span"));
	    boolean logo = myLogo.isDisplayed();
	    System.out.println("validate the logo is displayed"  + " " + logo);
	    
	    runner.manage().deleteAllCookies();
		runner.close();
	
		
	}
	
}
