package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Crossbrowsertestingdemo {
	WebDriver driver;
  @Test
  @Parameters({"browser","username","password"})
  public void login(String browser,String username,String password) throws Exception {
	  if(browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  WebElement user = driver.findElement(By.name("username"));
		  user.sendKeys(username);
		  WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys(password);
		  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  driver = new FirefoxDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  WebElement user = driver.findElement(By.name("username"));
		  user.sendKeys(username);
		  WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys(password);
		  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
		  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  WebElement user = driver.findElement(By.name("username"));
		  user.sendKeys(username);
		  WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys(password);
		  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		  login.click();
	  }
	  else {
		  throw new Exception("Invalid Browser");
	  }
	 
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
