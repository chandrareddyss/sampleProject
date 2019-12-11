package chandra_mpj.chandra;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Maximize extends facebook {
	
	@Test
    public static void max()  {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        System.out.println("maximizeapp1111");
	}
	


}
