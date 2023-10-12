package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	//Variable- private
	@FindBy (xpath = "//span[text() = 'Sign up']")
	private WebElement signUpLink ;
	
	@FindBy (xpath="//input[@name= 'emailOrPhone']")
	private WebElement mobileNumberOrEmail;
	
	@FindBy (xpath="//input[@name= 'fullName' ]")
	private WebElement fullName;
	
	@FindBy (xpath = "//input[@name= 'username' ]")
	private WebElement username;
	
	@FindBy (xpath="//input[@type = 'password' ]")
	private WebElement password;
	
	@FindBy (xpath="(//div[contains(@class , 'x1c4vz4f x2lah0s xdt5ytf ')])[3]")
	private WebElement signUpButton;
	
	@FindBy (xpath="//a[text() = 'Log in']")
	private WebElement login ;
	
	
	//private WebDriver driver;
	//Constructor public
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods - public
	public void clickOnSignUpLink() {
		signUpLink.click();
	}
	
	public void sendMobileNumberOrEmail() {
		mobileNumberOrEmail.sendKeys("9876543223");
	}
	
	public void sendFullName() {
		fullName.sendKeys("Bharti Patil");
	}
	
	public void sendUsername() {
		username.sendKeys("bhartipatil112");
	}
	
	public void sendPassword() {
		password.sendKeys("bharti@123");
	}
	
	public void clickOnSignUpButton() {
//		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
//		javascriptExecutor.executeScript("window.scrollBy(0,50)");
		signUpButton.click();
	}
	
		public void clickOnLogin1() {
			login.click();
		}
	
//	if(signUpButton.isEnabled()==true)
//	{
//		System.out.println("button is enabled");
//	}
//	else
//	{
//		System.out.println("button is disabled");
//	}
//	
//	
	
	
}
