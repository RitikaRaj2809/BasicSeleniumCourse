package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowhandlingusingTitlewithNaukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Services']")).click();

		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
				break;
			}

		}
		//driver.findElement(By.xpath("//a[text()='Text Resume']")).click();
		driver.findElement(By.xpath("//a[@title='FIND JOBS']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
