package MouseHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DummyWebsite {
	public static WebDriver driver;
	
	public static void main (String[] args) {
		
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jaspreet/Documents/New%20Dummy%20Website/template_7/template_7/index.html");
		driver.manage().window().maximize(); 
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//h3[text()='Mouse Over Practice']")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Projects']"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Projects"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Exercise1']"))).perform();
		driver.findElement(By.xpath("//a[text()='All Exercises']")).click();
		driver.findElement(By.linkText("iFrame Handling")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("name")).sendKeys("ABC");
		driver.findElement(By.id("mail")).sendKeys("abc@gmail.com");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.id("container")).click();
		driver.switchTo().defaultContent();
	}

	
}
