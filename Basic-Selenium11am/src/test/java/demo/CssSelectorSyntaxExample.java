package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import democom.automatio.common.BrowserManagerSetup;

public class CssSelectorSyntaxExample {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		BrowserManagerSetup.setUp(url);
		driver = BrowserManagerSetup.driver;
		verifyCssSelectorSyntax();
		BrowserManagerSetup.closeBrowser();
	}

	private static void verifyCssSelectorSyntax() throws InterruptedException {
		//For amazon Search Box
		
		// syntax 1: [AttributeName="AttributeValue"]
		// driver.findElement(By.cssSelector("[placeholder=\"Search
		// Amazon.in\"]")).sendKeys("Puma");

		// syntax 2: htmltag[Attributename="AttributeValue"]
		//driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]")).sendKeys("amazon finds");
       
		//syntax 3: supports only id: #AttributeValue
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Nail Paint");
		Thread.sleep(5000);
		
		//syntax 4:htmltag#AttributeValue
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Nike");
		Thread.sleep(5000);
		
		//syntax 5: supports only class name:->syntax-> .AttributeValue
		//syntax 6: htmltag.AttributeValue
	}

}
