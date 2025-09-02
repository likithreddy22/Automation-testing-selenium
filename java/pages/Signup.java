package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Signup {
	WebDriver driver;
	public Signup(WebDriver driver) {
		this.driver = driver;
	}
	
	By SignupName = By.xpath("//input[@data-qa='signup-name']");
	By SignupEmail = By.xpath("//input[@data-qa='signup-email']");
	By Signup = By.xpath("//button[@data-qa='signup-button']");
	
	By Gender = By.id("uniform-id_gender1");
	By Password = By.id("password");
	By Day = By.id("days");
	
	
	
  @Test
  public void sname(String name) {
	  WebElement Sname = driver.findElement(SignupName);
	  Sname.sendKeys(name);
  }
  public void semail(String email) {
	  WebElement Semail = driver.findElement(SignupEmail);
	  Semail.sendKeys(email);
  }
  public void signup() {
	  WebElement signup = driver.findElement(Signup);
	  signup.click();
  }
 
  public void selectday(String ) {
	  WebElement Sday = driver.findElement(Day);
	  Select day =new Select("Sday");
  }
  public void password(String pass) {
	  WebElement Spass = driver.findElement(Password);
	  Spass.sendKeys(pass);
  }
  public void selectgender(String gender) {
	  WebElement Sgender = driver.findElement(Gender);
	  Sgender.sendKeys(gender);
  }
  public void selectgender(String gender) {
	  WebElement Sgender = driver.findElement(Gender);
	  Sgender.sendKeys(gender);
  }
  public void selectgender(String gender) {
	  WebElement Sgender = driver.findElement(Gender);
	  Sgender.sendKeys(gender);
  }
  public void selectgender(String gender) {
	  WebElement Sgender = driver.findElement(Gender);
	  Sgender.sendKeys(gender);
  }
  
  
  
}  
