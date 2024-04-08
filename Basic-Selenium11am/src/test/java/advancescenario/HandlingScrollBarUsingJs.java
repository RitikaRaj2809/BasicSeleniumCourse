package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));

		// Approach -1: first get x,y coordinate of element and then put it in js 

		
		/*
		 * Point loc = ele.getLocation(); System.out.println(loc.getX());
		 * System.out.println(loc.getY()); JavascriptExecutor jse = (JavascriptExecutor)
		 * driver; jse.executeScript("window.scrollBy(1045,786)"); ele.click();
		 */
		  
		  // Approach - 2 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView()", ele); ele.click();
		  Thread.sleep(5000);
		 
		
		//Approach-3--> if we want to scroll down or scroll up completely
		
		/*
		 * JavascriptExecutor jss=(JavascriptExecutor) driver; Thread.sleep(2000);
		 * jss.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * 
		 * Thread.sleep(2000);
		 * jss.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 * Thread.sleep(2000);
		 */
       
		driver.quit();

	}

}
