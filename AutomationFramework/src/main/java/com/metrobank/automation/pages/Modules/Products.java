package main.java.com.metrobank.automation.pages.Modules;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import main.java.com.metrobank.automation.core.base.Validation;
import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.pages.POM.CheckoutPage.*;
import main.java.com.metrobank.automation.pages.POM.Controls.Controls;
import main.java.com.metrobank.automation.pages.POM.ProductsPage.ProductsPage;

public class Products extends Validation {

	private final WebDriver driver;
	private final PropertyFileHandler property;
	
	public Products (WebDriver driver, String propertyFile) {
		super(driver);
		this.driver = driver;
		this.property = new PropertyFileHandler(propertyFile);
	}
	
	public void AddToCart_Backpack() {
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.ClickBackPackAddToCart();
	}
	
	public void AddToCart_BackpackAndOnesie() {
		ProductsPage productsPage = new ProductsPage(driver);
		
		productsPage.ClickBackPackAddToCart();
		productsPage.ClickOnesieAddToCart();
		
	}
	
	public String BuyBackpackAndJacket() {
		ProductsPage productsPage = new ProductsPage(driver);
		YourCartPage yourCartPage = new YourCartPage(driver);
		YourInformationPage yourInformationPage = new YourInformationPage(driver);
		OverviewPage overviewPage = new OverviewPage(driver);
		Controls controls = new Controls(driver);
		
		productsPage.ClickBackPackAddToCart().ClickFleeceJacketAddToCart();
		controls.ViewCart();
		yourCartPage.Checkout();
		yourInformationPage.EnterFirstName(property.GetValue("firstname"))
		.EnterLastName(property.GetValue("lastname"))
		.EnterZipCode(property.GetValue("zipcode"))
		.Continue();
		ValidatePage(Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bolt T-Shirt"));
//		Assert.assertTrue(ValidateThatObjectExists("hello"));
		String reference = overviewPage.GetReferenceNumber();
		overviewPage.Finish();
		
		return reference;
	}
}
