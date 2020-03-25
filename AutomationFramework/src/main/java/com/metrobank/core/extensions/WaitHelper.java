package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public abstract class WaitHelper {

	public static void WaitUntilElementLoads(WebDriver driver, By by) {
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
	
	public static void WaitUntilElementLoads(Element element) {
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
	
}
