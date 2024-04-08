package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopup {
	@Test
	public void authenticatioMethod() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth ");
		//syntax: driver.get("https://username:password@url");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth ");
		Thread.sleep(2000);
		driver.quit();
	}

}
