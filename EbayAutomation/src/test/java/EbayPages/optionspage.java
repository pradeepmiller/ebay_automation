package EbayPages;

import org.openqa.selenium.By;

public class optionspage {
	
	public static final By signinoptionpage = By.id("com.ebay.mobile:id/logo");
	//public static final By settings = By.xpath("//android.widget.CheckedTextView[contains[@text,'Settings']");
	public static final By countryreg = By.xpath("//android.widget.TextView[contains(@text,'Country/region')]");
	public static final By countryre = By.className("android.widget.RelativeLayout");
	public static final By autodetectbutton = By.id("android:id/switchWidget");
	public static final By countryfilter = By.id("com.ebay.mobile:id/filter");
	public static final By australia = By.xpath("//android.widget.CheckedTextView[contains(@text,'Australia')]");
	public static final By back = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
}
