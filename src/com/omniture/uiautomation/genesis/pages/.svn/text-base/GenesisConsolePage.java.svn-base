package com.omniture.uiautomation.genesis.pages;

import java.util.HashMap;


import com.omniture.uiautomation.genesis.ui.GenesisConsoleUI;

import static org.junit.Assert.assertTrue;

public class GenesisConsolePage extends GenesisPage {
	
	/*
	 * Basic behaviors.
	 */
	public void switchToDashboardTab(){
		this.waitUntilElement(GenesisConsoleUI.getTab("Dashboards"));
		this.click(GenesisConsoleUI.getTab("Dashboards"));
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDS_HEAD);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDS_HEAD);
	}
	
	public void switchToConfigureTab(){
		this.waitUntilElementClickable(GenesisConsoleUI.getTab("Configure"));
		this.click(GenesisConsoleUI.getTab("Configure"));
		this.waitUntilElement(GenesisConsoleUI.CONFIGURE_HEAD);
		this.assertElementExists(GenesisConsoleUI.CONFIGURE_HEAD);
	}
	
	public void switchToSupportTab(){
		this.waitUntilElement(GenesisConsoleUI.getTab("Support"));
		this.click(GenesisConsoleUI.getTab("Support"));
		this.waitUntilElement(GenesisConsoleUI.SUPPORT_HEAD);
		this.assertElementExists(GenesisConsoleUI.SUPPORT_HEAD);
	}
	
	public void switchToTipTrickTab()
	{
		this.waitUntilElement(GenesisConsoleUI.getTab("Tips & Tricks"));
		this.click(GenesisConsoleUI.getTab("Tips & Tricks"));
		this.waitUntilElement(GenesisConsoleUI.TIP_TRICK_HEAD);
		this.assertElementExists(GenesisConsoleUI.TIP_TRICK_HEAD);
	}
	
	public void configureIntegration(){
		this.waitUntilElement(GenesisConsoleUI.CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON);
		this.click(GenesisConsoleUI.CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON);
	}
	
	private void deactivateIntegration(){
		this.sleep(5000);
		this.waitUntilElementClickable(GenesisConsoleUI.CONFIGURETAB_DEACTIVATE_BUTTON);
		this.click(GenesisConsoleUI.CONFIGURETAB_DEACTIVATE_BUTTON);
		this.waitUntilElementClickable(GenesisConsoleUI.DEACTIVATE_CONFIRM_BUTTON);
		this.click(GenesisConsoleUI.DEACTIVATE_CONFIRM_BUTTON);
	}
	
	public void deactivate(String wizardName)
	{
		this.navigateTo(wizardName);
		this.sleep(5000);
		this.switchToConfigureTab();
		this.deactivateIntegration();
	}
	
	/*
	 * Assertions.
	 */
	public void assertSupportTabDisplay(String path)
	{
		this.screenshot(path+"\\assertSupportTabDisplay.png");
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_UPPER_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_LOWER_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_INTEGRATION_CONTACT);
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_INTEGRATION_INFO);
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_INTEGRATION_RESOURCES);
		this.assertElementExists(GenesisConsoleUI.SUPPORTTAB_ACTIVITY_LOG_TABS);
	}
	
	public void assertTipTrickTabDisplay(String path)
	{
		this.screenshot(path+"\\assertTipTrickTabDisplay.png");
		this.assertElementExists(GenesisConsoleUI.TIPTRICK_FEED);
		this.assertElementExists(GenesisConsoleUI.TIPTRICK_MORE_TIPTRICKS_LINK);
	}
	
	public void assertConfigureTabDisplay(String path)
	{
		this.screenshot(path+"\\assertConfigureTabDisplay.png");
		this.assertElementExists(GenesisConsoleUI.CONFIGURETAB_SUMMARY);
		this.assertElementExists(GenesisConsoleUI.CONFIGURETAB_DEACTIVATE_BUTTON);
		this.assertElementExists(GenesisConsoleUI.CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON);
	}
	
	public void assertDashboardTabDisplay(String path)
	{
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_TOOLBAR_CONTAINER);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_MESSAGE_AREA);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_TITLE_CONTAINER);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_DASHBOARD_POOL);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_CALENDAR);

		this.screenshot(path+"\\assertDashboardTabDisplay.png");
		
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_TOOLBAR_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_MESSAGE_AREA);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_TITLE_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_DASHBOARD_POOL);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_CALENDAR);
	}
	
	public void assertBasicConsoleDisplay(String path)
	{
		this.waitUntilElement(GenesisConsoleUI.SUPPORT_BUTTON);
		this.waitUntilElement(GenesisConsoleUI.CONFIGURE_BUTTON);
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
		
		this.screenshot(path+"\\assertBasicConsoleDisplay.png");
		
		this.assertElementExists(GenesisConsoleUI.LEFT_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.SUPPORT_BUTTON);
		this.assertElementExists(GenesisConsoleUI.CONFIGURE_BUTTON);
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
	}
	
	public void assertBasicConsoleDisplay(HashMap<String,String> languageToAnotherLanguage,String path)
	{
		this.waitUntilElement(GenesisConsoleUI.getSupportButton(languageToAnotherLanguage));
		this.waitUntilElement(GenesisConsoleUI.getConfigureButton(languageToAnotherLanguage));
		this.waitUntilElement(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
		
		this.screenshot(path+"\\assertBasicConsoleDisplay.png");
		
		this.assertElementExists(GenesisConsoleUI.LEFT_CONTAINER);
		this.assertElementExists(GenesisConsoleUI.getSupportButton(languageToAnotherLanguage));
		this.assertElementExists(GenesisConsoleUI.getConfigureButton(languageToAnotherLanguage));
		this.assertElementExists(GenesisConsoleUI.DASHBOARDTAB_RIBBON_BAR);
	}
	
	public void assertLegacyConsoleDisplay(String product_metric,String siteCatalyst_eVar,String path)
	{
		this.assertElementExists(GenesisConsoleUI.CONFIGURE_BUTTON);
		this.assertElementExists(GenesisConsoleUI.SUPPORT_BUTTON);
		
		//Click configure tab. Check "Configure Integration","Deactivate" button display.
		//Check <<<integration name >>> right displayed ,<<<evar1>>> and <<<metric1>>> are mapped 
		this.click(GenesisConsoleUI.CONFIGURE_BUTTON);
		this.sleep(5000);
		this.waitUntilElement(GenesisConsoleUI.CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON);
		this.waitUntilElement(GenesisConsoleUI.CONFIGURETAB_DEACTIVATE_BUTTON);
		
		this.screenshot(path+"\\assertLegacyConsoleDisplay.png");
		
		this.assertElementExists(GenesisConsoleUI.CONFIGURETAB_CONFIGURE_INTEGRATION_BUTTON);
		this.assertElementExists(GenesisConsoleUI.CONFIGURETAB_DEACTIVATE_BUTTON);
		this.sleep(5000);
		this.assertElementsTextContain(GenesisConsoleUI.INFO_MATCH_TEXT, product_metric);
		this.assertElementsTextContain(GenesisConsoleUI.INFO_MATCH_TEXT, siteCatalyst_eVar);
	}
	
	public void assertConsoleInfoMatch(String path)
	{
		this.waitUntilElement(GenesisConsoleUI.EMAIL_INTEGRATION_TEXT);
		String email = this.findElement(GenesisConsoleUI.EMAIL_INTEGRATION_TEXT).getText().toLowerCase().trim();
		String report = this.findElement(GenesisConsoleUI.REPORT_INTEGRATION_TEXT).getText().toLowerCase().trim();
		String name = this.findElement(GenesisConsoleUI.NAME_INTEGRATION_TEXT).getText().toLowerCase().trim();
		
		//Click configure tab. Info get from pre step should be consistent with info display in Integration Summary tab
		this.switchToConfigureTab();
		//this.waitUntilElement(GenesisConsoleUI.SUMMARY_HEAD);
		
		this.waitUntilElement(GenesisConsoleUI.EMAIL_SUMMARY_TEXT);
		String temail = this.findElement(GenesisConsoleUI.EMAIL_SUMMARY_TEXT).getText().toLowerCase().trim();
		String treport = this.findElement(GenesisConsoleUI.REPORT_SUMMARY_TEXT).getText().toLowerCase().trim();
		String tname = this.findElement(GenesisConsoleUI.NAME_SUMMARY_TEXT).getText().toLowerCase().trim();
		
		this.screenshot(path+"\\assertConsoleInfoMatch.png");
		assertTrue("email not match!",temail.contains(email));
		assertTrue("name not match!",tname.contains(name));
		assertTrue("report not match!",treport.contains(report));
	}
}
