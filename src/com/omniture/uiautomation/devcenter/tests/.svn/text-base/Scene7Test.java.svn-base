package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.Scene7Page;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class Scene7Test extends DevCenterTest{
	Scene7Page scene7Page = new Scene7Page();
	
	@Test
	
	public void testScene7Page(){
		scene7Page.navToHomePage();
		scene7Page.navTo(DeveloperUI.DEV_CENTER);
		scene7Page.navToLeftTab(DevCenterUI.SCENE7);
		scene7Page.assertPageDisplay();
		
	}
	

}
