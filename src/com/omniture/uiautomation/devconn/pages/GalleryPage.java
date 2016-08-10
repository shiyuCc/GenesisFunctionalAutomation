package com.omniture.uiautomation.devconn.pages;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.devconn.ui.GalleryUI;

public class GalleryPage extends DevConPage{
	
	public void assertDefaultTitle(String title,String leftNavigationTitle)
	{
		this.assertElementTextContain(GalleryUI.CONTENT_TITLE_ELEMENT, title);
		this.assertElementTextContain(GalleryUI.LEFT_NAVIGATION_ELEMENT, leftNavigationTitle);
	}
	public void assertPageDisplays()
	{
		ArrayList<By> pageElements = new ArrayList<By>();
		pageElements.add(GalleryUI.LEFT_NAVIGATION_RATING);
		pageElements.add(GalleryUI.LEFT_NAVIGATION_DATE);
		pageElements.add(GalleryUI.LEFT_NAVIGATION_TAGS);
		pageElements.add(GalleryUI.LEFT_NAVIGATION_LANGUAGES);
		pageElements.add(GalleryUI.LEFT_NAVIGATION_RESET);
		pageElements.add(GalleryUI.SORTING_LIST);
//		pageElements.add(PAGINATION_BUTTONS);
		pageElements.add(GalleryUI.CONTRIBUTE_BUTTON);
		this.assertElementsExist(pageElements);
	}
	//the first param is the filter function you want to test,the second is your choice
	public void assertEachFilter(ArrayList<By> checkFilter,ArrayList<By> choice)
	{
		Iterator<By> it = checkFilter.iterator();
		Iterator<By> it2 = choice.iterator();
		int num=1;
		while(it.hasNext())
		{
			By currentFilter = it.next();
			By currentChoice = it2.next();
			this.assertElementExists(currentFilter);
			if(num!=1)
			this.click(currentFilter);
			this.waitUntilElement(currentChoice);
			this.assertElementExists(currentChoice);
			this.click(currentChoice);
			this.waitUntilElement(GalleryUI.CONTENT_LOADING);
			this.waitUntilElement(GalleryUI.CONTENT_DISPLAY);
			assertPageDisplays();
			this.click(GalleryUI.RESET_CHOICE);
			this.waitUntilElement(GalleryUI.CONTENT_LOADING);
			this.waitUntilElement(GalleryUI.CONTENT_DISPLAY);
			assertPageDisplays();
			num++;
		}				
	}
	public void fillTextContent(By element,String content)
	{
		this.clear(element);
		this.type(element,content);
		
	}
	public void typeTag(String tag)
	{
		WebElement text = this.findElement(GalleryUI.ADD_TAGS_LIST);
		text.click();
		text.sendKeys(tag,Keys.ENTER);
	}
	public void assertAddSuccessfully(String title)
	{
		this.assertElementTextContain(GalleryUI.CONTENT_TITLE,title);
	}
//	public void assertPaginations()
//	{
//		this.assertElementExists(by);
//	}
	public void assertEachSorting(ArrayList<By> checkSorting)
	{
		Iterator<By> it = checkSorting.iterator();
		int num = 1;
		while(it.hasNext())
		{
			this.assertElementsExist(checkSorting);
			this.click(it.next());
			if(num != 1)
			{//the first sorting choice does not make any change to the page
			this.waitUntilElement(GalleryUI.CONTENT_LOADING);
			this.waitUntilElement(GalleryUI.CONTENT_DISPLAY);
			}
			num++;
			assertPageDisplays();
			this.assertElementExists(GalleryUI.PAGINATION_BUTTONS);
		}
	}
	public int getCurrentPageNumber()
	{
		int currentPage =Integer.valueOf(this.findElement(GalleryUI.PAGINATION_CURRENT_BUTTON).getText().trim());
		return currentPage;
	}
	public void clickPageNum(int pageNumber)
	{
		this.assertElementExists(GalleryUI.getTestPageNum(pageNumber));
		this.click(GalleryUI.getTestPageNum(pageNumber));
		this.waitUntilElement(GalleryUI.getCurrentPageNum(pageNumber));
	}
	public void clickPreviousPage()
	{
		int currentPage = getCurrentPageNumber();
		this.assertElementExists(GalleryUI.PAGINATION_PREVIOUS_BUTTON);
		this.click(GalleryUI.PAGINATION_PREVIOUS_BUTTON);
		this.waitUntilElement(GalleryUI.getCurrentPageNum(currentPage-1));
	}
	public void clickNextPage()
	{
		int currentPage = getCurrentPageNumber();
		this.assertElementExists(GalleryUI.PAGINATION_NEXT_BUTTON);
		this.click(GalleryUI.PAGINATION_NEXT_BUTTON);
		this.waitUntilElement(GalleryUI.getCurrentPageNum(currentPage+1));	
	}
	public void clickFirstPage()
	{
		this.assertElementExists(GalleryUI.PAGINATION_FIRST_BUTTON);
		this.click(GalleryUI.PAGINATION_FIRST_BUTTON);
		this.waitUntilElement(GalleryUI.getCurrentPageNum(1));
	}
	public void clickLastPage()
	{
		this.assertElementExists(GalleryUI.PAGINATION_LAST_BUTTON);
		this.click(GalleryUI.PAGINATION_LAST_BUTTON);
		this.waitUntilElement(GalleryUI.PAGINATION_LAST_BUTTON_DISABLE);
		
	}
	public void assertPaginationExists()
	{	//default page
		this.assertElementExists(GalleryUI.PAGINATION_BUTTONS);
		this.assertElementTextContain(GalleryUI.PAGINATION_CURRENT_BUTTON,"1");
	}
}
