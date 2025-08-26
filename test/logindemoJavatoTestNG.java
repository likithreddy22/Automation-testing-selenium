package test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Loginfirstdemo;

public class logindemoJavatoTestNG {
  @Test
  public void f() throws IOException {
	  FileReader fr = new FileReader("C:\\Users\\likithreddy.konda\\eclipse-workspace\\Selenium\\MavenProject\\DemoMavenproject\\utility\\input.properties");
		Properties p =new Properties();
		p.load(fr);
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		Loginfirstdemo plog = new Loginfirstdemo(driver);
		plog.enterUSER(p.getProperty("username"));
		plog.enterPWD(p.getProperty("password"));
		plog.clicklogin();
		
  }
}
