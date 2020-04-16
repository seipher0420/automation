package main.java.com.metrobank.automation.pages.POM.Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.pages.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

/**
 * @Description 
 * Contains common objects
 *
 */

public class Controls extends BasePage{

	WebDriver driver;
	
	public Controls(WebDriver driver) {
		super(driver, Locators.CONTROLS);
		this.driver = driver;
	}

	public Controls ViewCart() {
		Link(By.id(getLocator("cartId"))).click();
		return this;
	}
	
	public Controls OpenMenu() {
		Button(By.xpath(getLocator("openMenuXpath"))).click();
		return this;
	}
	
	public Controls CloseMenu() {
		Button(By.xpath(getLocator("closeMenuXpath"))).click();
		return this;
	}
	
	public Controls ViewAllItems() {
		Button(By.xpath(getLocator("openMenuXpath"))).click();
		Link(By.id(getLocator("allItemsId"))).click();
		return this;
	}
	
	public Controls ViewAbout() {
		Button(By.xpath(getLocator("openMenuXpath"))).click();
		Link(By.id(getLocator("aboutId"))).click();
		return this;
	}
	
	public Controls Logout() {
		Button(By.xpath(getLocator("openMenuXpath"))).click();
		Link(By.id(getLocator("logoutId"))).click();
		return this;
	}
	
	public Controls Reset() {
		Button(By.xpath(getLocator("openMenuXpath"))).click();
		Link(By.id(getLocator("resetId"))).click();
		return this;
	}
	
	public Controls Cancel() {
		Link(By.xpath(getLocator("cancelXpath"))).click();
		return this;
	}
	
	public Controls Continue() {
		Button(By.cssSelector(getLocator("continueCss"))).click();
		return this;
	}
	
	public Controls Finish() {
		Link(By.xpath(getLocator("finishXpath"))).click();
		return this;
	}
	
	public Controls Back() {
		Button(By.xpath(getLocator("backXpath"))).click();
		return this;
	}
	
	public Controls Remove() {
		Button(By.xpath(getLocator("removeXpath"))).click();
		return this;
	}
	
}
