package TestNGClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePhotoPage;
import pages.SearchOptionPage;

public class VerifyHomePage {
	
	 private WebDriver driver;
	 private LoginPage login;
	 private  ProfilePhotoPage profilePhotoPage ;
	 
	 private SearchOptionPage searchOptionPage ;
	 @Parameters("browser")
	 @BeforeTest
     public void launchBrowser(String browserName) {
		 
		  if(browserName.equals("Chrome")) {
		   System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win32\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
		 }
		  
		  if(browserName.equals("Firefox"))
			 {
			   System.setProperty("webdriver.gecko.driver","D:\\Automation\\firefox\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
			 }
	 }
	 
	 @BeforeClass
	 public void creatingPOMObject() {
		 login = new LoginPage(driver);
		 profilePhotoPage = new ProfilePhotoPage(driver);
		 searchOptionPage = new SearchOptionPage(driver);
		 
	 }
	 
     @BeforeMethod
     public void openProfilePage() throws InterruptedException {
    	   driver.get("https://www.instagram.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		    
		    login.sendPhoneNumberOrUsernameOrEmail();
		    login.sendPassword();
		    login.clickOnLoginButton();
		    //Thread.sleep(3000);
		    
//		  HomePage homePage = new HomePage(driver);                                            
//		  homePage.clickOnNotNowButton();
//	      homePage.clickOnNotNowButton1();
	}
     
     @Test
     public void toVerifyProfilePhotoPage() {
    	// HomePage homePage = new HomePage(driver);                                            
//		   homePage.clickOnNotNowButton();
//	       homePage.clickOnNotNowButton1();
    	  
    	   profilePhotoPage.clickOnProfile();
    }
     
//     @Test
//     public void toVerifySearchOption() throws InterruptedException {
//    	
//    	 //searchOptionPage.clickOnLoginAgain();
//    	 searchOptionPage.clickOnSearchOption();
//		 searchOptionPage.clickOnSearch();
//		 searchOptionPage.clickOnSearchAccount();
//		 searchOptionPage.clickOnFollowAccount();
//	 }
//     
     @AfterMethod
     public void logOutFromApplication() throws InterruptedException {
    	 HomePage homePage = new HomePage(driver);
    	 homePage.clickOnMoreOption();
    	 homePage.clickOnLogOutButton();
     }
     
     @AfterClass
     public void clearObject() {
    	 login = null;
    	 profilePhotoPage = null;
    	 searchOptionPage = null;
    }
    
     @AfterTest
     public void closeBrowser() {
    	 driver.quit();
    	 driver = null;
    	 System.gc();

   	 }  

}
