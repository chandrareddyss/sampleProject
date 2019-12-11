package Testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Basicinfo {
	
	@BeforeSuite
	public static void c1() {
	System.out.println("execute before suite1");	
	}
	@BeforeTest
	public static void c2() {
		System.out.println("execute before test");
	}
	@BeforeClass
	public static void c3() {
		System.out.println("execute before class");
	}
	@BeforeMethod
	public static void c5() {
		System.out.println("execute before method");
	}
	@AfterMethod
	public static void c6() {
		System.out.println("execute AFTER method");
	}
	@org.testng.annotations.AfterClass
	public static void c7() {
		System.out.println("execute after class");
	}
	@AfterTest
	public static void c8() {
		System.out.println("execute after test");
	}
	@AfterSuite
	public static void c9() {
		System.out.println("execute after suite");
	}
}
