package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelDataUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    FileInputStream fis=new FileInputStream("./FetchTestData.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sheet = wb.getSheet("Sheet1");
    Row row = sheet.getRow(0);
    Cell cell = row.getCell(0);
    
    DataFormatter data=new DataFormatter();
    String exceldata=data.formatCellValue(cell);
    System.out.println(exceldata);
    
	}

}
