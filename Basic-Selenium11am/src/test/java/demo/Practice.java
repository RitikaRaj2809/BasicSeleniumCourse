package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		browserSetup();
		alertScenario1();
		closeBrowser();
		}
	
	public static void browserSetup()  {
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	   
	}
	
	
	
	public static void alertScenario1() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='alert']"))).click();
		Thread.sleep(5000);
		Alert alert1=wait.until(ExpectedConditions.alertIsPresent());
		if(alert1!=null) {
			System.out.println("alert1 found");
			System.out.println("alert text is:"+alert1.getText());
			alert1.accept();
		}
		
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
