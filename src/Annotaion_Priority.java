import org.testng.annotations.Test;

public class Annotaion_Priority {
	
	@Test(priority=1)
	 public void m1() {
		System.out.println("priority 1");
	}
	@Test(priority=2)
	 public void m2() {
		System.out.println("priority 2");
	}
	@Test
	 public void m3() {// if no priority is set then it is considered as priority 0.
		System.out.println("priority 0");
	}
	@Test(priority=0)
	 public void m4() {
		System.out.println("no priority");
	}
	
}
 