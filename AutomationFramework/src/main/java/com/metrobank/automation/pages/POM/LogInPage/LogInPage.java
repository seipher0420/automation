package main.java.com.metrobank.automation.pages.POM.LogInPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.pages.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class LogInPage extends BasePage {

	private final PropertyFileHandler property;
	
	/* Parameters List */
	private String LOGINBTN_CSS;
	private String USERNAME_ID;
	private String PASSWORD_ID;
	
	
	public LogInPage(WebDriver driver) {
		super(driver);
		
		this.property = new PropertyFileHandler(Locators.LOGINPAGE);
		InitializeParameters();
	}
	
	private void InitializeParameters() {
		USERNAME_ID = property.GetValue("usernameId");
		PASSWORD_ID = property.GetValue("passwordId");
		LOGINBTN_CSS = property.GetValue("loginBtnCss");
	}
	
	public LogInPage ClickLoginButton() throws IOException{
		Button(By.cssSelector(LOGINBTN_CSS)).click();
		return this;
	}
	
	public LogInPage EnterUsername(String value) throws IOException {
		Textbox(By.id(USERNAME_ID)).sendKeys(value);
		return this;
	}
	
	public LogInPage EnterPassword(String value) throws IOException {
		Textbox(By.id(PASSWORD_ID)).sendKeys(value);
		return this;
	}
	
}