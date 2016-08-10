package com.omniture.uiautomation.devcenter.pages;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.PartnerApiUI;

public class PartnerApiPage extends DevCenterPage{
	
	public void assertPageDisplay(){
		//this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.PARTNER_API_TITLE);
		//this.assertElementExists(DevCenterUI.companyDropDown);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_ONE);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_TWO);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_THREE);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_FOUR);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_FIVE);
		this.assertElementsTextContain(PartnerApiUI.subHeader, PartnerApiUI.SUBHEADER_SIX);
		
	}

}
