package Testngpractice;

import org.testng.annotations.Test;

public class Class4 extends Basicinfo {
	
    @Test(groups = "smoke1")
	public static void g1() {
		System.out.println("smoke testing g1");
	}
    @Test(priority = -1,groups= {"smoke1","regression1"})
	public static void g2() {
		System.out.println("both execute g2");
	}
    @Test(groups= "regression1")
    public static void g3() {
    	System.out.println("execute g3");
    }
    @Test
    public static void g4() {
    	System.out.println("execute g4");
    }
	/*
	 * @Test(dependsOnGroups="smoke1") public static void g5() {
	 * System.out.println("execute g5"); }
	 * 
	 * @Test(dependsOnMethods="g3") public static void g6() {
	 * System.out.println("execute g6"); }
	 */
    
}
