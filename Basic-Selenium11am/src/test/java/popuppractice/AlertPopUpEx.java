package popuppractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUpEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*
		 * new WebDriverWait(driver, Duration.ofSeconds(20))
		 * .until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//button[text()='Click for JS Alert']"))).click();
		 * driver.switchTo().alert().accept();
		 */

		new WebDriverWait(driver, Duration.ofSeconds(20)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']")))
				.click();

		Alert alert1 = driver.switchTo().alert();
		//alert1.dismiss();
		String txt = alert1.getText();
		System.out.println(txt);

		Thread.sleep(2000);

		driver.quit();

	}

}
