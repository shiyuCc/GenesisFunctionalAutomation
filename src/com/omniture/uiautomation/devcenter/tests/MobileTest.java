package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.MobilePage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class MobileTest extends DevCenterTest{
	MobilePage mobilePage = new MobilePage();
	
	@Test
	public void testMobilePage(){
		mobilePage.navToHomePage();
		mobilePage.navTo(DeveloperUI.DEV_CENTER);
		mobilePage.navToLeftTab(DevCenterUI.MOBILE);
		mobilePage.assertPageDisplay();
	}

}
