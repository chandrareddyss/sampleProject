package Testngpractice;

import org.testng.annotations.Test;

public class Class3 extends Basicinfo {
	
@Test
public static void dBC() {
	System.out.println("pa test 1");
}
@Test(priority = 1)
public static void abc() {
	System.out.println("pa test 2");
}
@Test
public static void chandra () {
	System.out.println("pa test3");
}



}
