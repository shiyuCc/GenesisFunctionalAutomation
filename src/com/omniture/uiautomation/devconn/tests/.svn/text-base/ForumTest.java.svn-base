package com.omniture.uiautomation.devconn.tests;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.openqa.selenium.By;

import com.omniture.uiautomation.devconn.pages.ForumPage;
import com.omniture.uiautomation.devconn.ui.BlogUI;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.devconn.ui.ForumUI;
import com.omniture.uiautomation.tests.DeveloperTest;

public class ForumTest extends DeveloperTest{

	ForumPage forumPage = new ForumPage();
//	@Test
//	public void testFilter()
//	{
//		
//		forumPage.navToHomePage();
//		forumPage.navTo(DevConUI.FORUM);
//		forumPage.waitUntilPageLoad();
//		forumPage.assertDefaultTitle(ForumUI.DEFAULT_TITLE,ForumUI.LEFT_NAVIGATION_TITLE);	
//		
//		ArrayList<By> leftNavTags = new ArrayList<By>();
//		ArrayList<String> leftNavTitles = new ArrayList<String>();
//		leftNavTags.add(ForumUI.GENERAL_TOPIC_FORUM);
//		leftNavTags.add(ForumUI.SITECATALYST_ADMINISTRATION);
//		leftNavTags.add(ForumUI.SITECATALYST_REPORTING);
//		leftNavTags.add(ForumUI.SITECATALYST_DATA_INSERTION);
//		leftNavTags.add(ForumUI.GENESIS_PARTNER_APIS);
//		leftNavTags.add(ForumUI.INSIGHT);
//		leftNavTags.add(ForumUI.SCENE7);
//		leftNavTitles.add(ForumUI.GENERAL_TOPIC_FORUM_TITLE);
//		leftNavTitles.add(ForumUI.SITECATALYST_ADMINISTRATION_TITLE);
//		leftNavTitles.add(ForumUI.SITECATALYST_REPORTING_TITLE);
//		leftNavTitles.add(ForumUI.SITECATALYST_DATA_INSERTION_TITLE);
//		leftNavTitles.add(ForumUI.GENESIS_PARTNER_APIS_TITLE);
//		leftNavTitles.add(ForumUI.INSIGHT_TITLE);
//		leftNavTitles.add(ForumUI.SCENE7_TITLE);
//		Iterator<By> it = leftNavTags.iterator();
//		Iterator<String> it2 = leftNavTitles.iterator();
//		while(it.hasNext())
//		{
//			forumPage.checkEachTag(it.next(),it2.next());
//		}
//	}
//	@Test
//	public void testPagination()
//	{
//		forumPage.navToHomePage();
//		forumPage.navTo(DevConUI.FORUM);
//		forumPage.waitUntilPageLoad();
//		forumPage.assertDefaultTitle(ForumUI.DEFAULT_TITLE,ForumUI.LEFT_NAVIGATION_TITLE);	
//		forumPage.assertElementExists(ForumUI.GENERAL_TOPIC_FORUM);
//		forumPage.click(ForumUI.GENERAL_TOPIC_FORUM);
//		forumPage.waitUntilPageLoad();
//		forumPage.assertElementsTextContain(ForumUI.CONTENT_TITLE, ForumUI.GENERAL_TOPIC_FORUM_TITLE);
//		forumPage.assertPaginagtionExists();
//		forumPage.assertPaginationNum(ForumUI.PAGINATION_TEST_PAGE3);
//		forumPage.assertDevConDisplay();
//		forumPage.assertPaginationPerPage(ForumUI.PER_PAGE_TEST_50);
//		forumPage.assertDevConDisplay();
//		forumPage.assertPaginationAll(ForumUI.PAGINATION_TEST_ALL);
//		forumPage.assertDevConDisplay();
//	}
//	@Test
//	public void testSorting()
//	{
//		forumPage.navToHomePage();
//		forumPage.navTo(DevConUI.FORUM);
//		forumPage.waitUntilPageLoad();
//		forumPage.assertDefaultTitle(ForumUI.DEFAULT_TITLE,ForumUI.LEFT_NAVIGATION_TITLE);
//		forumPage.assertElementExists(ForumUI.GENERAL_TOPIC_FORUM);
//		forumPage.click(ForumUI.GENERAL_TOPIC_FORUM);
//		forumPage.waitUntilPageLoad();
//		forumPage.assertSortingsExist();
//		forumPage.assertSorting(ForumUI.SORT_BY_THREAD);
//		forumPage.assertDevConDisplay();
//		forumPage.assertSorting(ForumUI.SORT_BY_REPLIES);
//		forumPage.assertDevConDisplay();
//		forumPage.assertSorting(ForumUI.SORT_BY_VIEWS);
//		forumPage.assertDevConDisplay();
//		forumPage.assertSorting(ForumUI.SORT_BY_LAST_REPLY);
//		forumPage.assertDevConDisplay();
//	}
	@Test
	public void testAddNewThread()
	{
		forumPage.navToHomePage();
		forumPage.navTo(DevConUI.FORUM);
		forumPage.waitUntilPageLoad();
		forumPage.assertDefaultTitle(ForumUI.DEFAULT_TITLE,ForumUI.LEFT_NAVIGATION_TITLE);
		forumPage.assertElementExists(ForumUI.GENERAL_TOPIC_FORUM);
		forumPage.click(ForumUI.GENERAL_TOPIC_FORUM);
		forumPage.waitUntilPageLoad();
		forumPage.login();
		forumPage.click(ForumUI.CREATE_NEW_THREAD_BUTTON);
		forumPage.waitUntilPageLoad();
		forumPage.assertElementTextContain(ForumUI.CONTENT_TITLE_ELEMENT, ForumUI.NEW_FORUM_PAGE_TITLE);
		forumPage.fillContent(ForumUI.NEW_FORUM_TITLE,"moshen-test");
		forumPage.fillContent(ForumUI.NEW_FORUM_BODY,"This is a new forum body test!");
		forumPage.type(ForumUI.NEW_FORUM_TAGS, "g");
		forumPage.click(ForumUI.NEW_FORUM_CREATE_BUTTON);
		forumPage.waitUntilPageLoad();
		forumPage.assertAddSuccessfully("moshen-test");
		forumPage.logout();
		forumPage.waitUntilPageLoad();
		forumPage.assertDevConDisplay();
	}
}
