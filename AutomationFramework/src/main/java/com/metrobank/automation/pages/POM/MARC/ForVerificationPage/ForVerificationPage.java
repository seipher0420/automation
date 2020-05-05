package main.java.com.metrobank.automation.pages.POM.MARC.ForVerificationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;


public class ForVerificationPage extends BasePage{

	public ForVerificationPage(WebDriver driver) {
		super(driver, Locators.FORVERIFICATIONPAGE);

	}
	
	public ForVerificationPage clickVerifyBtn(){
		Button(By.id(getLocator("verifyBtn_xpath"))).click();
		return this;
	}
	
	public ForVerificationPage clickRejectBtn(){
		Button(By.id(getLocator("rejectBtn_xpath"))).click();
		return this;
	}

	
	public ForVerificationPage clickYesbtn(){
		Button(By.id(getLocator("chooseYesBtn_xpath"))).click();
		return this;
	}

	
	public ForVerificationPage clickChooseNoBtn(){
		Button(By.id(getLocator("chooesNoBtn_xpath"))).click();
		return this;
	}
	
	public String getProductDescription(String value){
		String optionLocator = getLocator("productDescription_xpath");
		String valueLocator = optionLocator.substring(0, 25) + value
				+ optionLocator.substring(26, 28);
		String getProductDescription = Textbox(By.xpath(getLocator(valueLocator))).getText();
		return getProductDescription;
		
		
	}
	


}
