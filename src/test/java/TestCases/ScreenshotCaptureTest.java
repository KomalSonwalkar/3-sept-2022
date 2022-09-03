package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pagess.LoginPage;
import Utility.Screenshot_Capture;

public class ScreenshotCaptureTest extends TestBase{
LoginPage login;
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		login = new LoginPage();
	}
	@Test 
	public void verifyKiteleballTest()
	{
		String expctTitle="1Login to Kite";
		String actTitle = login.verifyKitelebal();
		Assert.assertEquals(actTitle, expctTitle);
	}
	@AfterMethod
	public void exit(ITestResult z) throws Throwable 
	{
		if(ITestResult.FAILURE==z.getStatus())
		{
			Screenshot_Capture.captureScreeshotFaildTC(driver,z.getName());
		}
		driver.close();
		
}
}

