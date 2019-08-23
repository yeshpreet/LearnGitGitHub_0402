package Grouping_Demo;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups= {"Sanity"})
	public void m1() {
		System.out.println("M1-Sanity 1");
	}
	@Test(groups= {"Sanity"})
	public void m2() {
		System.out.println("M2-Sanity 2");
	}
	@Test(groups= {"Sanity"})
	public void m3() {
		System.out.println("M3 Sanity 3");
	
	}
	@Test(groups= {"Regression"})
	public void m4() {
		System.out.println("M4 regression 1");
	}
	@Test(groups= {"Regression"})
	public void m5() {
		System.out.println("M5- Regression2");
	}
	@Test(groups= {"Regression"})
	public void m6() {
		System.out.println("M6 regression 3");
	}
	@Test(groups= {"Smoke"})
	public void m7() {
		System.out.println("M7 smoke1");
	
	}
	@Test(groups= {"S moke"})
	public void m8() {
		System.out.println("M8 smoke 2");
	}
}
