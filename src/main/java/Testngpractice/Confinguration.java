package Testngpractice;

import org.ghost4j.GhostscriptLibrary.stderr_fn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Confinguration {

	@Parameters({"url","browser"})
	@BeforeMethod
	public void url(@Optional String url,@Optional String browser) throws InterruptedException {
		url = (url==null)?"https://gmail.com":url;
		browser = (browser==null)?"ie":browser;
		switch (browser.toLowerCase()) {
		case "ie":
			System.setProperty("webdriver.ie.driver","drive//IEDriverServer.exe");
			Driver.set(new InternetExplorerDriver());
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver","drive//chromedriver.exe");
			Driver.set(new ChromeDriver());
			break;
		case "firfox":
			System.setProperty("webdriver.gecko.driver","drive//geckodriver.exe");
			Driver.set(new FirefoxDriver());	
			break;
		default:
			System.out.println("slect vlaid browser");
			
		}
		/*if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","ch//chromedirver.exe");
			driver =new ChromeDriver();
		
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drive//IEDriverServer.exe");
			driver =new InternetExplorerDriver();	
		}*/
		Driver.get().manage().window().maximize();
		Thread.sleep(5000);
		Driver.get().get(url);
		
		
	}	
	
	@AfterMethod(alwaysRun = true)
	public void close() {
		
		Driver.get().close();
		System.out.println("close browser");	
	}
	
}
