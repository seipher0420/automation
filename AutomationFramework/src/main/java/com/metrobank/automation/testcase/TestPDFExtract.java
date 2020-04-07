
package main.java.com.metrobank.automation.testcase;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.com.metrobank.automation.core.base.BrowserConnection;
import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.TestUtil;
import main.java.com.metrobank.automation.core.utilities.filehandler.FileHandle;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.automation.generics.AutomationConstants;

public class TestPDFExtract extends BrowserConnection{

	WebDriver driver;
	
	
	@Test
	public void testExtract() throws Exception{
		
		// Set up logger
		LogGeneration logGeneration = new LogGeneration();
		logGeneration.generateReport("PDF Extract");
		
		// Step 1 : Setup browser connection
		driver = SetBrowser(BrowserType.chrome);
		FileHandle fileHandle = new FileHandle();
		
		String[] text = fileHandle.readPdfFile(System.getProperty(AutomationConstants.USER_DIRECTORY) + "\\" + "Sample4.pdf");
		File file = new File(text[1]);
		try{
			Assert.assertTrue(text[0].contains("Worts"));
			System.out.println(TestUtil.encodeFileToBase64Binary(file));
			logGeneration.inputLogs(LogType.pass, "Worts is found in PDF", null);
			logGeneration.inputLogs(LogType.info, "Extract Image in PDF", TestUtil.encodeFileToBase64Binary(file));
		}catch(Exception e){
			logGeneration.inputLogs(LogType.fail, "Worts is not found in PDF", null);
		}
		
		TestUtil.waitTime(5);
		driver.quit();
			logGeneration.extentFlush();
	
	}
	
	
	
	
	}
	
	

