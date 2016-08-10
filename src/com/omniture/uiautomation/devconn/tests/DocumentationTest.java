package com.omniture.uiautomation.devconn.tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;
import org.openqa.selenium.By;

import com.omniture.uiautomation.tests.DeveloperTest;
import com.omniture.uiautomation.devconn.pages.DocumentationPage;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.devconn.ui.DocumentationUI;


public class DocumentationTest extends DeveloperTest{
	DocumentationPage documentationPage = new DocumentationPage();
	@Test
	public void testMainPage()
	{
	    ArrayList<By> documentTags = new ArrayList<By>();
	    ArrayList<String> documentTitle = new ArrayList<String>();
		documentTags.add(DocumentationUI.DATA_INSERTION);
		documentTitle.add(DocumentationUI.DATA_INSERTION_TITLE);
		documentTags.add(DocumentationUI.DATA_SOURCES);
		documentTitle.add(DocumentationUI.DATA_SOURCES_TITLE);
		documentTags.add(DocumentationUI.DATA_WAREHOUSE);
		documentTitle.add(DocumentationUI.DATA_WAREHOUSE_TITLE);
		documentTags.add(DocumentationUI.GENESIS);
		documentTitle.add(DocumentationUI.GENESIS_TITLE);
		documentTags.add(DocumentationUI.OMNITURE_ADMINISTRATION);
		documentTitle.add(DocumentationUI.OMNITURE_ADMINISTRATION_TITLE);
		documentTags.add(DocumentationUI.RECOMMENDATIONS);
		documentTitle.add(DocumentationUI.RECOMMENDATIONS_TITLE);
		documentTags.add(DocumentationUI.SAINT_API);
		documentTitle.add(DocumentationUI.SAINT_API_TITLE);
		documentTags.add(DocumentationUI.SITECATALYST_REPORTING);
		documentTitle.add(DocumentationUI.SITECATALYST_REPORTING_TITLE);
		documentTags.add(DocumentationUI.SURVEY_API);
		documentTitle.add(DocumentationUI.SURVEY_API_TITLE);
		documentTags.add(DocumentationUI.TEST_TARGET);
		documentTitle.add(DocumentationUI.TEST_TARGET_TITLE);
		Iterator<By> it = documentTags.iterator();
		Iterator<String> it2 = documentTitle.iterator();
		documentationPage.navToHomePage();
		while(it.hasNext())
		{
			documentationPage.navTo(DevConUI.DOCUMENTATION);
			documentationPage.assertNavTitle(DocumentationUI.defaultNavTitle);
			documentationPage.assertEachTag(it.next());
			documentationPage.assertElementsTextContain(DocumentationUI.CONTENT_TITLE_ELEMENT,it2.next());
			documentationPage.assertDevConDisplay();
			if(documentationPage.isElementExists(DocumentationUI.leftNavLastGrandsonTag))
			{
				documentationPage.click(DocumentationUI.leftNavLastGrandsonTag);
				documentationPage.waitUntilPageLoad();
				documentationPage.assertDevConDisplay();
			}
		}
	//	documentationPage.pageAssert(DocumentationUI.leftNavTitle, DevConGetStartedUI.leftNavName);
	}
}