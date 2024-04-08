package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// Launching ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Locator1:id()
		// Syntax:-AttributeName="AttributeValue"
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * Thread.sleep(1000); driver.findElement(By.id("login-button")).click();
		 * Thread.sleep(2000);
		 */
		// Locato2: name()
		// Syntax:-AttributeName="AttributeValue"
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
		 Thread.sleep(1000);
	////WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	
	
	

		driver.quit();

	}

}
