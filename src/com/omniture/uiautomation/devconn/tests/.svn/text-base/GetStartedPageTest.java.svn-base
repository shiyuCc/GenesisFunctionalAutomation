package com.omniture.uiautomation.devconn.tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;
import org.openqa.selenium.By;

import com.omniture.uiautomation.devconn.pages.GetStartedPage;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.devconn.ui.GetStartedUI;
import com.omniture.uiautomation.tests.DeveloperTest;

public class GetStartedPageTest extends DeveloperTest{
	GetStartedPage getStartedPage = new GetStartedPage();
	@Test	
	public void testHeadNav()
	{
	    ArrayList<By> getStartedTags = new ArrayList<By>();
	    ArrayList<String> getStartedTitle = new ArrayList<String>();
		getStartedTags.add(GetStartedUI.CONCEPTS_TERMINOLOGY);
		getStartedTitle.add(GetStartedUI.CONCEPTS_TERMINOLOGY_TITLE);
		getStartedTags.add(GetStartedUI.SITECATALYST_TAGGING);
		getStartedTitle.add(GetStartedUI.SITECATALYST_TAGGING_TITLE);
		getStartedTags.add(GetStartedUI.ENTERPRISE_API);
		getStartedTitle.add(GetStartedUI.ENTERPRISE_API_TITLE);
		getStartedTags.add(GetStartedUI.PARTNER_API);
		getStartedTitle.add(GetStartedUI.PARTNER_API_TITLE);
		getStartedTags.add(GetStartedUI.ERROR_CODE_RESPONSES);
		getStartedTitle.add(GetStartedUI.ERROR_CODE_RESPONSES_TITLE);
		getStartedTags.add(GetStartedUI.MOBILE);
		getStartedTitle.add(GetStartedUI.MOBILE_TITLE);
		getStartedTags.add(GetStartedUI.API_EXPLORER);
		getStartedTitle.add(GetStartedUI.API_EXPLORER_TITLE);
		getStartedTags.add(GetStartedUI.TERMS_OF_USE);
		getStartedTitle.add(GetStartedUI.TERMS_OF_USE_TITLE);
		Iterator<By> it = getStartedTags.iterator();
		Iterator<String> it2 = getStartedTitle.iterator();
		getStartedPage.navToHomePage();
		getStartedPage.navTo(DevConUI.GET_STARTED);
		getStartedPage.assertLeftNavigation(GetStartedUI.LEFT_NAVIGATION_ELEMENT, GetStartedUI.leftNavName);
		while(it.hasNext())
		{
			getStartedPage.assertLeftTag(it.next());
			if(it.hasNext())//because the last tag"terms of use" redirect to another page
			getStartedPage.assertDevConDisplay();
			getStartedPage.assertElementsTextContain(GetStartedUI.defaultTitleElement, it2.next());
			if(getStartedPage.isElementExists(GetStartedUI.leftNavLastGrandsonTag))
			{
				getStartedPage.click(GetStartedUI.leftNavLastGrandsonTag);
				getStartedPage.waitUntilPageLoad();
				getStartedPage.assertDevConDisplay();
			}
		}	
	}

}
