package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		// Dynamic Xpath
		// driver.findElement(By.xpath("//div[text()='March
		// 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']")).click();
		
		//if u want to change month and date than mention it as variable and add to path
		String month = "April 2024";
		String date = "10";
		driver.findElement(By.xpath("//div[text()='" + month+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + date + "']")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
