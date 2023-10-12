package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Variable- private
		@FindBy (xpath = "(//label[@class='_aa48'])[1]//input")
		private WebElement phoneNumberOrUsernameOrEmail;
		
		@FindBy (xpath="//input[@name = 'password']")
		private WebElement password;
		
		@FindBy (xpath="//div[text()= 'Log in' ]")
		private WebElement loginButton;
		
		
		//Constructor public
		public  LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Methods - public
		public void sendPhoneNumberOrUsernameOrEmail() {
			phoneNumberOrUsernameOrEmail.sendKeys("sw_apnil9971");
		}
		
		public void sendPassword() {
			password.sendKeys("swapnil@123");
		}
		
		public void clickOnLoginButton() {
			loginButton.click();
		}
		
		

}
