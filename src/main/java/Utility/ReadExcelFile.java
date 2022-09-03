package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	 public static String readExcelFile(int row,int col) throws Exception
     {
   	  FileInputStream file = new FileInputStream("C:\\Users\\pcc\\eclipse-workspace\\FRAMEWORK\\TestData\\OrderPrice.xlsx");
   	//path of orderPrice excel sheet properties path
   	  Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");
   	String value = excelFile.getRow(row).getCell(col).getStringCellValue();
   	return value;
   	}

}
