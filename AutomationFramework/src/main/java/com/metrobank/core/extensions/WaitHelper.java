package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	private static final int timeout = 10;
	
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
	
	public static void WaitUntilClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void WaitUntilVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void WaitUntilSelected(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void WaitUntilTextPresentIn(WebDriver driver, WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	public static void WaitUntilPresenceOf(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public static void WaitUntilAlertPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void WaitUntilTitleContains(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static void WaitUntilTitleIs(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public static void WaitUntilStale(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.stalenessOf(element));
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
