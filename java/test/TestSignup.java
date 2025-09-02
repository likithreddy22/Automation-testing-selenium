package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import pages.Signup;

public class TestSignup {
  @Test
  public void runsignup() throws Exception {
	  FileReader fr = new FileReader("C:\\Users\\likith reddy\\eclipse-workspace\\cucumber\\FinslTaskMaven\\Finaltask\\src\\test\\resources\\config.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  WebDriver driver = new EdgeDriver();
	  driver.get(p.getProperty("url"));
	  Signup su = new Signup(driver);
	  
	  su.sname(p.getProperty("Sname"));
	  su.semail(p.getProperty("Semail"));
	  su.signup();
	  
	  
	  
  }
}
