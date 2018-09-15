package Concept1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// In this program i will use my properties file to open my application in Chrome browser

public class TestScriptInChrome
{
	
	Reader r1;
	
	@BeforeTest
	public void setup()
	{
    	r1=new Reader();
    	System.setProperty("webdriver.chrome.driver",r1.getChromepath());
    	System.out.println("set up part executed");
    }
	
	@Test
	public void testChrome()
	{
		System.out.println("Test Execution Started");    
		WebDriver driver= new ChromeDriver();
		driver.get(r1.getAppURL());
		System.out.println("Test Execution completed");
	}
      }

/*              If we see our code it looks like "Abstraction concept" means showing 
          the essential features and  hiding the internal details so, here i am not showing 
                 chrome path, application url */   

