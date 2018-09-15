package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//  understand here which annotations executed first and rest of the annotations are used here

public class OrderOfAnnotationExecutionInTestNg
{

	@Test
  public void f() 
  {
	  System.out.println("########### 1 ################@ test executed means, perform all actions here");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("########### 2 ####################@ before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("########### 3 ##################@after method executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("############### 4 #######################@before class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("################## 5 ##################@after class executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("##################### 6 #################@before test executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("####################### 7 ###############@after test executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("##################### 8 #####################@before suite executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("###################### 9 ##############################@after suite executed");
	  
  }}
