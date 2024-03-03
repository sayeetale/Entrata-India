package PageObject;

import org.openqa.selenium.WebDriver;

public class BillpageScheduledemopage extends Basepage {

	public BillpageScheduledemopage(WebDriver driver) {
		super(driver);
		
	}

	  public String getScheduledemourl()
	  {
		 String url = driver.getCurrentUrl();             //To get the current url of billpay page
		return url;                                      // returns current url to TC_004_BillPay
		  
	  }
	
}
