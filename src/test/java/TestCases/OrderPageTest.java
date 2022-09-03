package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pagess.LoginPage;
import Pagess.OrderPage;

public class OrderPageTest extends TestBase{
    LoginPage login;
    OrderPage order;
    
    @BeforeMethod
    public void setup() throws Throwable
    {
    	initialization();
    	login = new LoginPage();
    	order= new OrderPage();
    	login.verifyZerodhaLogin();
    }
    @Test(enabled=true)
    public void verifyOrderLink() throws Throwable
    {
    	order.verifyOrederLink();
    }
	
	@Test
	public void verifyOrderPlace() throws Throwable
	{
		order.verifyOrederLink();
		Thread.sleep(2000);
		order.verifyOrderPlace();
	}
	@AfterMethod
	public void exist() throws Throwable {
		Thread.sleep(2000);
		driver.close();
	}
}
