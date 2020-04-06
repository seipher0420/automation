/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.Enums.AlertType;

/**
 * @Description
 * Interface for WebDriver Extensions
 *
 */
public interface Driver extends WebDriver {
	void NavigateToUrl(String url);
	void Refresh();
	void MaximizeWindow();
	void ExecuteJavaScript(String script);
	boolean HasAlert();
    void Alert(AlertType alertType);
}
