package com.omniture.uiautomation.devconn.tests;

import org.junit.Test;

import com.omniture.uiautomation.devconn.pages.APIExplorerPage;
import com.omniture.uiautomation.devconn.ui.APIExplorerUI;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.devconn.ui.GetStartedUI;
import com.omniture.uiautomation.tests.DeveloperTest;

public class APIExplorerTest extends DeveloperTest{
	APIExplorerPage apiExplorer = new APIExplorerPage();
	@Test
	public void testREST()
	{
		apiExplorer.navToHomePage();
		apiExplorer.navTo(DevConUI.GET_STARTED);
		apiExplorer.assertLeftNavigation(GetStartedUI.LEFT_NAVIGATION_ELEMENT, GetStartedUI.leftNavName);
		apiExplorer.assertDevConDisplay();
		apiExplorer.click(GetStartedUI.API_EXPLORER);
		apiExplorer.fillUsername(APIExplorerUI.USERNAME_TEST);
		apiExplorer.fillSecret(APIExplorerUI.SECRET_TEST);
		apiExplorer.selectAPI(APIExplorerUI.API_SELECTION);
		apiExplorer.waitUntilElement(APIExplorerUI.METHODS_DISPLAY);
		apiExplorer.selectMethod(APIExplorerUI.METHOD_SELECTION);
		apiExplorer.click(APIExplorerUI.ENVIRONMENT_EDIT);
		apiExplorer.waitUntilElementClickable(APIExplorerUI.ENVIRONMENT_LIST);
//		apiExplorer.waitUntilElement(APIExplorerUI.ENVIRONMENT_LIST);
		apiExplorer.selectEnvironment(APIExplorerUI.ENVIROMENT_SELECTION);
		apiExplorer.selectREST();
		apiExplorer.fillContent("[]");
		apiExplorer.click(APIExplorerUI.GET_RESPONSE);
		apiExplorer.waitUntilPageLoad();
		apiExplorer.checkResult();
	}
	@Test
	public void testSOAP()
	{
		apiExplorer.navToHomePage();
		apiExplorer.navTo(DevConUI.GET_STARTED);
		apiExplorer.assertLeftNavigation(GetStartedUI.LEFT_NAVIGATION_ELEMENT, GetStartedUI.leftNavName);
		apiExplorer.assertDevConDisplay();
		apiExplorer.click(GetStartedUI.API_EXPLORER);
		apiExplorer.fillUsername(APIExplorerUI.USERNAME_TEST);
		apiExplorer.fillSecret(APIExplorerUI.SECRET_TEST);
		apiExplorer.selectAPI(APIExplorerUI.API_SELECTION);
		apiExplorer.waitUntilElement(APIExplorerUI.METHODS_DISPLAY);
		apiExplorer.selectMethod(APIExplorerUI.METHOD_SELECTION);
		apiExplorer.click(APIExplorerUI.ENVIRONMENT_EDIT);
		apiExplorer.waitUntilElementClickable(APIExplorerUI.ENVIRONMENT_LIST);
//		apiExplorer.waitUntilElement(APIExplorerUI.ENVIRONMENT_LIST);
		apiExplorer.selectEnvironment(APIExplorerUI.ENVIROMENT_SELECTION);
		apiExplorer.selectSOAP();
//		apiExplorer.fillContent("[]");
		apiExplorer.click(APIExplorerUI.GET_RESPONSE);
		apiExplorer.waitUntilPageLoad();
		apiExplorer.checkResult();
	}
}
