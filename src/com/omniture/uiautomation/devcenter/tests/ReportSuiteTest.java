package com.omniture.uiautomation.devcenter.tests
;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.ReportSuitePage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class ReportSuiteTest extends DevCenterTest{
	
	ReportSuitePage reportSuitePage = new ReportSuitePage();
	String reportSuiteName = helper.generateUniqueName();
	
	@Test
	
	public void testReportSuitePage(){
		
		reportSuitePage.navToHomePage();
		reportSuitePage.navTo(DeveloperUI.DEV_CENTER);
		reportSuitePage.navToLeftTab(DevCenterUI.SANDBOX);
		reportSuitePage.assertPageDisplay();
		//reportSuitePage.addReportSuite(reportSuiteName);
		//reportSuitePage.assertReportSuiteAdded(reportSuiteName);
		
	}

}
