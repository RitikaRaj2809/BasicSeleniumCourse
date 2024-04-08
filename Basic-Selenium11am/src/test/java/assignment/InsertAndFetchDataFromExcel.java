package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class InsertAndFetchDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./FetchTestData.xlsx");
		Workbook wb =new XSSFWorkbookFactory().create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("9876543210");
		
		FileOutputStream fos=new FileOutputStream("./FetchTestData.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
		

	}

}
