package TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pagess.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	
	@BeforeMethod(groups="sanity")
	public void setup() throws Throwable
	{
		initialization();
		login = new LoginPage();
		
	}
	//who have priority low those testCase will run 1st
	@Test(enabled=true,groups="sanity") //(enabled=false,priority=3)//(timeOut=10) //to fail the test case purpose fully
	public void verifyKiteLogoTest()
	{
		boolean actResult = login.verifyKiteLogo();
		Assert.assertEquals(actResult, true);
	}//if(priority =100 that time this testcase will run last}
	@Test (enabled=true,priority=100) //(dependsOnMethods = "verifyKiteLogoTest")//if one testcse fail then dependent test case is skipped
	public void verifyKiteleballTest()
	{
		String expctTitle="Login to Kite";
		String actTitle = login.verifyKitelebal();
		Assert.assertEquals(actTitle, expctTitle);  //use only one line 
		
//		if(expctTitle.equals(actTitle))//never used
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
		
	}
	
	@Test(enabled=true,priority=1,invocationCount=3)//(enabled =false)
	//invocationCount=3 to use to verify 1 testCase multiple time run or not.
	public void verifyZerodhaLogoTest()
	{
		boolean actTitle = login.verifyzerodhaLogo();
		Assert.assertEquals(actTitle, true);
	}
	@Test (enabled=false,timeOut=1000,priority=2)//(enabled=false))
	//timeOut keyword use to verify performance of the that test .
	public void verifyZerodhaLoginTest() throws Throwable
	{
		Thread.sleep(2000);
		login.verifyZerodhaLogin();
		
	}
	@AfterMethod(groups="sanity")
	public void exit() throws Throwable
	{
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
	
	
}
