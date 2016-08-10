package com.omniture.uiautomation.devconn.tests;

import org.junit.Test;

import com.omniture.uiautomation.devconn.pages.BlogPage;
import com.omniture.uiautomation.devconn.ui.BlogUI;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.tests.DeveloperTest;

public class BlogTest extends DeveloperTest{
	BlogPage blogPage = new BlogPage();
//	@Test
//	public void testFilter()
//	{
//		blogPage.navToHomePage();
//		blogPage.navTo(DevConUI.BLOG);
//		blogPage.waitUntilPageLoad();
//		blogPage.assertDefaultTitle(BlogUI.DEFAULT_TITLE,BlogUI.LEFT_NAVIGATION_TITLE);
//		blogPage.assertFiltersExist();
//		blogPage.assertDateFilter(BlogUI.TEST_CHOICE_YEAR,BlogUI.TEST_CHOICE_MONTH);
//		blogPage.assertDefaultTitle(BlogUI.DEFAULT_TITLE,BlogUI.LEFT_NAVIGATION_TITLE);
//	}
//	@Test
//	public void testSearchBox()
//	{
//		blogPage.navToHomePage();
//		blogPage.navTo(DevConUI.BLOG);
//		blogPage.waitUntilPageLoad();
//		blogPage.assertDefaultTitle(BlogUI.DEFAULT_TITLE,BlogUI.LEFT_NAVIGATION_TITLE);	
//		blogPage.assertAuthorSearch(BlogUI.SEARCH_TOKEN);
//		blogPage.assertPageDisplays();
//	}
//	@Test
//	public void testPagination()
//	{
//		blogPage.navToHomePage();
//		blogPage.navTo(DevConUI.BLOG);
//		blogPage.waitUntilPageLoad();
//		blogPage.assertDefaultTitle(BlogUI.DEFAULT_TITLE,BlogUI.LEFT_NAVIGATION_TITLE);	
//		blogPage.assertNextPage();
//		blogPage.assertPageDisplays();
//		blogPage.assertPreviousPage();
//		blogPage.assertPageDisplays();
//	}
	@Test
	public void testAddNewBlog()
	{
		blogPage.navToHomePage();
		blogPage.navTo(DevConUI.BLOG);
		blogPage.waitUntilPageLoad();
		blogPage.assertDefaultTitle(BlogUI.DEFAULT_TITLE,BlogUI.LEFT_NAVIGATION_TITLE);	
		blogPage.login();
		blogPage.waitUntilPageLoad();
		blogPage.assertPageDisplays();
		blogPage.click(BlogUI.NEW_BLOG_BUTTON);
		blogPage.waitUntilPageLoad();
		blogPage.assertElementTextContain(BlogUI.CONTENT_TITLE_ELEMENT, BlogUI.NEW_BLOG_PAGE_TITLE);
		blogPage.fillContent(BlogUI.NEW_BLOG_TITLE,"test-moshen");
		blogPage.fillContent(BlogUI.NEW_BLOG_BODY,"THIS IS A NEW BLOG TEST!");
		blogPage.typeTag("g");
		blogPage.click(BlogUI.NEW_BLOG_SAVE_BUTTON);
		blogPage.waitUntilPageLoad();
		blogPage.assertAddSuccessfully("test-moshen");
	//	blogPage.click(BlogUI.New_BLOG_DELETE);
	//	blogPage.s
		blogPage.logout();
		blogPage.waitUntilPageLoad();
		blogPage.assertLogoutSuccessfully();
		
	}
}
