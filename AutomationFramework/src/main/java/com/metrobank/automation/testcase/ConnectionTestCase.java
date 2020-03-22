package main.java.com.metrobank.automation.testcase;

import java.io.IOException;

import main.java.com.metrobank.automation.core.base.mainConnection;
import main.java.com.metrobank.automation.core.utilities.TestUtil;
import main.java.com.metrobank.automation.generics.AutomationConstants;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

/* 
 * @Description
 * Test Case Sample Template for Screenshot and Reports
 */

public class ConnectionTestCase extends mainConnection{

	String userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
	WebDriver driver;
	String tempScreenshot;
	String nameOfTestCase = "report.html";
	
	@Test
	public void testConnectionCase() throws IOException{
	
		String title;
	
		ExtentReports extent = ExtentReports.get(ConnectionTestCase.class);
		
		//Change report.html to the name of TestCase 
		extent.init(userDirectory+ AutomationConstants.TEST_REPORT_FOLDER + nameOfTestCase, true);
		
		extent.startTest("Verify browser Connection");
		
		driver = connection("chrome");
		extent.log(LogStatus.INFO, "Started Browser");
		
		title = driver.getTitle();
		
		try{
			//If True get Screenshot
			Assert.assertTrue(title != null);
			tempScreenshot = TestUtil.getScreenshot(driver);
			extent.log(LogStatus.INFO, "Step 1: Get Title: " + title + ": " + AutomationConstants.TEST_PASSED);
			extent.attachScreenshot(tempScreenshot);
			
		}catch(AssertionError e){
			//False log Test Failed
			extent.log(LogStatus.INFO, "Step 1: Get Title: " + AutomationConstants.TEST_FAILED);
		}
		
	extent.endTest();
	driver.quit();
	
	
	
	
		
		
		
	}
	
}
