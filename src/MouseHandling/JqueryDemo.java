package MouseHandling;

import java.awt.Dimension;
import java.text.ParsePosition;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		//launch url
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize(); 
		//taking action like drag n drop.
		Actions action = new Actions(driver);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(2000);
		WebElement elm= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(elm);
		//driver.switchTo().frame(0);
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		driver.switchTo().defaultContent();
		//Sortable
		driver.findElement(By.linkText("Sortable")).click();
		driver.switchTo().frame(0);
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 7']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 6']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 5']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 4']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 3']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[@text()='Item 2']"))).moveToElement(driver.findElement(By.xpath("//li[@text()='Item 1']"))).release().build().perform();
	}

}
