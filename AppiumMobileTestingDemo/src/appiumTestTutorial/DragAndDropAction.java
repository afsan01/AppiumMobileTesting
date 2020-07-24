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

public class DragAndDropAction {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		
		dc.setCapability(MobileCapabilityType.APP, "C\\Teen Patti Cash_v2.1.0_apkpure.com.apk"); 
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		//Navigation
		driver.findElementById("XXXXXXXXX").click();
		
		//Drag specific item
		
		WebElement source=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		WebElement target=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);
		
		//drag and drop
		TouchAction action = new TouchAction((MobileDriver)driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		
		System.out.println("Element has been dropped at destination successfully");
		
	}

}
