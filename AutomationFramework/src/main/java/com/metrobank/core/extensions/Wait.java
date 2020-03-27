package main.java.com.metrobank.core.extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface Wait {
	void WaitUntilElementLoads(WebDriver driver, By by);
	void WaitUntilElementLoads(Element element);
	Element WaitUntilClickable(WebDriver driver, Element element);
	Element WaitUntilVisibile(WebDriver driver, Element element);
}
