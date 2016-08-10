package com.omniture.uiautomation.devconn.tests;

import org.junit.Test;

import com.omniture.uiautomation.devconn.pages.AccountPage;
import com.omniture.uiautomation.devconn.ui.AccountUI;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.tests.DeveloperTest;
public class AccountTest extends DeveloperTest{

	AccountPage accountPage = new AccountPage();
	@Test
	public void testViewProfile()
	{
		accountPage.navToHomePage();
		accountPage.waitUntilPageLoad();
		accountPage.assertDevConDisplay();
		accountPage.login();
		accountPage.assertDevConDisplay();
		accountPage.click(AccountUI.USER_LINK);
		accountPage.waitUntilPageLoad();
		accountPage.assertLeftNavigation();
		accountPage.assertViewProfile(TestEnvironment.current.getUsername());
	}
	@Test
	public void testUpdateProfile()
	{
		accountPage.navToHomePage();
		accountPage.waitUntilPageLoad();
		accountPage.assertDevConDisplay();
		accountPage.login();
		accountPage.assertDevConDisplay();
		accountPage.click(AccountUI.USER_LINK);
		accountPage.waitUntilPageLoad();
		accountPage.assertLeftNavigation();
		accountPage.assertViewProfile(TestEnvironment.current.getUsername());
		accountPage.click(AccountUI.UPDATE_PROFILE);
		accountPage.waitUntilPageLoad();
		accountPage.asserEditElements();
		accountPage.click(AccountUI.UPDATE_PROFILE_SAVE);
		accountPage.waitUntilPageLoad();
		accountPage.assertElementsTextContain(AccountUI.NOTICE_MESSAGE, "Profile updated successfully!");
	}
	@Test
	public void testChangePassword()
	{
		accountPage.navToHomePage();
		accountPage.waitUntilPageLoad();
		accountPage.assertDevConDisplay();
		accountPage.login();
		accountPage.assertDevConDisplay();
		accountPage.click(AccountUI.USER_LINK);
		accountPage.waitUntilPageLoad();
		accountPage.assertLeftNavigation();
		accountPage.assertViewProfile(TestEnvironment.current.getUsername());
		accountPage.click(AccountUI.CHANGE_PASSWORD);
		accountPage.waitUntilPageLoad();
		accountPage.type(AccountUI.PASSWORD_TEXTBOX, TestEnvironment.current.getPassword());
		accountPage.type(AccountUI.PASSWORD_AGAIN_TEXTBOX, TestEnvironment.current.getPassword());
		accountPage.click(AccountUI.PASSWORD_SAVE);
		accountPage.waitUntilPageLoad();
		accountPage.assertElementsTextContain(AccountUI.NOTICE_MESSAGE, "Your password was updated successfully!");
		
	}
}
