package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandlePickerView {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementByAccessibilityId("Picker View").click();
		List <WebElement> values=driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		String val1 = values.get(0).getAttribute("value");
		String val2 = values.get(1).getAttribute("value");
		String val3 = values.get(2).getAttribute("value");
		
		System.out.println(val1+" "+val2+" "+val3);
		
		values.get(0).sendKeys("50");
		values.get(2).sendKeys("100");
		values.get(3).sendKeys("200");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
