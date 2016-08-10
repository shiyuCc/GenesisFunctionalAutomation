package com.omniture.uiautomation.devcenter.pages;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.Scene7UI;

public class Scene7Page extends DevCenterPage{
	public void assertPageDisplay(){
		//this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.SCENE7_TITLE);
		this.assertElementExists(Scene7UI.flashSDK);
		this.assertElementExists(Scene7UI.html5SDKForWin);
		this.assertElementExists(Scene7UI.html5SDKForMac);
		this.assertElementExists(Scene7UI.scene7SolutionForWin);
		this.assertElementExists(Scene7UI.scene7SolutionForMac);
	}
}
