package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabhandlingdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String ft = driver.getWindowHandle();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		String st = driver.getWindowHandle();
		driver.get("https://www.changepond.com/");
		driver.switchTo().window(ft);

	}

}
