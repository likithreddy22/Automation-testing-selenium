package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TaskParametrize {
	WebDriver driver = new ChromeDriver();
  @Test
  @Parameters({"nam","mail","mobile","sub"})
  public void form(String nam,String mail,String mobile,String sub) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement name = driver.findElement(By.id("name"));
	  name.sendKeys(nam);
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys(mail);
	  WebElement  phone = driver.findElement(By.id("mobile"));
	  phone.sendKeys(mobile);
	  WebElement subj = driver.findElement(By.id("subjects"));
	  subj.sendKeys(sub);
//	  WebElement address = driver.findElement(By.id("picture"));
//	  address.sendKeys(add);
  }
  @BeforeTest
  public void browsersetup() {
	  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void teardown() {
	  //driver.close();
  }

}
