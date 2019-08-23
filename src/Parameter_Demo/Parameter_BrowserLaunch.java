package Parameter_Demo;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter_BrowserLaunch {
	WebDriver driver;
@Parameters ("browsername")
@Test
public void method(String abc) {
	System.out.println("Browsername="+abc);
	if (abc.equalsIgnoreCase("chrome"))	{
		System.out.println("Start Chrome");
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",Driverpath);
		WebDriver driver=new ChromeDriver();
		System.out.println("End Chrome");
		driver.manage().window().maximize();
		}
	else {
		System.out.println("Start Firefox");
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\geckodriver.exe" ;
		System.setProperty("webdriver.gecko.driver",Driverpath);
		WebDriver driver=new FirefoxDriver();
		System.out.println("End Firefox");
		driver.manage().window().maximize();
		
		}
	}

   @Test
   public void testA() {
	   driver.get("https://www.facebook.com");
	   
   }
}
