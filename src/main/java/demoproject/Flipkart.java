package demoproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Flipkart {
	
	@Test
	public static void test() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\javaexe\\chromeexe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(Data.url);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(Data.close_button).click();
	driver.findElement(Data.serach_Box).sendKeys("iphone xr 64gb coral",Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(Data.iphone64).click();	
 Set<String>si=driver.getWindowHandles();
	   Thread.sleep(4000);
	   Iterator<String> iter=si.iterator();
	   Thread.sleep(5000);
	   String main=iter.next();
	   String child=iter.next();
	   Thread.sleep(5000);
	   driver.switchTo().window(child);
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println("child window");
	driver.close();
	driver.switchTo().window(main);
	String title1=driver.getTitle();
	System.out.println(title1);
	System.out.println("main window");
	driver.close();
	

}
}
