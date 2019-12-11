package Data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonmethods {
	
	public static void launch_application(String browser,String url) {
		switch (browser.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"Drivers\\chromedriver.exe");
			flipkartData.driver=new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"Drivers\\geckodriver.exe");
			flipkartData.driver=new FirefoxDriver();
			break;
			
		}
		flipkartData.driver.get(url);
		flipkartData.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		flipkartData.driver.manage().window().maximize();
		
	}
	
	
	public static void enter_Value_Into_textbox(By by,String textbox_Vallue) {
		WebElement e = flipkartData.driver.findElement(by);
		e.clear();
		e.sendKeys(textbox_Vallue);
		
	}

}
