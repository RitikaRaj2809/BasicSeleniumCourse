package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable, IOException {
		
		FileInputStream fis = new FileInputStream("./FetchTestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Page1");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		 cell.setCellValue("bluetooth");
		 
		FileOutputStream fos = new FileOutputStream("./FetchTestData.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
	}

}
