package main.java.com.metrobank.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.core.extensions.Element;
import main.java.com.metrobank.core.extensions.ElementImpl;

/**
 * @Description
 * This class should be inherited by all Pages 
 * within the Automation Project
 *
 */
public class BasePage {
	
	protected WebDriver driver;

    public BasePage (WebDriver driver)
    {
        this.driver = driver;
    }
    
    public Element Button (By by) {
    	return new ElementImpl(driver.findElement(by));
    }
    
    public static Element TextBox(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element MenuItem(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element TabItem(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Checkbox(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element RadioButton(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Dropdown(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Link(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element HyperLink(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Window(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Element(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
    
    
}

