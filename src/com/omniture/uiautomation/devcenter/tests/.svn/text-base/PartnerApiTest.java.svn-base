package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.PartnerApiPage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class PartnerApiTest extends DevCenterTest{
	PartnerApiPage partnerApiPage = new PartnerApiPage();
	
	@Test
	
	public void testPartnerApiPage(){
		partnerApiPage.navToHomePage();
		partnerApiPage.navTo(DeveloperUI.DEV_CENTER);
		partnerApiPage.navToLeftTab(DevCenterUI.GENESIS);
		partnerApiPage.navToLeftTab(DevCenterUI.PARTNER_API);
		partnerApiPage.assertPageDisplay();
		
		
	}
	

}
