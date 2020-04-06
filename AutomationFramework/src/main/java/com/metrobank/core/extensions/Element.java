/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

/**
 * @Description
 * Interface for Element Extensions
 *
 */
public interface Element extends WebElement, WrapsElement {
		void sendKeys(String value);	
		void doubleClick();
		void rightClick();
		void hover();
		void hoverAndClick();
		void clearAndSetValue(String value);
		void SelectByText(String text);
		
		void jClick();		
		Element scrollIntoView();
		
		String getClassName();
		String getInnerHtml();
		String getOuterHtml();
		String getName();
		String getId();
		String getTitle();
		String getValue();
		String getType();
		String getStyle();
		Element getParent();
		Element getChild();
		Element getNextSibling();
		Element getPreviousSibling();
		
		WebDriver GetDriver();
		JavascriptExecutor GetJavascriptExecutor();
}
