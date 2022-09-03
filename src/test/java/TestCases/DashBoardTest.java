package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pagess.DashBoardPage;
import Pagess.LoginPage;

public class DashBoardTest extends TestBase {
	LoginPage login;
	DashBoardPage dash;
	
	@BeforeMethod//(groups= {"sanity","Regression","functional"})
	public void setup() throws Throwable
	{
		initialization();
		login = new LoginPage();
		dash = new DashBoardPage();
		login.verifyZerodhaLogin();
		
	}
	@Test(enabled=false)//(groups="sanity")       //(enabled=false)
	public void verifydashBoaedLinkTest() throws Exception
	{   
		Thread.sleep(2000);
		String value = dash.verifydashBoaedLink();
		System.out.println(value);
	}
	
	@Test (enabled=false)//(groups="sanity")//(enabled = false)
	public void verifynickNameTest() throws Throwable
	{
		Thread.sleep(2000);
		//String extResult = "222Hi, Komal45";
		String actResult = dash.verifynickName();
		Assert.assertEquals(actResult,"Hi, Komal");
	}
	
	@Test (enabled=true)//(groups="functional")//(enabled=false)
	public void verifyuserIdTest() throws Throwable
	{
		Thread.sleep(2000);
		dash.verifyuserId();
	}
	@Test(enabled=false,groups="Regression")
	public void verifylogOutLinkTest() throws Throwable
	{
		Thread.sleep(2000);
		dash.verifydashBoaedLink();
	}
	
	@AfterMethod//(groups= {"sanity","Regression","functional"})
	public void exist() throws Throwable
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
