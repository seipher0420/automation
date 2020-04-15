package main.java.com.metrobank.automation.pages.POM.CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.pages.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class YourCartPage extends BasePage {

	public YourCartPage(WebDriver driver) {
		super(driver, Locators.CHECKOUTPAGE);
	}
	
	public YourCartPage ContinueShopping() {
		Button(By.xpath(getLocator("continueShoppingXpath"))).click();
		return this;
	}
	
	public YourCartPage Checkout() {
		Button(By.xpath(getLocator("checkoutXpath"))).click();
		return this;
	}
	
	public YourCartPage RemoveItem(String itemName) {
		String xpath = String.format("//div[contains(text(), '%s')]/../../descendant::button[text()='REMOVE']", itemName);
		Button(By.xpath(xpath)).click();
		return this;
	}

}
