package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	 public static String readProperty(String value) throws Exception
     {
   	Properties prop = new Properties();
      FileInputStream file = new FileInputStream("C:\\Users\\pcc\\eclipse-workspace\\FRAMEWORK\\TestData\\config.properties");
     //path of config.properties
      prop.load(file);
    return prop.getProperty(value);
     }
}
