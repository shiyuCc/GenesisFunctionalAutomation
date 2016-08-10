package com.omniture.uiautomation.genesis.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.ui.OmnitureUI;

public class GenesisUI extends OmnitureUI {

	/*
	public static By getProductMenu(String productName){
		return By.xpath("//ul[@id='sn_integrations_menu_root']/li[@class='folder']/a[.='"+productName+"']");
	}
	*/
	
	public static By getFirstIntegration(String integrationName){
		return By.xpath("//li/a[starts-with(text(), '"+integrationName+"')]/../../li[@class='first']/a");
	}
	
	public static By getIntegrationMenu(String integrationName){
		return By.xpath("//li/a[starts-with(text(), '"+integrationName+"')]");
	}
	
	public static By getProductionMenu(String integrationName){
		return By.xpath("//li/a[starts-with(text(), '"+integrationName+"')]/../../..");
	}
	
	public static By GETTING_STARTED_LINK = By.xpath("//ul/li/a[.='Getting Started']");
	public static By ADD_INTEGRATION_LINK = By.xpath("//ul/li/a[.='Add Integration']");
	public static By SHOWCASE_LINK = By.xpath("//ul/li/a[.='Partner Showcase']");
}
