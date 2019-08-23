package DataProvider_Demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_XL_Sheet {
	public static WebDriver driver;
	
	@BeforeMethod
	public void aBrowserLaunch() {
	System.getProperty("user.dir");
	String driverPath=System.getProperty("user.dir")+"\\src\\Browser_Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.manage().window().maximize();   
	}


	@DataProvider
	public Object[][] readdata() {
	Object[][] arr=null;
	//System.out.println("Start");
	String filepath=System.getProperty("user.dir")+"\\src\\TestData\\TestData.xlsx";	
		System.out.println(filepath);
		//System.out.println("End");
		return arr;
	}
	
	@DataProvider(name="Acess")
	@Test
	public String[][] Acess() throws IOException, InterruptedException {
	String wbpath=System.getProperty("user.dir")+"\\src\\TestData\\TestData.xlsx";
	File file=new File(wbpath);
	FileInputStream fis= new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	// read rows
	int  rowsCount = sheet.getLastRowNum();//3
	System.out.println(rowsCount);
//	int rowcount= sheet.getFirstRowNum();
//	System.out.println(rowcount);
	//get columns
	XSSFRow row=sheet.getRow(0);
	int colcount=row.getLastCellNum();
	System.out.println(colcount);// 2
	String[][] arr=new String[rowsCount][colcount];
		for(int i=1; i<=rowsCount;i++) {
			for( int j=0;j<colcount; j++) {
				arr[i-1][j]=row.getSheet().getRow(i).getCell(j).getStringCellValue();
				System.out.println(arr[i-1][j]);				
			}
		}
		return arr;
	}
	
	
	@Test(dataProvider="Acess") 
	public void Login(String uname, String pwd) throws InterruptedException {
		System.out.println("driver="+driver);
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		 
	}
//	@BeforeMethod
//	public void clearaFields() {
//		driver.findElement(By.id("txtUsername")).clear();
//		driver.findElement(By.id("txtPassword")).clear();
//		 
//	}
}
 