package main.java.com.metrobank.automation.testcase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import main.java.com.metrobank.automation.core.base.*;
import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.automation.pages.Modules.*;
import main.java.com.metrobank.automation.pages.POM.LogInPage.LogInPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoTestCase extends BrowserConnection{

	WebDriver driver;
	private String username;
	private String password;
	private PropertyFileHandler property;
	
	@Test
	public void testCase() throws IOException {

		property = new PropertyFileHandler(TestData.LOGIN);
		username = property.GetValue("username");
		password = property.GetValue("password");
		
		// Set up logger
		LogGeneration logger = new LogGeneration();
		logger.generateReport("Sample Test Report");
		
		// Step 1 : Setup browser connection
		driver = SetBrowser(BrowserType.chrome);
		LogInPage loginPage = new LogInPage(driver);
		Validation validate = new Validation(driver);

		// Login script
		loginPage.EnterUsername(username)
		.EnterPassword(password)
		.ClickLoginButton();
		
		// Validation that login is successful
		validate.ValidateThatObjectExists("Swag Labs", true);
		
		driver.quit();
			logger.inputLogs(LogType.pass, "Quitting browser...", null);
		
		try {
			logger.extentFlush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}

