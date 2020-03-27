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
	
	public ElementImpl(final WebElement element) {
		this.element = element;
		logger = new LogGeneration();
	}

	/**------------- Base methods --------------*/
	@Override
	public void clear() {
		element.clear();
	}
	@Override
	public void click() {
		try {
			element.click();	
			logger.inputLogs(LogType.info, "Action: CLICK on " + element, null);
		}
		catch (StaleElementReferenceException e) {
			try {
				logger.inputLogs(LogType.warning, "Attempting to find " + element, null);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void sendKeys(CharSequence... arg0) {
		element.sendKeys(arg0);
//		logger.inputLogs(LogType.info, "Action: INPUT \" on " + element, null);
	}
	@Override
	public void submit() {
		element.submit();
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
	public void doubleClick(WebDriver driver) {
		Actions actionsBuilder = new Actions(driver);
        Action action = actionsBuilder.doubleClick(element).build();
        action.perform();
	}
	@Override
	public void rightClick(WebDriver driver) {
		Actions actionsBuilder = new Actions(driver);
        Action action = actionsBuilder.contextClick(element).build();
        action.perform();
	}
	@Override
	public void hover(WebDriver driver) {
		Actions action = new Actions(driver);
        action.moveToElement(element).perform();
	}
	@Override
	public void hoverAndClick(WebDriver driver) {
		Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
	}
	@Override
	public void clearAndSetValue(String value) {
		element.clear();
		sendKeys(value);
	}
	@Override
	public void SelectByText(String text) {
		Select item = new Select(element);
		item.selectByValue(text);
	}
	@Override
	public void jClick() {
		JavascriptExecutor executor = GetJavascriptExecutor();
		executor.executeScript("arguments[0].click();", element);
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
			WebElement parent = element.findElement(By.xpath("./parent::*"));
			return (Element) parent;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getChild() {
		try {
			WebElement child = element.findElement(By.xpath("./child::*"));
			return (Element) child;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getNextSibling() {
		try {
			WebElement sibling = element.findElement(By.xpath("./following-sibling::*"));
			return (Element) sibling;
		}
		catch (Exception e) {
			return null;
		}
	}
	@Override
	public Element getPreviousSibling() {
		try {
			WebElement sibling = element.findElement(By.xpath("./previous-sibling::*"));
			return (Element) sibling;
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


}
