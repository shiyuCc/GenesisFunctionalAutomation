package com.omniture.uiautomation.devconn.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.devconn.ui.BlogUI;
import com.omniture.uiautomation.devconn.ui.GalleryUI;

public class BlogPage extends DevConPage{
	
	public void assertAuthorSearch(String token)
	{
		this.assertElementExists(BlogUI.AUTHOR_SEARCH);
		this.type(BlogUI.AUTHOR_SEARCH, token);
		this.waitUntilElement(BlogUI.CONTENT_LOADING);
		this.waitUntilElement(BlogUI.CONTENT_RESULT);

	}
	public void fillContent(By element,String content)
	{
		this.clear(element);
		this.type(element,content);

	}
	public void typeTag(String tag)
	{
		this.type(BlogUI.NEW_BLOG_TAGS,tag);
//		WebElement text = this.findElement(BlogUI.NEW_BLOG_TAGS);
//		text.click();
//		this.waitUntilElement(BlogUI.New_BLOG_TAG_LOADING);
//		this.waitUntilElement(BlogUI.New_BLOG_TAG_DONE);
//		text.sendKeys(Keys.ENTER);
		
	}
	public void assertAddSuccessfully(String title)
	{
		this.assertElementTextContain(BlogUI.CONTENT_TITLE,title);
	}
	public void assertNextPage()
	{
		this.assertElementExists(BlogUI.PAGINATION_NEXT);
		this.click(BlogUI.PAGINATION_NEXT);
		this.waitUntilElement(BlogUI.CONTENT_LOADING);
		this.waitUntilElement(BlogUI.CONTENT_RESULT);
		
	}
	public void assertPreviousPage()
	{
		this.assertElementExists(BlogUI.PAGINATION_PREVIOUS);
		this.click(BlogUI.PAGINATION_PREVIOUS);
		this.waitUntilElement(BlogUI.CONTENT_LOADING);
		this.waitUntilElement(BlogUI.CONTENT_RESULT);
				
	}
	
	public void assertDefaultTitle(String title,String leftNavigationTitle)
	{
		this.assertElementTextContain(BlogUI.CONTENT_TITLE_ELEMENT, title);
		this.assertElementTextContain(BlogUI.LEFT_NAVIGATION_ELEMENT, leftNavigationTitle);
	}
	public void assertPageDisplays()
	{
		this.assertElementExists(BlogUI.ACCOUNT_NAV);
		this.assertElementExists(BlogUI.CONTENT);
		this.assertElementExists(BlogUI.FOOTER);
		this.assertElementExists(BlogUI.SEARCH_BOX);
		this.assertElementExists(BlogUI.SIDENAV);
	}
	public void assertLogoutSuccessfully()
	{
		this.assertElementExists(BlogUI.ACCOUNT_NAV);
		this.assertElementExists(BlogUI.FOOTER);
		this.assertElementExists(BlogUI.SEARCH_BOX);	
	}
	public void assertFiltersExist()
	{
		this.assertElementExists(BlogUI.FILTER_AUTHOR);
		this.assertElementExists(BlogUI.FILTER_DATE);
		this.assertElementExists(BlogUI.RESET_CHOICE);	
	}
	public void assertDateFilter(int year,int month)
	{
		this.click(BlogUI.getCheckYear(year));
		this.waitUntilElement(BlogUI.getCheckMonth(year,month));
		//the 3rd month of 2012
		this.click(BlogUI.getCheckMonth(year,month));
		this.waitUntilElement(BlogUI.getActiveMonthTag(year,month));
	}
	public void assertResetFilter()
	{
		this.click(BlogUI.RESET_CHOICE);
		this.waitUntilPageLoad();

	}
}
