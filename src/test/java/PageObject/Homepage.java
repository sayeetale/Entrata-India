package PageObject;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	
	public Homepage (WebDriver driver)
	{
		super(driver);
	}
	
	//Elements on Home Page
	
	@FindBy(xpath="//a[@class='button-default outline-dark-button']") 
	WebElement signinbutton;                                             //Xpath of Signin button
	
	@FindBy(xpath="//button[@id='rcc-confirm-button']") 
	WebElement acceptcookiesbutton;                                      //Xpath of Signin button
	
	@FindBy(xpath="//div[@class='double-link']//a[@href='https://go.entrata.com/watchdemo' and @title='Take the tour (demo button)']")
	WebElement takeatourbutton;                                          //Xpath of Take a Tour button
	
	
	@FindBy(xpath="//div[@class='header-nav-item']//a[text()='Base Camp']")
	WebElement Basecampbutton;                                           //Xpath of Base Camp button
	
	@FindBy(xpath="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[@class='layout']/div[@class='main-header']/div[@class='content-cap']/div[@class='main-header-grid']/div[@class='header-desktop-nav hide-on-mobile']/div[3]/div[1]")
	WebElement resourcebutton;                                            //Xpath of Resource option
	
	@FindBy(xpath="//div[@class='header-drop-nav']//a[@class='fat-nav-links'][normalize-space()='Guides']")
	WebElement guide;                                                     //Xpath of guide option in Resource option
	
	@FindBy(xpath="//a[@class='standard-footer-link'][normalize-space()='Bill Pay']")
	WebElement billpay;                                                    //Xpath of Bill Pay option present in footer of home page
	
	// Action performed on above elements
	
	public void clickonsignupbutton()
	{
		signinbutton.click();
	}
	
	public void clickonacceptallcookiesbutton()
	{
		acceptcookiesbutton.click();
		
	}
	
	public void take_a_tour_button()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  //Creating the JavascriptExecutor interface object by Type casting
		js.executeScript("arguments[0].click();", takeatourbutton); //Calling executeScript to click Take a Tour button element
		
	}
	
	public void base_camp()
	{
		Basecampbutton.click();
	}
	
	public void resourcebutton()
	{
		Actions act=new Actions(driver);    //Creating an object of Actions class
		act.moveToElement(resourcebutton).moveToElement(guide).click().perform(); // Performed mouse hover action
		 
	}
	
	public void bill_pay()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; //Creating the JavascriptExecutor interface object by Type casting
		js.executeScript("arguments[0].click();", billpay); //Calling executeScript to click Bill Pay element
	}
	
	
}
