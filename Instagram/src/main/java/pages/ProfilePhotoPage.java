package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePhotoPage {
	
	//Variable- private
			
			@FindBy (xpath="//span[text() = 'Profile']")
			private WebElement profile ;
			
			
			
		    //Constructor public
			public  ProfilePhotoPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Methods - public
			
		    public void clickOnProfile() {
				profile.click();
			}
			
		  //a[text() = 'sw_apnil9971']
			
			

}
