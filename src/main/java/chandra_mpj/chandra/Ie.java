package chandra_mpj.chandra;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Ie {
	
	@Test
	public static void internetexplorer() {
		System.setProperty("webdriver.ie.driver", "E:\\javaexe\\ie\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions(capabilities);
        internetExplorerOptions.ignoreZoomSettings();
        internetExplorerOptions.introduceFlakinessByIgnoringSecurityDomains();
        internetExplorerOptions.requireWindowFocus();
        
		WebDriver driver = new InternetExplorerDriver(internetExplorerOptions);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		Actions a=new Actions(driver).sendKeys(Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("Chandra");
	}

}
