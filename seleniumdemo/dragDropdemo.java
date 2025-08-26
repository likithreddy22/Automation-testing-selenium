package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDropdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("angular"));
		
		WebElement drop = driver.findElement(By.id("droparea"));
		
		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1 = driver.findElement(By.id("mongo"));
		
		WebElement drop1 = driver.findElement(By.id("droparea"));
		
		action.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2 = driver.findElement(By.id("node"));
		
		WebElement drop2 = driver.findElement(By.id("droparea"));
		
		action.dragAndDrop(drag2, drop2).build().perform();

	}

}
