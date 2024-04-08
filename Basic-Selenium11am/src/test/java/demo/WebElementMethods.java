package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.flipkart.com/");

		/*
		 * driver.get("https://www.amazon.in/");
		 * 
		 * WebElement bar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		 * bar.sendKeys("nike"); Thread.sleep(5000); bar.clear(); Thread.sleep(5000);
		 * bar.sendKeys("Puma"); bar.submit();
		 * 
		 * driver.quit();
		 */

		// driver.get("https://www.facebook.com/");
		/*
		 * WebElement ele = driver.findElement(By.xpath("//a[.=\"Instagram\"]")); //
		 * Method 4: getLocation() Point loc = ele.getLocation();
		 * System.out.println(loc.getX()); System.out.println(loc.getY());
		 * 
		 * // Method 5: getSize() 
		 * Dimension elem = ele.getSize();
		 * System.out.println(elem.getHeight()); System.out.println(elem.getWidth());
		 * 
		 * // Method 6: getRect Rectangle element = ele.getRect();
		 * System.out.println(element.getX()); System.out.println(element.getY());
		 * System.out.println(element.getHeight());
		 * System.out.println(element.getWidth());
		 */
		// Method 7: getCssValue
		/*
		 * WebElement ele = driver.findElement(By.id("email"));
		 * System.out.println(ele.getCssValue("color"));
		 * System.out.println(ele.getCssValue("font-size"));
		 */
		// Method 8:getTagName
		// WebElement elem = driver.findElement(By.id("email"));
		// System.out.println(elem.getTagName());

		// Method 9,10: getAttribute(),getDomAttribute()
		
		/*
		 * driver.get("https://www.flipkart.com/"); WebElement search=
		 * driver.findElement(By.name("q"));
		 * System.out.println(search.getAttribute("title"));
		 * System.out.println(search.getDomAttribute("class"));
		 */
		 
		// Method 11:getDomProperty()
		/*
		 * WebElement text=driver.findElement(By.xpath("//span[text()='Grocery']"));
		 * System.out.println(text.getDomProperty("tagName"));
		 */

		// Method 12:isDisplayed()->is logo displayed
		/*
		 * WebElement text=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		 * if(text.isDisplayed()) { System.out.println("logo is displayed"); }else {
		 * System.out.println("logo not displayed"); }
		 */
		// driver.quit();
		// Method 13:isEnabled() ->if enabled is active
		/*
		 * WebElement txt=driver.findElement(By.xpath("//input[@name='q']"));
		 * if(txt.isEnabled()) { txt.sendKeys("mask"); Thread.sleep(2000); }else {
		 * System.out.println("txt not enabled"); }
		 */

		driver.get("https://www.facebook.com/");

		// Method 14: isSelected()
		/*
		 * driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 * Thread.sleep(2000); WebElement radio =
		 * driver.findElement(By.xpath("//input[@value='1']")); radio.click(); if
		 * (radio.isSelected()) { System.out.println("radio  button is selected"); }
		 * else { System.out.println("radio is not selected"); }
		 */
		
		//Method 15:getAriaRole()-> tells what type of element it is
		
		  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		  Thread.sleep(2000); WebElement
		  fname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		  
		  System.out.println(fname.getAriaRole()); WebElement
		  value=driver.findElement(By.xpath("//input[@value='1']"));
		  System.out.println(value.getAriaRole()); 
			/*
			 * //Method 16:getAccessibleName() WebElement passTextBox=
			 * driver.findElement(By.xpath("//input[@id='password_step_input']"));
			 * System.out.println(passTextBox.getAccessibleName());
			 */
		//Method 16:getAccessibleName
		//driver.get("https://www.flipkart.com/");
		//WebElement t=driver.findElement(By.xpath("//a[@aria-label=\"Grocery\"]"));
		//System.out.println(t.getAccessibleName());
		
		/*
		 * WebElement ele=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		 * ele.sendKeys("nike"); ele.submit(); String
		 * name=driver.findElement(By.xpath("//a[text()='NIKE Western Wear Legging']")).
		 * getText(); System.out.println(name);
		 */
		
		
		
		
		
		driver.quit();
	}

}
