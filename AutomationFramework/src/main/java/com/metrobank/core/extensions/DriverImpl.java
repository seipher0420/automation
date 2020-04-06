/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import main.java.com.metrobank.automation.core.base.Enums.AlertType;
import main.java.com.metrobank.automation.core.base.Enums.BrowserType;
import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;


/**
 * @Description 
 * This class contains implementation
 * for the Driver interface
 * which includes WebDriver base methods
 * and extension methods
 */
public class DriverImpl implements Driver {

	private final WebDriver driver;
	private final LogGeneration logger;
	
	public DriverImpl (WebDriver driver) {
		this.driver = driver;
		logger = new LogGeneration();
		logger.inputLogs(LogType.pass, "Initializing browser...", null);
	}
	
	/************** Base Methods *************/
	@Override
	public void close() {
		driver.close();
	}
	@Override
	public WebElement findElement(By arg0) {
		return driver.findElement(arg0);
	}
	@Override
	public List<WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}
	@Override
	public void get(String arg0) {
		driver.get(arg0);
	}
	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}
	@Override
	public String getTitle() {
		return driver.getTitle();
	}
	@Override
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}
	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}
	@Override
	public Options manage() {
		return driver.manage();
	}
	@Override
	public Navigation navigate() {
		return driver.navigate();
	}
	@Override
	public void quit() {
		logger.inputLogs(LogType.pass, "Quitting browser...", null);
		driver.quit();
	}
	@Override
	public TargetLocator switchTo() {
		return driver.switchTo();
	}
	
	/************ Extension Methods *************/
	@Override
	public void NavigateToUrl(String url) {
		driver.navigate().to(url);
		logger.inputLogs(LogType.pass, "Navigating to url-> " + url, null);
	}
	@Override
	public void MaximizeWindow() {
		driver.manage().window().maximize();
	}
	@Override
	public void ExecuteJavaScript(String script) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(script);
	}
	@Override
	public boolean HasAlert() {
		try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
	}
	@Override
	public void Alert(AlertType alertType) {
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
	@Override
	public void Refresh() {
		driver.navigate().refresh();
	}
}
