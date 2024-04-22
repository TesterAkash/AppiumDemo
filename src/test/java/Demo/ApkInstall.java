package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApkInstall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
              
		DesiredCapabilities Capabilties = new DesiredCapabilities();
		
		Capabilties.setCapability("deviceName", "realme RMX3360");
		Capabilties.setCapability("platformName", "Android");
		Capabilties.setCapability("automationName", "uiautomator2");
		
		Capabilties.setCapability("platformversion", "13");
		Capabilties.setCapability("app", "C:\\Users\\HP\\Downloads\\apkFile\\facebook_lite_v392.0.0.13.114.apk");
		
		URL url=URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver= new AndroidDriver(url,Capabilties);
		Thread.sleep(2000);
		System.out.println("APK Installed");
		
		
		driver.quit();
	}

}
