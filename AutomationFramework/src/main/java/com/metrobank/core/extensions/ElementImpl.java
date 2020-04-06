/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;

import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;
//import main.java.com.metrobank.core.extensions.WaitHelper;

/**
 * @Description 
 * This class contains implementation
 * for the Element interface
 * which includes WebElement base methods
 * and extension methods
 */
public class ElementImpl extends WaitHelper implements Element{

	private final WebElement element;
	private LogGeneration logger;
	
	// consider accessing driver for wait helpers
	public ElementImpl(final WebElement element) {
		this.element = element;
		logger = new LogGeneration();
	}

	/**------------- Base methods --------------*/
	@Override
	public void clear() {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.clear();
			logger.inputLogs(LogType.info, "action:CLEAR \t element: " + GetLocator(), null);
//			logger.inputLogs(LogType.info, String.format("Action:CLICK Element:%s", element), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:CLEAR could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void click() {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.click();	
			logger.inputLogs(LogType.info, "action:CLICK \t element: " + GetLocator(), null);
//			logger.inputLogs(LogType.info, String.format("Action:CLICK Element:%s", element), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:CLICK could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	public void sendKeys(String value) {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.sendKeys(value);
			logger.inputLogs(LogType.info, "action:INPUT \t value: {" + value + "} \t element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:INPUTVALUE could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		}
	}
	@Override
	public void sendKeys(CharSequence... arg0) {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.sendKeys(arg0);
			logger.inputLogs(LogType.info, "action:INPUT \t value: " + arg0 + " \t element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:INPUTVALUE could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		}
	}
	@Override
	public void submit() {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.submit();
			logger.inputLogs(LogType.info, "action:SUBMIT \t element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:SUBMIT could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public String getTagName() {
		return element.getTagName();
	}
	@Override
	public String getText() {
		return element.getText();
	}
	@Override
	public boolean isDisplayed() {
		return element.isDisplayed();
	}
	@Override
	public boolean isEnabled() {
		return element.isEnabled();
	}
	@Override
	public boolean isSelected() {
		return element.isSelected();
	}
	@Override
	public Element findElement(By by) {
		return (Element) element.findElement(by);
	}
	@Override
	public List<WebElement> findElements(By by) {
		return element.findElements(by);
	}
	@Override
	public String getAttribute(String arg0) {
		return element.getAttribute(arg0);
	}
	@Override
	public String getCssValue(String arg0) {
		return element.getCssValue(arg0);
	}
	@Override
	public Point getLocation() {
		return element.getLocation();
	}
	@Override
	public Rectangle getRect() {
		return element.getRect();
	}
	@Override
	public Dimension getSize() {
		return element.getSize();
	}
	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		return element.getScreenshotAs(arg0);
	}
	@Override
	public Element getWrappedElement() {
		return getWrappedElement();
	}
	
	/**-------------------- Extension Methods ----------------------*/
	@Override
	public void doubleClick() {
        try {
        	Actions actionsBuilder = new Actions(GetDriver());
			WaitUntilElementIsClickable(GetDriver(), element);	
			Action action = actionsBuilder.doubleClick(element).build();
			action.perform();
			logger.inputLogs(LogType.info, "action:DOUBLECLICK on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:DOUBLECLICK could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void rightClick() {
        try {
        	Actions actionsBuilder = new Actions(GetDriver());
			WaitUntilElementIsClickable(GetDriver(), element);	
			Action action = actionsBuilder.contextClick(element).build();
			action.perform();
			logger.inputLogs(LogType.info, "action:RIGHTCLICK on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:RIGHTCLICK could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void hover() {
        try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			Actions action = new Actions(GetDriver());
	        action.moveToElement(element).perform();
			logger.inputLogs(LogType.info, "action:HOVER on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:HOVER could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void hoverAndClick() {
        try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			Actions action = new Actions(GetDriver());
	        action.moveToElement(element).click().build().perform();
			logger.inputLogs(LogType.info, "action:CLICK on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:CLICK could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void clearAndSetValue(String value) {
		try {
			WaitUntilElementIsClickable(GetDriver(), element);	
			element.clear();
			sendKeys(value);
			logger.inputLogs(LogType.info, "action:INPUT \t value: " + value + " \t element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:INPUTVALUE could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		}
	}
	@Override
	public void SelectByText(String text) {
		try {
			WaitUntilElementIsVisible(GetDriver(), element);	
			Select item = new Select(element);
			item.selectByValue(text);
			logger.inputLogs(LogType.info, "action:SELECT on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:SELECT could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public void jClick() {
		try {
//			WaitUntilElementIsClickable(GetDriver(), element);	
			JavascriptExecutor executor = GetJavascriptExecutor();
			executor.executeScript("arguments[0].click();", element);
			logger.inputLogs(LogType.info, "action:jCLICK on element: " + GetLocator(), null);
		} catch (Exception e) {
			logger.inputLogs(LogType.warning, "action:jCLICK could not be completed on Element: " + GetLocator(), null);
			logger.inputLogs(LogType.warning, e.getMessage(), null);
		} 
	}
	@Override
	public Element scrollIntoView() {
		JavascriptExecutor executor = GetJavascriptExecutor();
		executor.executeScript("arguments[0].scrollIntoView(arguments[1]);", element);
		return (Element) element;
	}
	
	/**---------------- Element Getter Methods ----------------*/
@Override
	public String getClassName() {
		try {
			return element.getAttribute("class");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getInnerHtml() {
		try {
			return element.getAttribute("innerHTML");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getOuterHtml() {
		try {
			return element.getAttribute("outerHTML");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getName() {
		try {
			return element.getAttribute("name");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getId() {
		try {
			return element.getAttribute("id");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getTitle() {
		try {
			return element.getAttribute("title");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getValue() {
		try {
			return element.getAttribute("value");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getType() {
		try {
			return element.getAttribute("type");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public String getStyle() {
		try {
			return element.getAttribute("style");
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public Element getParent() {
		try {
			Element parent = findElement(By.xpath("./parent::*"));
			return parent;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getChild() {
		try {
			Element child = findElement(By.xpath("./child::*"));
			return child;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getNextSibling() {
		try {
			Element sibling = findElement(By.xpath("./following-sibling::*"));
			return sibling;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getPreviousSibling() {
		try {
			Element sibling = findElement(By.xpath("./previous-sibling::*"));
			return sibling;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	/**---------------- Common Methods -------------------*/
	@Override
	public WebDriver GetDriver(){
		WrapsDriver wrappedElement = (WrapsDriver)element;
		if (wrappedElement == null) {
			logger.inputLogs(LogType.warning, "Element must wrap a web driver Element:" + GetLocator(), null);
			throw new IllegalArgumentException("Element must wrap a web driver");
		}
		return wrappedElement.getWrappedDriver();
    }
	@Override
	public JavascriptExecutor GetJavascriptExecutor() {
		
		WebDriver driver = GetDriver();
		
		return (JavascriptExecutor)driver;
		
//		if (javascriptExecutor == null)
//        {
//            throw new ArgumentException("Element must wrap a web driver that supports javascript execution")
//        }
	}
	
	private String GetLocator() {
		String locator = element.toString();
		locator = locator.substring(locator.indexOf("-> ") + 3);
		locator = locator.substring(0, locator.lastIndexOf("]"));
		locator = locator.replaceFirst(":", "->");
		return locator;
	}
}
