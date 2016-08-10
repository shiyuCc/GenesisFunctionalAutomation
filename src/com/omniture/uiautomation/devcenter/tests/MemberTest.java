package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.MemberPage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class MemberTest extends DevCenterTest{
	MemberPage memberPage = new MemberPage();
	
	@Test
	public void testMemberPage(){
		this.addToBeCleanObject("test@adobe.com");
		
		memberPage.navToHomePage();
		memberPage.navTo(DeveloperUI.DEV_CENTER);
		memberPage.navToLeftTab(DevCenterUI.SANDBOX);
		memberPage.navToLeftTab(DevCenterUI.MEMBERS);
		memberPage.assertPageDisplay();
		memberPage.addMember();
		memberPage.assertMemberAdded();
		memberPage.resendEmail();
		memberPage.assertEmailResent();
		memberPage.deleteMember();
		memberPage.assertMemberDeleted();
	}
	
	@Override
	public void clean(Object obj) {
		String s = obj.toString();
		memberPage.deleteMember();
		memberPage.waitUntilPageLoad();
	}

}
