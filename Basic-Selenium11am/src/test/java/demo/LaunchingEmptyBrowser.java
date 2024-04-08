package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * case1: String key="webdriver.chrome.driver"; String
		 * value="./chromedriver.exe"; System.setProperty(key, value); WebDriver
		 * driver=new ChromeDriver(); driver.quit();
		 */

		/*
		 * //case2:selenium version-3.141.59 and webdriverManager -5.6.3
		 * WebDriverManager.chromedriver().setup(); //WebDriver driver=new
		 * ChromeDriver(); WebDriver driver=new FirefoxDriver();
		 */

		// case3: selenium version-4.17.0 and webdriverManager -5.6.3
		// WebDriverManager.chromedriver().setup(); //only if selenium 4.17.0 is not
		// suppoting then use webdriver manager
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new EdgeDriver();
		// WebDriver driver = new FirefoxDriver();
		// method1:launching application
		driver.get("https://www.facebook.com/");
		// Thread.sleep(2000);
		// method 2: fetching title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		// method3: to fetch current url of the application
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		// method4: it will print source code of the application
		String source = driver.getPageSource();
		System.out.println(source);

		driver.quit();

	}

}
