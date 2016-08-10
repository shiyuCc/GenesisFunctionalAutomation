package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.CustomerSupportPage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class CustomerSupportTest extends DevCenterTest{
	
	CustomerSupportPage customerSupportPage = new CustomerSupportPage();
	
	@Test
	
	public void testCustomerSupportPage(){
		customerSupportPage.navToHomePage();
		customerSupportPage.navTo(DeveloperUI.DEV_CENTER);
		customerSupportPage.navToLeftTab(DevCenterUI.GENESIS);
		customerSupportPage.navToLeftTab(DevCenterUI.CUSTOMER_SUPPORT);
		customerSupportPage.assertPageDisplay();
		
	}
	
	

}
