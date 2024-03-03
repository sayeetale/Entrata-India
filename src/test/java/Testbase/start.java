package Testbase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class start {
	
	public WebDriver driver;  
    @BeforeClass
	public void setup() 
	{
    	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();                                          //To Initiate Chrome browser
		driver.manage().deleteAllCookies();                                  //Method to delete all cookieds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //Implicit wait
		driver.get("https://www.entrata.com/");                             //To get the URL of Entrata India
		driver.manage().window().maximize();	                            //To Maximize the window
	}
    
	@AfterClass
	public void close()
	{
		driver.close();                                     //To Close the driver
	}
 

}
