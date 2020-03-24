/**
 * 
 */
package main.java.com.metrobank.core.extensions;

import java.util.List;

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
		void doubleClick(Driver driver);
		void rightClick(Driver driver);
		void hover(Driver driver);
		void hoverAndClick(Driver driver);
		void clearAndSetValue(String value);
		
		void jClick();		
		Element scrollIntoView();
		
//		String getClassName();
//		String getInnerHtml();
//		String getOuterHtml();
//		String getName();
//		String getId();
//		String getTitle();
//		String getValue();
//		String getType();
//		String getStyle();
//		Element getParent();
//		Element getChild();
//		List<Element> getChildren();
//		Element getNextSibling();
//		Element getPreviousSibling();
		
		WebDriver GetDriver();
		JavascriptExecutor GetJavascriptExecutor();
}
