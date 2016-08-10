package com.omniture.uiautomation.devcenter.pages;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.OverviewUI;

public class OverviewPage extends DevCenterPage{
	
	public void assertPageDisplay(){
		this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.OVERVIEW_TITLE);
		this.assertElementExists(OverviewUI.myProductButton);
		
		}
	public void clickMyProductButton(){
		this.click(OverviewUI.myProductButton);
		this.waitUntilPageLoad();
		this.assertTitle(DevCenterUI.titleOfGenesisPage, DevCenterUI.GENESIS_DEFAULT_TITLE);
		
	}

}
