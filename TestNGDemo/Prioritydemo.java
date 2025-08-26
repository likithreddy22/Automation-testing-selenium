package TestNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Prioritydemo {
  @Test(priority = 'a')
  public void b() {
	  System.out.println("I am test first");
  }
  @Test(priority = 3)
  public void a() {
	  System.out.println("I am test third");
  }
  @Test(priority = 0)
  public void d() {
	  System.out.println("I am test second");
  }
  @Test()
  public void c() {
	  throw new SkipException("No need to Execute");
	  //System.out.println("I am test fifth");
  }
  @Test(priority = 1)
  public void e() {
	  System.out.println("I am test fourth");
  }
}
