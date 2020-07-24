package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckBoxRadioButtonTextField {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementsById("android:id/text1").get(10).click();
		
		//get the Controls
		driver.findElementsById("android:id/text1").get(4).click();
		//click Dark theme
		//driver.findElementsById("android:id/text1").get(1).click();
		//or
		driver.findElementByAccessibilityId("2. Dark Theme").click();
		
		//text box
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Mahbub");
		
		//CheckBox
		driver.findElementById("io.appium.android.apis:id/check1").click();
		
		//Radio button
		driver.findElementById("io.appium.android.apis:id/radio1").click();
		
	
		
		
		
		
		
	}

}
