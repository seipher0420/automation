
package main.java.com.metrobank.automation.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPageObjects {

	public boolean clickElement(WebElement element){
		
		try{
			element.click();
			return true;
		}catch(Exception e){		
			return false;
		}
	}
	
	public boolean enterText(WebElement element, String text) {
		
		try{
			element.sendKeys(text);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public String getText(WebElement element){
		
		String genericText;
		try{
		 genericText = element.getText();
		 	return genericText;
		}catch(Exception e){
			return e.getMessage();
		}
		
	}	
}
