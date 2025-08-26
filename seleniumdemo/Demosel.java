package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demosel {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver wd = new FirefoxDriver(); //In order to open the chrome/firefox browser
		WebDriver wd1 = new ChromeDriver();
		// WebDriver wd2 = new EdgeDriver();
		String s = "https://www.google.com/";
		wd1.get(s);  //to open Web Page
		wd1.manage().window().maximize();
		Thread.sleep(1000);
		//wd1.manage().window().minimize();
		System.out.println(wd1.getTitle());
		System.out.println(wd1.getCurrentUrl());
		System.out.println(wd1.getPageSource());
		wd1.close();
	}

}
