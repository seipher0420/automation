package main.java.com.metrobank.automation.testcase;

import java.io.IOException;

import main.java.com.metrobank.automation.core.base.mainConnection;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.automation.pages.Modules.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase03 extends mainConnection{

	WebDriver driver;
	
	@Test
	public void testCase3() throws IOException{

		driver = connection("chrome");
		
		LogIn login = new LogIn(driver);
		login.LogInSetup();
		
		driver.quit();
	}
	
	
}
