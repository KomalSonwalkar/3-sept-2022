package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsTest {
	
	@AfterSuite
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterClass //7
	public void test2()
	{
		System.out.println("test2");	
	}
	@AfterMethod
	public void test3()//6
	{
		System.out.println("test3");
	}
	@AfterTest//8
	public void test4()
	{
		System.out.println("test4");	
	}
	@Test
	public void test5() //5
	{
		System.out.println("test5");
	}
	@BeforeSuite   //1
	public void test6()
	{
		System.out.println("test6");
	}
	@BeforeClass//3
	public void test7()
	{
		System.out.println("test7");
	}
	@BeforeMethod//4
	public void test8()
	{
		System.out.println("test8");
	}
	@BeforeTest()//2
	public void test9()
	{
		System.out.println("test9");
	}
	
	
	
	
	
	
	

}
