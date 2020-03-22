package main.java.com.metrobank.automation.core.utilities.report;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogLevel;
import com.relevantcodes.extentreports.LogStatus;

import main.java.com.metrobank.automation.generics.AutomationConstants;




public class GenerateReport {
	
	String userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
	ExtentReports extent;
	
	public void createReportFile(String className, String testCaseName){
		extent = ExtentReports.get(className);

		   Format f = new SimpleDateFormat("MM/dd/yy");
		      String strDate = f.format(new Date());
		      System.out.println("Current Date = "+strDate);
		extent.init(userDirectory+ AutomationConstants.TEST_REPORT_FOLDER + "/" + strDate + "/" + testCaseName + ".html", true);
		
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
