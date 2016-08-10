package com.omniture.uiautomation.genesis.ui;

import java.util.HashMap;

import org.openqa.selenium.By;

public class GenesisConsoleUI extends GenesisUI{

	public static By getTab(String tabName){ 
		return By.xpath("//div[@id='tabs']/ul[@class='tabs']/li[text()='"+tabName+"']");
	}
	
	public static By DEACTIVATE_CONFIRM_BUTTON = By.xpath("//div[@class='footer']/button[.='Deactivate']");
	
	//The function to get support and configure button in another language
	public static By getSupportButton(HashMap<String,String> languageToAnotherLanguage)
	{
		return By.xpath("//div[@class='consoleTabs tabView primaryTabs']/ul/li[.='"+languageToAnotherLanguage.get("support")+"']");
	}
	
	public static By getConfigureButton(HashMap<String,String> languageToAnotherLanguage)
	{
		return By.xpath("//div[@class='consoleTabs tabView primaryTabs']/ul/li[.='"+languageToAnotherLanguage.get("configure")+"']");
	}
	
	//The support and configure button in default English language
	public static By SUPPORT_BUTTON = By.xpath("//div[@class='consoleTabs tabView primaryTabs']/ul/li[.='Support']");
	public static By CONFIGURE_BUTTON = By.xpath("//div[@class='consoleTabs tabView primaryTabs']/ul/li[.='Configure']");
	
	public static By INFO_MATCH_TEXT = By.xpath("//td[@class='summary_info']");
	public static By SHOW_DROPDOWN = By.xpath("//td[@class='networkProducts']");
	public static By SHOW_TARGET = By.xpath("//td[@class='networkIntegrations']");

	public static By getShowCaseLink(String baseURL){ 
		return By.xpath("//a[starts-with(@href,'"+baseURL+"/p/sn/3.0/index.html?a=Main.ShowcaseTab')]");
	}
	
	public static By FEATURED_ITEM = By.id("f_tabcontent");
	public static By NAME_ITEM = By.id("a_tabcontent");
	public static By CATEGERY_ITEM = By.id("c_tabcontent");
	public static By FEATURED_PRODUCTS = By.xpath("//div[@id='f_scroll_parent']/div/table[@class='product']");
	public static By MODULE_SELECTION=By.id("//select[@id='industry_filter']");
	public static By NAME_SELECTION=By.id("//select[@id='industry_filter']/optgroup/option[@value='ALPHABETICAL']");

	public static By LEFT_CONTAINER = By.id("simple_nav");
	public static By BROWSE_SHOWCASE_IN_RIBBON_BUTTON = By.id("sn_ribbon-browse-showcase");
	public static By ADD_NEW_IN_RIBBON_BUTTON = By.id("sn_ribbon-add-new");
	public static By ADD_NEW_IN_LEFT_RIBBON_BUTTON = By.xpath("//div[@id='ribbon']/div[@class='list-container']/ul[@class='slider']/li[@class='new']/a/img");
	public static By SUMMARY_HEAD = By.id("summary");
	
	
	public static By EMAIL_INTEGRATION_TEXT = By.xpath("//div[@id='integration-info']/table/tbody/tr/td[.='Email:']/../td[@class='helpText']");	
	public static By REPORT_INTEGRATION_TEXT = By.xpath("//div[@id='integration-info']/table/tbody/tr/td[.='Report Suite:']/../td[@class='helpText']");	
	public static By NAME_INTEGRATION_TEXT = By.xpath("//div[@id='integration-info']/table/tbody/tr/td[.='Name:']/../td[@class='helpText']");
	
	public static By EMAIL_SUMMARY_TEXT = By.xpath("//div[@id='summary']/table/tbody/tr/td[.='E-mail']/../td[@class='summary_info']");	
	public static By REPORT_SUMMARY_TEXT = By.xpath("//div[@id='summary']/table/tbody/tr/td[.='Report Suite']/../td[@class='summary_info']");	
	public static By NAME_SUMMARY_TEXT = By.xpath("//div[@id='summary']/table/tbody/tr/td[.='Name']/../td[@class='summary_info']");
	
	public static By CONFIGURE_HEAD = By.id("configure-element");
	public static By SUPPORT_HEAD = By.id("support-element");
	public static By DASHBOARDS_HEAD = By.id("dashboards-element");
	public static By TIP_TRICK_HEAD = By.id("tips-tricks-element");
	
	//Element under DashboardTab 
	public static By DASHBOARDTAB_RIBBON_BAR = By.id("ribbon");
	public static By DASHBOARDTAB_TOOLBAR_CONTAINER = By.id("toolbar_container");
	public static By DASHBOARDTAB_MESSAGE_AREA = By.id("message_area");
	public static By DASHBOARDTAB_TITLE_CONTAINER = By.id("title_container");
	public static By DASHBOARDTAB_DASHBOARD_POOL = By.id("dashboard");
	public static By DASHBOARDTAB_CALENDAR = By.xpath("//div[@class='CalendarWidgetActivator'][1]");
	
	//Element under SupportTab
	public static By SUPPORTTAB_UPPER_CONTAINER = By.id("support-upper-container");
	public static By SUPPORTTAB_LOWER_CONTAINER = By.id("support-lower-container");
	public static By SUPPORTTAB_INTEGRATION_INFO = By.id("integration-info");
	public static By SUPPORTTAB_INTEGRATION_CONTACT = By.id("integration-contact");
	public static By SUPPORTTAB_INTEGRATION_RESOURCES = By.id("integration-resources");
	public static By SUPPORTTAB_ACTIVITY_LOG_TABS = By.id("activity-log-tabs");
	
	//Element under TipTrickTab
	public static By TIPTRICK_FEED = By.xpath("//ul[@class='tips-and-tricks-feed']");
	public static By TIPTRICK_MORE_TIPTRICKS_LINK = By.xpath("//div[@id='tips-and-tricks-container']/a");
	
	//Element under ConfigureTab
	//public static By CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON = By.xpath("//button[@onclick='launchConfiguration()']");
	public static By CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON = By.xpath("//div[@id='configure-element']/button[.='Configure Integration']");
	public static By CONFIGURETAB_DEACTIVATE_BUTTON = By.xpath("//div[@id='configure-element']/button[.='Deactivate']");
	public static By CONFIGURETAB_SUMMARY = By.id("summary");
}
