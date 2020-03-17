package main.test;

import java.io.IOException;

import main.java.Abstract.mainConnection;
import main.utilities.properties.TestUtil;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;



public class TestConnection extends mainConnection{

	String userDirectory = System.getProperty("user.dir");
	WebDriver driver;
	String tempScreenshot;
	
	@Test
	public void testConnectionCase() throws IOException{
	
	String title;
	
	ExtentReports extent = ExtentReports.get(TestConnection.class);
	 
	extent.init(userDirectory + "report.html", true);
	extent.startTest("Verify browser Connection");
	
	driver = connection("internetexplorer");
	extent.log(LogStatus.INFO, "Started Browser");
	
	title = driver.getTitle();
	
	try{
		Assert.assertTrue(title != null);
	
		tempScreenshot = TestUtil.getScreenshot(driver);
		extent.log(LogStatus.INFO, "Step 1: Get Title: " + title);
		extent.attachScreenshot(tempScreenshot);
		
	}catch(AssertionError e){
		extent.log(LogStatus.INFO, "Failed");
	}
	
	extent.endTest();
	driver.close();
	
	
	
	
		
		
		
	}
	
}
