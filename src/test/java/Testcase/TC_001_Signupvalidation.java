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
	Homepage hp = new Homepage(driver); //
	hp.clickonsignupbutton();
	
	Signinpage sp = new Signinpage(driver);
	
	String actualsignintitle = sp.getsignintitle();
	Assert.assertEquals(actualsignintitle, "Entrata Sign In");

}
}
