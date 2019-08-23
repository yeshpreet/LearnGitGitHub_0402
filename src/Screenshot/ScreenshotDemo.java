package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	WebDriver driver;

	@Test
	public void Launchbrowser() throws IOException {
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",Driverpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");	

		TakesScreenshot sshot=((TakesScreenshot)driver);
		File sshotfile=sshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Jaspreet\\Pictures\\test.png");
		FileUtils.copyFile(sshotfile,destfile);
	}
}
//C:\Users\Jaspreet\Pictures
