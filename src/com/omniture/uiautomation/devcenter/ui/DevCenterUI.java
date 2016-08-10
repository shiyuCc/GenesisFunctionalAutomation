package com.omniture.uiautomation.devcenter.ui;

import org.openqa.selenium.By;
import com.omniture.uiautomation.ui.DeveloperUI;;


public class DevCenterUI extends DeveloperUI{
	
	//the title of left navigation
	public static By leftNavTitle = By.xpath("//ul[@id='sidenav']/li[1]/a") ;
	public static By titleOfPage = By.xpath("//div[@class='content_header']/h1");
	public static By titleOfGenesisPage = By.xpath("//div[@class='content_header main']/h1");
	public static By companyDropDown = By.xpath("//div[@class='company_div']/form[@name='companySelect']");
	public static By successfulMessage = By.xpath("//div[@id='messages']/div");

	public static By getTitleXpath (String title)
	{
		return By.xpath("//Li/a[@title='"+title+"']");
	}
	
	//the xpath of left navigation tag
	
	public static By HOME = getTitleXpath("Home");
	public static By SANDBOX = getTitleXpath("Sandbox");
	public static By GENESIS = getTitleXpath("Genesis");
	public static By MOBILE = getTitleXpath("Mobile");
	public static By SCENE7 = getTitleXpath("Scene7");
	public static By REPORT_SUITE = getTitleXpath("Report Suites");
	public static By MEMBERS = getTitleXpath("Members");
	public static By OVERVIEW = getTitleXpath("Overview");
	public static By CUSTOMER_SUPPORT = getTitleXpath("Customer Support");
	public static By PARTNER_API = getTitleXpath("Partner API");
	
	
	//the expect page title after click the related tag
	
	public static String leftNavName = "Dev Center";
	public static String DEFAULT_TITLE = "Welcome to the Dev Center!";
	public static String SANDBOX_DEFAULT_TITLE = "Sandbox Report Suites";
	public static String MEMBER_TITLE = "Member Management";
	public static String GENESIS_DEFAULT_TITLE = "Products";
	public static String OVERVIEW_TITLE = "Welcome To The Dev Center!";
	public static String CUSTOMER_SUPPORT_TITLE = "Customer Support";
	public static String PARTNER_API_TITLE ="Partner API Access";
	public static String MOBILE_TITLE = "Mobile";
	public static String SCENE7_TITLE = "Scene7";
	
	

}
