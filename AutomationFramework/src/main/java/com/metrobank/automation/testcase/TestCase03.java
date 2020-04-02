package main.java.com.metrobank.automation.testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import main.java.com.metrobank.automation.core.base.mainConnection;
import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.automation.generics.AutomationConstants;
import main.java.com.metrobank.automation.pages.Locators;
import main.java.com.metrobank.automation.pages.Modules.*;
import main.java.com.metrobank.core.extensions.Driver;
import main.java.com.metrobank.core.extensions.DriverImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase03 extends mainConnection{

//	WebDriver driver;
	String chromeDriver;
	String url;
	Driver driver;
	String userDirectory;
	
	@Test
	public void testCase3() throws IOException{

		PropertyFileHandler property = new PropertyFileHandler(AutomationConstants.PROPERTY_FILE);
		
		//Initialize string parameters
		chromeDriver = property.GetValue(AutomationConstants.CHROME_BROWSER);
		userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
		url = property.GetValue("url");
		
		System.setProperty("webdriver.chrome.driver",userDirectory + chromeDriver);
		driver = new DriverImpl(BrowserType.chrome);
		driver.MaximizeWindow();
		driver.NavigateToUrl(url);
		
		LogIn login = new LogIn(driver, TestData.LOGIN);
		login.LogInSetup();
		
		driver.quit();
	}
	
	
}
