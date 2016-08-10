package com.omniture.uiautomation.devconn.ui;

import org.openqa.selenium.By;

import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.ui.DeveloperUI;

public class DevConUI extends DeveloperUI{
	
	//the title of the content
	public final static By CONTENT_TITLE_ELEMENT = By.xpath("//div[@id='content']//h1[@class!='comments-title']|//div[@id='content']/h1");
	//the left navigation title
	public final static By LEFT_NAVIGATION_ELEMENT = By.xpath("//ul[@id='sidenav']/li/a") ;
	//search box
	public final static By SEARCH_BOX = By.id("q");
	public final static String SEARCH_BOX_TEST = "brent";
	//footbar
	public final static By FOOTBAR_DOCUMENTATION = getFootbarXpath("documentation");
	public final static By FOOTBAR_GET_STARTED = getFootbarXpath("get-started");
	public final static By FOOTBAR_GALLERY = getFootbarXpath("gallery");
	public final static By FOOTBAR_BLOG = getFootbarXpath("blog");
	public final static By FOOTBAR_FORUM = getFootbarXpath("forum");
	//language switch test
	public final static String LANGUAGE_ENGLISH_URL = "en_US";//English
	public final static String LANGUAGE_GERMAN_URL = "de_DE";//German
	public final static String LANGUAGE_SPANISH_URL = "es_ES";//Spanish
	public final static String LANGUAGE_FRENCH_URL = "fr_FR";//French
	public final static String LANGUAGE_PORTUGUESE_URL = "pt_BR";//Portuguese
	public final static String LANGUAGE_JAPANESE_URL = "ja_JP";//Japanese
	public final static String LANGUAGE_KOREAN_URL = "ko_KR";//Korean
	public final static String LANGUAGE_SIMPLE_CHINESE_URL = "zh_CN";//simple Chinese
	public final static String LANGUAGE_TRADITIONAL_CHINESE_URL = "zh_TW";//traditional Chinese
	//language switch check points
	public static By TOP_NAVIGATION_GALLERY = By.xpath("//div[@id='header']//a[@href='/"+getLanguageEnvironment()+"/gallery']");
	public final static By LEFT_NAVIGATION_TITLE = By.xpath("//div[@class='left-column']//h1");
	public final static By ACCOUNT_NAVIGATION_LOGIN = By.xpath("//a[@class='login']");
	public static By FOOTBAR_NAVIGATION_FORUM = By.xpath("//div[@id='footer']/ul/li/a[@href='/"+getLanguageEnvironment()+"/forum']");
	
	
	public static By getTitleXpath (String title)
	{
		return By.xpath("//Li//a[@title='"+title+"']");
	}
	public static By getXpath(String title)
	{
		String currentURL = TestEnvironment.driver.getCurrentUrl();
		String[] environment = currentURL.split("com");
		return By.xpath("//ul[@id='sidenav']//li/a[@href='"+environment[1]+"/"+title+"']");
	}
	//return language environment such as en_US
	public static String getLanguageEnvironment()
	{
		String url = TestEnvironment.driver.getCurrentUrl();
		String[] environment = url.split("com/");
		String language;
		if(environment[1].contains("/"))
			language = environment[1].substring(0, environment[1].indexOf('/'));
		else
			language = environment[1];
		return language;
	}
	public static By getFootbarXpath(String title)
	{
		return By.xpath("//div[@id='footer']//li/a[@href='/"+getLanguageEnvironment()+"/"+title+"']");
	}

}
