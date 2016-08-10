package com.omniture.uiautomation.devconn.pages;

import org.openqa.selenium.By;

import com.omniture.uiautomation.devconn.ui.DocumentationUI;

public class DocumentationPage extends DevConPage{
	
	
	public void assertNavTitle(String expPageTitle)
	{
		this.assertElementsTextContain(DocumentationUI.LEFT_NAVIGATION_ELEMENT , expPageTitle.toUpperCase());
	}
	
	public void assertEachTag(By checkLeftNavTag)
	{

//		String navTitle = null;
		this.assertElementExists(checkLeftNavTag);
		this.click(checkLeftNavTag);
		this.waitUntilPageLoad();
		//check the default page title
//		navTitle = checkLeftNavTag.toString();
//		this.assertElementsTextContain(DocumentationUI.leftNavTitle , navTitle);
		//check the left navigation title
		//check if the value got by xpath is the same with the title string
	}
}
