package day14;

import org.testng.annotations.Test;

public class FirstTestNg 
{
@Test(priority=1,enabled=false)
public static void firstMethod()
{
	System.out.println("First");
}
@Test(priority=2)
public static void thirdTest()
{
	System.out.println("First");
}
@Test(priority=3)
public static void secondTest()
{
	System.out.println("First");
}
@Test(priority=4)
public static void firthTest()
{
	System.out.println("First");
}
}
