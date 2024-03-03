package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billpaypage extends Basepage{

	public Billpaypage(WebDriver driver) {
		super(driver);
}
	
	//Elements of Bill Pay page
	
	@FindBy(xpath="//h1[normalize-space()='Bill Pay']")  
	WebElement billpaytext;                                  //Xpath to validate that driver is currently pointing to Bill Pay page
	
	@FindBy(xpath="//a[@title='Bill Pay - Product Page - Product Banner - Button']") 
	WebElement scheduledemobutton;                           // Xpath of Schedule demo button
	
	// Action performed on above elements
	
	String actualbillpaytext = billpaytext.getText();
	public String getbillpayvalidation()
	{
		return actualbillpaytext;
		
	}
	public void Schedulebutton()
	{
		scheduledemobutton.click();
	}
	}
	
