package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		//date dropdown
		driver.findElement(By.xpath("//option[text()='9']")).click();
		Thread.sleep(2000);
		//month dropdown
		driver.findElement(By.xpath("//option[text()='May']")).click();
		Thread.sleep(2000);
		//Year dropdown
		driver.findElement(By.xpath("//option[@value='2007']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
