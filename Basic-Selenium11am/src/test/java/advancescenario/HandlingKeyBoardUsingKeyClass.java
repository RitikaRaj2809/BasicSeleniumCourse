package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeyClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Normal approach->we cannot perform more than one action like sendkeys and enter
		//so we use keyboard actions
		/*
		 * driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click(); Thread.sleep(1000);
		 */
		//case1
		/*
		 * driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 * WebElement PASSWORD=driver.findElement(By.name("password"));
		 * PASSWORD.sendKeys("secret_sauce",Keys.ENTER);
		 */
		 
		  //case 2:
			/*
			 * driver.findElement(By.name("user-name")).sendKeys("standard_user");
			 * WebElement PASSWORD=driver.findElement(By.name("password"));
			 * PASSWORD.sendKeys("secret_sauce",Keys.ENTER);
			 * 
			 */
		  
		  //case3:we will make all actions like to go to password field,then type password
		//and then enter will be performed with the help of keys
		  driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		 
		  
		  Thread.sleep(5000);
		  driver.quit();
	}

}
