package advancescenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		/*
		 * String path="D:\\workspace_A3\\Basic-Selenium11am\\chromedriver";
		 * System.setProperty("webdriver.chrome.driver", path);
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.quit();

	}

}
