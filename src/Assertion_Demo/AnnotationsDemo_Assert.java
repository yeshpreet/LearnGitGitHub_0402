package Assertion_Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsDemo_Assert {
	public static WebDriver driver;
	
	//@Test(priority=0)
	public void Welcome() {
		//System.out.println("Welcome to TestNG");
	}
	
	@Test(priority=0)
	public void LaunchBrowser() {
		System.getProperty("user.dir");
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	
	@Test(priority=1)
	public void LaunchApp() {	 
		//System.out.println("Launch App");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		}
	@Test(priority=2)
	public void Url() {
		//System.out.println("Assertion Method");
		String expurl="https://opensource-demo.orangehrmlive.com/" ;
		String acturl=driver.getCurrentUrl();
		
		//Assert.assertEquals(acturl, expurl);
//		
		//Assert.assertTrue(true, "acturl");
		//Assert.assertTrue(true, "expurl");
		//Assert.assertTrue(false, acturl);
		//Assert.assertTrue(false, expurl);
		//Assert.assertFalse(true, "");
		Assert.assertTrue(expurl.equals(acturl), "Pass");
		//Assert.assertFalse(false,acturl );
//		Assert.assertFalse(false, expurl);
//		Assert.assertFalse(true, acturl);
		
			}
}

