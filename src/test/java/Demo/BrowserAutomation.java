package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities Capabilties = new DesiredCapabilities();
		Capabilties.setCapability("deviceName","realme RMX3360");
		Capabilties.setCapability("platformName","Android");
		Capabilties.setCapability("automationName","uiautomator2");

		Capabilties.setCapability("platformversion","13");
		Capabilties.setCapability("browserName","Chrome");
		Capabilties.setCapability("chromedriverExcutable","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");

		URL url = URI.create("http://127.0.0.1:4723/").toURL();

		AndroidDriver driver = new AndroidDriver(url, Capabilties);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("JayshreeRAM");
		srchBox.sendKeys(Keys.RETURN);
		

	}

}
