import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.*;

public class All_Annotations {
	@BeforeSuite
public static void suite()
{
		System.out.println("before suite");
}
@AfterSuite
public static void qwe()
{
	System.out.println("AfterSuite");
}

@BeforeTest
public static void test()
{
	System.out.println("before test");
}
@BeforeClass
public static void asd()
{
	System.out.println("before class");
}
@Test(priority=1)
public static void ght()
{
	System.out.println("Test1");
}
@Test(priority=2)
public static void gasd()
{
	System.out.println("Test2");
}
}
