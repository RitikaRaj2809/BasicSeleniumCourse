package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		List<WebElement> phoneNameList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> phonePriceList = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));

		int count = 0;
		//Method 1:
		for (int i = 0; i < phoneNameList.size(); i++) {
			System.out.println("phone names are:" + phoneNameList.get(i).getText() + "phone price is: "
					+ phonePriceList.get(i).getText());
			count++;
		}
		//Method 2:
		/*
		 * for (WebElement ele : phoneNameList) { System.out.println("Phone name is:" +
		 * ele.getText() + "Phone price is:" + phonePriceList.get(count).getText());
		 * count++; }
		 */
		System.out.println("Total count of phone on particular page is:" + count);
		driver.quit();
	}

}
