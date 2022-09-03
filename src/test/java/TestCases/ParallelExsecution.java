package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExsecution {
	
	@Test
	public void FbOpen()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
    @Test
    public void RediffOpen()
    {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.close();
    }
    @Test
    public void OpenGoggle()
    {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.close();
    }
    
    @Test
    public void OpenZerodha()
    {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zerodha.com/");
		driver.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
