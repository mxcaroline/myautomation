package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static WebDriver runner;
	
	public static void main(String[] args) {
		runner = new ChromeDriver();
		runner.navigate().to("https://money.rediff.com/gainers/bse/daily/groupa");
		runner.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
	
		////*[@id="leftcontainer"]/table/thead/tr/th[1]
		 // Numbers of rows and column in the dynamic table
		
		 // fetching  colums in the table
		 List<WebElement> col = runner.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		 System.out.println(" number of col " + col.size());
		 
		 
		 // fecthing rows in the table 
		 List<WebElement> rows = runner.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
		 System.out.println("number of rows " + " " + rows.size());
		 
		 
		 
		runner.manage().deleteAllCookies();
		runner.close();
	}

}
