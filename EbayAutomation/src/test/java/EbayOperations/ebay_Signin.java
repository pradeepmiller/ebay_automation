package EbayOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import EbayPages.signinpage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import EbayPages.*;

public class ebay_Signin extends test_Setup{

	/*
	   public static AndroidDriver<AndroidElement> ebaySignin() throws MalformedURLException {
		

		if(driver.findElement(signinpage.signin_title).isDisplayed())
			System.out.println("Pass: Sign-in page title is displayed successfully");
		if(driver.findElement(signinpage.close_button).isDisplayed())
			System.out.println("Pass: Close button on sign-in page is displayed successfully");		
	
		
		driver.findElement(signinpage.email_username_field).sendKeys();
		driver.findElement(signinpage.password_field).sendKeys();
		
		if(driver.findElement(signinpage.show_password_option).isDisplayed())
			System.out.println("Pass: Password is shown as encrypted with show option successfully");	
		driver.findElement(signinpage.show_password_option).click();
		if(driver.findElement(signinpage.hide_password_option).isDisplayed())
			System.out.println("Pass: Password is shown as decrypted with hide option");	
		if(driver.findElement(signinpage.forgot_button).isDisplayed())
			System.out.println("Pass: Forgot password option is shown succcessfully");	
		driver.findElement(signinpage.forgot_button).click();
			
		
		
		return driver;
		
		
		*/
	
	@Test
	public void signin() throws InterruptedException, Exception
	{	ExcelRead=new FileInputStream("TestData/testdata.xlsx");
		wbk=new XSSFWorkbook(ExcelRead);
		
		String user_name = wbk.getSheetAt(0).getRow(1).getCell(1).toString();
		String password = wbk.getSheetAt(0).getRow(2).getCell(1).toString();
		driver.findElement(homepage.hamburger_icon).click();
		Thread.sleep(2000);
		driver.swipe(441, 503, 441, 835, 1000);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().resourceId(\"com.ebay.mobile:id/home\"));");
		Thread.sleep(3000);
		driver.findElement(optionspage.signinoptionpage).click();
		Thread.sleep(2000);
		driver.findElement(homepage.signin_option).click();
		Thread.sleep(2000);
		driver.findElement(signinpage.email_username_field).sendKeys(user_name);
		Thread.sleep(2000);
		driver.findElement(signinpage.password_field).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(signinpage.signin_button).click();
		Thread.sleep(3000);
		driver.findElement(signinpage.maybelater_option).click();
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	
}

