package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("nike");
		searchBox.submit();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]")).click();
		String mainwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println("Total windows are:" + allwin.size());

		for (String win : allwin) {
			if (!mainwin.equals(win)) {
				driver.switchTo().window(win);
				driver.findElement(By.id("add-to-cart-button")).click();
			}

		}

		Thread.sleep(2000);

		driver.quit();

	}

}
