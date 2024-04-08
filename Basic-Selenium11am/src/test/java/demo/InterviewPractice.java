package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewPractice {
	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys("Phone");
		searchBox.submit();
		WebElement phoneLink=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(phoneLink));
		phoneLink.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println("no. of windows are:"+allWindow.size());
		for(String s:allWindow) {
			if(!parentWindow.equals(s)) {
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
			WebElement	addToCart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			Thread.sleep(5000);
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", addToCart);
			Actions action = new Actions(driver);
			action.moveToElement(addToCart)
			      .click()
			      .build()
			      .perform();
			
			Thread.sleep(5000);
			
			//wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
			}
		}
		
		
		
		

		

		

		//Thread.sleep(5000);
		driver.quit();

	}

	/*
	 * public static void waitForElement(By locator) { new WebDriverWait(driver,
	 * Duration.ofSeconds(20))
	 * .until(ExpectedConditions.visibilityOfElementLocated(locator));
	 * 
	 * }
	 */
}
