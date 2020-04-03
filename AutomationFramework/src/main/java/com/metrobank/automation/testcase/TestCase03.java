package main.java.com.metrobank.automation.testcase;

import main.java.com.metrobank.automation.core.base.*;
import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.automation.pages.Modules.*;
import main.java.com.metrobank.core.extensions.Driver;

import org.testng.annotations.Test;

public class TestCase03 extends BrowserConnection{

//	WebDriver driver;
	String chromeDriver;
	String url;
	Driver driver;
	String userDirectory;
	
	@Test
	public void testCase3() {

		// Step 1 : Setup browser connection
		driver = SetBrowser(BrowserType.chrome);

		LogGeneration logGeneration = new LogGeneration();
		logGeneration.generateReport("Test Websites", "Test Report2");
		logGeneration.inputLogs(LogType.pass, "Step 1: Open Browser", null);
		
		LogIn login = new LogIn(driver, TestData.LOGIN);
		login.LogInSetup();
		
		logGeneration.extentFlush();
		driver.quit();
	}
	
	
}
