package democom.automatio.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManagerSetup {
	public static WebDriver driver = null;

	public static void setUp(String url) throws InterruptedException {
		String baseUrl = url;
		// initialize webdriver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Launch the application
		driver.get(baseUrl);
		System.out.println("Application is launched in chrombrowser"+baseUrl);

		Thread.sleep(2000);

	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
