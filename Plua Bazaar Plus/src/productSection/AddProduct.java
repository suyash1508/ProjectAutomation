package productSection;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddProduct {
	
	
	private static final WebElement element = null;
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
	       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='My Products']")));
	   driver.findElement(By.xpath("//*[@text='My Products']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Add Product']")));
	   driver.findElement(By.xpath("//*[@text='Add Product']")).click();
	 
       //  elementToClick.click();
	  

	   
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.Image\r\n" + 
	   		"")));
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.Image\r\n" + 
	   		"")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Upload from Gallery']")));
	   driver.findElement(By.xpath("//*[@text='Upload from Gallery']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView\r\n" + 
	   		"")));
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView\r\n" + 
	   		"")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Albums']")));
	   driver.findElement(By.xpath("//*[@text='Albums']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Paytm']")));
	   driver.findElement(By.xpath("//*[@text='Paytm']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView\r\n" + 
	   		"")));
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView\r\n" + 
	   		"")).click();
	   driver.findElement(By.id("android:id/button2")).click();
	   Thread.sleep(5000);
	   MobileElement element = (MobileElement) driver
	   		    .findElementByAndroidUIAutomator("new UiScrollable("
	   		        + "new UiSelector().scrollable(false)).scrollIntoView("                      
	   		        + "new UiSelector().className(\"android.view.View\"));");
	   
//	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='NEXT']")));
//	   driver.findElement(By.xpath("//*[@text='NEXT']")).click();
	   // to delete the image
//	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView\r\n" + 
//	   		"")));
//	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView\r\n" + 
//	   		"")).click();
//   Thread.sleep(2000);
//   TouchActions action = new TouchActions(driver);
//   WebElement element = null;
//action.scroll(element, 10, 100);
//   action.perform();


	   
	   
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='NEXT']")));
	   driver.findElement(By.xpath("//*[@text='NEXT']")).click();
	   
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='My Products']")));
	   driver.findElement(By.xpath("//*[@text='My Products']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='My Products']")));
	   driver.findElement(By.xpath("//*[@text='My Products']")).click();
	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='My Products']")));
	   driver.findElement(By.xpath("//*[@text='My Products']")).click();
	   

}

}