package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		// Method 1:select by index
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		/*
		 * Select select =new Select(dateList); Thread.sleep(2000);
		 * select.selectByIndex(14); Thread.sleep(2000);
		 */

		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		/*
		 * Select select1=new Select(monthList); select.selectByIndex(5);
		 * Thread.sleep(2000);
		 */

		WebElement yearList = driver.findElement(By.id("year"));
		yearList.click();
		/*
		 * Select select2=new Select(yearList); select2.selectByIndex(4);
		 * Thread.sleep(5000);
		 */

		// Method 2,3:select by value and select by visible text
		Select sel = new Select(dateList);
		//sel.selectByValue("15");
		sel.selectByVisibleText("28");
		Thread.sleep(5000);

		Select sel1 = new Select(monthList);
		sel1.selectByVisibleText("Sep");
		Thread.sleep(2000);

		Select sel2 = new Select(yearList);
		sel2.selectByVisibleText("2015");
		Thread.sleep(2000);
		driver.quit();

	}

}
