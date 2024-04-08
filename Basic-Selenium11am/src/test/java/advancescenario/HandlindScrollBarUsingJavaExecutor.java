package advancescenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlindScrollBarUsingJavaExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// i want to scroll bar 3 times down
		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
		}

		// to scroll up for 3 times
		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");
		}
		driver.quit();

	}

}
