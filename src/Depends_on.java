import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depends_on {
	WebDriver driver;
	
	@Test 
	public void LaunchBrowser() {
		System.getProperty("user.dir");
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	@Test(dependsOnMethods="BrowserLaunch")
	public void LaunchApp() {
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();   
		}
	@Test(dependsOnMethods="LaunchApp")
	public void   Login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
}
