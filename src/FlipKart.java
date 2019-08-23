import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKart {
public static WebDriver driver;
	@Test
	public void flipkart() throws InterruptedException, AWTException {
		String Driver=System.getProperty("user.dir");
		String Driverpath=Driver+"\\src\\Browser_Drivers\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",Driverpath);
		
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Women"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Sarees']"))).perform();	
//		Robot robot = new Robot(); 
//		robot.keyPress(KeyEvent.VK_ESCAPE); robot.keyRelease(KeyEvent.VK_ESCAPE);
		
	}
	
}
//https://www.flipkart.com