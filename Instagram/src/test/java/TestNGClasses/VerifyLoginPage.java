package TestNGClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
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

import pages.ForgetPasswordPage;
import pages.SignUpPage;

public class VerifyLoginPage {
     
	 private WebDriver driver;
	 private SignUpPage signUpPage;
	 private ForgetPasswordPage forgetPasswordPage;
	 
	 @Parameters("browser")
	 @BeforeTest
	 public void launchBrowser(String browserName) {
			
		 if(browserName.equals("Chrome"))
		 {
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
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 
	 }
	 
	 @BeforeClass
	 public void creatingPOMObject() {
		  signUpPage = new SignUpPage(driver); 
		 forgetPasswordPage = new ForgetPasswordPage(driver);
	 }
	 
     @BeforeMethod
     public void openLoginPage() {
    	   driver.get("https://www.instagram.com/");
  		    driver.manage().window().maximize();
  		 //   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
   	 }
     
     @Test
     public void toVerifySignUpPage() {
         
		    signUpPage.clickOnSignUpLink();
		    signUpPage.sendMobileNumberOrEmail();
		    signUpPage.sendFullName();
		    signUpPage.sendUsername();
		    signUpPage.sendPassword();
		    signUpPage.clickOnSignUpButton();
		    signUpPage.clickOnLogin1();
     }
     
     @Test
     public void toVerifyForgetPasswordPage() {
    	 
		    forgetPasswordPage.clickOnForgetPasswordLink();
		    forgetPasswordPage.sendEmailPhoneOrUsername();
		    forgetPasswordPage.clickOnBackToLoginLink();
	}
     
  
     
     @AfterMethod
     public void refreshPage() {
    	driver.navigate().refresh(); 
   	  
     }
     
     @AfterClass
     public void clearObject() {
    	 signUpPage = null;
    	 forgetPasswordPage = null;
    	 
     }
    
     @AfterTest
     public void closeBrowser() {
    	 driver.quit();
    	 driver = null;
    	 System.gc();

     } 
     
//     @AfterTest
//     public void afterTest() {
//		 System.out.println("after test");
//	 }
     
}
