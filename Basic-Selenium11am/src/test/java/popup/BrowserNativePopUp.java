package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopUp {

	public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	opt.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	
	driver.quit();

	}

}
