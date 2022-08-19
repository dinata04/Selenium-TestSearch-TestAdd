package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SearchItem {
	
	public WebDriver driver;

	public SearchItem() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchItem;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//span[@class='lighter']")
	private WebElement txtSearchResult;
	
	public void searchItem() {
		searchItem.sendKeys("Dress");
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public String getTxtSearchResult() {
		return txtSearchResult.getText();
		
	}

}
