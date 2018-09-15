package Concept1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reader 
{

	   Properties pro;
	
// Main purpose of constructor is to initialize the values
// below is constructor , it simply load the file 
// Instead of using below code always, i created constructor and used my code inside that 	
	
	public Reader()
	{
		
		try
		{
File src= new File("D:\\SeleniumExamples\\UsageOfPropertyFileInSelenium\\src\\Configuration\\Config.property");   
		
FileInputStream fis =new FileInputStream(src);

pro= new Properties();    

pro.load(fis);                  
 
String Chromepath=pro.getProperty("ChromeDriver"); 
    System.out.println("This is my chrome path"+" "+Chromepath);
		    	
		}
	    	catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	  public String getChromepath()
	  {
		  String path=pro.getProperty("ChromeDriver");// this ChromeDriver name should be same as in Properties file
		  return path;
	  }
	
	  public String getAppURL()
	  {
		 return pro.getProperty("URL");// this ChromeDriver name should be same as in Properties file
	  }
	  
	 		}
