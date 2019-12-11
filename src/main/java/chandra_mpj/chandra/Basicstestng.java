package chandra_mpj.chandra;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Basicstestng {
	
	@BeforeSuite
	public static void beforesuite() {
		System.out.println("before suite");
	}
	@BeforeTest
	public static void beforetest() {
	System.out.println("before test");		
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public static void beforemehod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	public static void aftermethod() {
		System.out.println("after method");
	}
	@AfterTest
	public static void aftertest() {
		System.out.println("after test");
	}
	@org.testng.annotations.AfterClass
	public static void afterclass() {
		System.out.println("after class");
	}
	@AfterSuite
	public static void aftersuite() {
		System.out.println("after suite");
}
}
