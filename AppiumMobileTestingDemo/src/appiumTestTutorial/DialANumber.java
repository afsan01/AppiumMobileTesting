package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialANumber {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		dc.setCapability("appPackage", "com.android.dialer");
		dc.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		//Dial 8142402254
		driver.findElementById("com.android.dialer:id/floating_action_button").click();
		driver.findElementById("com.android.dialer:id/eight").click();//Eight
		driver.findElementById("com.android.dialer:id/one").click();//One
		driver.findElementById("com.android.dialer:id/four").click();//Four
		driver.findElementById("com.android.dialer:id/two").click();//Two
		driver.findElementById("com.android.dialer:id/four").click();//Four
		driver.findElementById("com.android.dialer:id/zero").click();//Zero
		driver.findElementById("com.android.dialer:id/two").click();//Two
		driver.findElementById("com.android.dialer:id/two").click();//Two
		driver.findElementById("com.android.dialer:id/five").click();//Five
		driver.findElementById("com.android.dialer:id/four").click();//Four
		
		Thread.sleep(5000);
		
		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
