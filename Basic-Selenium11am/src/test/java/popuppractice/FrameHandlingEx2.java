package popuppractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
	
		/*
		 * driver.switchTo().frame("SingleFrame"); WebElement txt =
		 * driver.findElement(By.xpath("//input[@type='text']")); txt.sendKeys("Hello");
		 */
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
