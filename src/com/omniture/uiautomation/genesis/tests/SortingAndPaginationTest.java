package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.genesis.ui.GenesisShowcaseUI;
import com.omniture.uiautomation.utils.ScreenShotUtil;


public class SortingAndPaginationTest extends GenesisTest {
	
	@Test
	public void testSortingAndPagination() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"SortingAndPaginationTest\\";
		//Login to genesis and navigate to showcase page. //Check "SEARCH_BUTTON","SEARCH_TEXT","SEARCH_TYPE" and "ACTIVATE_BUTTON" display.
		showcasePage.navigateToShowcase();
		if(!showcasePage.checkLanguage("en_US"))
			showcasePage.switchLanguage("en_US");
		showcasePage.assertBasicShowcaseDisplay(pathPrefix);
		
		//Check the default select is "Featured" in show drop-down. Check some products listed below
		//Select "Category" in show drop-down. Check "Select a Category" drop-down display right of show drop-down
		showcasePage.assertElementAttributeContains(GenesisShowcaseUI.F_SELECTION,"selected","true");
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		showcasePage.selectByValue(GenesisShowcaseUI.SEARCH_MODULE_SELECTION,"c");
		showcasePage.waitUntilElement(GenesisShowcaseUI.CATEGORY_SELECTION);
		showcasePage.assertElementExists(GenesisShowcaseUI.CATEGORY_SELECTION);
		
		//Select <<<category>>> in "category" drop-down. Check some products listed below
		showcasePage.selectByValue(GenesisShowcaseUI.CATEGORY_SELECTION,"Email Marketing");
		showcasePage.waitUntilPageLoad();
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		//showcase.checkSortByCategory();
		
		//Select "Alphabetical" in show drop-down.
		//Check some products listed below and pagination &"next" button display,no "pre" button.Check products listed in page 1 are sorted by name
		showcasePage.selectByValue(GenesisShowcaseUI.SEARCH_MODULE_SELECTION,"a");
		showcasePage.waitUntilPageLoad();
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		showcasePage.waitUntilElement(GenesisShowcaseUI.NEXT_BUTTON);
		showcasePage.assertElementAttributeNotContains(GenesisShowcaseUI.NEXT_BUTTON, "style", "display: none;");
		showcasePage.waitUntilElement(GenesisShowcaseUI.PREV_BUTTON);
		showcasePage.sleep(5000);
		showcasePage.assertElementAttributeContains(GenesisShowcaseUI.PREV_BUTTON, "style", "display: none;");
		
		//Select "2" in pagination drop-down.Check products listed below are sorted by name and different from products listed in page 1.Check "pre" button display
		showcasePage.changeUpperPagination("2");
		showcasePage.waitUntilElement(GenesisShowcaseUI.PAGINATION_UPPER);
		showcasePage.waitUntilElement(GenesisShowcaseUI.PREV_BUTTON);
		showcasePage.sleep(5000);
		showcasePage.assertPagination("2",pathPrefix);
		showcasePage.waitUntilElement(GenesisShowcaseUI.PREV_BUTTON);
		showcasePage.assertElementAttributeNotContains(GenesisShowcaseUI.PREV_BUTTON, "style", "display: none;");
		
		//Click "next" button right of pagination drop-down.
		
		showcasePage.executeScript("window.scrollTo(80000,0)");
		showcasePage.changeLowerPagination("1");
		showcasePage.executeScript("window.scrollTo(80000,0)");
		showcasePage.waitUntilElement(GenesisShowcaseUI.PAGINATION_LOWER);
		showcasePage.sleep(5000);
		showcasePage.assertPagination("1",pathPrefix);
		
		showcasePage.click(GenesisShowcaseUI.NEXT_BUTTON);
		showcasePage.waitUntilPageLoad();
		showcasePage.waitUntilElement(GenesisShowcaseUI.PAGINATION_UPPER);
		showcasePage.waitUntilElement(GenesisShowcaseUI.PAGINATION_LOWER);
		showcasePage.waitUntilElement(GenesisShowcaseUI.PREV_BUTTON);
		showcasePage.sleep(5000);
		showcasePage.assertPagination("2",pathPrefix);
		
		showcasePage.click(GenesisShowcaseUI.PREV_BUTTON);
		showcasePage.waitUntilPageLoad();
		showcasePage.sleep(5000);
		showcasePage.assertPagination("1",pathPrefix);
		
	}
	
}