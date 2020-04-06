package main.java.com.metrobank.automation.testcase;

import java.io.IOException;

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

		// Set up logger
		LogGeneration logGeneration = new LogGeneration();
		logGeneration.generateReport("Test Report3");
		
		// Step 1 : Setup browser connection
		driver = SetBrowser(BrowserType.chrome);

		LogIn login = new LogIn(driver, TestData.LOGIN);
		login.LogInSetup();
		driver.quit();
		
		try {
			logGeneration.extentFlush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
