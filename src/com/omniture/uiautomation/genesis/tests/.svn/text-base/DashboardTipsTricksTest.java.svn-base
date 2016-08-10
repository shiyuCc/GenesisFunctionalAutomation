package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.utils.ScreenShotUtil;

public class DashboardTipsTricksTest extends GenesisTest {

	@Test
	public void testDashboardTipsTricks() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"DashboardTipsTricksTest\\";
		//console.navigateToConsole();
		//console.assertBasicConsoleDisplay();
		consolePage.switchProduct("Genesis");
		if(!consolePage.checkLanguage("en_US"))
			consolePage.switchLanguage("en_US");
		String wizardName = helper.generateUniqueName();
		integrationPage.navigateToAddIntegration();
		integrationPage.assertBasicIntegrationDisplay(pathPrefix);
		integrationPage.dragProdcut("Facebook Demographics for Apps and Websites");
		this.addToBeCleanObject(wizardName);
		boolean dashboardCanBeTested = wizardPage.performFacebook(wizardName,"Age","eVar 1");
		if(dashboardCanBeTested==true)
		{
			wizardPage.navigateTo(wizardName);
			
			consolePage.switchToDashboardTab();
			consolePage.assertDashboardTabDisplay(pathPrefix);
			consolePage.switchToSupportTab();
			consolePage.sleep(2000);
			consolePage.assertSupportTabDisplay(pathPrefix);
			consolePage.switchToTipTrickTab();
			consolePage.assertTipTrickTabDisplay(pathPrefix);
			consolePage.switchToConfigureTab();
			consolePage.assertConfigureTabDisplay(pathPrefix);
		}
	}
	
}
