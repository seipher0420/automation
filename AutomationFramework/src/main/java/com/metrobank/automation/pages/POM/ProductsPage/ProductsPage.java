package main.java.com.metrobank.automation.pages.POM.ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver, Locators.PRODUCTSPAGE);
	}
	
	public ProductsPage ClickBackPack() {
		Link(By.id(getLocator("id_backpack"))).click();
		return this;
	}
	public ProductsPage ClickBackPackAddToCart() {
//		Link(By.id(getLocator("id_backpack"))).getParent().getParent()
//		.findElement(By.xpath("./descendant::button[text()='ADD TO CART']")).click();
		Button(By.xpath(getLocator("xpath_backpackAddToCart"))).click();
		return this;
	}
	public ProductsPage ClickBikeLight() {
		Link(By.id(getLocator("id_bikeLight"))).click();
		return this;
	}
	public ProductsPage ClickBikeLightAddToCart() {
		Button(By.xpath(getLocator("xpath_bikeLightAddToCart"))).click();
		return this;
	}
	public ProductsPage ClickBoltShirt() {
		Link(By.id(getLocator("id_boltShirt"))).click();
		return this;
	}
	public ProductsPage ClickBoltShirtAddToCart() {
		Button(By.xpath(getLocator("xpath_boltShirtAddToCart"))).click();
		return this;
	}
	public ProductsPage ClickFleeceJacket() {
		Link(By.id(getLocator("id_fleeceJacket"))).click();
		return this;
	}
	public ProductsPage ClickFleeceJacketAddToCart() {
		Button(By.xpath(getLocator("xpath_fleeceJacketAddToCart"))).click();
		return this;
	}
	public ProductsPage ClickOnesie() {
		Link(By.id(getLocator("id_onesie"))).click();
		return this;
	}
	public ProductsPage ClickOnesieAddToCart() {
		Button(By.xpath(getLocator("xpath_onesieAddToCart"))).click();
		return this;
	}
	public ProductsPage ClickRedShirt() {
		Link(By.id(getLocator("id_redShirt"))).click();
		return this;
	}
	public ProductsPage ClickRedShirtShirtAddToCart() {
		Button(By.xpath(getLocator("xpath_redShirtAddToCart"))).click();
		return this;
	}
}
