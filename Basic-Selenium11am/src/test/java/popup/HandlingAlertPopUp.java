package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Thread.sleep(5000);
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Alert alert = driver.switchTo().alert(); Thread.sleep(2000);
		 * alert.accept(); Thread.sleep(2000);
		 */

		// driver.findElement(By.xpath("//button[text()='Click for JS
		// Confirm']")).click();
		/*
		 * Alert alert1=driver.switchTo().alert(); Thread.sleep(2000); alert1.dismiss();
		 * Thread.sleep(2000);
		 */
		/*
		 * String txt=alert1.getText(); System.out.println(txt);
		 */

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("Qspiders");
		Thread.sleep(5000);
		alt.accept();

		driver.quit();

	}

}
