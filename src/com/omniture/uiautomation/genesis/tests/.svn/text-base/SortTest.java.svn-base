package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.genesis.ui.GenesisConsoleUI;
import com.omniture.uiautomation.genesis.ui.GenesisShowcaseUI;
import com.omniture.uiautomation.utils.ScreenShotUtil;


public class SortTest extends GenesisTest {
	
	@Test
	public void testSort() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"SortTest\\";
		//Login to genesis and navigate to add integration page
		integrationPage.navigateToAddIntegration();
		if(!integrationPage.checkLanguage("en_US"))
			integrationPage.switchLanguage("en_US");
		
		//Check "show:" drop-down,drop target area,"Partner Showcase" link.
		integrationPage.assertBasicIntegrationDisplay(pathPrefix);
		
		//Check the default product list is "Show:Featured". Check some products listed below
		integrationPage.assertElementAttributeNotContains(GenesisConsoleUI.FEATURED_ITEM,"style","display: none;");
		integrationPage.assertElementExists(GenesisConsoleUI.FEATURED_PRODUCTS);
		
		//Click "show:" drop-down and select "By Name". Check products are sorted by name
		
		//integration.selectByVisibleText(GenesisConsoleUI.MODULE_SELECTION, "Name");
		//integration.waitUntilElement(GenesisConsoleUI.NAME_SELECTION);
		//integration.click(GenesisConsoleUI.NAME_SELECTION);
		integrationPage.selectOptionByValue("ALPHABETICAL");
		integrationPage.waitUntilElement(GenesisConsoleUI.NAME_ITEM);
		integrationPage.assertElementAttributeNotContains(GenesisConsoleUI.NAME_ITEM,"style","display: none;");
		
		//assert the products are sorted by name
		integrationPage.assertProductsSortedByName(pathPrefix);
		
		//Click "show:" drop-down and select "By Category". Check some products listed below
		//integration.selectByValue(GenesisConsoleUI.MODULE_SELECTION, "--");
		integrationPage.selectOptionByValue("--");
		integrationPage.waitUntilElement(GenesisConsoleUI.CATEGERY_ITEM);
		integrationPage.assertElementAttributeNotContains(GenesisConsoleUI.CATEGERY_ITEM,"style","display: none;");
		integrationPage.assertProductsSortedByCategory(pathPrefix);
		
		//Click "Partner Showcase" link
		//Check page turn to showcase page.
		integrationPage.click(GenesisConsoleUI.getShowCaseLink(TestEnvironment.current.getBaseUrl()));
		integrationPage.waitUntilPageLoad();
		integrationPage.assertElementExists(GenesisShowcaseUI.SEARCH_BUTTON);
		
	}
}