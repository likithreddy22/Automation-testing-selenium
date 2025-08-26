package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskDragdrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement drag4 = driver.findElement(By.id("credit2"));
		
		WebElement drop4 = driver.findElement(By.id("bank"));
		
		action.dragAndDrop(drag4, drop4).build().perform();
		
		WebElement drag5 = driver.findElement(By.id("fourth"));
		
		WebElement drop5 = driver.findElement(By.id("amt8"));
		
		action.dragAndDrop(drag5, drop5).build().perform();
		

	}

}
