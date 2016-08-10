package com.omniture.uiautomation.genesis.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.genesis.ui.GenesisShowcaseUI;
import com.omniture.uiautomation.genesis.ui.GenesisWizardUI;

public class GenesisShowcasePage extends GenesisPage {
	
	/*
	 * Basic behaviors.
	 */
	
	public void searchProduct(String query, String type) {
		this.clear(GenesisShowcaseUI.SEARCH_TEXT);
		this.type(GenesisShowcaseUI.SEARCH_TEXT, query);
		this.selectByValue(GenesisShowcaseUI.SEARCH_TYPE, type);
		this.click(GenesisShowcaseUI.SEARCH_BUTTON);
		this.waitUntilPageLoad();
	}
	
	public void changeUpperPagination(String value){
		this.selectByValue(GenesisShowcaseUI.PAGINATION_UPPER, value);
		this.waitUntilPageLoad();
	}
	
	public void changeLowerPagination(String value){
		this.selectByValue(GenesisShowcaseUI.PAGINATION_LOWER, value);
		this.waitUntilPageLoad();
	}
	
	public void activateIntegration(String productName){
		searchProduct(productName, "a");
		List<WebElement> list = this.findElements(GenesisShowcaseUI.ACTIVATE_BUTTON);
		list.get(0).click();
		this.waitUntilElement(GenesisWizardUI.WIZARD_WINDOW);
	}
	
	public void searchProduct(String productName)
	{
		this.searchProduct(productName, "a");
	}
	
	/*
	 * Assertions.
	 */

	public void assertShowcasePage(String path)
	{
		this.screenshot(path+"\\assertShowcasePage.png");
		this.assertElementExists(GenesisShowcaseUI.SHOWCASE_HEAD);
	}
	
	public void assertBasicShowcaseDisplay(String path)
	{
		this.screenshot(path+"\\assertBasicShowcaseDisplay.png");
		this.assertElementExists(GenesisShowcaseUI.SEARCH_BUTTON);
		this.assertElementExists(GenesisShowcaseUI.SEARCH_TEXT);
		this.assertElementExists(GenesisShowcaseUI.SEARCH_TYPE);
		this.assertElementExists(GenesisShowcaseUI.ACTIVATE_BUTTON);
	}
	
	public void assertSortByAlphabetical(String path)
	{
		List<WebElement> products = this.getProducts(GenesisShowcaseUI.PRODUCTS);
		this.screenshot(path+"\\assertSortByAlphabetical.png");
		assertSortByText(products);
	}
	
	public void assertSearch(String path){
		this.screenshot(path+"\\assertSearch.png");
		this.assertElementExists(GenesisShowcaseUI.SEARCH_TEXT);
		this.assertElementExists(GenesisShowcaseUI.SEARCH_TYPE);
		this.assertElementExists(GenesisShowcaseUI.SEARCH_BUTTON);
	}

	public void assertPagination(String value,String path){
		
		this.executeScript("window.scrollTo(80000,0)");
		this.screenshot(path+"\\assertPagination.png");
		this.assertSelected(GenesisShowcaseUI.PAGINATION_LOWER, value);
		this.executeScript("window.scrollTo(-80000,0)");
		this.screenshot(path+"\\assertPagination.png");
		this.assertSelected(GenesisShowcaseUI.PAGINATION_UPPER, value);
	}

	public void assertNoPagination(String path){
		this.executeScript("window.scrollTo(80000,0)");
		this.screenshot(path+"\\assertNoPagination.png");
		this.assertElementNotExists(GenesisShowcaseUI.PAGINATION_LOWER);
		this.executeScript("window.scrollTo(-80000,0)");
		this.screenshot(path+"\\assertNoPagination.png");
		this.assertElementNotExists(GenesisShowcaseUI.PAGINATION_UPPER);
	}
	
	public void assertResultsContainKeywords(String keywords,String path){
		List<WebElement> elements = this.findElements(GenesisShowcaseUI.SEARCH_ITEM_PRODUCT_NAME);
		this.screenshot(path+"\\assertResultsContainKeywords.png");
		for (WebElement e : elements){
            assertTrue("Search item does not contain keywords", !e.getText().contains(keywords));
        }
	}
}
