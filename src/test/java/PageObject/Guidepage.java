package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guidepage extends Basepage{

	public Guidepage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements on Guide page
	
	 @FindBy(xpath="//h2[normalize-space()='Resource Center']") 
		WebElement guidevalidation;
		
		String actualguidetext = guidevalidation.getText();
		
		// Action performed on above elements
		
		public String getblogvalidation()
		{
			return actualguidetext;
			
		}
	
	
	
}