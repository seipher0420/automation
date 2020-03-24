/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.*;

/**
 * @Description 
 * This class contains implementation
 * for the Element interface
 * which includes WebElement base methods
 * and extension methods
 */
public class ElementImpl implements Element{

	private final WebElement element;
	
	public ElementImpl(final WebElement element) {
		this.element = element;
	}

	/**------------- Base methods --------------*/
	@Override
	public void clear() {
		element.clear();
	}
	@Override
	public void click() {
		element.click();	
	}
	@Override
	public void sendKeys(CharSequence... arg0) {
		element.sendKeys(arg0);
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
	
	/** Perform the Double Click 
	 * action on the element
	 */
	@Override
	public void doubleClick(Driver driver) {
		Actions actionsBuilder = new Actions(driver);
        Action action = actionsBuilder.doubleClick(element).build();
        action.perform();
	}

	@Override
	public void rightClick(Driver driver) {
		Actions actionsBuilder = new Actions(driver);
        Action action = actionsBuilder.contextClick(element).build();
        action.perform();
	}

	@Override
	public void hover(Driver driver) {
		Actions action = new Actions(driver);
        action.moveToElement(element).perform();
	}

	@Override
	public void hoverAndClick(Driver driver) {
		Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
	}

	@Override
	public void clearAndSetValue(String value) {
		element.clear();
		sendKeys(value);
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
	
	//*---------------- Element Getter Methods ----------------*/
	
	
	
	//*---------------- Common Methods -------------------*/
	@Override
	public WebDriver GetDriver(){
//		WrapsDriver wrappedElement = (WrapsDriver)element;
//		if (wrappedElement == null) {
//			// throw exception
//			throw new ArgumentException("Element must wrap a web driver", nameof(element));
//		}
//		else {
//			return wrappedElement.getWrappedDriver();
//		}
		
		return ((WrapsDriver)element).getWrappedDriver();
    }
	@Override
	public JavascriptExecutor GetJavascriptExecutor() {
		WebDriver driver = GetDriver();
		
		return (JavascriptExecutor)driver;
		
//		if (javascriptExecutor == null)
//        {
//            throw new ArgumentException("Element must wrap a web driver that supports javascript execution",
//                nameof(javascriptExecutor));
//        }
	}

	

}
