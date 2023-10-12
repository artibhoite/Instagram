package TestsClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePhotoPage;

public class ProfilePhotoPageClass {
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win32\\chromedriver.exe");
			
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			    WebDriver driver = new ChromeDriver(options);
			    
			    driver.get("https://www.instagram.com/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		   		
			    LoginPage login = new LoginPage(driver);
			    login.sendPhoneNumberOrUsernameOrEmail();
			    login.sendPassword();
			    login.clickOnLoginButton();
			    
			    HomePage homepage = new HomePage(driver);
			    homepage.clickOnNotNowButton();
			    homepage.clickOnNotNowButton1();
			    
			    ProfilePhotoPage profilePhotoPage = new ProfilePhotoPage(driver);
			    profilePhotoPage.clickOnProfile();
			  
			   
			    homepage.clickOnMoreOption();
			    homepage.clickOnLogOutButton();
			    driver.quit();
			    
			    
}
}
