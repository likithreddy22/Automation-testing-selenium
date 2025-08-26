package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver nv = new ChromeDriver();
		nv.get("https://www.google.com/");
		//nv.get("https://playwright.dev/");
		nv.navigate().to("https://playwright.dev/");
		Thread.sleep(2000);
		nv.navigate().back();
		Thread.sleep(2000);
		nv.navigate().forward();
		Thread.sleep(2000);
		nv.navigate().refresh();		
		nv.manage().window().maximize();
		System.out.println(nv.manage().window().getSize());
	}

}
