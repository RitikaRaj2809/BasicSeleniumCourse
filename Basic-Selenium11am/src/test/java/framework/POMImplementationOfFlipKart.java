package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomorobjectrepo.FlipKartPage;

public class POMImplementationOfFlipKart {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("./flipkart.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");
		driver.get(URL);
		
		
		FlipKartPage page=new FlipKartPage(driver);
		page.passValue("bluetooth");
		page.handleMultipleElements(driver);
		
		
		
		Thread.sleep(2000);
	

	}

}
