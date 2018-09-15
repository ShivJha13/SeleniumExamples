package MyPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActiTime 
{
  
	@Test
  public void f() 
  {
	   WebDriver driver=new FirefoxDriver();
      driver.get("http://localhost/login.do");
     
      driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   
	  driver.findElement(By.id("keepLoggedInCheckBox")).click();
	   driver.findElement(By.id("loginButton")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)  ;
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  // driver.findElement(By.linkText("Logout")).click();
	   driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
	  
	  }
}
