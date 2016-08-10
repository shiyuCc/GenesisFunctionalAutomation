package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.OverviewPage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class OverviewTest extends DevCenterTest{
	OverviewPage overviewPage = new OverviewPage();
	
	@Test
	
	public void testOverviewPage(){
		overviewPage.navToHomePage();
		overviewPage.navTo(DeveloperUI.DEV_CENTER);
		overviewPage.navToLeftTab(DevCenterUI.GENESIS);
		overviewPage.navToLeftTab(DevCenterUI.OVERVIEW);
		overviewPage.assertPageDisplay();
		overviewPage.clickMyProductButton();
		
	}

}
