package MyPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleBrowser {
	
  @Test
  public void f() 
  {
	  // for selenium it is a default fire fox
	  
	  WebDriver driver=new FirefoxDriver();   
	  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier"); 
	  Reporter.log("The 1st report",true); 
	  Reporter.log("Hi this is shiv");
	  
	  // get is used to get url for particular application

	  
	  // for chrome browser :: download first chromedriver and give the path of web driver
	  // and we need to give double slash instead of single slash.
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul deo\\Desktop\\chromedriver.exe");
		WebDriver driver8=new ChromeDriver();
		driver8.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	  
	  
		// this below code is not working
	  
		
/*
		// for internet explorer :: download first webdriver and give path of web driver 
	  // and we need to give double slash instead of single slash
	  
	  System.setProperty("webdriver.ie.driver","C:\\Users\\Rahul deo\\Desktop\\IEDriverServer.exe");
	  WebDriver driver1=new InternetExplorerDriver();
	  driver1.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
			   
	  
*/
	  
  }
    }
