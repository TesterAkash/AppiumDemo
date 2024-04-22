package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Dialer {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

DesiredCapabilities Capabilties = new DesiredCapabilities();
		
		Capabilties.setCapability("deviceName", "realme RMX3360");
		Capabilties.setCapability("platformName", "Android");
		Capabilties.setCapability("automationName", "uiautomator2");
		
		Capabilties.setCapability("platformversion", "13");
		Capabilties.setCapability("appPackage", "com.google.android.dialer");
		Capabilties.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver= new AndroidDriver(url,Capabilties);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"6\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"2\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"3\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"4\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"8\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"4\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"1\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"5\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"dial\"]")).click();
		
		
	}

}
