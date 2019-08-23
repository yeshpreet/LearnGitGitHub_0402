import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestRough {
WebDriver driver;

	@Test
	public void m1() {
		System.out.println("Start Chrome");
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",Driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("End Chrome");
				
	}
@Test(priority=1)
public void m2() {
	System.out.println("Start Firefox");
	String Driver=System.getProperty("user.dir");
	String Driverpath=Driver+"\\src\\Browser_Drivers\\geckodriver.exe" ;
	System.setProperty("webdriver.gecko.driver",Driverpath);
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	System.out.println("End Firefox");
}

}
