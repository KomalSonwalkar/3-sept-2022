package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Capture {
	 public static String captureScreeshotFaildTC(WebDriver driver,String methodName) throws Exception
     {
   	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	File  destination = new File("C:\\Users\\pcc\\eclipse-workspace\\FRAMEWORK\\ScreenshotCapture/methodName.png");
   	FileHandler.copy(source, destination);
   	return methodName;
   
     }


}
