package Testngpractice;


import org.testng.annotations.Test;

public class ParallelFIRST extends Confinguration {
	

	@Test
	public void gettitle() {
		
		String  title=Driver.get().getTitle();
		System.out.println(title);
		
		
		System.out.println("hai i am method 1");
		
	}	
	@Test
	public void msg() {
		String  title=Driver.get().getTitle();
		System.out.println(title);
		System.out.println(" this is 2 methodwhere r u");
	}
}
