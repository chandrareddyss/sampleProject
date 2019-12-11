package Testngpractice;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	public static ThreadLocal<WebDriver> driverThread = new ThreadLocal<WebDriver>();
	
	public static void set(WebDriver driver) {
		driverThread.set(driver);
	}
	public static WebDriver get() {
		return driverThread.get();
	}
	

}
