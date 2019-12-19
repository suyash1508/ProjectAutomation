package signUpLogin;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SignUp {
	
	
	public static void main(String[] args) {
		try {
			Signup();
		} catch (Exception exp) {
		  System.out.println(exp.getCause());
		  System.out.println(exp.getMessage());
		  exp.printStackTrace();
		}
	
	}
		@Test
		public static void Signup() throws InterruptedException, WebDriverException, IOException {
			AndroidDriver<MobileElement> driver;
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Redmi");
			caps.setCapability("udid","192.163.0.16:5555"); //Give Device ID of your mobile phone
		//	caps.setCapability("udid","5dd3e2bf7d62");
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "5.1.1");
			caps.setCapability("automationName", "UiAutomator2");
		//	 caps.setCapability("unicodeKeyboard", true);
	//		caps.setCapability("noReset",  true);

			caps.setCapability("appPackage", "io.cordova.helloCordova");
			caps.setCapability("appActivity", "io.cordova.helloCordova.MainActivity");
			
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			
	        driver =new AndroidDriver<MobileElement>(url,caps);
	       
//  //*[@text='SUBMIT']
	       Reporter.log("Launch app", true);
	       WebDriverWait wait1 = new WebDriverWait(driver, 20);
	       WebDriverWait wait2 = new WebDriverWait(driver, 8);
	  
	    
	       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Not a member? Sign Up Now']")));
	   driver.findElement(By.xpath("//*[@text='Not a member? Sign Up Now']")).click();
	  Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
        		"")).setValue("8770292108");
        driver.findElement(By.xpath("//*[@text='Request OTP']")).click();
     //   Thread.sleep(16000);
   //     driver.findElement(By.xpath("//*[@text='COnfirm OTP']")).click();
        
       //  click on check box 
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.CheckBox/android.widget.Button\r\n" + 
//        		"")));
// 	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.CheckBox/android.widget.Button\r\n" + 
// 	   		"")).click();
// 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Check the box, if you have differ WhatsApp number']")));
//	   driver.findElement(By.xpath("//*[@text='Check the box, if you have differ WhatsApp number']")).click();
//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
//	  		"")));
 	   // whatsapp number
// 	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
// 	   		"")).setValue("9584149828");
 	   // PVS ID
      Thread.sleep(15000);
// 	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
// 	  		"")));
 	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
 	   		"")).setValue("PVS automation");
 	  Reporter.log("ENter PVS ID");
    // Fb URL
 	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
  	  		"")).setValue("https://www.facebook.com/BulbandKey/");
  	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[5]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
  	  		"")).setValue("First name");
 	   
// 	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
// 	   		"")).setValue("Fb.com/automation");
//	   Thread.sleep(1000);
 	   MobileElement element = (MobileElement) driver
	   		    .findElementByAndroidUIAutomator("new UiScrollable("
	   		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
	   		        + "new UiSelector().text(\"Email*\"));");
 	   Thread.sleep(1000);
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
     		"")).setValue("LAst NAme");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[7]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
     		"")).setValue("suyash@bulbandkey.com");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[8]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
     		"")).setValue("123456");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[9]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
     		"")).setValue("123456");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Image\r\n" + 
     		"")).click();
     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]\r\n" + 
     		"")));
 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]\r\n" + 
 		"")).setValue("bulbandkey");	
 Thread.sleep(2000);
  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]\r\n" + 
  		"")).click();
  Thread.sleep(2000); 
driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
		"")).setValue("123");  
  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[3]\r\n" + 
  		"")).click();
  Thread.sleep(2000);
  MobileElement element1 = (MobileElement) driver
 		    .findElementByAndroidUIAutomator("new UiScrollable("
 		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
 		        + "new UiSelector().text(\"Continue*\"));");  
  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[3]\r\n" + 
  		"")).click();
  
}
}
