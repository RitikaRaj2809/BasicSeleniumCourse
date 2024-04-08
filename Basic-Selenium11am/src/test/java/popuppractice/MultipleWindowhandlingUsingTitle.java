package popuppractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowhandlingUsingTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(2000);
		//String mainwin = driver.getWindowHandle();
		Set<String> allWin=driver.getWindowHandles();
		System.out.println("No. of windows are:"+allWin.size());
		for(String win:allWin) {
			driver.switchTo().window(win);
			String winTitle = driver.getTitle();
			System.out.println(winTitle);
			if(winTitle.contains("Selenium")) {
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()='Read all about it!']")).click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String s:allWindow) {
			driver.switchTo().window(s);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("WebDriver BiDi ")) {
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Get inspired')]")).click();
		
		
		//switch back to main window
		
		  Set<String> allWin2=driver.getWindowHandles();
		  System.out.println("No. of windows are:"+allWin2.size()); for(String
		  s1:allWin2) { driver.switchTo().window(s1); String windowtitle =
		  driver.getTitle(); System.out.println(windowtitle);
		  if(windowtitle.contains("Frames & windows")) { break; } }
		  driver.findElement(By.xpath("//a[text()='Home']")).click();
		 
		
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
