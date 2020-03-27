package main.java.com.metrobank.automation.pages.POM.LogInPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.pages.BasePage;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		super(driver);
		
	}
	
	public LogInPage ClickLoginButton() throws IOException{
		Button(By.cssSelector(LogInPageLocators.LOGINBTN_CSS)).click();
		return this;
	}
	
	public LogInPage EnterUsername(String value) throws IOException {
		Textbox(By.id(LogInPageLocators.USERNAME_ID)).sendKeys(value);
		return this;
	}
	
	public LogInPage EnterPassword(String value) throws IOException {
		Textbox(By.id(LogInPageLocators.PASSWORD_ID)).sendKeys(value);
		return this;
	}
	
}