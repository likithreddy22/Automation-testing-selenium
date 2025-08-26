package TestNGDemo;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parametrizedemo {
	WebDriver driver = new ChromeDriver();
  @Test
  @Parameters({"user1","pass1"})
  public void loginparametrize(String user1,String pass1) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement username = driver.findElement(By.name("user-name"));
	  username.sendKeys(user1);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys(pass1);
	  WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	  login.click();
  }
  @BeforeTest
  public void browsersetup() {
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void teardown() {
	  driver.close();
  }

}
