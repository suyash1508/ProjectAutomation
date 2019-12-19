import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginScreen {

	
	public static void main(String[] args) {
		try {
			Login();
		} catch (Exception exp) {
		  System.out.println(exp.getCause());
		  System.out.println(exp.getMessage());
		  exp.printStackTrace();
		}
	
	}
		@Test
		public static void Login() throws InterruptedException, WebDriverException, IOException {
			AndroidDriver<MobileElement> driver;
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Redmi");
			caps.setCapability("udid","5dd3e2bf7d62"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("skipLogcatCapture", "true");
			
			caps.setCapability("noReset", "true");
			caps.setCapability("newCommandTimeout", "0");
			caps.setCapability("skipServerInstallation", "true");
			caps.setCapability("skipUnlock", "true");
			caps.setCapability("skipDeviceInitialization", "true");
		
			caps.setCapability("appPackage", "io.cordova.helloCordova");
			caps.setCapability("appActivity", "io.cordova.helloCordova.MainActivity");
			
//			caps.setCapability("appPackage", "io.ionic.starter");
//			caps.setCapability("appActivity", "io.ionic.starter.MainActivity");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			
	        driver =new AndroidDriver<MobileElement>(url,caps);
			
  //    Thread.sleep(20000);
	       Reporter.log("Launch app", true);
	       WebDriverWait wait1 = new WebDriverWait(driver, 20);
			 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Login']")));
			 driver.findElement(By.xpath("//*[@text='Login']")).click();
	       driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
	       		"")).setValue("9823488138");
	       Reporter.log("Enter NUmber", true);
	       driver.hideKeyboard();
	       driver.findElement(By.xpath("//*[@text='Login']")).click();
	     Reporter.log("Click LOgin", true);
	       driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
	       		"")).setValue("qwerty");
	       driver.hideKeyboard();
	      driver.findElement(By.xpath("//*[@text='Login']")).click();
	
}
}