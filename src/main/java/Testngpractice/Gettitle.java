package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gettitle extends Lunchapplication {
	

	@Test
	public void gettitle() {
		
		String  title=driver.getTitle();
		System.out.println(title);
		
		
		System.out.println("hai i am method 1");
		
	}	
	@Test
	public void msg() {
		String  title=driver.getTitle();
		System.out.println(title);
		System.out.println(" this is 2 methodwhere r u");
	}
}
