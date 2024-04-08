package pomorobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	@FindBy(id="user-name")
	private WebElement UserTextfield;
	
	@FindBy(id="password")
	private WebElement PasswordTextField;
	
	@FindBy(id="login-button")
	private WebElement LoginButton;

	
	//getter Method
	public WebElement getUserTextfield() {
		return UserTextfield;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	//Business Logics
	public void loginToApplication(String username,String password)
	{
		UserTextfield.sendKeys(username);
		PasswordTextField.sendKeys(password);
		LoginButton.click();
	}
	
	
	
	

}
