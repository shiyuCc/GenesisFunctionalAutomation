package com.omniture.uiautomation.devconn.ui;

import org.openqa.selenium.By;

public class BlogUI extends DevConUI{

	//default page display
	public final static String DEFAULT_TITLE = "Blog";
	public final static String LEFT_NAVIGATION_TITLE = "BLOG";
	//common page components
	public final static By SIDENAV = By.id("sidenav");
	public final static By CONTENT = By.id("content");
	public final static By FOOTER = By.id("footer");
	public final static By ACCOUNT_NAV = By.xpath("//div[@class='account-nav']");
	public final static By SEARCH_BOX = By.xpath("//div[@class='search yui-skin-sam']");
	public final static By AUTHOR_SEARCH = By.id("blog-author-filter");
	public final static By CONTENT_LOADING = By.xpath("//div//ul[@class='post-list loading']");
	public final static By CONTENT_RESULT = By.xpath("//div//ul[@class='post-list']");
	//filter functions
	public final static By FILTER_AUTHOR =  By.id("filter-author");
	public final static By FILTER_DATE =  By.id("filter-date");	
	public final static By PAGINATION_NEXT = By.id("blog-next-page");
	public final static By PAGINATION_PREVIOUS = By.id("blog-previous-page");
	public final static By RESET_CHOICE = By.id("reset-filters-button");
	//test choice
	public final static String SEARCH_TOKEN = "brent";
	public final static int TEST_CHOICE_YEAR = 2012;
	public final static int TEST_CHOICE_MONTH = 1;
	//new blog page
	public final static By NEW_BLOG_BUTTON = By.xpath("//a[@href='/"+getLanguageEnvironment()+"/blog/new']");
	public final static String NEW_BLOG_PAGE_TITLE = "New Blog Post";
	public final static By NEW_BLOG_TITLE = By.id("blog_post_title");
	public final static By NEW_BLOG_BODY = By.id("blog_post_body_markdown");
	public final static By NEW_BLOG_TAGS = By.id("autocomplete_blog_post_tags_list");
	public final static By NEW_BLOG_FILE_UPLOAD = By.id("blog_post_uploads");
	public final static By NEW_BLOG_SAVE_BUTTON = By.xpath("//input[@value='Save']");
	public final static By New_BLOG_TAG_LOADING = By.xpath("//input[@class='tag-widget ac_loading']");
	public final static By New_BLOG_TAG_DONE = By.xpath("//input[@class='tag-widget ac_input']");
	public final static By New_BLOG_DELETE = By.xpath("//a[@class='button'][last()]");
	public static By getCheckYear(int year)
	{
		return By.id("date-"+year);
	}
	public static By getCheckMonth(int year,int month)
	{
		return By.id("date-"+year+"-"+month);
	}
	public static By getActiveMonthTag(int year,int month)
	{
		return By.xpath("//li[@id='date-"+year+"-"+month+"']/a[@class='active filter-month']");
	}
}
