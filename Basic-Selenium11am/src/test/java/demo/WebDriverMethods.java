package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// WebDriverManager.chromedriver().setup(); //This step not required as using
		// selenium 4
		// Launching empty Browser
		WebDriver driver = new ChromeDriver();

		// method1-> Launching Application
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		// Method 2-> getTitle---> fetches the title of the webpage
		String ele = driver.getTitle();
		System.out.println(ele);

		// Method 3->getCurrentUrl--->fetrches URL of webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// Method 4-> getPageSource--->fetches sourcecode of the webpage
		String source = driver.getPageSource();
		System.out.println(source);

		/*
		 * Options opt=driver.manage(); Window win=opt.window(); win.maximize();
		 */

		// or
		// Method 5->manage--->for maximize,minimize or fullscreen
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		// Method 6-> close the  single tab/window where driver is currently in focus
		driver.close();
		// Method 7-> closes all tabs and windows including browser.
		driver.quit();

	}

}
