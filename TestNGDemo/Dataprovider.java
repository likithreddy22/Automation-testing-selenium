package TestNGDemo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	
  @Test(dataProvider = "dp")
  public void login(String username, String password) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement user = driver.findElement(By.name("username"));
	  user.sendKeys(username);
	  WebElement pass = driver.findElement(By.name("password"));
	  pass.sendKeys(password);
	  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
//	  driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "admin", "34567" },
      new Object[] { "admin12", "3456789" },
    };
  }
}
