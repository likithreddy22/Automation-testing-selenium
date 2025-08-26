package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver we = new ChromeDriver();
		we.get("https://demo.automationtesting.in/Register.html");
		we.manage().window().maximize();
//		we.findElement(By.id("firstName")).click();
//		Thread.sleep(2000);
//		we.findElement(By.id("firstName")).sendKeys("Abcde");
//		Thread.sleep(2000);
//		we.findElement(By.id("firstName")).clear();
//		Thread.sleep(2000);
//		we.findElement(By.id("firstName")).sendKeys("wxyz");
		
//		WebElement element = we.findElement(By.id("firstName"));
//		Thread.sleep(1000);
//		System.out.println(element.isDisplayed());
//		Thread.sleep(1000);
//		System.out.println(element.isEnabled());
//		Thread.sleep(1000);
//		System.out.println(element.isSelected());
//		
//		System.out.println(element.getTagName());
//		System.out.println(element.getSize());
//		System.out.println(element.getLocation());
//		element.click();
//		element.sendKeys("virat");
//		Thread.sleep(1000);
//		System.out.println(element.getAttribute("value"));
//		element.clear();
//		Thread.sleep(1000);
//		element.sendKeys("kohli");
//		
//		WebElement radio = we.findElement(By.id("hobbies-checkbox-1"));
//	
//		Thread.sleep(2000);
//		System.out.println(radio.getTagName());
//		System.out.println(radio.isEnabled());
//		Thread.sleep(1000);
//		System.out.println(radio.isSelected());
		WebElement drop = we.findElement(By.id("yearbox"));
		System.out.println(drop.getText());
	}

}
