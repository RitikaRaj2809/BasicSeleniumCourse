package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		// switch to top frame
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		// switch to left frame

		WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftFrame); // Go inside left frame and perform the operation

		String text = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(text);
		Thread.sleep(2000);

		// switch to Middle frame
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		String txt = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(txt);

		// switch to bottom frame from middle frame(of top frame)
		// directly when we need to switch from middle to bottom frame
		// first switch to grand parent/main frame
		// using->driver.switchto().defaultcontent();
		// then switch to bottom frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		String textOnBottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(textOnBottomFrame);

		// switch to Right Frame from bottom frame
		// First switch to main frame/grandparent
		// then switch to top frame and then to the right frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topFrame);

		WebElement rightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(rightFrame);
		String text1 = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(text1);
		Thread.sleep(2000);

		driver.quit();
	}

}
