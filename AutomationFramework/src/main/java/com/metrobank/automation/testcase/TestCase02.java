package main.java.com.metrobank.automation.testcase;

import java.io.IOException;

import main.java.com.metrobank.automation.core.base.mainConnection;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase02 extends mainConnection{

	WebDriver driver;
	
	@Test
	public void testCase2() throws IOException{
		String title;
		String tempScreenshot = null;
		LogGeneration logGeneration = new LogGeneration();	
		driver = connection("chrome");
		logGeneration.generateReport("Test Websites", "Test Report2");
		logGeneration.inputLogs(LogType.pass, "Step 1: Open Browser", tempScreenshot);
		
		
		logGeneration.extentFlush();
		driver.quit();
		
		
	}
	
	
}
