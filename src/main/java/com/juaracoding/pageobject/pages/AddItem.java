package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class AddItem {
	
	public WebDriver driver;

	public AddItem() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Search Item
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchItem;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//span[@class='lighter']")
	private WebElement txtSearchResult;
	
	
//	Add Item 1
	@FindBy(css = ".replace-2x.img-responsive[src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
	private WebElement quickView;
	
	@FindBy(xpath = "//span[normalize-space()='Add to cart']")
	private WebElement itemOne;
	
	@FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
	private WebElement txtItemOne;
	
	@FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
	private WebElement continueShipping;
	
	
//	Add Item 2
	@FindBy(css = "..replace-2x.img-responsive[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	private WebElement quickViewTwo;
	
	@FindBy(xpath = "//span[normalize-space()='Add to cart']")
	private WebElement itemTwo;
	
	@FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
	private WebElement txtItemTwo;
	
	
	public void searchItem() {
		searchItem.sendKeys("Dress");
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public String getTxtSearchResult() {
		return txtSearchResult.getText();
		
	}
	
	public void btnView() {
		quickView.click();
	}
	
	public void btnAddCart() {
		itemOne.click();
	}
	
	public String getTxtItemOne() {
		return txtItemOne.getText();
	}
	
	public void continueShipping() {
		continueShipping.click();
	}
	
	public void btnViewTwo() {
		quickViewTwo.click();
	}
	
	public void btnAddCartTwo() {
		quickView.click();
	}
	
	public String getTxtItemTwo() {
		return txtItemTwo.getText();
	}

}
