package com.omniture.uiautomation.genesis.tests;

import org.junit.Test;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.utils.ScreenShotUtil;

public class WizardTest extends GenesisTest {
	
	@Test
	public void testWizard() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"WizardTest\\";
		String wizardName = helper.generateUniqueName();
		String productName = "Facebook Demographics for Apps and Websites";
		//Login to genesis and navigate to showcase page
		showcasePage.navigateToShowcase();
		if(!showcasePage.checkLanguage("en_US"))
			showcasePage.switchLanguage("en_US");
		
		//Check "SEARCH_BUTTON","SEARCH_TEXT","SEARCH_TYPE" and "ACTIVATE_BUTTON" display.
		showcasePage.assertBasicShowcaseDisplay(pathPrefix);
		
		//Enter <<<product name>>> in "SEARCH_TEXT"(say facebook) and click "SEARCH_BUTTON".
		showcasePage.searchProduct(productName);
		
		//Check only product name contains <<<product name>>> can display and each product has a "ACTIVATE_BUTTON".
		//(Check product named "Facebook Demographics for Apps and Websites" and "ACTIVATE_BUTTON" display)
		showcasePage.assertResultsContainKeywords(productName,pathPrefix);
		
		//Click "activate" button,Check wizard container display.verify "checkbox" and "next" button display.
		//Click "checkbox" and "next" button.
		
		showcasePage.activateIntegration(productName);
		
		
		//String integrationName = "test"+String.valueOf(new Random().nextInt());
		this.addToBeCleanObject(wizardName);
		wizardPage.performFacebook(wizardName,"Age","eVar 1");
		
		//Click <<<product name>>> in left navigation and click <<<integration name>>>
		//wizard.navigateTo("name text");
		wizardPage.navigateTo(wizardName);
		
		consolePage.sleep(5000);
		//Check <<<integration name>>>,support&configure tab display.(If have dashboard,check dashboard tab)
		consolePage.assertLegacyConsoleDisplay("Age","eVar 1",pathPrefix);
		
		//Click "Configure Integration" button. Check wizard container display.
		consolePage.switchToConfigureTab();
		
		//Click "checkbox" and "next" button. Enter <<<integration name1>>> in "name" textbox
		//Enter <<<email address>> in "email". Click "next" button.
		//Select "JavaScript Plug-in" radio button and click "next" button.
		//Select another option in "SiteCatalyst Evar" drop-down
		//Click "Add another metric" link
		//Click "Facebook Metric" drop-down and select <<<metric2>>>
		//Click "SiteCatalyst eVar" and select <<<evar2>>>
		
		consolePage.configureIntegration();
		this.addToBeCleanObject(wizardName);
		wizardPage.performFacebook(wizardName,"Age","eVar 1");
		
		//Click <<<product name>>> in left navigation and click <<<integration name1>>>
		wizardPage.navigateTo(wizardName);
		consolePage.sleep(5000);
		consolePage.assertLegacyConsoleDisplay("Age","eVar 1",pathPrefix);

		consolePage.deactivate(wizardName);
		consolePage.waitUntilPageLoad();
		consolePage.sleep(5000);
		consolePage.assertIntegrationNotExist(wizardName,pathPrefix);
		
	}
	
}