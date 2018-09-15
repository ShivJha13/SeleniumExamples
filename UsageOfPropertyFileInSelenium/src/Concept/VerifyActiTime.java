package Concept;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;


// this program is all about how my program read my properties file 


public class VerifyActiTime 
{
    
	@Test
	public void testConfig() throws Exception  // here i am throwing the Exception and this is Base Exception
	{
	
File src= new File("D:\\SeleniumExamples\\UsageOfPropertyFileInSelenium\\src\\Configuration\\Config.property");   
	
FileInputStream fis =new FileInputStream(src);

Properties pro= new Properties();   // Properties is a class and its available under util package 

   pro.load(fis);                  // It loads my property file 
   
   
  //I want to get path from property file then use below methods 
   
 String Chromepath=pro.getProperty("ChromeDriver"); //this ChromeDriver name should be same as the name available in property file 
    System.out.println("This is my chrome path"+" "+Chromepath);
    
    
   		
	}
	
	
}
