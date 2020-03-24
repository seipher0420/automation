package main.java.com.metrobank.automation.core.utilities.report;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.com.metrobank.automation.generics.AutomationConstants;






import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract class ReportGeneration {


	ExtentHtmlReporter htmlReporter;
	
	 String userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
	 public static ExtentReports extent;
	 public static ExtentTest test;
	 

	@BeforeTest
	 public void generateReport(String documentTitle, String reportName){
		 
	    	String path;
	    	File file;
	    	Format format = new SimpleDateFormat("MMddyy");
			String strDate = format.format(new Date());
			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/" + strDate + "/" ;
			
			file = new File(path);
			boolean createDir = file.mkdir();
			   if(createDir){
			         System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Folder has been Created " + path);
			      }else{
			         System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Folder has already been created or not found " + path);
			      }
			   
	        htmlReporter = new ExtentHtmlReporter(path + reportName + ".html");
	        	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        htmlReporter.config().setDocumentTitle(documentTitle);
	        htmlReporter.config().setReportName(reportName);
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	    	test = extent.createTest(reportName);
		 
		 
	 }	
}
