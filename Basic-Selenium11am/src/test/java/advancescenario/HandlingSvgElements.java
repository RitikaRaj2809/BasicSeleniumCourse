package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSvgElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/ ");
		driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
