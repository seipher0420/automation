//package main.java.com.metrobank.automation.testcase;
//
//import java.io.IOException;
//import java.text.Format;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import main.java.com.metrobank.automation.core.base.mainConnection;
//import main.java.com.metrobank.automation.core.utilities.TestUtil;
//import main.java.com.metrobank.automation.generics.AutomationConstants;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.SkipException;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ConnectionTestCase01 extends mainConnection{
//
//	 ExtentHtmlReporter htmlReporter;
//	 WebDriver driver;
//	 String userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
//	    ExtentReports extent;
//	    //helps to generate the logs in test report.
//	    ExtentTest test;
//	    
////	    @Parameters({ "OS", "browser" })
//	    @BeforeTest
//	    public void startReport() {
//	    	// initialize the HtmlReporter
//	    	String path;
//	    	Format format = new SimpleDateFormat("MMddyy");
//			String strDate = format.format(new Date());
//			path = userDirectory + AutomationConstants.TEST_REPORT_FOLDER + "/" + strDate + "/" ;
//			
//	        htmlReporter = new ExtentHtmlReporter(path + "test01.html");
//	        
//	        //initialize ExtentReports and attach the HtmlReporter
//	        extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//	         
//	        //To add system or environment info by using the setSystemInfo method.
////	        extent.setSystemInfo("OS", );
////	        extent.setSystemInfo("Browser", browser);
//	        
//	        //configuration items to change the look and feel
//	        //add content, manage tests etc
//	        htmlReporter.config().setChartVisibilityOnOpen(true);
//	        htmlReporter.config().setDocumentTitle("Test");
//	        htmlReporter.config().setReportName("Test Report");
//	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//	        htmlReporter.config().setTheme(Theme.DARK);
//	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//	    }
//	     
//	    @Test
//	    public void testConnection() throws IOException {
//	        test = extent.createTest("Test Connection", "PASSED test case");
//	       
//	        driver = connection("chrome");
//	        test.log(Status.PASS, MarkupHelper.createLabel("Step 1: Open chrome", ExtentColor.GREEN));
//	        test.log(Status.PASS , MarkupHelper.createLabel("Step 2: Quit chrome", ExtentColor.GREEN));
////	        Assert.assertTrue(true);
//	        driver.quit();
//	    }
////	    
////	    @Test
////	    public void testCase2() {
////	        test = extent.createTest("Test Case 2", "PASSED test case");
////	        Assert.assertTrue(true);
////	    }
//
////	   
////	    @AfterMethod
////	    public void getResult(ITestResult result) throws IOException {
////	        if(result.getStatus() == ITestResult.FAILURE) {
////	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
////	            test.fail(result.getThrowable());
////	        }
////	        else if(result.getStatus() == ITestResult.SUCCESS) {
////	        	 String testpath;
////	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
////		        testpath = TestUtil.getScreenshot(driver);
////		        test.pass("Screenshot Below: " +  test.addScreenCaptureFromPath(testpath));
////	        }
////	        else {
////	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
////	            test.skip(result.getThrowable());
////	        }
////	    }
//	     
//	    @AfterTest
//	    public void tearDown() {
//	    	//to write or update test information to reporter
//	        extent.flush();
//	    }
//	}
//
