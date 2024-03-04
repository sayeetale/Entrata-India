package Testcase;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.Homepage;
import PageObject.Signinpage;
import Testbase.start;
public class TC_001_Signupvalidation extends start {
	@Test
	public void signup()
	{
	Homepage hp = new Homepage(driver);                                  //To create Home page object
	hp.clickonsignupbutton();                                           //Reference of Homepage object is use to call clickonsignupbutton method
	
	Signinpage sp = new Signinpage(driver);                             //To create Signin page object
	
	String actualsignintitle = sp.getsignintitle();                     //The return output value of getsignintitle method is stored in actualsignintitle
	Assert.assertEquals(actualsignintitle, "Entrata Sign In");         //Assertion is use to validate expected title of signin page with actual title of signin page

}
}
