package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WaitHelper {

	private static int timeout = 10;
	
	public static void WaitUntilElementIsDisplayed(WebDriver driver, By by) {
		while (true) {
			try {
				if (driver.findElement(by).isDisplayed()) {
					break;
				}
			}
			catch (NoSuchElementException e) {
				continue;
			}
			catch (StaleElementReferenceException e) {
				break;
			}
		}
	}
	
	public static void WaitUntilElementIsDisplayed(Element element) {
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
	
	public static WebElement FindAndWaitUntilClickable(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = driver.findElement(by);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static WebElement FindAndWaitUntilVisible(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = driver.findElement(by);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
}
