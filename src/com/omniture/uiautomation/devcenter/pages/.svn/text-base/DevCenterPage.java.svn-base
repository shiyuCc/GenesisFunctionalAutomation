package com.omniture.uiautomation.devcenter.pages;

import org.openqa.selenium.By;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.pages.DeveloperPage;;

public class DevCenterPage extends DeveloperPage{
	
	
	public void assertPage(By leftNavTitle , String leftNavName)
	{
		this.assertElementExists(leftNavTitle);
		this.assertElementTextContain(leftNavTitle, leftNavName.trim().toUpperCase());
	}
	
	public void assertTitle(By titleOfPage , String expTitle){
		this.assertElementExists(titleOfPage);
		this.assertElementsTextContain(titleOfPage, expTitle);
		
	}
	
	public void navToLeftTab(By leftNavTab){
		//this.sleep(10000);
		this.waitUntilElement(leftNavTab);
		this.click(leftNavTab);
		//this.waitUntilPageLoad();
		this.sleep(10000);
		
	}
	
	
	
	
	public void assertTabDisplay(){
		
		this.assertPage(DevCenterUI.leftNavTitle, DevCenterUI.leftNavName);
		this.assertElementExists(DevCenterUI.HOME);
		this.assertElementExists(DevCenterUI.SANDBOX);
		this.assertElementExists(DevCenterUI.GENESIS);
		this.assertElementExists(DevCenterUI.MOBILE);
		this.assertElementExists(DevCenterUI.SCENE7);
		
	}

}
