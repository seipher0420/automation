package main.java.com.metrobank.automation.core.utilities.report;



import main.java.com.metrobank.automation.core.utilities.TestUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract class ReportGeneration {


	public static ExtentHtmlReporter htmlReporter;
	

	 public static ExtentReports extent;
	 public static ExtentTest test;
	 
	 
	 public static synchronized ExtentReports GetExtent() {
		    if (extent != null) {
		    	return extent;
		    }else{
		    	  return extent = new ExtentReports();
		    }
	 }
	 
	@BeforeSuite
	 public void generateReport(String documentTitle, String reportName){
		 	String path = TestUtil.createNewFolderBaseDate();
	     	
			htmlReporter = new ExtentHtmlReporter(path + reportName + ".html");
	        GetExtent();
	        extent.attachReporter(htmlReporter);

	        htmlReporter.config().setDocumentTitle(documentTitle);
	        htmlReporter.config().setReportName(reportName);
	        htmlReporter.config().setTheme(Theme.DARK);
	
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	    	test = extent.createTest(reportName);
	}	
}
