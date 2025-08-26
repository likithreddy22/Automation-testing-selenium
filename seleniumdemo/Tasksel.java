package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tasksel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver ts = new FirefoxDriver();
		ts.manage().window().maximize();
		ts.get("https://accounts.google.com/v3/signin/accountchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdBytiO_sJ3MrGAmiNGlUbUuCNlBmUmEmwX_zdW-ZdvjLpDjDvccPyY2QT0HD_dl6dMFKlDEXek9&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S690429352%3A1755585011206342");
		ts.manage().window().minimize();
		String t = ts.getTitle();
		System.out.println(t);
		if(t.equals("Welcome")){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(ts.getCurrentUrl());
		Thread.sleep(3000);
		ts.close();
		

	}

}
