package com.omniture.uiautomation.devconn.pages;
import org.openqa.selenium.By;

import com.omniture.uiautomation.devconn.ui.BlogUI;
import com.omniture.uiautomation.devconn.ui.ForumUI;

public class ForumPage extends DevConPage{
	
	public void assertDefaultTitle(String title,String leftNavigationTitle)
	{
		this.assertElementTextContain(ForumUI.CONTENT_TITLE_ELEMENT, title);
		this.assertElementTextContain(ForumUI.LEFT_NAVIGATION_ELEMENT, leftNavigationTitle);
	}

	public void checkEachTag(By checkTag , String expectTitle)
	{
		this.assertElementExists(checkTag);
		this.click(checkTag);
		this.waitUntilPageLoad();
		this.assertElementsTextContain(ForumUI.CONTENT_TITLE, expectTitle);
	}
	public void fillContent(By element,String content)
	{
		this.clear(element);
		this.type(element,content);

	}
	public void assertAddSuccessfully(String title)
	{
		this.assertElementTextContain(BlogUI.CONTENT_TITLE,title);
	}
	public void assertPaginagtionExists()
	{
		this.assertElementExists(ForumUI.PAGINATION_SECTION);
	}
	public void assertPaginationNum(By page)
	{
		//click page 3 & all
		this.assertElementExists(page);
		this.click(page);
		this.waitUntilPageLoad();

	}
	public void assertPaginationPerPage(By perPage)
	{
		//click page 3 & all
		this.assertElementExists(perPage);
		this.click(perPage);
		this.waitUntilPageLoad();

	}
	public void assertPaginationAll(By all)
	{
		//click page 3 & all
		this.assertElementExists(all);
		this.click(all);
		this.waitUntilPageLoad();
	}
	public void assertSortingsExist()
	{
		this.assertElementExists(ForumUI.SORT_BY_THREAD);
		this.assertElementExists(ForumUI.SORT_BY_REPLIES);
		this.assertElementExists(ForumUI.SORT_BY_VIEWS);
		this.assertElementExists(ForumUI.SORT_BY_LAST_REPLY);
	}
	public void assertSorting(By sortChoice)
	{
		//check the sorting buttons
		this.click(sortChoice);
		this.waitUntilPageLoad();
	}
}
