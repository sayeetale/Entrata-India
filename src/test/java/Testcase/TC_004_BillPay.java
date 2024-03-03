package Testcase;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.BillpageScheduledemopage;
import PageObject.Billpaypage;
import PageObject.Homepage;
import Testbase.start;

public class TC_004_BillPay extends start {

	
    @Test
	public void bill_pay() throws InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonacceptallcookiesbutton();
		Thread.sleep(1000);
		hp.bill_pay();
		
		Billpaypage bpp = new Billpaypage(driver);
		String actualbillpaytext = bpp.getbillpayvalidation();
		
		Assert.assertEquals(actualbillpaytext, "Bill Pay");
		
		BillpageScheduledemopage bsp = new BillpageScheduledemopage(driver);
		bsp.getScheduledemourl();
		
		String url = bsp.getScheduledemourl();
		System.out.println("URL of Bill Pay Page is " + url);
	}
	
    
}
