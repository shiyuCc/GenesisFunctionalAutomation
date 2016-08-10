package com.omniture.uiautomation.devconn.tests;

import org.junit.Test;

import com.omniture.uiautomation.devconn.pages.DevConPage;
import com.omniture.uiautomation.tests.DeveloperTest;

public class LoginTest extends DeveloperTest{
	DevConPage devConPage = new DevConPage();
	@Test
	public void testLogin()
	{
		devConPage.navToHomePage();
		devConPage.waitUntilPageLoad();
		devConPage.assertDevConDisplay();
		devConPage.login();
		devConPage.assertDevConDisplay();
		devConPage.logout();
		devConPage.assertDevConDisplay();
	}
}
