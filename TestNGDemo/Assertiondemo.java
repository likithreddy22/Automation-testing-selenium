package TestNGDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertiondemo {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  SoftAssert sa = new SoftAssert();
	  String extitle = driver.getTitle();
	  String acttitle = "oogle";
	  sa.assertEquals(extitle, acttitle);
	  System.out.println("Test complete");
	  sa.assertAll(); 
  }
}
