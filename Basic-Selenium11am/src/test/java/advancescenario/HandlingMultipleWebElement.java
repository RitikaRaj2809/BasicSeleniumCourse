package advancescenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> allLink=driver.findElements(By.xpath("//a"));
		System.out.println("count of links are:"+allLink.size());
		for(WebElement link:allLink) {
			//System.out.println(link.getText()); //prints visible text in webpage
			//System.out.println(link.getAttribute("href"));// will print alltribute of href-> the link
			System.out.println(link.getDomAttribute("href"));
		}
		driver.quit();

	}

}
