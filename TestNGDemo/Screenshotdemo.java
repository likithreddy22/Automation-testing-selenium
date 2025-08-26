package TestNGDemo;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotdemo {
  @Test
  public void login() throws IOException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoblaze.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("signin2")).click();
	  WebElement user =driver.findElement(By.id("sign-username"));
	  user.sendKeys("admin");
	  WebElement pass = driver.findElement(By.id("sign-password"));
	  pass.sendKeys("admin123");
	  WebElement signup = driver.findElement(By.xpath("//button[@onclick='register()']"));
	  signup.click();
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(f, new File("C:\\screenshots\\p.jpeg"));
	  
	 
  }
}
