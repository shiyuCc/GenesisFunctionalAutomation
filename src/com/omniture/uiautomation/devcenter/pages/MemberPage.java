package com.omniture.uiautomation.devcenter.pages;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.MemberUI;

public class MemberPage extends DevCenterPage{
	
	public void assertPageDisplay(){
		
		this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.MEMBER_TITLE);
		this.assertElementExists(DevCenterUI.companyDropDown);
		this.assertElementExists(MemberUI.addMembersLink);
	}
	
	public void addMember(){
	
		this.click(MemberUI.addMembersLink);
		this.waitUntilElement(MemberUI.addMemberWindow);
		this.type(MemberUI.inviteEmailTextBox, "test@adobe.com");
		this.click(MemberUI.inviteButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
	}
	
	public void assertMemberAdded(){
		this.assertElementTextContain(DevCenterUI.successfulMessage, MemberUI.ADD_SUCCESSFUL_MESSAGE);
		this.assertElementsTextContain(MemberUI.emailAddress, "test@adobe.com");
		this.assertElementExists(MemberUI.resendButton);
		this.assertElementExists(MemberUI.deleteButton);
	}
	
	public void resendEmail(){
		this.waitUntilElementClickable(MemberUI.resendButton);
		this.click(MemberUI.resendButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		
	}
	
	public void assertEmailResent(){
		
		this.assertElementTextContain(DevCenterUI.successfulMessage, MemberUI.RESENT_SUCCESSFUL_MESSAGE);
		
	}
	
	public void deleteMember(){
		this.click(MemberUI.deleteButton);
		this.getLocator().alert().accept();
		this.waitUntilElement(DevCenterUI.successfulMessage);
		
	}
	
	public void assertMemberDeleted(){
		
		this.assertElementTextContain(DevCenterUI.successfulMessage, MemberUI.DELETE_SUCCESSFUL_MESSAGE);
		
	}

}
