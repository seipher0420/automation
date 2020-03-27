/**
 * 
 */
package main.java.com.metrobank.automation.pages.Modules;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.pages.POM.LogInPage.*;

/**
 * @Description
 * This class contains the different modules for
 * LogIn Page
 *
 */
public class LogIn {

	private final WebDriver driver;
	
	public LogIn (WebDriver driver) {
		this.driver = driver;
	}
	
	public void LogInSetup () throws IOException {
		LogInPage loginPage = new LogInPage(driver);
		
		loginPage.EnterUsername("standard_user")
		.EnterPassword("secret_sauce")
		.ClickLoginButton();
		
	}
}
