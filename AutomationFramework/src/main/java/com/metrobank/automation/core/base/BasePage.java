package main.java.com.metrobank.automation.core.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
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
public abstract class BasePage {
	
	protected final WebDriver driver;
	private final PropertyFileHandler property;
	private LogGeneration logger;
	private String description;

    public BasePage (WebDriver driver, String locatorPath)
    {
        this.driver = driver;
        this.property = new PropertyFileHandler(locatorPath);
        logger = new LogGeneration();
    }
    
    protected Element Button (By by) {
    	try {
    		WebElement element = driver.findElement(by);
    		return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Textbox (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Label (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Image (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element MenuItem (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element TabItem (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Checkbox (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element RadioButton (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Dropdown (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Link (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element HyperLink (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Window (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    protected Element Element (By by) {
    	try {
    		WebElement element = driver.findElement(by);
        	return new ElementImpl(element);
    	}
    	catch (NoSuchElementException e) {
    		UnableToFind(by);
    		return null;
    	}
    }
    
  //**================== via String Locator Constants =====================**//
  	protected Element Button (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
      		return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
  	protected Element Textbox (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
  	protected Element Label (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Image (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element MenuItem (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element TabItem (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Checkbox (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element RadioButton (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Dropdown (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Link (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element HyperLink (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Window (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
      protected Element Element (String locator) {
      	try {
      		WebElement element = driver.findElement(by(locator));
          	return new ElementImpl(element);
      	}
      	catch (NoSuchElementException e) {
      		UnableToFind(locator);
      		return null;
      	}
      }
  	
      //**========================== Common Methods ==========================**//
  	protected By by(String locator) {
  		By by = null;
  		
  		String type = locator.substring(locator.indexOf("_") + 1);
  		switch (type) {
  		case "id" :
  			by = By.id(getLocator(locator));
  			break;
  		case "xpath" :
  			by = By.xpath(getLocator(locator));
  			break;
  		case "css" :
  			by = By.cssSelector(getLocator(locator));
  			break;
  		default :
  			break;
  		}
  		
  		return by;
  	}
    protected String getLocator(String value) {
    	return property.GetValue(value);
    }
    
  	private void UnableToFind(String locator) {
  		description = "Unable to locate element : "+ locator ;
  		logger.inputLogs(LogType.warning, description, null);
  	}
	private void UnableToFind(By by) {
		description = "Unable to locate element : "+ by ;
		logger.inputLogs(LogType.warning, description, null);
	}
	
}

