package EbayOperations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import EbayPages.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ebay_CountrySelection extends test_Setup {
	
	TouchActions action;
	@Test
	public void countryselect() throws InterruptedException, Exception{
		
		driver.findElement(homepage.hamburger_icon).click();
		Thread.sleep(10000);
		//((MobileElement) driver).find_Element_by_android_uiautomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text('Settings'))");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Settings\"));").click();
		driver.findElement(optionspage.countryreg).click();
		driver.findElement(optionspage.autodetectbutton).click();
		Thread.sleep(3000);
		List<AndroidElement> country=driver.findElements(optionspage.countryre);
		country.get(2).click();
		Thread.sleep(2000);
		driver.findElement(optionspage.countryfilter).sendKeys("Aus");
		driver.findElement(optionspage.australia).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Australia\"));").click();
		Thread.sleep(2000);
		driver.findElement(optionspage.back).click();
		Thread.sleep(2000);
		driver.findElement(optionspage.back).click();
	}
	

}
