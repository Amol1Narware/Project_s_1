package UTLITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utlity {
	
	
	
	public static String getDataFromExcel(int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream Myfile= new FileInputStream("D:\\AT Notes\\selenum_excel_read.xlsx");
	    Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet5");
	    String value = mysheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		}
	
	public static void getScrreenshot(WebDriver driver, int TCID) throws IOException {
		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Screenshots\\KiteTest"+TCID+".jpg");
		org.openqa.selenium.io.FileHandler.copy(sourse, dest);
		
		
		
	}

}
