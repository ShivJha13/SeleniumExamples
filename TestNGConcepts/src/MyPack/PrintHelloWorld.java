package MyPack;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class PrintHelloWorld 
 {
	
  @Test
  public void f() 
  {
	System.out.println("hi shiv");  
	
	// While sending report to some one if you want to put any message use 
	Reporter.log("this is my first report");
	
  }
  
}




