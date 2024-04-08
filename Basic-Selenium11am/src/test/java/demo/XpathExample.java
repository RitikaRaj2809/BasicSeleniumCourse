package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import democom.automatio.common.BrowserManagerSetup;

public class XpathExample {
	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// String url="https://www.saucedemo.com/";
		String url = "https://www.flipkart.com/";
		// String url="https://www.amazon.in/";
		BrowserManagerSetup.setUp(url);
		driver = BrowserManagerSetup.driver;
		verifyXpathSyntax();
		BrowserManagerSetup.closeBrowser();
	}

	private static void verifyXpathSyntax() throws InterruptedException {
		// Syntax 1:xpath by Attribute-> //htmltag[@AttributeName="AttributeValue"]
		// driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		// Thread.sleep(5000);

		// syntax 1
		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).
		 * sendKeys("Bluetooth"); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		 * Thread.sleep(5000);
		 */

		/*
		 * driver.findElement(By.
		 * xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).
		 * sendKeys("Puma Sneakers"); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		 * Thread.sleep(5000); String prodName=driver.findElement(By.
		 * xpath("//a[@title=\"Popcat 20 Shower RES Men Slides\"]")).getText();
		 * System.out.println("Name of the product is: "+prodName); String prodPrice=
		 * driver.findElement(By.xpath("//div[contains(text(),'₹1,047')]")).getText();
		 * System.out.println("The price of the product is:"+prodPrice);
		 */
		// xpath by Attribute
		// driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
		// Thread.sleep(5000);
		// xpath by text
		// driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]")).click();
		// Thread.sleep(5000);

		// xpath by contains

		driver.findElement(By.xpath("//input[contains(@title,\"Search \")]")).sendKeys("Puma Shoes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String
		// xpath by group index
		name = driver.findElement(By.xpath("//a[@class=\"IRpwTa\"][1]")).getText();
		System.out.println("Name of the first product is:" + name);
		Thread.sleep(5000);

		// xpath by contains text
		driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]")).click();

	}

}
