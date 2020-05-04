package main.java.com.metrobank.automation.pages.POM.CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class OverviewPage extends BasePage {

	public OverviewPage(WebDriver driver) {
		super(driver, Locators.CHECKOUTPAGE);
	}
	
	public OverviewPage ViewItem(String itemName) {
		String xpath = String.format("//div[contains(text(), '%s')]/..", itemName);
		Link(By.xpath(xpath)).click();
		return this;
	}
	
	public OverviewPage Finish() {
		Link(By.xpath(getLocator("finishXpath"))).click();
		return this;
	}
	
	public String GetReferenceNumber() {
		return Label(By.xpath("//div[contains(text(), 'SauceCard')]")).getText();
	}

}
