package main.java.com.metrobank.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	// sample use
	public void ClickLoginButton() throws IOException {
		Button(By.id("login")).click();
		Textbox(null).getChild();
		MenuItem(By.id("dashboard")).SelectByText("item");
	}

}
