package com.omniture.uiautomation.genesis.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.genesis.ui.GenesisConsoleUI;
import com.omniture.uiautomation.genesis.ui.GenesisIntegrationUI;


public class GenesisIntegrationPage extends GenesisPage{
	
	/*
	 * Basic behaviors.
	 */
	public void selectOptionByValue(String value_str)
	{
		((JavascriptExecutor)TestEnvironment.driver).executeScript("applyProductFilter(\""+value_str+"\");");
	}
	
	public void dragProdcut(By source)
	{
	    this.dragAndDrop(source,GenesisIntegrationUI.TARGET_DRAG);
	    this.waitUntilPageLoad();
	    this.waitUntilElementClickable(GenesisIntegrationUI.PAYMENT_CHECK);
	}
	
	public void dragProdcut(String productName)
	{
		By source = GenesisIntegrationUI.getSourceByProductName(productName);
		this.waitUntilElement(GenesisIntegrationUI.TARGET_DRAG);
		this.dragAndDrop(source,GenesisIntegrationUI.TARGET_DRAG);
	    this.waitUntilPageLoad();
	    this.waitUntilElementClickable(GenesisIntegrationUI.PAYMENT_CHECK);
	}
	
	/*
	 * Assertions.
	 */
	public void assertIntegrationPage(String path)
	{
		this.screenshot(path+"\\assertIntegrationPage.png");
		this.assertElementExists(GenesisIntegrationUI.INTEGRATION_HEAD);
	}
	
	public void assertProductsSortedByName(String path)
	{
		List<WebElement> products = this.getProducts(GenesisIntegrationUI.INTEGRATION_PRODUCTS);
		this.screenshot(path+"\\assertProductsSortedByName.png");
		assertSortByText(products);
	}
	
	public void assertProductsSortedByCategory(String path)
	{
		List<WebElement> products = this.getProducts(GenesisIntegrationUI.INTEGRATION_CATEGORY);
		this.screenshot(path+"\\assertProductsSortedByCategory.png");
		assertSortByText(products);
	}
	
	public void assertBasicIntegrationDisplay(String path)
	{
		this.waitUntilElement(GenesisConsoleUI.SHOW_DROPDOWN);
		this.screenshot(path+"\\assertBasicIntegrationDisplay.png");
		this.assertElementExists(GenesisConsoleUI.SHOW_DROPDOWN);
		this.waitUntilElement(GenesisConsoleUI.SHOW_TARGET);
		this.assertElementExists(GenesisConsoleUI.SHOW_TARGET);
		this.waitUntilElement(GenesisConsoleUI.getShowCaseLink(TestEnvironment.current.getBaseUrl()));
		this.assertElementExists(GenesisConsoleUI.getShowCaseLink(TestEnvironment.current.getBaseUrl()));
	}
	

}
