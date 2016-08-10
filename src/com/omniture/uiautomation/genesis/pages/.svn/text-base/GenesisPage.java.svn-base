package com.omniture.uiautomation.genesis.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.genesis.ui.GenesisConsoleUI;
import com.omniture.uiautomation.pages.OmniturePage;

public class GenesisPage extends OmniturePage{
	
	/*
	 * Navigations. For navigating to all Genesis pages.
	 */
	public void navigateToConsole() {
		
		/*
		if(sessionId == null) {
			this.login();
		}
		*/
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?ssSession=" + sessionId);
		//this.switchProduct("Genesis");
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?ssSession=" + sessionId);
		this.waitUntilPageLoad();
	}
	
	public void navigateToGettingStarted() {
		/*
		if(sessionId == null) {
			this.login();
		}
		*/
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?a=Main.Overview&ssSession=" + sessionId);
		
		/*
		this.switchProduct("Genesis");
		this.waitUntilElementClickable(GenesisUI.GETTING_STARTED_LINK);
		this.click(GenesisUI.GETTING_STARTED_LINK);
		*/
		this.waitUntilPageLoad();
	}
	
	public void navigateToAddIntegration() {
		/*
		if(sessionId == null) {
			this.login();
		}
		*/
		
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?a=Main.NetworkTab&ssSession=" + sessionId);
		/*
		this.switchProduct("Genesis");
		this.waitUntilElementClickable(GenesisUI.ADD_INTEGRATION_LINK);
		this.click(GenesisUI.ADD_INTEGRATION_LINK);
		*/
		this.waitUntilPageLoad();
	}
	
	public void navigateToShowcase() {
		/*
		if(sessionId == null) {
			this.login();
		}
		*/
		this.sleep(500);
		
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?a=Main.ShowcaseTab&ssSession=" + sessionId);
		
		/*
		this.switchProduct("Genesis");
		this.waitUntilElementClickable(GenesisUI.SHOWCASE_LINK);
		this.click(GenesisUI.SHOWCASE_LINK);
		*/
		this.waitUntilPageLoad();
		this.sleep(500);
	}
	
	/*
	public void navigateToIntegration() {
		
		if(sessionId == null) {
			this.login();
		}
		
		TestEnvironment.driver.get(TestEnvironment.current.getBaseUrl() + "/p/sn/3.0/index.html?a=Main.NetworkTab&ssSession=" + sessionId + "&jpj=30338937854159");
		
		this.waitUntilPageLoad();
	}
	*/
	
	public void navigateTo(String integrationName) {
		this.click(GenesisConsoleUI.getProductionMenu(integrationName));
		this.sleep(500);
		this.mouseTo(GenesisConsoleUI.getFirstIntegration(integrationName));
		//moveToFirstIntegrationAction.moveToElement(this.findElement(GenesisConsoleUI.getFirstIntegration(integrationName)), 3000, 0);
		//moveToFirstIntegrationAction.moveByOffset(20000,0);
		//moveToFirstIntegrationAction.click();
		this.click(GenesisConsoleUI.getIntegrationMenu(integrationName));
		this.waitUntilPageLoad();
	}
	
	public void assertIntegrationNotExist(String integrationName,String path) {
		boolean flag = false;
		try
		{
			this.findElement(GenesisConsoleUI.getIntegrationMenu(integrationName));
		}
		catch(Exception e)
		{
			flag = true;
		}
		this.screenshot(path+"\\assertIntegrationNotExist.png");
		assertTrue("still exist",flag);
	}
	
	/*====Helpers for basic algorithms====*/
	public List<WebElement> getProducts(By by)
	{
		List<WebElement> list = this.findElements(by);
		return list;
	}
	
	
	
}
