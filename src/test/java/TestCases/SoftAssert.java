package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void test1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Execution	of	test1	started");
		Assert.assertEquals(200,201,"Check	if	it	failed");
		System.out.println("Checking first assertion");
	
		Assert.assertEquals("Java","Java",	"Check	if	it	failed");
		System.out.println("Execution of test1 ended");
	
		}
	@Test
	public	void	test2()
	{
	System.out.println("Execution	of	test2	started");
	Assert.assertEquals(200,	201,	"Check	if	it	failed");
	System.out.println("Checking	first	assertion");
	Assert.assertEquals("Java",	"Java",	"Check	if	it	failed");
	System.out.println("Execution	of	test2	ended");
}
}