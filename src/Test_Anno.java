import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Test_Anno {
  @Test
  public void browser() {
	  System.out.println("method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @AfterMethod
  public void aftermethod() {
	  System.out.println("After method");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("After method");
  }
  
  
}
