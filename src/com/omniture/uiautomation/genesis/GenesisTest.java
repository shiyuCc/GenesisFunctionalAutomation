package com.omniture.uiautomation.genesis;

import com.omniture.uiautomation.genesis.pages.GenesisConsolePage;
import com.omniture.uiautomation.genesis.pages.GenesisIntegrationPage;
import com.omniture.uiautomation.genesis.pages.GenesisShowcasePage;
import com.omniture.uiautomation.genesis.pages.GenesisWizardPage;
import com.omniture.uiautomation.tests.OmnitureTest;

public class GenesisTest extends OmnitureTest {

	protected GenesisIntegrationPage integrationPage; 
	protected GenesisWizardPage wizardPage;
	protected GenesisConsolePage consolePage;
	protected GenesisShowcasePage showcasePage;
	
	public GenesisTest()
	{
		this.integrationPage = new GenesisIntegrationPage();
		this.wizardPage = new GenesisWizardPage();
		this.consolePage = new GenesisConsolePage();
		this.showcasePage = new GenesisShowcasePage();
	}
	
	@Override
	public void clean(Object obj) {
		String s = obj.toString();
		consolePage.deactivate(s);
		consolePage.waitUntilPageLoad();
	}

}
