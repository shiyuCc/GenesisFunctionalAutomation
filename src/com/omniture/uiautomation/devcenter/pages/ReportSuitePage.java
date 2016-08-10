package com.omniture.uiautomation.devcenter.pages;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.ReportSuiteUI;



public class ReportSuitePage extends DevCenterPage{
	
	
	
	public void assertPageDisplay(){
		this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.SANDBOX_DEFAULT_TITLE);
		this.assertElementExists(ReportSuiteUI.companyDropDown);
		this.assertElementExists(ReportSuiteUI.addReportSuiteLink);
	}
	
	public void addReportSuite(String reportSuiteName){
		this.click(ReportSuiteUI.addReportSuiteLink);
		this.waitUntilElement(ReportSuiteUI.addReportSuiteWindow);
		this.type(ReportSuiteUI.nameTextBox, reportSuiteName);
		this.click(ReportSuiteUI.saveButton);	
		
	}
	
	public void assertReportSuiteAdded(String reportSuiteName){
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, ReportSuiteUI.successfulMessageDisplay);
		//this.assertElementTextContain(ReportSuiteUI.reportSuiteName,reportSuiteName);
		this.assertElementExists(ReportSuiteUI.dataFeed);
		this.assertElementExists(ReportSuiteUI.editButton);
		this.assertElementExists(ReportSuiteUI.editReportSuiteLink);
	}

}
