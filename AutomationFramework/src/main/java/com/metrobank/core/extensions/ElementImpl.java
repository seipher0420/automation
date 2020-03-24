/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;

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

	/********* Base methods *********/
	@Override
	public void clear() {
		element.clear();
	}

	@Override
	public void click() {
		element.click();	
	}

	@Override
	public WebElement findElement(By by) {
		return element.findElement(by);
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
	public void sendKeys(CharSequence... arg0) {
		element.sendKeys(arg0);
	}

	@Override
	public void submit() {
		element.submit();
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		return element.getScreenshotAs(arg0);
	}

	@Override
	public Element getWrappedElement() {
		return getWrappedElement();
	}

	
	/********** Extension Methods ************/
	
	
	

}
