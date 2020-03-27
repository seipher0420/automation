package main.java.com.metrobank.automation.core.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import main.java.com.metrobank.automation.generics.AutomationConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * @Description
 * for getting the driver connection and Web App
 * @Parameter String webBrowser for getting the name of browser
 * @Return value of WebDriver
 */


public abstract class mainConnection {

	String chromeDriver;
	String ieDriver;
	String firefoxDriver;
	String url;
	WebDriver webDriver;
	String userDirectory;
	
	@SuppressWarnings("deprecation")
	public WebDriver connection(String webBrowser) throws IOException{
		
		Properties properties = new Properties();
		userDirectory = System.getProperty(AutomationConstants.USER_DIRECTORY);
		FileInputStream propertyFile = new FileInputStream(userDirectory + AutomationConstants.PROPERTY_FILE);
		
		properties.load(propertyFile);
		
		//For using Chrome Browser
		if(webBrowser.equals(AutomationConstants.CHROME_BROWSER)){
			chromeDriver = properties.getProperty(AutomationConstants.CHROME_BROWSER);
			System.setProperty("webdriver.chrome.driver",userDirectory + chromeDriver);
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.navigate().to(properties.getProperty("url"));
		
		//For using IE Browser
		}else if(webBrowser.equals(AutomationConstants.INTERNET_EXPLORER_BROWSER)){
			ieDriver = properties.getProperty(AutomationConstants.INTERNET_EXPLORER_BROWSER);
			System.setProperty("webdriver.ie.driver", userDirectory +  ieDriver);
			webDriver = new InternetExplorerDriver();
		    DesiredCapabilities	 capabilities = DesiredCapabilities.internetExplorer();
		    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		    webDriver = new InternetExplorerDriver(capabilities);
			webDriver.manage().window().maximize();
			webDriver.navigate().to(properties.getProperty("url"));
		
		//For using firefox Browser
		}else if(webBrowser.equals(AutomationConstants.FIREFOX_BROWSER)){
			firefoxDriver = properties.getProperty(AutomationConstants.FIREFOX_BROWSER);
			System.setProperty("webdriver.gecko.driver", userDirectory + firefoxDriver);
			webDriver = new FirefoxDriver();
			webDriver.manage().window().maximize();
			webDriver.navigate().to(properties.getProperty("url"));
	

		}else{
			System.out.println(AutomationConstants.FRAMEWORK_LOGS + "Driver not Compatible");
		}
		
		return webDriver;
		
		
	}
	
}
