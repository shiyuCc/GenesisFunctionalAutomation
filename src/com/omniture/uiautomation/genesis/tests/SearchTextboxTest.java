package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.genesis.ui.GenesisShowcaseUI;
import com.omniture.uiautomation.utils.ScreenShotUtil;


public class SearchTextboxTest extends GenesisTest {
	
	@Test
	public void testSearchTextbox() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"SearchTextboxTest\\";
		//Login to genesis and navigate to showcase page. //Check "SEARCH_BUTTON","SEARCH_TEXT","SEARCH_TYPE" and "ACTIVATE_BUTTON" display.
		showcasePage.navigateToShowcase();
		if(!showcasePage.checkLanguage("en_US"))
			showcasePage.switchLanguage("en_US");
		showcasePage.assertBasicShowcaseDisplay(pathPrefix);
		
		//showcase.assertElementAttributeContains(GenesisShowcaseUI.SEARCH_TEXT,"type","text");
		
		//Check the default select is "Featured" in show drop-down. Check some products listed below
		//Select "Alphabetical" in show drop-down. Check some products listed below and pagination &"next" button display,no "pre" button
		//Enter <<<product name>>> in search textbox and click search button. Check only product name contains <<<product name>>> can display and each product has a "activate" button .
		//Click reset button in search textbox. Check some products listed below and pagination display
		showcasePage.assertElementAttributeContains(GenesisShowcaseUI.F_SELECTION,"selected","true");
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		showcasePage.selectByValue(GenesisShowcaseUI.SEARCH_MODULE_SELECTION,"a");
		showcasePage.waitUntilPageLoad();
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		//showcase.assertElementExists(GenesisShowcaseUI.NEXT_BUTTON);
		//showcase.assertElementNotExists(GenesisShowcaseUI.PREV_BUTTON);
		
		//check if the products are sorted by alphabetical.
		showcasePage.assertSortByAlphabetical(pathPrefix);
		
		showcasePage.waitUntilElement(GenesisShowcaseUI.NEXT_BUTTON);
		showcasePage.assertElementAttributeNotContains(GenesisShowcaseUI.NEXT_BUTTON, "style", "display: none;");
		showcasePage.sleep(5000);
		showcasePage.assertElementAttributeContains(GenesisShowcaseUI.PREV_BUTTON, "style", "display: none;");
		
		showcasePage.searchProduct("facebook");
		showcasePage.assertResultsContainKeywords("facebook",pathPrefix);
		
		showcasePage.click(GenesisShowcaseUI.RESET_BUTTON);
		showcasePage.waitUntilPageLoad();
		showcasePage.assertElementExists(GenesisShowcaseUI.FEATURED_PRODUCTS);
		showcasePage.sleep(500);
		showcasePage.assertElementExists(GenesisShowcaseUI.PAGE_SELECTION);
		
	}
	
}