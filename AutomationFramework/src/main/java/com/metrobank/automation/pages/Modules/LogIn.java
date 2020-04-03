/**
 * 
 */
package main.java.com.metrobank.automation.pages.Modules;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.pages.POM.LogInPage.*;

/**
 * @Description
 * This class contains the different modules for
 * LogIn Page
 *
 */
public class LogIn {

	private final WebDriver driver;
	private final PropertyFileHandler property;
	
	/* Parameters List */
	private String username;
	private String password;
	
	
	public LogIn (WebDriver driver, String propertyFile) {
		this.driver = driver;
		this.property = new PropertyFileHandler(propertyFile);
		// Get all test data and parameter values
		InitializeParameters();
	}
	
	public void InitializeParameters() {
		username = property.GetValue("username");
		password = property.GetValue("password");
	}
	
	public void LogInSetup() {
		
		LogInPage loginPage = new LogInPage(driver);
		
		loginPage.EnterUsername(username)
		.EnterPassword(password)
		.ClickLoginButton();
		
	}
}
