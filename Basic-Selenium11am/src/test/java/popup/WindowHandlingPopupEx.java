package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPopupEx {
	//Go to child window and perform click action on downloads and then close child window
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(2000);
		String mainWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String s : allWin) {
			if (!mainWin.equals(s)) {
				driver.switchTo().window(s);
				driver.findElement(By.xpath("//span[text()='Downloads']")).click();
				driver.close();
				Thread.sleep(2000);
			}
		}

		driver.quit();
	}

}
