package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandleDatePicker {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog+"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementByAccessibilityId("Date Picker").click();
		List <WebElement> values=driver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		for(int i=0; i<values.size();i++) {
			System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("June 3");
		values.get(0).sendKeys(Keys.TAB);
		
		values.get(1).sendKeys("8");
		values.get(1).sendKeys(Keys.TAB);
		
		
		values.get(2).sendKeys("09");
		values.get(2).sendKeys(Keys.TAB);
		
		values.get(3).sendKeys("PM");
		
		Thread.sleep(9000);
		
		driver.quit();
		
	}

}
