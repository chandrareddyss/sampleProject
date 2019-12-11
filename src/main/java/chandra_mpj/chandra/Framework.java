package chandra_mpj.chandra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framework {
	public static void launch_application(String browser, String url) {
		switch (browser.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");
			Data.driver=new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drive\\firefoxdriver.exe");
			Data.driver=new FirefoxDriver();
		}
		Data.driver.get(url);
		Data.driver.manage().window().maximize();
		
	}
}