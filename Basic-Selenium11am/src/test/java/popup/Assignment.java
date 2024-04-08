package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		// Enter text phone in searchBox and submit it
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Phone");
		text.submit();
		// get the path for particular phone price using ancestor and descendant
		WebElement phonePricePath = driver.findElement(By.xpath("//div[text()='realme 12+ 5G (Navigator Beige, 256 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹21,999']"));
		// print the price of the phone on console
		String phonePrice = phonePricePath.getText();
		System.out.println(phonePrice);
		Thread.sleep(5000);

		driver.quit();

	}

}
