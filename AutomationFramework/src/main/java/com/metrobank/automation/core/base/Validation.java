package main.java.com.metrobank.automation.core.base;

import org.testng.Assert;

import main.java.com.metrobank.automation.core.base.Enums.LogType;
import main.java.com.metrobank.automation.core.utilities.TestUtil;
import main.java.com.metrobank.automation.core.utilities.logger.LogGeneration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validation {
	final WebDriver driver;
	LogGeneration logger;
	
	public Validation(WebDriver driver) {
		this.driver = driver;
		logger = new LogGeneration();
	}
	
	public boolean ValidateThatObjectExists(String parameter) {
		try {
			String xpath = String.format("//*[contains(text(), '%s')]", parameter);
			WebElement element = driver.findElement(By.xpath(xpath));
			if (element != null) {
				logger.inputLogs(LogType.pass, String.format("Parameter:{%s} exists", parameter), null);
				return true;
			}
			else
			{
				logger.inputLogs(LogType.fail, String.format("Parameter:{%s} does NOT exist", parameter), TestUtil.getScreenshot(driver));
				return false;
			}
		} catch (Exception e) {
			logger.inputLogs(LogType.fail, String.format("Parameter:{%s} does NOT exist", parameter), TestUtil.getScreenshot(driver));
			return false;
		}
	}
	
	public boolean ValidateThatObjectExists(String parameter, boolean takeScreenshot) {
		try {
			String xpath = String.format("//*[contains(text(), '%s')]", parameter);
			WebElement element = driver.findElement(By.xpath(xpath));
			if (element != null) {
				logger.inputLogs(LogType.pass, String.format("Parameter:{%s} exists", parameter), TestUtil.getScreenshot(driver));
				return true;
			}
			else
			{
				logger.inputLogs(LogType.fail, String.format("Parameter:{%s} does NOT exist", parameter), TestUtil.getScreenshot(driver));
				return false;
			}
		} catch (Exception e) {
			logger.inputLogs(LogType.fail, String.format("Parameter:{%s} does NOT exist", parameter), TestUtil.getScreenshot(driver));
			return false;
		}
	}
	
	public boolean ValidatePage(List<String> parameters) {
		boolean result = false;
		
		for (String param : parameters) {
			if (ValidateThatObjectExists(param) == false) {
				return false;
			}
			else {
				result = true;
			}
		}
		
		return result;
	}
}
