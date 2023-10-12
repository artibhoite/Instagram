package TestsClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import pages.LoginPage;

public class LoginPageClass {
	public static void main(String[] args) {
		
   System.setProperty("webdriver.gecko.driver","D:\\Automation\\firefox\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new FirefoxDriver(options);
	    
	    driver.get("https://www.instagram.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
   		
	    LoginPage login = new LoginPage(driver);
	    login.sendPhoneNumberOrUsernameOrEmail();
	    login.sendPassword();
	    login.clickOnLoginButton();
 }
}