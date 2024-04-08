package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");
    System.out.println(  driver.getCurrentUrl());   
  
    //driver.get("https://www.amazon.in/");
   
    //using cssSelector
   // driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_gb\"]")).click();
    //syntax1:[AttributeName="AttributeValue"]
   // driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
    //syntax2: [htmltag[AttributeName="AttributeValue"]
	
	//  driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(
	 // "secret_sauce");
	//  driver.findElement(By.cssSelector("input[data-test=\"login-button\"]")).click
	//  ();
	 
    
   // Syntax3:supports only id() locator->using id locator's attibute name with preceding #
     // driver.findElement(By.cssSelector("#login-button")).sendKeys("secret_sauce");
	//syntax 4: supports only for id() locator-> html#Attribute
	 // driver.findElement(By.cssSelector("input#login-button")).click();
	  //syntax 5:.AttributeValue
	 // driver.findElement(By.cssSelector(".btn_action")).click();
	  //syntax 6: html.AttributeValue
	  //driver.findElement(By.cssSelector("input.btn_action")).click();
	  
    
    Thread.sleep(5000);
    driver.quit();
    
	}

}
