package appiumTestTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");//Version of the device
		
		dc.setCapability("appPackage", "com.digitalchemy.calculator.freedecimal");
		dc.setCapability("appActivity", "com.digitalchemy.calculator.droidphone.CalculatorMainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(5000);
		
		WebElement seven = driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n7");//7
		seven.click();
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/add")).click();//+ button
		WebElement three = driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n3");//3
		three.click();
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/equals")).click();//= button
		String result = driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.HorizontalScrollView[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View").getText();
		if(result.equals("10")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
