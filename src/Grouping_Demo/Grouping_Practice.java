package Grouping_Demo;

import org.testng.annotations.Test;

public class Grouping_Practice {
	
	@Test(groups= "Arithmatic",priority=0)
	public void Add() {
		int a= 2, b=4;
		int c= a+b;
		System.out.println("Method Add="+c);	
	}
	@Test(groups= "Arithmatic",priority=1)
	public void Mul() {
		int a= 2, b=4;
		int c= a*b;
		System.out.println("Method2 Mul="+c);	
	}
	@Test(groups= "Arithmatic",priority=2)
	public void Div() {
		int a= 2, b=4;
		int c= b/2;
		System.out.println("Method3 Div="+c);	
	}
	@Test(groups= "Alpha",priority=0)
	public void Alpha() {
		char A = 1;	
		System.out.println("Method4 Alpha="+A);	
	}
	@Test(groups= "Alpha",priority=1)
	public void Alphao() {
		char Z=10;
		System.out.println("Method5 Alphao Dec="+Z);
		}	
	@Test(groups= "Alpha",priority=2)
	public void Alpha1() {
		String h = "Hello Class";
		System.out.println("Method6 Alpha1 String="+h);	
	}
	
}
