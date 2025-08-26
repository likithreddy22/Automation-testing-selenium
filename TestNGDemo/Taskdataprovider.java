package TestNGDemo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Taskdataprovider {
  @Test(dataProvider = "dp")
  public void logintesttrack(String n, String s) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://testtrack.org/login-demo");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement user = driver.findElement(By.id("username"));
	  user.sendKeys(n);
	  WebElement pass = driver.findElement(By.id("password"));
	  pass.sendKeys(s);
	  WebElement tick = driver.findElement(By.id("remember-me"));
	  tick.click();
	  WebElement login = driver.findElement(By.id("login-submit"));
	  login.click();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser", "password123" },
      new Object[] { "testuser1", "password12" },
      new Object[] { "testuser12", "password1" },
    };
  }
}
