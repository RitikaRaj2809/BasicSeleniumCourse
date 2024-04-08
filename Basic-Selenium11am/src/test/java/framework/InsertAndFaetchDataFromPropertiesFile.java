package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertAndFaetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileOutputStream fos = new FileOutputStream("./testData3.properties.txt");

		Properties pro1 = new Properties();
		pro1.setProperty("url", "https://www.facebook.com/");
		pro1.setProperty("emailaddress", "ritikaraj.28@gmail.com");
		pro1.setProperty("password", "Ritsjuicy@321");

		pro1.store(fos, "coomondata");

		System.out.println("data inserted successfully");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream fis = new FileInputStream("./testData3.properties.txt");
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
