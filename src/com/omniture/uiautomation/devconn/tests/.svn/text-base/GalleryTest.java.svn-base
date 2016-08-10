package com.omniture.uiautomation.devconn.tests;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.devconn.pages.GalleryPage;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.devconn.ui.GalleryUI;
import com.omniture.uiautomation.tests.DeveloperTest;

public class GalleryTest extends DeveloperTest{
	GalleryPage galleryPage = new GalleryPage();
//	
//	@Test
//	public void testFilter()
//	{
//		ArrayList<By> filterFunctions = new ArrayList<By>();
//		ArrayList<By> filterChoices = new ArrayList<By>();
//		filterFunctions.add(GalleryUI.LEFT_NAVIGATION_RATING);
//		filterFunctions.add(GalleryUI.LEFT_NAVIGATION_DATE);
//		filterFunctions.add(GalleryUI.LEFT_NAVIGATION_TAGS);
//		filterFunctions.add(GalleryUI.LEFT_NAVIGATION_LANGUAGES);		
//		filterChoices.add(GalleryUI.RATING_CHOICE);
//		filterChoices.add(GalleryUI.DATE_CHOICE);
//		filterChoices.add(GalleryUI.TAGS_CHOICE);
//		filterChoices.add(GalleryUI.LANGUAGES_CHOICE);
//		galleryPage.navToHomePage();
//		galleryPage.navTo(DevConUI.GALLERY);
//		galleryPage.assertDefaultTitle(GalleryUI.DEFAULT_TITLE,GalleryUI.LEFT_NAVIGATION_TITLE);	
//		galleryPage.assertPageDisplays();
//		galleryPage.assertEachFilter(filterFunctions,filterChoices);
//	}
//	@Test
//	public void testSorting()
//	{
//		ArrayList<By> sortSelections = new ArrayList<By>();
//		sortSelections.add(GalleryUI.SORTING_HIGH);
//		sortSelections.add(GalleryUI.SORTING_LOW);
//		sortSelections.add(GalleryUI.SORTING_NEW);
//		sortSelections.add(GalleryUI.SORTING_OLD);
//		sortSelections.add(GalleryUI.SORTING_POPULARITY_MOST);
//		sortSelections.add(GalleryUI.SORTING_POPULARITY_LEAST);
//		sortSelections.add(GalleryUI.SORTING_TALKED_MOST);
//		sortSelections.add(GalleryUI.SORTING_TALKED_LEAST);
//		galleryPage.navToHomePage();
//		galleryPage.navTo(DevConUI.GALLERY);
//		galleryPage.assertDefaultTitle(GalleryUI.DEFAULT_TITLE,GalleryUI.LEFT_NAVIGATION_TITLE);	
//		galleryPage.assertPageDisplays();
//		galleryPage.assertEachSorting(sortSelections);
//	}
//	@Test
//	public void testPaginations()
//	{
//		galleryPage.navToHomePage();
//		galleryPage.navTo(DevConUI.GALLERY);
//		galleryPage.assertDefaultTitle(GalleryUI.DEFAULT_TITLE,GalleryUI.LEFT_NAVIGATION_TITLE);	
//		galleryPage.assertPageDisplays();
//		galleryPage.assertPaginationExists();
//		galleryPage.clickPageNum(GalleryUI.PAGINATION_TEST_PAGENUM_BUTTON);
//		galleryPage.assertPageDisplays();	
//		galleryPage.clickPreviousPage();
//		galleryPage.assertPageDisplays();	
//		galleryPage.clickNextPage();
//		galleryPage.assertPageDisplays();	
//		galleryPage.clickFirstPage();
//		galleryPage.assertPageDisplays();	
//		galleryPage.clickLastPage();
//		galleryPage.assertPageDisplays();		
//	}
	@Test
	public void testAddNewContribution()
	{
		galleryPage.navToHomePage();
		galleryPage.navTo(DevConUI.GALLERY);
		galleryPage.assertDefaultTitle(GalleryUI.DEFAULT_TITLE,GalleryUI.LEFT_NAVIGATION_TITLE);	
		galleryPage.assertPageDisplays();
		galleryPage.login();
		galleryPage.click(GalleryUI.CONTRIBUTE_BUTTON);
		galleryPage.fillTextContent(GalleryUI.ADD_TITLE,GalleryUI.ADD_TEST_TITLE);
		galleryPage.fillTextContent(GalleryUI.ADD_DESCRIPTION,GalleryUI.ADD_TEST_DESCRIPTION);
//		if(galleryPage.isElementExists(GalleryUI.ADD_TAGS_CLICKABLE))
//		{
//			galleryPage.click(GalleryUI.ADD_TEST_TAG);
//		}
//		else
//		{
//		galleryPage.click(GalleryUI.ADD_POPULAR_TAGS);
//		galleryPage.waitUntilElement(GalleryUI.ADD_TAGS_CLICKABLE);
//		galleryPage.click(GalleryUI.ADD_TEST_TAG);
//		}
		galleryPage.typeTag("g");
		galleryPage.click(GalleryUI.ADD_LANGUAGES_JAVA);
		galleryPage.click(GalleryUI.ADD_LANGUAGES_PHP);
		galleryPage.click(GalleryUI.ADD_CREATE_BUTTON);
		galleryPage.waitUntilPageLoad();
		galleryPage.assertAddSuccessfully(GalleryUI.ADD_TEST_TITLE);
		galleryPage.logout();
		galleryPage.waitUntilPageLoad();
	}

}
