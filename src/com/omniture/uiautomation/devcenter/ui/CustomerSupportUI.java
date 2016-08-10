package com.omniture.uiautomation.devcenter.ui;

import org.openqa.selenium.By;

public class CustomerSupportUI extends DevCenterUI{
	public static By ticketStatus = By.xpath("//div[@id='incident-table-controls']/form");
	public static By incidentTab = By.xpath("//div[@id='incidents_tab']");
	public static By activityTab = By.xpath("//div[@id='activity_tab']");
	
	//activity log tab ui
	public static By dataInTab = By.xpath("//div[@id='data_in_tab']");
	public static By dataOutTab = By.xpath("//div[@id='data_out_tab']");
	public static By changeLogTab = By.xpath("//div[@id='change_log_tab']");
	public static By dateLimit = By.xpath("//div[@id='inner-tab-dpicker']");
	public static By logInfo = By.cssSelector("div.log-error");
}
