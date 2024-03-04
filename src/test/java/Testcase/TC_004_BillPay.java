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
		Homepage hp = new Homepage(driver);                                        //To create Home Page object
		hp.clickonacceptallcookiesbutton();                                        //Referece of Home Page object is use to call clickonacceptallcookiesbutton method
		Thread.sleep(1000);                                                        //Thread.sleep statement is use to wait after accepting the cookies
		hp.bill_pay();                                                             //Referece of Home Page object is use to call bill_pay method
		
		Billpaypage bpp = new Billpaypage(driver);                                  //To create Bill Pay Page object                       
		String actualbillpaytext = bpp.getbillpayvalidation();                          
		
		Assert.assertEquals(actualbillpaytext, "Bill Pay");                          //Assertion is used to validatd "Bill Pay" text present on Bill Pay page
                        
		BillpageScheduledemopage bsp = new BillpageScheduledemopage(driver);          //To create Schedule demo Page object
		bsp.getScheduledemourl();                                                     //Referece of Schedule demo Page object is use to call getScheduledemourl method                                          
		
		String url = bsp.getScheduledemourl();                                         //get the URL of Schedule demo Page
		System.out.println("URL of Bill Pay Page is " + url);                          //Print URL
	}
}
