package seleniumdemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customsizeselwp {

	public static void main(String[] args) {
		
		WebDriver y = new ChromeDriver();
		Dimension d1 = new Dimension(10, 700);
		y.manage().window().setSize(d1);

	}

}
