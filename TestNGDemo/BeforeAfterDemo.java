package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BeforeAfterDemo {
	 WebDriver driver = new ChromeDriver();
  @Test
  public void login() {
	  System.out.println(driver.getTitle());
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement username = driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @BeforeTest
  public void browsersetup() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void teardown() {
	  driver.close();
  }

}
