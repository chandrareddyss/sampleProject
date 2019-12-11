package chandra_mpj.chandra;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class facebook {
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public static void lunchapplication(@Optional String browser) {
		
		/*
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "\\drive\\chromedriver.exe"); driver=new ChromeDriver();
		 * driver.get("http://fb.com"); System.out.println("lunch1");
		 */
		browser =(browser==null)?"chrome":browser;
		
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://fb.com");
			System.out.println("lunch1");
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drive\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://fb.com");
			System.out.println("lunch1");
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drive\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://fb.com");
			System.out.println("Internet Exploerer");
			break;
			
		}
	}
	
	@AfterMethod
	public static void closeapplication() {
		driver.close();
		//driver.quit();	
	}

}
