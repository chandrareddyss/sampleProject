package chandra_mpj.chandra;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentTestInterruptedException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.utils.FileUtil;

public class Extentreports1 {
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html=new ExtentHtmlReporter("extent.html");
	
		
		ExtentReports extnet=new ExtentReports();
		extnet.attachReporter(html);
		
		ExtentTest test=extnet.createTest("google search","test");
		System.setProperty("webdriver.chrome.driver","E:\\javaexe\\chromexe1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test.log(Status.INFO, "starting testcase");
		driver.get("https:\\google.com");
		test.pass("navigated to google com");
		driver.findElement(By.name("q")).sendKeys("chandra",Keys.ENTER);
		

		ExtentTest test1=extnet.createTest("google search","test1");
		System.setProperty("webdriver.chrome.driver","E:\\javaexe\\chromexe1\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		test1.log(Status.INFO, "starting testcase");
		driver1.get("https:\\google.com");
		test.pass("navigated to google com");
		driver.findElement(By.name("q")).sendKeys("chandra",Keys.ENTER);
		test1.fail("wrong locator");
		test1.addScreenCaptureFromPath("E:\\chandra.jpg");
		
		
		
		driver.close();
		test.pass("close the browser");
		extnet.flush();
	}
	/*	public WebDriver driver;
		public ExtentHtmlReporter htmlreporter;
		public ExtentReports extent;
		public ExtentTest test;
		
		@BeforeTest
		public void setextent() {
			htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir"+"/test-output/myreport.html"));
			
			htmlreporter.config().setDocumentTitle("automationreport");//title of the report
			htmlreporter.config().setReportName("functional report");//name of the report
			htmlreporter.config().setTheme(Theme.DARK);
			
			
			extent=new ExtentReports();
			extent.attachReporter(htmlreporter);
			extent.setSystemInfo("Host Name","local Host");
			extent.setSystemInfo("Os","windows10");
			extent.setSystemInfo("Tester name","chandra");
			extent.setSystemInfo("Browser","chrome");
		}
		@AfterTest
		public void endreport() {
			extent.flush();
		}
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","E:\\javaexe\\chromexe1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.nopecommerce.com/");
		}
		@Test
		public void nocommercetitletest() {
		test=extent.createTest("nocommercetitletest");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopcommerce demo store");
		}
		@Test
		public void nocommercelogotest() {
			test=extent.createTest("nocommercelogotest");
		Boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce']")).isDisplayed();
        Assert.assertTrue(status);
		}
		@Test
		public void nocommercelogintest() {
			test=extent.createTest("nocommercelogintest");
			Assert.assertTrue(true);	
		}
		@AfterMethod
	public void teardown(ITestResult result) {
			if(result.getStatus()==ITestResult.FAILURE) {
				test.log(Status.FAIL,"test casefailed"+result.getName());
				test.log(Status.FAIL,"test casefailed"+result.getThrowable());
				//String screenshotpath=NopCommercetest.getscreenshot(driver,result.getName());
			//	test.addScreenCaptureFromPath(screenshotpath);
			}else if(result.getStatus()==ITestResult.SKIP) {
				test.log(Status.SKIP,"test case is skipped is"+result.getName());
				
			}else if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS,"test case pass"+result.getName());
			}
			
		}
		
		
		public static String getscreenshot(WebDriver driver,String screenshotname) throws IOException {
			String datename=new SimpleDateFormat("yyyymmdd").format(new Date());
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			
			String destination=System.getProperty("user.dir")+"/screenshots/"+screenshotname+datename+".png";
			File finaldestination=new File(destination);
			FileUtils.copyFile(source, finaldestination);
			return destination;
			
		}*/
	
}
