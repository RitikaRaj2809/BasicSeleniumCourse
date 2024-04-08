package advancescenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Move element and right click
		/*
		 * driver.get("https://www.amazon.in/");
		 * 
		 * WebElement txt=driver.findElement(By.xpath("//a[.='Mobiles']")); Actions
		 * act=new Actions(driver); act.moveToElement(txt) .contextClick() .build()
		 * .perform(); Thread.sleep(5000);
		 */
		
		//Senkeys method using Actions Class

		/*
		 * driver.get("https://www.saucedemo.com/"); WebElement USERNAME =
		 * driver.findElement(By.id("user-name")); WebElement PASSWORD =
		 * driver.findElement(By.id("password")); WebElement LOGIN =
		 * driver.findElement(By.id("login-button")); Actions action = new
		 * Actions(driver); action.sendKeys(USERNAME,
		 * "standard_user").sendKeys(PASSWORD,
		 * "secret_sauce").click(LOGIN).build().perform(); Thread.sleep(5000);
		 * driver.quit();
		 */
		
		//Drag and drop Method
		
		/*
		 * driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
		 * WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		 * WebElement drop=driver.findElement(By.cssSelector("div#droppable")); Actions
		 * action = new Actions(driver); //action.dragAndDrop(drag, drop).perform();
		 * //or Usimng Method 2:
		 * 
		 * action.clickAndHold(drag).release(drop).perform();
		 * 
		 * Thread.sleep(5000); driver.quit();
		 */
		
		//Double click
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act =new Actions(driver);
		act.doubleClick(ele).perform();*/
		
		
		//to handle popup
		//driver.get("https://www.goibibo.com/");
		Actions act=new Actions(driver);
		 // give some random value-> we will click somewhere on screen
		act.moveByOffset(20, 10).click().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
