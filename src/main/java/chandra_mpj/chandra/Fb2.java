package chandra_mpj.chandra;

import org.testng.annotations.Test;

public class Fb2 extends facebook{
	
	@Test
	public static void chandra() {
		driver.manage().window().maximize();
		System.out.println("fb2 class 222"+driver.getTitle());
		
	}

}
