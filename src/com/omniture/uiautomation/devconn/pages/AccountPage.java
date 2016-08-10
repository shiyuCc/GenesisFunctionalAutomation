package com.omniture.uiautomation.devconn.pages;

import com.omniture.uiautomation.devconn.ui.AccountUI;

public class AccountPage extends DevConPage{
	
	public void assertLeftNavigation()
	{
		this.assertElementExists(AccountUI.LEFT_NAVIGATION);
	}
	public void assertViewProfile(String username)
	{
		this.assertElementTextContain(AccountUI.VIEW_PROFILE_USERNAME, username);
		this.assertElementExists(AccountUI.VIEW_PROFILE_USERINFO);
	}
	public void asserEditElements()
	{
		this.assertElementExists(AccountUI.UPDATE_PROFILE_ICON);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_NICKNAME);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_EMAIL);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_FIRST_NAME);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_LAST_NAME);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_BLOG);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_SELECTIONS);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_RELATIONSHIP);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_COMPANY);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_JOB);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_DEPARTMENT);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_INDUSTRY);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_WEBSITE);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_MARKET);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_BUSINESS);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_REVENUE);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_ADDRESS);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_ADDRESS2);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_CITY);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_STATE);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_ZIP);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_STUDENT);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_WEB_SERVIECE_USERNAME);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_WEB_SERVIECE_NAME);
		this.assertElementExists(AccountUI.UPDATE_PROFILE_SAVE);
		
	}
}
