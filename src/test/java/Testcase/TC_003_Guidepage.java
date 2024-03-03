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
		Homepage hp = new Homepage(driver);
	hp.resourcebutton();
	
	Guidepage gp = new Guidepage(driver);
	
	String actual = gp.getblogvalidation();
	
	Assert.assertEquals(actual, "Resource Center");
	}
	
	

}
