package main.java.com.metrobank.automation.pages.POM.CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.pages.BasePage;
import main.java.com.metrobank.automation.pages.Locators;
import main.java.com.metrobank.automation.pages.POM.Controls.Controls;

public class YourInformationPage extends BasePage {

	public YourInformationPage(WebDriver driver) {
		super(driver, Locators.CHECKOUTPAGE);
	}
	
	public YourInformationPage EnterFirstName(String name) {
		Textbox(By.id(getLocator("firstnameId"))).sendKeys(name);
		return this;
	}
	
	public YourInformationPage EnterLastName(String name) {
		Textbox(By.id(getLocator("lastnameId"))).sendKeys(name);
		return this;
	}
	
	public YourInformationPage EnterZipCode(String code) {
		Textbox(By.id(getLocator("zipcodeId"))).sendKeys(code);
		return this;
	}
	
	public YourInformationPage Cancel() {
		Link(By.xpath(getLocator("cancelXpath"))).click();
		return this;
	}
	
	public YourInformationPage Continue() {
		Button(By.cssSelector(getLocator("continueCss"))).click();
		return this;
	}
	

}
