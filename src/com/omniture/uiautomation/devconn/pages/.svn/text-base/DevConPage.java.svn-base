package com.omniture.uiautomation.devconn.pages;

import org.openqa.selenium.By;

import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.framework.TestEnvironment;
import com.omniture.uiautomation.pages.DeveloperPage;

public class DevConPage extends DeveloperPage{
	//check if the value get by xpath is the same with expected left navigation title
	public void assertLeftNavigation(By leftNavTitle , String leftNavName)
	{
		this.assertElementExists(leftNavTitle);
		this.assertElementTextContain(leftNavTitle, leftNavName.trim().toUpperCase());
	}
	public void assertFootbar(By footBar)
	{
		this.assertElementExists(footBar);
	}
	public void switchLanguage(String language)
	{
		this.getDriver().get(TestEnvironment.current.getBaseUrl()+"/"+language);
		this.waitUntilPageLoad();
	}
	public void assertLanguageSwithed(String gallery,String login,String title,String forum)
	{	
		forum.toUpperCase();
		DevConUI.TOP_NAVIGATION_GALLERY = By.xpath("//div[@id='header']//a[@href='/"+DevConUI.getLanguageEnvironment()+"/gallery']");
		DevConUI.FOOTBAR_NAVIGATION_FORUM = By.xpath("//div[@id='footer']/ul/li/a[@href='/"+DevConUI.getLanguageEnvironment()+"/forum']");
		System.err.println(this.findElement(DevConUI.TOP_NAVIGATION_GALLERY).getText());
		System.err.println(this.findElement(DevConUI.ACCOUNT_NAVIGATION_LOGIN).getText());
		System.err.println(this.findElement(DevConUI.LEFT_NAVIGATION_TITLE).getText());
		System.err.println(this.findElement(DevConUI.FOOTBAR_NAVIGATION_FORUM).getText());
		this.assertElementTextContain(DevConUI.TOP_NAVIGATION_GALLERY, gallery);
		this.assertElementTextContain(DevConUI.ACCOUNT_NAVIGATION_LOGIN, login);
		this.assertElementTextContain(DevConUI.LEFT_NAVIGATION_TITLE, title);
		this.assertElementTextContain(DevConUI.FOOTBAR_NAVIGATION_FORUM,forum);
	}
	public void assertEnglish()
	{
		this.assertElementTextContain(DevConUI.TOP_NAVIGATION_GALLERY, "");
		this.assertElementTextContain(DevConUI.ACCOUNT_NAVIGATION_LOGIN, "");
		this.assertElementTextContain(DevConUI.LEFT_NAVIGATION_TITLE, "");
		this.assertElementTextContain(DevConUI.FOOTBAR_NAVIGATION_FORUM, "");
	}
	public void assertGerman()
	{
		
	}
	public void assertSpanish()
	{
		
	}
	public void assertFrench()
	{
		
	}
	public void assertPortuguese()
	{
		
	}
	public void assertJapanese()
	{
		
	}
	public void assertKorean()
	{
		
	}
	public void assertSimpleChinese()
	{
		
	}
	public void assertTraditionalChinese()
	{
		
	}
	
}
