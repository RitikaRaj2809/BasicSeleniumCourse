package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import democom.automatio.common.BrowserManagerSetup;

public class Assignment1 {
	//navigate search for iphone and print all the phone names on console
	protected static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
				 String url="https://www.amazon.in/";
				BrowserManagerSetup.setUp(url);
				driver = BrowserManagerSetup.driver;
				verifyXpathSyntax();
				BrowserManagerSetup.closeBrowser();
	}
	
	private static void verifyXpathSyntax() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(5000);
	    String phonename=	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).getText();
		System.out.println("Phone name is:"+phonename);
		String phonePrice=driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText();
		
		System.out.println("price of phone is:"+phonePrice);
		
		
		List<WebElement> allPhoneName=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> allPhonePrice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int count=0;
		for(int i=0;i<allPhoneName.size();i++) {
		
			System.out.println("Phone name is: "+allPhoneName.get(i).getText()+" and the price is: "+allPhonePrice.get(i).getText());
		    count++;
		}
		
		System.out.println("Total no. of phones in particular page: "+count);
		
	}

}
