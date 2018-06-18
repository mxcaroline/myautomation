package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
	public static WebDriver runner;
	
	public static void main(String[] args) {
		runner = new ChromeDriver();
		runner.navigate().to("https://money.rediff.com/gainers/bse/daily/groupa");
		runner.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		// task 1 is to find a specific data in row 5 and current price column data 145.95 
		
		// step 1 locate table name and put it in a webelement variable
		// write 
		// find the table by tagname and put it in a webelemnt variable
		
		// //*[@id="leftcontainer"]/table/tbody/tr[5]/td[4] no that is your coll
		
		 WebElement iData = runner.findElement(By.tagName("table"));
		
		
		 // find data in row 5
		 WebElement row5 = runner.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]"));
		
		 // find data in column 4, Current price column
		 WebElement currencyColumn = runner.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"));
		
		// use a get text method to find the text for the columnu
		 String currentprice = currencyColumn.getText();
		// assert needs two values actual an.d expected
		 
		 //String Expected = "145.95";
	     //String Actual = currentprice ;
	     
		 System.out.println("show the current price" + " " + currentprice);
		
		// use a get text method to find the text for the row
		String data = row5.getText();
		System.out.println("show the data in row 5" +  " " + data);
		
		
		
		
		runner.manage().deleteAllCookies();
		runner.close();
	}
	
	
	
	
	
}


