package seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Try {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//d.findElement(By.xpath(input[@placeholder='First Name'])).sendKeys("Sridhar");
		d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sridhar");
		
		d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mandava");
	
		d.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Mvp colony sector 11");
		
		d.findElement(By.xpath("//input[@type='email']")).sendKeys("sridharmadhava1@gmail.com");
	
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("9866633951");
	
		d.findElement(By.name("radiooptions")).click();
	
		//d.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		d.findElement(By.id("checkbox1")).click();
	
		//d.findElement(By.xpath("//div[@id='msdd']")).click();
 
		Select s= new Select(d.findElement(By.id("Skills")));
		s.selectByVisibleText("Ruby");
		Thread.sleep(2000);
		
		
		
		
		d.findElement(By.id("msdd")).click();
		d.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
		Thread.sleep(1000);
		
 
		
		Select s1= new Select(d.findElement(By.id("yearbox")));
		s1.selectByContainsVisibleText("2002");
		Thread.sleep(1000);
 
		Select s2= new Select(d.findElement(By.xpath("//select[@placeholder='Month']")));
		s2.selectByContainsVisibleText("May");
		Thread.sleep(1000);
		
		Select s3= new Select(d.findElement(By.id("daybox")));
		s3.selectByContainsVisibleText("22");
		Thread.sleep(1000);
		
		Select s4= new Select(d.findElement(By.id("country")));
		s4.selectByContainsVisibleText("Japan");
		Thread.sleep(1000);
		
		d.findElement(By.id("firstpassword")).sendKeys("Harinadh@18");
		Thread.sleep(2000);
		d.findElement(By.id("secondpassword")).sendKeys("Harinadh@18");
		Thread.sleep(2000);
		d.findElement(By.id("submitbtn")).click();
		Thread.sleep(2000);
		
		System.out.println("Success");
		
		

	}

}
