package chandra_mpj.chandra;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Gmail1 {

	@Test
	public void gamil1() throws InterruptedException, FindFailed, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\javaexe\\chromexe1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chandra12019", Keys.ENTER);
		// driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("8639872324", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Actions a = new Actions(driver);
		// driver.findElement(By.xpath("//textarea[@name='to']"))
		a.sendKeys("narendraprgp@gamil.com", Keys.TAB).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys("praceticetest1").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.TAB).build().perform();
	//driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		Screen s = new Screen();
		//s.find("E:\\javaexe\\Capture.PNG");
		/*Pattern p=new Pattern("E://javaexe//Capture.PNG");
		s.doubleClick(p);
		s.click("E://javaexe//Capture.PNG");*/
	s.type("r",Key.WIN);
	Thread.sleep(5000);
	s.type(Key.SPACE);
	Thread.sleep(3000);
	s.type("D:\\");
	s.type(Key.ENTER);
	Thread.sleep(3000);
    s.type(Key.LEFT,KeyModifier.WIN);
    Thread.sleep(3000);
    //Pattern p=new Pattern("E:\\javaexe\\Capture.PNG");
   // Pattern p1=new Pattern("E:\\javaexe\\Capture1.PNG");
    //s.dragDrop(p,p1);
    //Thread.sleep(5000);
   // s.type(Key.PAGE_DOWN);
    //Pattern p=new Pattern("D:\\Capture.PNG");
    s.dragDrop("E:\\javaexe\\Capture.PNG","E:\\javaexe\\Capture1.PNG");
	// Pattern p=new Pattern("E:\\javaexe\\Capture2.PNG");
	//p.setFilename("E:\\javaexe\\Capture.PNG");
/*	Thread.sleep(2000);
  Pattern p=new Pattern("E:\\javaexe\\Capture2.PNG");
  s.type(p,"E:\\javaexe\\Capture.PNG");
  
	//a.sendKeys("E:\\javaexe\\Capture.PNG").build().perform();
	//s.find("E:\\javaexe\\Capture.PNG");
  
	//a.sendKeys("E:\\javaexe\\Capture.PNG").click();
		//Pattern p=new Pattern("E:\\javaexe\\Capture.PNG");*/
	}
}
	
