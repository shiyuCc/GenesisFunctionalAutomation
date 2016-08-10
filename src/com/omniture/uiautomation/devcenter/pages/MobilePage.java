package com.omniture.uiautomation.devcenter.pages;


import com.omniture.uiautomation.devcenter.ui.MobileUI;

public class MobilePage extends DevCenterPage{
	public void assertPageDisplay(){
		//this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.MOBILE_TITLE);
		
		//pro env ui
		//this.assertElementExists(MobileUI.iOSLink);
		//this.assertElementExists(MobileUI.androidLink);
		//this.assertElementExists(MobileUI.symbianLink);	
		
		//beta env ui
		this.assertElementExists(MobileUI.publicDownload);
		this.assertElementExists(MobileUI.authenticationDownload);
		this.assertElementExists(MobileUI.mobileDownload);
		this.assertElementExists(MobileUI.appForAndroid);
		this.assertElementExists(MobileUI.appForIOS);
		
	}

}
