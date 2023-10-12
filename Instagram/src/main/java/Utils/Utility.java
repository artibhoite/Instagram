package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	//2- methods
//	1.to fetch data from excel sheet
//	2.to capture the screenshot
       
	public static void getDataFromExcelSheet() throws EncryptedDocumentException, IOException {
		
		String filepath = "C:\\Users\\bhoit\\OneDrive\\Desktop\\Auto data.xlsx";
		InputStream file = new FileInputStream(filepath);
		
          
		Workbook workbook = WorkbookFactory.create(file);
		
		String data = workbook.getSheet("Data").getRow(3).getCell(1).getStringCellValue();
		
		
		
	}
}
