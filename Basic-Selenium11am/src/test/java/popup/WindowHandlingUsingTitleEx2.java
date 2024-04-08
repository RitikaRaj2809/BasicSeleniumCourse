package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingUsingTitleEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();

		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(2000);
		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Selenium")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Read all about it!']")).click();
		Set<String> allWin1 = driver.getWindowHandles();//win1,win2,win3
		System.out.println(allWin1.size());
		for (String s : allWin1) {
			driver.switchTo().window(s);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if (title1.contains(
					"WebDriver BiDi - The future of cross-browser automation  |  Blog  |  Chrome for Developers")) {
				break;
			}

		}

		driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[1]")).click();

		Thread.sleep(5000);
		
		
		  Set<String> allWin2 = driver.getWindowHandles(); 
		  for (String win2 : allWin2)
		  { 
		  driver.switchTo().window(win2); String title2 = driver.getTitle();
		  System.out.println(title2); 
		  if (title2.contains("Frames & windows")) 
		  { break; 
		  
		  }
		  }
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		Thread.sleep(2000);
		

		driver.quit();

	}

}
