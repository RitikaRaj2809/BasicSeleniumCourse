package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// step 1: set file path
		FileInputStream fis = new FileInputStream("./FetchTestData.xlsx");
		// step 2: Excel in read mode
		Workbook wb = WorkbookFactory.create(fis);
		// step 3:fetch the required sheet
		Sheet sheet = wb.getSheet("Page1");
		// step 4: fetch the required row
		Row row = sheet.getRow(4);
		// step 5: fetch the required call
		Cell cell = row.getCell(3);
		// step 6: fetch the data from the cell
		String value = cell.getStringCellValue();
		System.out.println(value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(value);
		Thread.sleep(2000);
		driver.quit();

	}

}
