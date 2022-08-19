package com.juaracoding.pageobject.posttest18;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.AddItem;
import com.juaracoding.pageobject.drivers.DriverSingleton;

public class TestSearchAdd {

	public static WebDriver driver;
	private AddItem addItem;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "http://automationpractice.com/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		addItem = new AddItem();
	}

	@Test
	public void testSearch() {
		addItem.searchItem();
		addItem.clickBtnSearch();
		String txt = addItem.getTxtSearchResult();
		assertTrue(txt.contains("DRESS"));
		
		
		scroll(400);
	}

	@Test
	public void tesAddItem() {
		addItem.btnView();
		addItem.btnAddCart();
		String txtOne = addItem.getTxtItemOne();
		assertTrue(txtOne.contains("Product successfully added to your shopping cart"));
		
		addItem.btnViewTwo();
		addItem.btnAddCartTwo();
		String txtTwo = addItem.getTxtItemTwo();
		assertTrue(txtTwo.contains("Product successfully added to your shopping cart"));
		
	}

	@AfterClass
	public void closebrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}

}
