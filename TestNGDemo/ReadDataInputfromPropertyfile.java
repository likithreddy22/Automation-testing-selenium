package TestNGDemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataInputfromPropertyfile {
  @Test
  public void f() throws Exception {
	  FileReader fr = new FileReader("C:\\Users\\likithreddy.konda\\eclipse-workspace\\Selenium\\TestNGJava\\src\\TestNGDemo\\datainput.properties");
	  Properties p = new Properties();
	  p.load(fr);
	  WebDriver driver = new ChromeDriver();
	  driver.get(p.getProperty("url2"));
//	  driver.switchTo().newWindow(WindowType.TAB);
//	  driver.get(p.getProperty("url2"));
//	  driver.findElement(By.id("APjFqb")).sendKeys(p.getProperty("data"));
//	  driver.findElement(By.name("btnK")).submit();
	  System.out.println(driver.findElement(By.xpath("//label[@for='username']")).getTagName());
	  
  }
}
