package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html ");

		// Approach 1: since it is 2nd frame so we give index value as 1

		/*
		 * driver.switchTo().frame(1);
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");
		 * driver.quit();
		 */

		// Approach 2: using id or name

		/*
		 * driver.switchTo().frame("SingleFrame");
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		 * Thread.sleep(2000); driver.quit();
		 */

		// Approach 3: using webelement
		WebElement txt = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(txt);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
		Thread.sleep(2000);
		driver.quit();

	}

}
