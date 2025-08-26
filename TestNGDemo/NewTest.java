package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("I am in Test Case");
  }
  @Test
  public void test() {
	  System.out.println("I am in Test Case1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("I am in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in After Suite");
  }

}
