package EbayOperations;

import java.net.MalformedURLException;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

public class ebay_ExtraTasks extends test_Setup {
	@Test
	public void tiltandscroll() throws InterruptedException
	{
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(5000);
		
		driver.swipe(200, 630, 400, 630, 3000);
		driver.swipe(400, 630, 200, 630, 3000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		driver.swipe(441, 503, 441, 835, 3000);
		driver.swipe(441, 835, 441, 503, 3000);
	}
	

	

}
