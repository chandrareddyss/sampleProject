package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data {
	
	public static WebDriver driver=null;
	public static final String url="https://www.flipkart.com/";
	public static final By close_button=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	public static final By serach_Box=By.xpath("//input[@name='q']");
	public static final By iphone64=By.xpath("//div[text()='Apple iPhone XR (Coral, 64 GB)']");
	
	

}
