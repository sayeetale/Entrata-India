package Testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.Takeatourpage;
import Testbase.start;

public class TC_002_Takeatourpage extends start {
   @Test
	public void takeatour() throws InterruptedException 
	{
		Homepage hp = new Homepage(driver);                         //To create Home Page object
		hp.clickonacceptallcookiesbutton();                         //Referece of Home Page object is use to call clickonacceptallcookiesbutton method
		Thread.sleep(3000);                                         //Thread.sleep statement is use to wait after accepting the cookies
		hp.take_a_tour_button();                                    //Referece of Home Page object is use to call take_a_tour_button method
		
		Takeatourpage tp = new Takeatourpage(driver);                //To create Take a Tour page object
		
		tp.myFirstName();                                            //Referece of Take a Tour page object is use to call methods present in Takeatourpage class
		tp.myLastName();
		tp.myEmailAddress();
		tp.myCompanyName();
		tp.myPhoneNumber();
		tp.myUnitCount();
		tp.myJobTitle();
		tp.myStatus();
		
		boolean actual = tp.watchdemobutton();                       
		Assert.assertTrue(actual);                                   //To Validate Watch Demo button on Take a tour page
	}
}
