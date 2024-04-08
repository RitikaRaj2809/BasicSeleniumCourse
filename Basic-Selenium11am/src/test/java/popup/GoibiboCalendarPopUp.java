package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='23']" )).click();
		 String month="April 2024";
		 driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='23']" )).click();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
