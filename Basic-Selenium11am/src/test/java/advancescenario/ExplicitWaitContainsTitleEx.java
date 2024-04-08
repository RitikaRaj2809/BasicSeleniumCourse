package advancescenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitContainsTitleEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		//to go to next page, we can give title of that page in Expected conditions and 
		//perform required action
		//using Explicit wait---> polling time is 0.5 sec(fixed)
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		 * driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritika")
		 * ;
		 */
		
		//using Fluent wait--->we can customize polling time
		FluentWait wait =new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ritika");
		//Thread.sleep(2000);
		driver.quit();
		
		

	}

}
