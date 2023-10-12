package TestsClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.ForgetPasswordPage;

public class ForgetPasswordPageClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver-win32\\chromedriver.exe");
			
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			    WebDriver driver = new ChromeDriver(options);
			    
			    driver.get("https://www.instagram.com/");
			    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		   		
			    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage(driver);
			    forgetPasswordPage.clickOnForgetPasswordLink();
			    forgetPasswordPage.sendEmailPhoneOrUsername();
			    Thread.sleep(2000);
			    forgetPasswordPage.clickOnBackToLoginLink();
			    
			    
 }
}