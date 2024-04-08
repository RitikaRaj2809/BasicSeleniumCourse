package advancescenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsEx {
	
	@Test
   public void waitMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		
		  WebElement loginBttn = driver.findElement(By.id("login-button")); 
			/*
			 * //Explicit wait new WebDriverWait(driver, Duration.ofSeconds(10))
			 * //.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
			 * //.until(ExpectedConditions.attributeContains(loginBttn, "id",
			 * "login-button")); // loginBttn.click();
			 */
		  
		   
		   
		   
		 

		// loginBttn.click();
		/*
		 * WebElement loginBttn = driver.findElement(By.id("login-button")); FluentWait
		 * wait = new FluentWait(driver); wait.pollingEvery(Duration.ofSeconds(2));
		 * wait.withTimeout(Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(loginBttn));
		 * loginBttn.click(); 
		 * 
		 */
		   
		   driver.quit();

	}

}
