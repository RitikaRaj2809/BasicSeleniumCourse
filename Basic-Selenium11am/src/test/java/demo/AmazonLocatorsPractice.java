package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import democom.automatio.common.BrowserManagerSetup;

public class AmazonLocatorsPractice {
	protected static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.amazon.in/";
		BrowserManagerSetup.setUp(url);
		driver=BrowserManagerSetup.driver;
		verifyLocatorsUse();
		BrowserManagerSetup.closeBrowser();
	}
		
		private static void verifyLocatorsUse() throws InterruptedException {
		
		 //Locator:using name
		  //driver.findElement(By.name("field-keywords")).sendKeys("Puma");
		  //Locator:using id
		  //driver.findElement(By.id("nav-search-submit-button")).click(); //Locator 4:
		  //By using linkText //driver.findElement(By.linkText("Amazon miniTV")).click();
		  //driver.findElement(By.linkText("Today's Deals")).click();
		  //Locator:partilaLinkText
		  //driver.findElement(By.partialLinkText("Today's ")).click();
		 
		
		//Locator 5: cssSelector
		//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("iphone");
		//driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("Bluetooth");
		
		//xpath by multiple locators
		  //driver.findElement(By.xpath("//a[@class='nav-a  ' and text()='Amazon miniTV']")).click();
		//Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()=\"Today's Deals\" or tabindex=\"0\"]")).click();
		Thread.sleep(5000);
		//driver.quit();
		}

	}

	


