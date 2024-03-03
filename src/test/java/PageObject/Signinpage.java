package PageObject;

import org.openqa.selenium.WebDriver;

public class Signinpage extends Basepage{

	public Signinpage(WebDriver driver) {
		super(driver);
	}
    
         
	public String getsignintitle()                     //To get the Title of page and return it to TC_001_Signupvalidation
	{
		return (driver.getTitle());
		
	}
}
