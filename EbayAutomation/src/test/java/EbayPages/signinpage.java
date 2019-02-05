package EbayPages;

import org.openqa.selenium.By;

public class signinpage {

	//Declaring the constant variables of values stored with the relevant id for various elements available in the sign-in page of Ebay mobile application.
	
	public static final By signin_title = By.id("com.ebay.mobile:id/sign_in_title"); 
    public static final By close_button = By.id("com.ebay.mobile:id/button_close"); 
    public static final By email_username_field = By.id("com.ebay.mobile:id/edit_text_username"); 
    public static final By password_field = By.id("com.ebay.mobile:id/edit_text_password"); 
    public static final By show_password_option = By.id("com.ebay.mobile:id/button_show_password"); 
    public static final By hide_password_option = By.xpath("//android.widget.Button[@text='hide']");
    //public static final By hide_password_option = By.xpath("//android.widget.Button[contains(@text),'hide']");
    public static final By forgot_button = By.id("com.ebay.mobile:id/button_forgot"); 
    public static final By signin_button = By.id("com.ebay.mobile:id/button_sign_in"); 
    public static final By temp_pwd_option = By.id("com.ebay.mobile:id/button_one_time_password"); 
    public static final By register_option = By.id("com.ebay.mobile:id/button_register"); 
    
    public static final By maybelater_option = By.id("android:id/button2");
}
