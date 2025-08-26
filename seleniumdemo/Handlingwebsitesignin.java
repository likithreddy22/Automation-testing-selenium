package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwebsitesignin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver b = new ChromeDriver();
		b.get("https://accounts.saucelabs.com/am/XUI/#login/");
		Thread.sleep(3000);
		b.findElement(By.id("idToken1")).sendKeys("fillitplease");
		b.findElement(By.name("callback_1")).sendKeys("passtheword12");
		b.findElement(By.className("checkmark")).click();
		Thread.sleep(2000);
		b.findElement(By.partialLinkText("I forgot my ")).click();
		Thread.sleep(2000);
		b.navigate().back();
		
		}

}
