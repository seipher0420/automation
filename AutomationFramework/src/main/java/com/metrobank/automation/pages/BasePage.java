package main.java.com.metrobank.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.TestUtil;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
import main.java.com.metrobank.core.extensions.Element;
import main.java.com.metrobank.core.extensions.ElementImpl;
import main.java.com.metrobank.core.extensions.WaitHelper;

/**
 * @Description
 * This class should be inherited by all Pages 
 * within the Automation Project
 *
 */
public abstract class BasePage extends WaitHelper {
	
	protected WebDriver driver;
	private LogGeneration logger;
	private String description;

    public BasePage (WebDriver driver)
    {
        this.driver = driver;
        logger = new LogGeneration();
    }
    
    protected Element Button (By by) throws IOException {
    	try {
    		WebElement element = FindAndWaitUntilClickable(driver, by);
//    		WebElement element = driver.findElement(by);
    		return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Textbox (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Label (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element MenuItem (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }

    protected Element TabItem (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Checkbox (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element RadioButton (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Dropdown (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Link (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
		
    protected Element HyperLink (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
    protected Element Window (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
	
    protected Element Element (By by) throws IOException {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
	
	private void UnableToFind(By by) throws IOException {
		description = "Unable to locate element : "+ by ;
		logger.inputLogs(LogType.warning, description, null);
	}
	
	    
}

