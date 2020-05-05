package main.java.com.metrobank.automation.pages.POM.MARC.AllProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.com.metrobank.automation.core.base.BasePage;
import main.java.com.metrobank.automation.pages.Locators;

public class AllProductPage extends BasePage{

	public AllProductPage(WebDriver driver) {
		super(driver, Locators.ALLPRODUCTSPAGE);
		
	}
	
	public AllProductPage clickAddProductbtn(){
		Button(By.xpath(getLocator("addproduct_xpath"))).click();
		return this;
	}
	
	public AllProductPage clickGenerateExcel(){
		Button(By.id(getLocator("generateExcelFilebtn_id"))).click();
		return this;
	}

	public AllProductPage clickGeneratePDF(){
		Button(By.id(getLocator("generatePdfBtn_id"))).click();
		return this;
	}
	
	public AllProductPage inputProductDescription(String value){
		Button(By.id(getLocator("productDescription_id"))).sendKeys(value);
		return this;
	}

	public AllProductPage clickProductCode(){
		Button(By.id(getLocator("productCode_id"))).click();
		return this;
		
	}
	
	public AllProductPage selectProductCode(String value){
		String optionLocator = getLocator("productCodeOption_xpath");
		String valueLocator = optionLocator.substring(0, 56) + value
				+ optionLocator.substring(57, 59);
		Button(By.xpath(valueLocator)).click();
		return this;
		
	}
	
	public AllProductPage selectProductType(){
		Button(By.xpath(getLocator("selectOptions_xpath"))).click();
		return this;
	
	}

	
	public AllProductPage selectBranch(){
		Button(By.xpath(getLocator("selectOptions_xpath")));
		Button(By.xpath(getLocator("selectOptionss_xpath"))).click();
		return this;
	}
	
	public AllProductPage seleckCheckBox(String value){
		String optionLocator = getLocator("productCodeOption_xpath");
		String valueLocator = optionLocator.substring(0, 64) + value
				+ optionLocator.substring(65, 66);
		Button(By.xpath(valueLocator)).click();
		return this;
	}
	
	public AllProductPage clickSaveBtn(){
		Button(By.xpath(getLocator("saveBtn_xpath"))).click();
		return this;
	}
	
	public AllProductPage clickCancelBtn(){
		Button(By.xpath(getLocator("cancelBtn_xpath"))).click();
		return this;
	}
	
	public AllProductPage clickDeleteProductBtn(){
		Button(By.xpath(getLocator("deleteProductBtn_xpath"))).click();
		return this;
		}

	public AllProductPage clickEditProductBtn(){
		Button(By.xpath(getLocator("editProductBtn_xpath"))).click();
		return this;
		
	}
	


	
	


}


