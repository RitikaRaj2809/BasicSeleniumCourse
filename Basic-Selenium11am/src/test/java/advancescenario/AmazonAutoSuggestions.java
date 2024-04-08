package advancescenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonAutoSuggestions {

	@Test
	public void amazonAutoSuggestion() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Puma");
		Thread.sleep(2000);
		List<WebElement> allList=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		 System.out.println(allList.size());
		for (WebElement ele : allList) {
			Thread.sleep(2000);
			String text = ele.getText();
			System.out.println(text);
			if(text.contains("puma slippers for men")) {
				ele.click();
				break;
			}
		}

		driver.quit();
	}

}
