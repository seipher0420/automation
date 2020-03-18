package main.utilities.Helpers;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogLevel;
import com.relevantcodes.extentreports.LogStatus;

import main.java.com.metrobank.automation.generics.AutomationConstants;




public class generateReport {
	
	String userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
	ExtentReports extent;
	
	public void createReportFile(String className, String testCaseName){
		extent = ExtentReports.get(className);
		extent.init(userDirectory+ AutomationConstants.TEST_REPORT_FOLDER + testCaseName + ".html", true);
		
	}
	
	public void startTestLogName(String testName){
		extent.startTest(testName);
	}
	
	
	public void startTestLogNameAndDescription(String testName, String testDesription){
		extent.startTest(testName, testDesription);
		
	}
	
	public void attachScreenshot(String screenCapturePath){
		extent.attachScreenshot(screenCapturePath);
		
	}
	public void testLogInfo(String logDescription){
		extent.log(LogStatus.INFO, logDescription);
		
	}
	
	public void testLogError(String logDescription){
		extent.log(LogStatus.ERROR, logDescription);
	}
	
	public void testLogPass(String logDescription){
		extent.log(LogStatus.PASS, logDescription);
	}
	
	public void testLogFail(String logDescription) {
		extent.log(LogStatus.FAIL, logDescription);
	}
	
	public void testLogFatal(String logDesciption) {
		extent.log(LogStatus.FATAL, logDesciption);
		
	}
	
	public void testLogWarning(String logDescription) {
		extent.log(LogStatus.WARNING, logDescription);
	}
	
	public void testLogSkip(String logDescription) {
		extent.log(LogStatus.SKIP, logDescription);
	}
	
	
	
	

	
	
	

	

}
