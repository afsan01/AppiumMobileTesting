package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendingMessage {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 5.0);//Version of the device
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		driver.findElementById("com.android.mms:id/recipients_editor").sendKeys("7189476499");
		driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Hello...How are you?");
		driver.findElementById("com.android.mms:id/send_button_sms").click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
