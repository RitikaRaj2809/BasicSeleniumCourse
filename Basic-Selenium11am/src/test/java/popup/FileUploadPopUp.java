package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//input[@id='file-upload']"));
		txt.sendKeys("C:\\Users\\ritik\\OneDrive\\Documents\\Week1_Assessment.docx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
