package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.utils.ScreenShotUtil;

public class AddIntegrationTest extends GenesisTest {
	
	@Test
	public void testAddIntegration() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"AddIntegrationTest\\";
		String wizardName = helper.generateUniqueName();
		//Login to genesis and navigate to add integration page. Check "show:" drop-down,drop target area,"Partner Showcase" link.
		integrationPage.navigateToAddIntegration();
		if(!integrationPage.checkLanguage("en_US"))
			integrationPage.switchLanguage("en_US");
		integrationPage.assertBasicIntegrationDisplay(pathPrefix);
		
		//Select a product,say"searchmetrics" and drag it to the right drop area
		//integration.dragProdcut(GenesisIntegrationUI.SOURCE_DRAG);
		integrationPage.dragProdcut("Facebook Demographics for Apps and Websites");
		
		//Verify a wizard container pops up,verify checkbox and "Create and Configure This Integration" button
		//display.Check no report suite&integration name textbox
		//Click checkbox. Check report suite&integration name textbox display
		//Enter <<<integration name>>> in "name text"
		//this.addToBeCleanObject(wizardName);
		this.addToBeCleanObject(wizardName);
		wizardPage.performFacebook(wizardName,"Age","eVar 1");
		
		//Click <<<product name>>> in left navigation and click <<<integration name1>>>
		wizardPage.navigateTo(wizardName);
		consolePage.assertLegacyConsoleDisplay("Age","eVar 1",pathPrefix);
		
		consolePage.deactivate(wizardName);
		consolePage.waitUntilPageLoad();
		consolePage.assertIntegrationNotExist(wizardName,pathPrefix);
	}
	
}
