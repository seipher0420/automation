package main.java.com.metrobank.automation.pages.POM.LogInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		super(driver, Locators.LOGINPAGE);
	}
	
	public LogInPage ClickLoginButton() {
		Button(By.cssSelector(getLocator("loginBtnCss"))).click();
		return this;
	}
	
	public LogInPage EnterUsername(String value) {
		Textbox(By.id(getLocator("usernameId"))).sendKeys(value);
		return this;
	}
	
	public LogInPage EnterPassword(String value) {
		Textbox(By.id(getLocator("passwordId"))).sendKeys(value);
		return this;
	}
	
}