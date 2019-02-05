package EbayOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import EbayPages.*;

public class ebay_SearchPurchase extends test_Setup {
	@Test
	public void searchitem() throws InterruptedException, Exception
		{
		ExcelRead=new FileInputStream("TestData/testdata.xlsx");
		wbk=new XSSFWorkbook(ExcelRead);
		String search_item = wbk.getSheetAt(0).getRow(3).getCell(1).toString();
		driver.findElement(homepage.search_input).click();
		System.out.println(search_item);
		driver.findElement(homepage.searchtext).sendKeys(search_item);
		Thread.sleep(2000);
		((AndroidDeviceActionShortcuts) driver).pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(10000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"65X4US TCL 65 inch X4 QLED Android TV\"));").click();
		String pprice=driver.findElement(productpage.prodprice).getText();
		System.out.println("Product Price:"+pprice);
		driver.findElement(productpage.addtocart).click();
		Thread.sleep(2000);
		driver.findElement(productpage.viewcart).click();
		Thread.sleep(2000);
		String cprice=driver.findElement(productpage.cartprice).getText();
		System.out.println("Cart Price:"+cprice);
		if(pprice.equalsIgnoreCase(cprice))
		{
			System.out.println("Clicking Checkout");
			driver.findElement(productpage.checkout).click();
		}
		else
		{
		System.out.println("Do nothing");
		}
		
		
		}
	
		
		
		
	
}
