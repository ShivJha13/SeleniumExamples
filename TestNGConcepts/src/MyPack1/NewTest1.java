package MyPack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() {
	  System.out.println("Hello");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Ascent");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Softwares");
  }

}


