package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasklogindemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver log = new ChromeDriver();
		log.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement submit = log.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		WebElement alert = log.findElement(By.xpath("//span[text()='Required']"));
		System.out.println(alert.getText());
		
		
	}

}
