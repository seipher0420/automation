package main.java.com.metrobank.automation.core.base;

import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.generics.AutomationConstants;
import main.java.com.metrobank.core.extensions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * @Description
 * for setting up driver connection
 * @Parameter String webBrowser for getting the name of browser
 * @Return value of WebDriver
 */


public abstract class BrowserConnection {

	String chromeDriver;
	String ieDriver;
	String firefoxDriver;
	String url;
	String userDirectory;
	Driver driver;
	WebDriver webDriver;
	
	public WebDriver SetBrowser(BrowserType browser) {
		
		InitializeParameters();
		
		switch (browser) {
		
		// Google Chrome Browser
		case chrome:
			System.setProperty("webdriver.chrome.driver",userDirectory + chromeDriver);
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.navigate().to(url);	
//			driver = new DriverImpl(new ChromeDriver());
//			driver.MaximizeWindow();
//			driver.NavigateToUrl(url);
			break;
		
		// Internet Explorer Browser
		case ie:
			System.setProperty("webdriver.ie.driver", userDirectory +  ieDriver);
		    DesiredCapabilities	 capabilities = DesiredCapabilities.internetExplorer();
		    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		    driver = new InternetExplorerDriver(capabilities);
		    driver = new DriverImpl(new InternetExplorerDriver());
		    driver.MaximizeWindow();
		    driver.NavigateToUrl(url);
		    break;
		    
		// Mozilla Firefox Browser    
		case firefox:
			System.setProperty("webdriver.gecko.driver", userDirectory + firefoxDriver);
			driver = new DriverImpl(new FirefoxDriver());
			driver.MaximizeWindow();
		    driver.NavigateToUrl(url);
		    break;
		    
	    default :
	    	System.out.println("Driver not compatible");
	    	break;
		}
		
		return webDriver;
	}
	
	private void InitializeParameters() {
		
		PropertyFileHandler property = new PropertyFileHandler(AutomationConstants.PROPERTY_FILE);
		
		userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
		chromeDriver = property.GetValue(AutomationConstants.CHROME_BROWSER);
		ieDriver = property.GetValue(AutomationConstants.INTERNET_EXPLORER_BROWSER);
		firefoxDriver = property.GetValue(AutomationConstants.FIREFOX_BROWSER);
		url = property.GetValue("url");
	}
		
}