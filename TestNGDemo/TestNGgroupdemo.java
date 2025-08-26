package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGgroupdemo {
  @Test(groups= {"smoke"})
  public void f1() {
	  System.out.println("I am first test case");
  }
  @Test(groups= {"sanity"})
  public void f2() {
	  System.out.println("I am second test case");
  }
  @Test(groups= {"smoke"})
  public void f3() {
	  System.out.println("I am third test case");
  }
  @Test(groups= {"sanity"})
  public void f4() {
	  System.out.println("I am fourth test case");
  }
  @Test(groups= {"smoke"})
  public void f5() {
	  System.out.println("I am fifth test case");
  }
  @Test(groups= {"sanity"})
  public void f6() {
	  System.out.println("I am sixth test case");
  }
  @Test(groups= {"smoke"})
  public void f7() {
	  System.out.println("I am seventh test case");
  }
}
