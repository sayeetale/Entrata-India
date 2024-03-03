package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Takeatourpage extends Basepage{

	public Takeatourpage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements on Watch Demo page
	
      @FindBy(xpath="//input[@id='FirstName']")
      WebElement first_name;                                                  //Xpath for First Name textbox
      
      @FindBy(xpath="//input[@id='LastName']")
      WebElement last_name;                                                   //Xpath for Last Name textbox
	
      @FindBy(xpath="//input[@id='Email']")
      WebElement email;                                                       //Xpath for Email textbox
	
      @FindBy(xpath=" //input[@id='Company']")
      WebElement company_name;                                                //Xpath for Company Name textbox
      
      @FindBy(xpath="//input[@id='Phone']")
      WebElement phone_number;                                                //Xpath for Phone Number textbox
   
      @FindBy(xpath="//select[@id='Unit_Count__c']")
      WebElement unit_count;                                                   //Xpath for Unit Count textbox
      Select ddw_unit_count = new Select(unit_count);                           //Using Select class for selecting values from dropdown
      
      @FindBy(xpath="//input[@id='Title']")
      WebElement job_title;                                                     //Xpath for Job Title textbox
      
      @FindBy(xpath="//select[@id='demoRequest']")
      WebElement i_am;                                                           //Xpath for Iam textbox
      Select ddw_i_am = new Select(i_am);                                        //Using Select class for selecting values from dropdown
      
      @FindBy(xpath="//button[normalize-space()='WATCH DEMO']")
      WebElement  watchdemobutton;                                              //Xpath of Watch Demo button                           
  
   //Action performed on above elements
      
      public void myFirstName()
      {
    	  first_name.sendKeys("sayee");
      }
      
      public void myLastName()
      {
    	  last_name.sendKeys("Tale");
      }
      
      public void myEmailAddress()
      {
    	  email.sendKeys("sayeet@gmail.com");
      }
      
      public void myCompanyName()
      {
    	  company_name.sendKeys("entrata");
      }
      
      public void myPhoneNumber()
      {
    	  phone_number.sendKeys("12345678");
      }
      public void myUnitCount()
      {
    	  ddw_unit_count.selectByIndex(1);;
      }
      
      public void myJobTitle()
      {
    	  job_title.sendKeys("QA");;
      }
      
      public void myStatus()
      {
    	  ddw_i_am.selectByVisibleText("a Resident");
      }
      
      public boolean watchdemobutton()
      {
		return (watchdemobutton.isDisplayed());
    	  
      }
      
      
      
}
