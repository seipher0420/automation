package main.java.com.metrobank.automation.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.model.Media;

import main.java.com.metrobank.automation.core.base.mainConnection;
import main.java.com.metrobank.automation.core.utilities.TestUtil;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;

public class TestCase01 extends mainConnection{
	
	WebDriver driver;

	@Test
	public void testCase() throws IOException, InterruptedException{
	String title;
	String tempScreenshot = null;
	LogGeneration logGeneration = new LogGeneration();	
	driver = connection("chrome");
	logGeneration.generateReport("Test Websites", "Test Report");
	
	title = driver.getTitle();

	
	logGeneration.inputLogs("info", "Step 1: Open Browser", tempScreenshot);
	
	
	logGeneration.inputLogs("warn", "Step 2: Warning test log", tempScreenshot);
	
	try{
		Assert.assertTrue(driver.getWindowHandle()!=null);
		logGeneration.inputLogs("pass", "Step 3: Windows Handle: " + driver.getWindowHandle(), tempScreenshot);
	}catch(AssertionError e){
		logGeneration.inputLogs("input", "No window handle", tempScreenshot);
	}
	
	
	try{
		Assert.assertTrue(title.equals("Test"));
		logGeneration.inputLogs("pass","Step 4: Pass", tempScreenshot);
	}catch(AssertionError e){
			tempScreenshot = TestUtil.getScreenshot(driver);
			logGeneration.inputLogs("fatal","Step 4: Not Test Page", tempScreenshot);
		
	}
	driver.navigate().to("http://yahoo.com");
	TestUtil.waitTime(2);
	
	try{
		Assert.assertTrue(title.equals("google"));
		logGeneration.inputLogs("pass","Step 5: Pass ", tempScreenshot);
	}catch(AssertionError e){
		tempScreenshot = TestUtil.getScreenshot(driver);
		logGeneration.inputLogs("fail", "Step 5: Not Google " + driver.getTitle(), tempScreenshot);
		
		
	}
	logGeneration.inputLogs("skip", "Step 6: Skip Test" , tempScreenshot);
	
	logGeneration.extentFlush();
	driver.quit();
	
	}
	
	
}
