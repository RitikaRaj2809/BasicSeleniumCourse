package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		WebElement dateList=driver.findElement(By.id("day"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);// to select 4th date
		//to select 2nd date
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		
		WebElement monthList=driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		WebElement yearList=driver.findElement(By.id("year"));
		yearList.click();
		
		yearList.sendKeys(Keys.ARROW_UP);
		yearList.sendKeys(Keys.ARROW_UP);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}

}
