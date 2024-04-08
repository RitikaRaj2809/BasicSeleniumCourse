package advancescenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(5000);
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));

		for (WebElement ele : allList) {
			Thread.sleep(2000);
			String value = ele.getText();
			System.out.println(value);
			Thread.sleep(2000);
			if (value.contains("nike sneakers")) {
				ele.click();
				break;
			}
			Thread.sleep(5000);

		}
		

		driver.quit();

	}

}
