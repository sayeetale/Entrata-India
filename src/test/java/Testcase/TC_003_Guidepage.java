package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Guidepage;
import PageObject.Homepage;
import Testbase.start;

public class TC_003_Guidepage extends start {
	@Test
	public void blog_page()
	{
        Homepage hp = new Homepage(driver);              //To create Home Page object
	hp.resourcebutton();                             //Referece of Home page object is use to call resourcebutton method
	
	Guidepage gp = new Guidepage(driver);              //To create Guide Page object
	
	String actual = gp.getblogvalidation();
	
	Assert.assertEquals(actual, "Resource Center");      //Assertion is used to validatd "Resource Center" text present on guide page
	}
	
	

}
