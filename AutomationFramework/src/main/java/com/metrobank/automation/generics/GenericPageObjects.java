
package main.java.com.metrobank.automation.generics;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericPageObjects {

	public static void clickElement(WebDriver driver, WebElement element){
		
		try{
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
		}catch(StaleElementReferenceException staleElement){		
			element.click();
		}
		
	}
	
	public static void enterText(WebDriver driver, WebElement element, String text) {
		
		try{
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(text);
		
		}catch(StaleElementReferenceException staleElement){		
			element.sendKeys(text);
		}
	}
	
	public String getText(WebDriver driver, WebElement element){
		
		String genericText;
		try{
		 genericText = element.getText();
		 	return genericText;
		}catch(Exception e){
			return e.getMessage();
		}
	}	
	
	public static void selectDropDown(WebDriver driver, WebElement element, String text){
		Select dropdown = new Select(element);
		try{
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeSelected(element));
			dropdown.selectByValue(text);
		}catch (StaleElementReferenceException staleElement){
			dropdown.selectByValue(text);
		}
		
		
	}
	
	
}
