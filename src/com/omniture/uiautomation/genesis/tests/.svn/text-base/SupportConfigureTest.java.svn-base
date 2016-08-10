package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.utils.ScreenShotUtil;

public class SupportConfigureTest extends GenesisTest {
	
	@Test
	public void testSupportConfigure() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"SupportConfigureTest\\";
		String wizardName = helper.generateUniqueName();
		//console.navigateToConsole();
		//console.checkBasicConsoleDisplay();
		//console.switchToSupportTab();
		
		consolePage.navigateToShowcase();
		if(!consolePage.checkLanguage("en_US"))
			consolePage.switchLanguage("en_US");
		showcasePage.activateIntegration("Facebook Demographics for Apps and Websites");
		
		this.addToBeCleanObject(wizardName);
		wizardPage.performFacebook(wizardName,"Age","eVar 1");
		wizardPage.navigateTo(wizardName);
		//wizard.sleep(2000000);
		consolePage.assertConsoleInfoMatch(pathPrefix);
		consolePage.deactivate(wizardName);
		consolePage.waitUntilPageLoad();
		consolePage.assertIntegrationNotExist(wizardName,pathPrefix);
	}
}