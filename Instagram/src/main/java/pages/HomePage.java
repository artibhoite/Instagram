package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//div[@class ='_ac8f']")
	private WebElement notNowButton ;
	
	@FindBy (xpath="//button[text() = 'Not Now']")
	private WebElement notNowButton1 ;
	
	@FindBy (xpath = "//span[text() = 'More']")
	private WebElement moreOption;
	
	@FindBy (xpath="//span[text() = 'Log out']")
	private WebElement logOutButton ;
	
    //Constructor public
			public HomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			
			public void clickOnNotNowButton() {
				notNowButton.click();
			}
			
			public void clickOnNotNowButton1() {
				notNowButton1.click();
			}
			
			public void clickOnMoreOption() {
				moreOption.click();
			}
			
			
			public void clickOnLogOutButton() {
				logOutButton.click();
			}

}
