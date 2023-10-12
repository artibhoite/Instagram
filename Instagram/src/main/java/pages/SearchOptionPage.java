package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOptionPage {


	//Variable- private
//	@FindBy (xpath="//input[@value = 'Log in']")
//	private WebElement loginAgain;
	
	@FindBy (xpath="(//div[@style='opacity: 1;'])[3]")
	private WebElement searchOption;
	
	@FindBy (xpath="//input[@autocapitalize = 'none']")
	private WebElement search ;
	
	@FindBy (xpath="//span[text() = 'arti_bhoite']")
	private WebElement searchAccount ;
	
	@FindBy (xpath = "(//div[text() = 'Follow'])[1]")
	private WebElement followAccount;
	
	
	
	   //Constructor public
				public  SearchOptionPage(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
				
				//Methods - public
				
//				public void clickOnLoginAgain() {
//					loginAgain.click();
//				}
				public void clickOnSearchOption() {
					searchOption.click();
				}
				
				public void clickOnSearch() {
					search.sendKeys("arti bhoite");
				}
				
				public void clickOnSearchAccount() {
					searchAccount.click();
				}
				
				public void clickOnFollowAccount() {
					followAccount.click();
				}
			
			
				
				

}
