package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class HorizontalScrolling {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		//Horizontal scroll/ Progress bar
		WebElement obj = driver.findElementById("com.android.androidui:id/seekbar1");
		String Val1= driver.findElementById("com.android.androidui:id/TextProgress").getText();
		System.out.println(Val1);
		
		TouchAction ta = new TouchAction((MobileDriver)driver);
		
		ta.longPress(ElementOption.element(obj)).moveTo(ElementOption.element(obj,250,250)).release().perform();
		
		String Val2= driver.findElementById("com.android.androidui:id/TextProgress").getText();
		System.out.println(Val2);
		
		
		
		
		
		
		
	}

}
