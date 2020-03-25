package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class DriverExtension {

	public static void NavigateToUrl (WebDriver driver, String url) {
		driver.navigate().to(url);
	}
	
	public static void MaximizeWindow(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public static void ExecuteJavaScript(WebDriver driver, String script)
    {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(script);
    }
	
}
