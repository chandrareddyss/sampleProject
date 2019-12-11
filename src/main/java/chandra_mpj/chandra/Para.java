package chandra_mpj.chandra;


import org.testng.annotations.Test;

public class Para extends Basicstestng  {
	/*
	 * WebDriver driver;
	 * 
	 * @Test(priority=0)
	 * 
	 * public void lunch() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * System.getProperty("user.dir")+"\\drive\\chromedriver.exe"); driver=new
	 * ChromeDriver(); driver.get("http://www.gmail.com"); Thread.sleep(5000); }
	 */

	@Test(priority = -1)
	public static void test1() {
		System.out.println("test 1 is running");
	}

	@Test(dependsOnMethods = "test3")
	public static void test2() {
		System.out.println("test2  running");
		
	}

	@Test(description = "this is test case 3")
	public static void test3() {
		System.out.println("test3 is running");
	}
	
	@Test(invocationCount = 2)
	public static void repeat() {
		System.out.println("hi how are you");
	}

	@Test(invocationTimeOut = 3000)
	public static void repeat1() {
		System.out.println("hi how are you");
	}

	
	
	
	

	/*
	 * @DataProvider(name = "data-provider") public Object[][] dataProviderMethod()
	 * { return new Object[][] { { "data one" }, { "data two" } }; }
	 * 
	 * @Test(description = "hai")
	 * 
	 * public void testMethod() { System.out.println("hello"); }
	 */
}
