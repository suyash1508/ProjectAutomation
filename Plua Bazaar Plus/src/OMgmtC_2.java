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

public class OMgmtC_2 {
	    
	
	
	
	public static void main(String[] args) {
		try {
			case2();
		} catch (Exception exp) {
		  System.out.println(exp.getCause());
		  System.out.println(exp.getMessage());
		  exp.printStackTrace();
		}
	
	}
		@Test
		public static void case2() throws InterruptedException, WebDriverException, IOException {
			AndroidDriver<MobileElement> driver;
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Redmi");
			caps.setCapability("udid","5dd3e2bf7d62"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("automationName", "UiAutomator2");
		
			caps.setCapability("noReset",  true);
//			caps.setCapability("newCommandTimeout", "0");
//			caps.setCapability("skipServerInstallation", "true");
//			caps.setCapability("skipUnlock", "true");
//			caps.setCapability("skipDeviceInitialization", "true");
		
			caps.setCapability("appPackage", "io.cordova.helloCordova");
			caps.setCapability("appActivity", "io.cordova.helloCordova.MainActivity");
			
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			
	        driver =new AndroidDriver<MobileElement>(url,caps);
			

	       Reporter.log("Launch app", true);
	       WebDriverWait wait1 = new WebDriverWait(driver, 20);
			 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]\r\n" + 
			 		"")));
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]\r\n" + 
			 		"")).click();
			 driver.findElement(By.xpath("//*[@text='add_order']")).click();
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Other']")));
			 driver.findElement(By.xpath("//*[@text='Other']")).click();
		   driver.hideKeyboard();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText\r\n" + 
					"")).setValue("Automation MAchine");
			 driver.findElement(By.xpath("//*[@text='send']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='0.5 Kg']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[4]/android.view.View/android.view.View[17]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
			 		"")).setValue("Suyash");
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[4]/android.view.View/android.view.View[17]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
			 		"")).setValue("Testing");
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[4]/android.view.View/android.view.View[17]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
			 		"")).setValue("9584149828");
			  driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='I need Delivery Services']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[4]/android.view.View/android.view.View[20]/android.view.View[2]\r\n" + 
			 		"")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='Yes, this is a Non Residential Location']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='Tomorrow']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@text='1pm - 2pm']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='Skip']")).click();
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText\r\n" + 
			 		"")).setValue("999");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='send']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='I will pay']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='No']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='Send a payment link of Rs.999 to Suyash']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
			// File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//	 FileUtils.copyFile(src1, new File("C:\\Users\\Leo\\eclipse-workspace\\Clothing\\ScreeshotsClothing\\RoundNeckT.PNG"));
		//	 Reporter.log("Screeshot captured", true);
			 
			 
		}
	
	
	

}
