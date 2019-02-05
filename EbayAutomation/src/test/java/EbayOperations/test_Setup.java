package EbayOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class test_Setup {
	
	static AndroidDriver<AndroidElement> driver;
	static DesiredCapabilities caps;
	InputStream ExcelRead;
	XSSFWorkbook wbk; 
	@BeforeSuite
	public static void setUP() throws MalformedURLException
	{
		
		File appDir = new File("Application");
		//File appDir = new File("/Users/Easwaraprasath/eclipse-workspace/EbayAutomation/Application");
        File app = new File (appDir, "eBay.apk");
        caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "3abace39");
		//caps.setCapability("udid", "");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", "Android");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability("appPackage", "com.ebay.mobile");
		caps.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		//caps.setCapability("unicodeKeyboard", "true");                                     
		//caps.setCapability("resetKeyboard", "true");
		driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps); 
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
