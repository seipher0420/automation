package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.Enums.AlertType;

public class DriverExtension {

	public static void NavigateToUrl (WebDriver driver, String url) {
		driver.navigate().to(url);
	}
	
	public static void Refresh (WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public static void MaximizeWindow (WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public static void ExecuteJavaScript (WebDriver driver, String script)
    {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(script);
    }
    
    public static boolean HasAlert (WebDriver driver) {
    	try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void Alert (WebDriver driver, AlertType alertType) {
    	switch (alertType) {
    	case accept:
    		driver.switchTo().alert().accept();
    		break;
    	case dismiss:
    		driver.switchTo().alert().dismiss();
    		break;
		default:
    			break;
    	}
    }
	
}
