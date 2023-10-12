package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {

	@FindBy (xpath = "(//form[@id='loginForm']//span)[5]")
	private WebElement forgetPasswordLink ;
	
	@FindBy (xpath="//input[@name='cppEmailOrUsername']")
	private WebElement emailPhoneOrUsername;
	
	@FindBy (xpath="//div[@style='height: 44px;']")
	private WebElement backToLoginLink;
	
	
	//Constructor public
	public ForgetPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods - public
	public void clickOnForgetPasswordLink(){
		forgetPasswordLink.click();
	}
	
	public void sendEmailPhoneOrUsername()  {
		emailPhoneOrUsername.sendKeys("9876543223");
	}
	
	public void clickOnBackToLoginLink() {
		backToLoginLink.click();
	}
	
}
