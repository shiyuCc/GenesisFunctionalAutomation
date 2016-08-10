package com.omniture.uiautomation.devconn.ui;

import org.openqa.selenium.By;

public class DocumentationUI extends DevConUI{
	//the title of left navigation
	public final static String defaultNavTitle = "DOCUMENTATION";
	public final static String DEFAULT_TITLE = "API Documentation";
	//the xpath of the left navigation tag
	public final static By DATA_INSERTION = getTitleXpath("Data Insertion");
	public final static By DATA_SOURCES = getTitleXpath("Data Sources");
	public final static By DATA_WAREHOUSE = getTitleXpath("Data Warehouse");
	public final static By GENESIS = getTitleXpath("Genesis");
	public final static By OMNITURE_ADMINISTRATION = getTitleXpath("Omniture Administration");
	public final static By RECOMMENDATIONS = getTitleXpath("Recommendations");
	public final static By SAINT_API = getTitleXpath("SAINT API");
	public final static By SITECATALYST_REPORTING = getTitleXpath("SiteCatalyst Reporting");
	public final static By SURVEY_API = getTitleXpath("Survey API");
	public final static By TEST_TARGET = getTitleXpath("Test&Target");
	//the expect page title after click the related tag
	public final static String DATA_INSERTION_TITLE = "Data Insertion API";
	public final static String DATA_SOURCES_TITLE = "Overview";
	public final static String DATA_WAREHOUSE_TITLE = "Overview";
	public final static String GENESIS_TITLE = "Genesis Partner API";
	public final static String OMNITURE_ADMINISTRATION_TITLE = "SiteCatalyst Administration API";
	public final static String RECOMMENDATIONS_TITLE = "Recommendations API";
	public final static String SAINT_API_TITLE = "Overview";
	public final static String SITECATALYST_REPORTING_TITLE = "Overview";	
	public final static String SURVEY_API_TITLE = "Overview";	
	public final static String TEST_TARGET_TITLE = "Test&Target API";	
	//child nodes after click a tag
	public final static By leftNavLastGrandsonTag = By.xpath("//ul[@class='expandable']//li[last()]");
}

