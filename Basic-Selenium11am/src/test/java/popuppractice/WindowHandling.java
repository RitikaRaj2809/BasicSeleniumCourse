package popuppractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Go to child window and perform click action on downloads
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
	    driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	    String mainWin = driver.getWindowHandle();
	    Set<String> allWin = driver.getWindowHandles();
	    System.out.println("No. of windows are:"+allWin.size());
	    for(String win:allWin) {
	    	if(!mainWin.equals(win)) {
	    		driver.switchTo().window(win);
	    		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	    		driver.close();
	    	}
	    	
	    }
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
