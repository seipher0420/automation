package main.java.com.metrobank.automation.pages.POM.MARC.OutstandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;
import main.java.com.metrobank.automation.pages.POM.LogInPage.LogInPage;

public class OutstandingPage extends BasePage {

	public OutstandingPage(WebDriver driver) {
		super(driver, Locators.OUTSTANDINGPAGE);

	}

	public OutstandingPage JumpTo(String value) {
		Textbox(By.id(getLocator("jumpNumber_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage ShowDropDown() {
		Dropdown(By.id(getLocator("selPageLimit_id"))).click();
		return this;
	}

	public OutstandingPage selectDropdownShow(String value) {
		String optionLocator = getLocator("option_xpath");
		String valueLocator = optionLocator.substring(0, 48) + value
				+ optionLocator.substring(49, 50);
		Dropdown(By.xpath(valueLocator)).click();
		return this;
	}

	public OutstandingPage selectPage(String value) {
		String optionLocator = getLocator("pagnumber_xpath");
		String valueLocator = optionLocator.substring(0, 67) + value
				+ optionLocator.substring(68, 69);
		Button(By.xpath(valueLocator)).click();
		return this;
	}

	public OutstandingPage buttonShowHideSearch() {
		Button(By.id("button_show_id")).click();
		return this;
	}

	public OutstandingPage inputOpicsBranch(String value) {
		Textbox(By.id(getLocator("opics_branch_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputMnemonic(String value) {
		Textbox(By.id(getLocator("mnemonic_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputportfolio(String value) {
		Textbox(By.id(getLocator("portfolio_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputCcy(String value) {
		Textbox(By.id(getLocator("ccy_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputWithHoldOut(String value) {
		Textbox(By.id(getLocator("withHold-out_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputTsaAccount(String value) {
		Textbox(By.id(getLocator("tsaAccount_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputMbtcBranch(String value) {
		Textbox(By.id(getLocator("mbtcbranch_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputSecurityId(String value) {
		Textbox(By.id(getLocator("security_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputMaturityDate(String value) {
		Textbox(By.xpath(getLocator("maturityDate_xpath"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputValueDate(String value) {
		Textbox(By.xpath(getLocator("valueDate_xpath"))).sendKeys(value);
		return this;
	}

	public OutstandingPage inputTraderId(String value) {
		Textbox(By.id(getLocator("trader_id"))).sendKeys(value);
		return this;
	}

	public OutstandingPage clickResetCriteriaBtn() {
		Button(By.xpath(getLocator("resetCriteriaBtn_xpath"))).click();
		return this;
	}

	public OutstandingPage clickSearchBtn() {
		Button(By.xpath(getLocator("searchBtn_xpath"))).click();
		return this;
	}

	public OutstandingPage clickActionBtn() {
		Button(By.xpath(getLocator("actionBtn_xpath"))).click();
		return this;
	}

	public OutstandingPage clickAddHoldOutBtn() {
		Button(By.xpath(getLocator("addHoldoutBtn_xpath"))).click();
		return this;

	}

	public OutstandingPage clickAddPreTermBtn() {
		Button(By.xpath(getLocator("addPreTermBtn_xpath"))).click();
		return this;

	}

	public OutstandingPage inputAssetSwapDealNo(String value) {
		Button(By.xpath(getLocator("addPreTermBtn_xpath"))).click();
		return this;

	}
	
	public OutstandingPage selectAssetSwapValue(String value) {
		String optionLocator = getLocator("assetSwapDealValue_xpath");
		String valueLocator = optionLocator.substring(0, 47) + value
				+ optionLocator.substring(48, 49);
		Button(By.xpath(valueLocator)).click();
		return this;

	}
	
	public OutstandingPage inputRemarks(String value){
		Textbox(By.id(getLocator("remark_id"))).sendKeys(value);
		return this;
		
	}
	
	public OutstandingPage clickHoldOutRecordbtn() {
		Button(By.xpath(getLocator("holdoutRecordbtn_xpath"))).click();
		return this;

	}
	
	public OutstandingPage clickCancelBtn() {
		Button(By.xpath(getLocator("cancelbtn_xpath"))).click();
		return this;

	}
	
	public OutstandingPage inputPurchaseNo(String value) {
		Textbox(By.id(getLocator("purchaseDealNo_id"))).sendKeys(value);
		return this;
	}
	
	public OutstandingPage clickGetAmountBtn(){
		Button(By.xpath(getLocator("getAmountbtn_xpath"))).click();
		return this;
	}
	
	public OutstandingPage clickPreTerminateDealButton(){
		Button(By.xpath(getLocator("preTerminatDealBtn_xpath"))).click();
		return this;
	}
	
	

	
	
	
	
	

}
