package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandleSwitchInRealDevice {

	public static void main(String[] args) throws MalformedURLException {

 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		//Handling Switch element
		driver.findElementById("com.android.androidui:id/mySwitch").click();
		String val=driver.findElementById("com.android.androidui:id/switchStatus").getText();
		System.out.println(val);
		
		driver.findElementById("com.android.androidui:id/mySwitch").click();
		val=driver.findElementById("com.android.androidui:id/switchStatus").getText();
		System.out.println(val);
		
		driver.quit();
	}

}
