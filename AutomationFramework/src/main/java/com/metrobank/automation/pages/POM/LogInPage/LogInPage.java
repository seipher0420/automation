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
		Button("loginBtn_css").click();
		return this;
	}
	
	public LogInPage EnterUsername(String value) {
		Textbox("username_id").sendKeys(value);
		return this;
	}
	
	public LogInPage EnterPassword(String value) {
		Textbox("password_id").sendKeys(value);
		return this;
	}
	
}