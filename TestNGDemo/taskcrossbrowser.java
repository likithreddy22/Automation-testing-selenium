package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class taskcrossbrowser {
	WebDriver driver;
  @Test(groups= {"smoke"})
  public void loginchrome() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 // driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement user = driver.findElement(By.name("username"));
	  user.sendKeys("Admin");
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @Test(groups= {"sanity"})
  public void loginfirefox() {
	  driver = new FirefoxDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement user = driver.findElement(By.name("username"));
	  user.sendKeys("Admin");
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
  @Test(groups= {"sanity"})
  public void loginedge() {
	  driver = new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement user = driver.findElement(By.name("username"));
	  user.sendKeys("Admin");
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
  }
}
