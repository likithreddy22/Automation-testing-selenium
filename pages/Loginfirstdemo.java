package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Loginfirstdemo {
	 WebDriver driver = null;
	 By user = By.name("username");
	 By pass = By.name("password");
	 By login = By.xpath("//button[@type='submit']");
	 @Test
	public void enterUSER(String input) {
		driver.findElement(user).sendKeys(input);
	}
	public void enterPWD(String input) {
		driver.findElement(pass).sendKeys(input);
	}
	public void clicklogin() {
		driver.findElement(login).click();
	}
	public Loginfirstdemo(WebDriver driver) {
		this.driver=driver;
	}
	
	 

}
