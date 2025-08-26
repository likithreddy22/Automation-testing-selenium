package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandlingdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver web = new ChromeDriver();
		web.get("https://demo.automationtesting.in/Alerts.html");
		web.manage().window().maximize();
//		WebElement ale = web.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		Thread.sleep(2000);
//		ale.click();
//		Thread.sleep(2000);
//		Alert alert = web.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		
		
		WebElement con = web.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		Thread.sleep(2000);
		con.click();
		Alert confirm = web.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.dismiss();
		
		
		

	}

}
