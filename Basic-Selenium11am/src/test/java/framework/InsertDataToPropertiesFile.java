package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		//to insert data in empty notepad or properties file
		Properties pro = new Properties();
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		pro.setProperty("url", "https://www.saucedemo.com/");
		
		FileOutputStream fos = new FileOutputStream("./TestData2.properties.txt");
		pro.store(fos, "commondata");
		System.out.println("data written successfully");
		
		//Now to fetch same data inserted from the notepad
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("./TestData2.properties.txt");
		
		Properties pro1 = new Properties();
		pro1.load(fis);
		
		String URL=pro1.getProperty("url");
		String USERNAME=pro1.getProperty("username");
		String PASSWORD=pro1.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
		driver.quit();
		
		

	}

}
