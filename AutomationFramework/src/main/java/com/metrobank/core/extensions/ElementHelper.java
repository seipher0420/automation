package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class ElementHelper {
	
//	private static Driver browser;
//	
//	public ElementHelper(Driver driver)
//    {
//		this.browser = driver;
//    }
	
	
	public static Element TextBox(WebDriver driver, By by) {
		return new ElementImpl(driver.findElement(by));
	}
	
	public static Element Button(WebDriver driver, By by) {
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
