package main.java.com.metrobank.automation.pages.Modules;

import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.utilities.PropertyFileHandler;
import main.java.com.metrobank.automation.pages.POM.ProductsPage.ProductsPage;

public class Products {

	private final WebDriver driver;
//	private final PropertyFileHandler property;
	
	/* Parameters List */
	private String username;
	private String password;
	
	
	public Products (WebDriver driver, String propertyFile) {
		this.driver = driver;
//		this.property = new PropertyFileHandler(propertyFile);
		// Get all test data and parameter values
//		InitializeParameters();
	}
	
	public void InitializeParameters() {
		
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
}
