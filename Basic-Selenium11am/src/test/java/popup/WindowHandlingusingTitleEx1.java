package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingusingTitleEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

		driver.findElement(By.xpath("//button[text()='click']")).click();
		Set<String> allWin = driver.getWindowHandles();

		for (String win : allWin) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Selenium")) {
				break;
			}
		}

		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
