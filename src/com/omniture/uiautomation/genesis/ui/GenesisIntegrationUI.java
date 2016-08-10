package com.omniture.uiautomation.genesis.ui;

import org.openqa.selenium.By;

public class GenesisIntegrationUI extends GenesisUI{

	public static By INTEGRATION_HEAD = By.id("network");
	
	public static By SOURCE_DRAG = By.xpath("//tbody/tr/td/div/div[@id='mb_f_6_head']");
	public static By TARGET_DRAG = By.xpath("//img[@src='images/puzzle-placeholder-right.gif'][1]");
	//public static By TARGET_DRAG1 = By.id("drop_target_39");
	public static By PAYMENT_CHECK = By.name("accept_payment"); 
	public static By INTEGRATION_PRODUCTS = By.xpath("//table[@class='product']/tbody/tr/td[@class='name']");
	public static By INTEGRATION_CATEGORY = By.xpath("//h2[@style='display: block; ']");
	
	
	public static By getSourceByProductName(String productName){ 
		return By.xpath("//div[@id='f_scroll_parent']/div/table[@class='product']/tbody/tr/td[contains(.,'"+productName+"')]/../td[@class='logo']/div/div");
		//div[@id='f_scroll_parent']/div/table[@class='product']/tbody/tr/td[contains(.,'Facebook Demographics for Apps and Websites')]/../td[@class='logo']/div/div
	}
}
