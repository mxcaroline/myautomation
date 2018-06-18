package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectandDropdown {

 public static WebDriver runner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runner = new ChromeDriver();
		runner.navigate().to("https://www.expedia.co.uk/");
		runner.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement DirectFlight = runner.findElement(By.xpath("//input[@type='checkbox']"));
        boolean idirect = DirectFlight.isSelected();
		System.out.println("see if the check box is selected" + " " + idirect);
		
		//drop down on multiple select 
		
		// call the Select method and set your webelement variable inside the select method
	
		//PreferredClass.selectByIndex(0);
		//PreferredClass.selectByIndex(1);
	   //PreferredClass.selectByValue("First class");
		//PreferredClass.selectByVisibleText("Business");
		
		
		// to select number of rooms to be booked
		WebElement iRoom = runner.findElement(By.id("package-rooms-hp-package"));
		Select Rooms = new Select(iRoom);
		Rooms.selectByVisibleText("2");	
		System.out.println("this is the value of the second room" + " " + Rooms);
		
		//to select number of adults for the booking 
		WebElement iAdult = runner.findElement(By.id("package-1-adults-hp-package"));
		Select Adults = new Select (iAdult);
		Adults.selectByIndex(3);
		System.out.println("this should show the third index value" + " " + Adults);
		
		//to select number of children for the booking
		WebElement iChildren = runner.findElement(By.id("package-1-children-hp-package"));
		Select Children = new Select (iChildren);
		Children.selectByValue("2");
		System.out.println("this is the value of the number of children" + " " + Children);
		
		
		//to select the travel class for the booking
		WebElement Class = runner.findElement(By.id("package-advanced-preferred-class-hp-package"));
		Select PreferredClass = new Select(Class);
		PreferredClass.selectByIndex(0);
		System.out.println("show class to be travelled in" + "" + PreferredClass);
		
		runner.manage().deleteAllCookies();
		runner.close();
		
		//Home work, write scripts for Room, Adult, Children and select travel class***
	}

}
