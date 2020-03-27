package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitImpl implements Wait {

	private final int timeout = 10;
	
	@Override
	public void WaitUntilElementLoads(WebDriver driver, By by) {
		while (true) {
			try {
				if (driver.findElement(by).isDisplayed()) {
					break;
				}
			}
			catch (NullPointerException e) {
				continue;
			}
			catch (StaleElementReferenceException e) {
				break;
			}
		}
	}

	@Override
	public void WaitUntilElementLoads(Element element) {
		while (true) {
			try {
				if (element.isDisplayed()) {
					break;
				}
			}
			catch (NullPointerException e) {
				continue;
			}
			catch (StaleElementReferenceException e) {
				break;
			}
		}
	}

	@Override
	public Element WaitUntilClickable(WebDriver driver, Element element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable((WebElement)element));
		return element;
	}

	@Override
	public Element WaitUntilVisibile(WebDriver driver, Element element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf((WebElement)element));
		return element;
	}

}
