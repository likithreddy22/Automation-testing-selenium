package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbardemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver sb = new ChromeDriver();
		sb.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		WebElement ref = sb.findElement(By.id("Button1"));
		
		JavascriptExecutor je = (JavascriptExecutor)sb;
		je.executeScript("arguments[0].scrollIntoView();",ref);
//		je.executeScript("scroll(0,350)");
//		Thread.sleep(2000);
//		
//		je.executeScript("scroll(0,-350)");
	}

}
