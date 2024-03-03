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
		Homepage hp = new Homepage(driver);
		hp.clickonacceptallcookiesbutton();
		Thread.sleep(3000);
		hp.take_a_tour_button();
		
		Takeatourpage tp = new Takeatourpage(driver);
		
		tp.myFirstName();
		tp.myLastName();
		tp.myEmailAddress();
		tp.myCompanyName();
		tp.myPhoneNumber();
		tp.myUnitCount();
		tp.myJobTitle();
		tp.myStatus();
		
		boolean actual = tp.watchdemobutton();
		Assert.assertTrue(actual);
	}
}
