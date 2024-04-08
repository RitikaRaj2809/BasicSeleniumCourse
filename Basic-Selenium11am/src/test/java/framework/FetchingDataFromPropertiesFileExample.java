package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFileExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// String chromeDriverpath="";
		// Syste.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream fis = new FileInputStream("C:\\Users\\ritik\\Downloads\\testData3.properties.txt");

		Properties pro = new Properties();
		pro.load(fis);

		String URL = pro.getProperty("url");
		String EMAIL = pro.getProperty("emailaddress");
		String PASSWORD = pro.getProperty("password");

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);

		driver.quit();

	}

}
