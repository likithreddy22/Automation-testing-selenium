package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasktabhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String ft = driver.getWindowHandle();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		String st = driver.getWindowHandle();
		driver.get("https://www.samsung.com/in/");
		driver.switchTo().newWindow(WindowType.TAB);
		String tt = driver.getWindowHandle();
		driver.get("https://www.changepond.com/");
		Thread.sleep(2000);
		driver.switchTo().window(ft);
		Thread.sleep(2000);
		driver.switchTo().window(st);
		Thread.sleep(2000);
		driver.switchTo().window(tt);
		Thread.sleep(2000);
		driver.switchTo().window(st);
		Thread.sleep(2000);
		driver.switchTo().window(ft);
		Thread.sleep(2000);
		driver.switchTo().window(tt);
		Thread.sleep(2000);
		driver.switchTo().window(st);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
