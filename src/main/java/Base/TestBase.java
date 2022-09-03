package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.ReadExcelFile;
import Utility.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
	
	public void initialization() throws Exception
	{
		if(ReadPropertyFile.readProperty("browser").equals("chrome")) //multiple browser used
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(ReadPropertyFile.readProperty("browser").equals("fireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (ReadPropertyFile.readProperty("browser").equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		//driver.get("https://kite.zerodha.com/");
		//driver.get(readProperty("url"));
		driver.get(ReadExcelFile.readExcelFile(0, 0));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		}
     
      
      
     
     
}
//this is the testbase class