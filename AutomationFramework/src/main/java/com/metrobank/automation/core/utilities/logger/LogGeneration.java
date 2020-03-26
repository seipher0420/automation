package main.java.com.metrobank.automation.core.utilities.logger;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.report.ReportGeneration;
import main.java.com.metrobank.automation.generics.AutomationConstants;

public class LogGeneration extends ReportGeneration{
	
	
	
	public void inputLogs(LogType type, String description, String screenshot) throws IOException{

		switch(type){
		case info:
	        test.log(Status.INFO, MarkupHelper.createLabel(description, ExtentColor.BLUE));
	        break;
		
		case pass:
			test.log(Status.PASS, MarkupHelper.createLabel(description, ExtentColor.GREEN));
			break;
		
		case warning:	
			test.log(Status.WARNING, MarkupHelper.createLabel(description, ExtentColor.ORANGE));
			break;
		
		case fail:
			test.log(Status.FAIL,description, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
			break;
		
		case fatal:
			test.log(Status.FATAL,description, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
			break;
		
		case skip:
			test.log(Status.SKIP, MarkupHelper.createLabel(description, ExtentColor.INDIGO));
			
		default:
			System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Log Generations");
			
		}
	}
	
	@AfterSuite
	public void extentFlush(){
		extent.flush();
	}

}
