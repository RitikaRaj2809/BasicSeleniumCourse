package pomorobjectrepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPage {

	public FlipKartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(name = "q"), @FindBy(xpath = "//input[@title='Search for Products, Brands and More']") })

	private WebElement searchBar;

	// business logic
	public void passValue(String Name) {
		searchBar.sendKeys(Name);
		

	}

	public void handleMultipleElements(WebDriver driver) throws InterruptedException {
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li"));

		for (WebElement ele : allList) {
			Thread.sleep(2000);
			String value = ele.getText();
			System.out.println(value);
			Thread.sleep(2000);
			if (value.contains("bluetooth headphones")) {
				ele.click();
				break;
			}
		}

	}
}
