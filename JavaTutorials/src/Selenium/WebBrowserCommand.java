package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * set up Java // dwonload java 
 * set up eclipse / inetelej
 * download load webdrver client
 * downlaod and install chromedriver/ firefox-geckodriver/  safari, internet exploere
 * dwonloda selenium jar files adn driver in a folder 
 * add the downloaded selenium jar files to you project Path
 * right click on your project folder, click on build path, configure build path 
 * 
 * WHAT IS SEDLENIUM WEBDRIVER?
 * its an automation tool, its a java class that helps communicate with the web, navigate, browse thru AUT, 
 * 
 * Selenium  ===== "Class One"
 * OBJECTIVES  FRO TODAYS CLASS IS "BRWOSER  & NNAVIGATION Command" 
 * ======================================================
 * 
 * 
 */
public class WebBrowserCommand {

	// first >>  call your webdriver class and create an object of  webdriver 
	 //WebDriver browser; // created an object of webdriver/variable OR instantiated my webdriver
	// WebDriver driver = new ChromeDrive()r/FirfoxDriver()/ safariDriver()

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver browser = new ChromeDriver(); // do this first, call your webdriver
		//browser.get("https://www.indeed.co.uk/");// url of the application under test
		browser.navigate().to("https://www.indeed.co.uk/");
		
		browser.manage().window().maximize();
		
		
	 
	    
	    // USING NAVIGATION COMMAND
	    //browser.navigate().
		  browser.navigate().back();
	       browser.navigate().forward();
	       browser.navigate().refresh();
	       
	       
	    
	    
		//to get title of the page 
		String getPageTitle = browser.getTitle();
	    System.out.println("print the title of the page....." + " " + getPageTitle);
		
	     // get windonw handle of te current window 
	    String windowhandle = browser.getWindowHandle();
	    System.out.println("my window handle is" + " " + windowhandle);
	    
	  
	    // get the page source of your site
	   String pagesource = browser.getPageSource();
       System.out.println("print the page source" + " " + pagesource);
	   
	    // get the current url 
	   String myurl =  browser.getCurrentUrl();
	   System.out.println("display url" + " " + myurl);
	    
	   //
	   
	    // to close the browser what method ?
	    browser.close();
	    
		
	}

}
