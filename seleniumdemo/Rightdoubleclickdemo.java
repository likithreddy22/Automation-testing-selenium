package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rightdoubleclickdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver click = new ChromeDriver();
		click.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement user = click.findElement(By.id("email"));
//		Actions act = new Actions(click);
//		Thread.sleep(2000);
//		act.moveToElement(user).click().build().perform();
//		Thread.sleep(2000);
//		act.contextClick(user).build().perform();
//		Thread.sleep(2000);
//		user.sendKeys("Virat_Kohli");
//		Thread.sleep(2000);
//		act.doubleClick(user).build().perform();
		
		//click.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait w = new WebDriverWait(click, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(user));
		user.sendKeys("locvate");

	}

}
