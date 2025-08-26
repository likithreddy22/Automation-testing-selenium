package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskdemoregisterform {

	public static void main(String[] args) throws InterruptedException {
		WebDriver r = new ChromeDriver();
	r.get("https://demo.automationtesting.in/Register.html");
	r.manage().window().maximize();
	r.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys("virat");
	
	r.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("Kohli");
	//Thread.sleep(2000);			
	r.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Alibaug,Mumbai");
	r.findElement(By.xpath("//input[@type = 'email']")).sendKeys("kohli@gmail.com");
	r.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("234567891");
	r.findElement(By.xpath("//input[@value='FeMale']")).click();
	r.findElement(By.id("checkbox1")).click();
	r.findElement(By.id("checkbox2")).click();
	//r.findElement(By.xpath("//span[@role='combobox']"));
	//r.findElement(By.xpath("//a[contains(text() , 'Bulgarian')]")).click();
	Select s = new Select(r.findElement(By.id("Skills")));
	s.selectByVisibleText("SQL");
	Select y = new Select(r.findElement(By.id("yearbox")));
	y.selectByVisibleText("2000");
	Select m = new Select(r.findElement(By.xpath("//select[@placeholder='Month']")));
	m.selectByVisibleText("November");
	Select d = new Select(r.findElement(By.xpath("//select[@placeholder='Day']")));
	d.selectByVisibleText("5");
	
	r.findElement(By.id("msdd")).click();
	r.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
	Thread.sleep(1000);
	
	Select c = new Select(r.findElement(By.id("country")));
	c.selectByContainsVisibleText("Japan");
	Thread.sleep(2000);
	
	
	r.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Web@123");
	r.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Web@123");
	

		
	}

}
