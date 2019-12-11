package chandra_mpj.chandra;

import org.testng.annotations.Test;

public class Compamy extends Basicstestng {
	
	@Test(groups= {"smoke"})
	public void oracle() {
		System.out.println("company");
	}
	@Test
	public void technip()
	{
		System.out.println("techical");
	}
  @Test(groups= {"regression"})
  public void testing() {
	  System.out.println("testing");
  }
}
