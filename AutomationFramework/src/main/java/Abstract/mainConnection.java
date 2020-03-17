package main.java.Abstract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class mainConnection {

	String chromeDriver;
	String ieDriver;
	String url;
	WebDriver webDriver;
	String userDirectory;
	
	@SuppressWarnings("deprecation")
	public WebDriver connection(String webBrowser) throws IOException{
		
		Properties properties = new Properties();
		userDirectory = System.getProperty("user.dir");
		FileInputStream propertyFile = new FileInputStream(userDirectory + "/src/main/utilities/properties/main.properties");
		
		properties.load(propertyFile);
		
		if(webBrowser.equals("chrome")){
			chromeDriver = properties.getProperty("chrome");
			System.setProperty("webdriver.chrome.driver",userDirectory + chromeDriver);
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.navigate().to(properties.getProperty("url"));
			
		}else if(webBrowser.equals("internetexplorer")){
			ieDriver = properties.getProperty("internetexplorer");
			System.setProperty("webdriver.ie.driver", userDirectory + ieDriver);
//			webDriver = new InternetExplorerDriver();
		    DesiredCapabilities	 capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
            webDriver = new InternetExplorerDriver(capabilities);
			webDriver.manage().window().maximize();
			webDriver.navigate().to(properties.getProperty("url"));
	
			
		}else{
			System.out.println("Driver not Compatible");
		}
		
		return webDriver;
		
		
	}
	
}
