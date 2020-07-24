package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class VarticalScrolling {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		//Vartical scroll
		driver.findElementsById("android:id/text1").get(10).click();
		
		//Capture all the list item.
		AndroidElement list= (AndroidElement)driver.findElementById("android:id/text1");
		
		//Scrolling down till we get the element
		MobileElement listitem = (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScorllable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().description(\"Swotches\"));"));
		System.out.println(listitem.getLocation());
		listitem.click();
	}

}
