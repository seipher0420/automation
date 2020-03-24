/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @Description 
 * This class contains implementation
 * for the Driver interface
 * which includes WebDriver base methods
 * and extension methods
 */
public class DriverImpl implements Driver {

	private final WebDriver driver;
	
	public DriverImpl(final WebDriver driver) {
		this.driver = driver;
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
		driver.quit();
	}

	@Override
	public TargetLocator switchTo() {
		return driver.switchTo();
	}



	
	/************ Extension Methods *************/
	
	/** @Description 
	 * Driver navigates to specified url
	 * 
	 */
	@Override
	public void NavigateToUrl(String url) {
		driver.navigate().to(url);
		
//		Textbox(driver, By.id("xyz"));
	}
	
	
}
