package AppiumDemo.AppiumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.17.0");
         driver.close();
	}

}
