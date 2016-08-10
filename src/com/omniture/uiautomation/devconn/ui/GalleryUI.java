package com.omniture.uiautomation.devconn.ui;


import org.openqa.selenium.By;



public class GalleryUI extends DevConUI{
	//common components and display
	public final static String DEFAULT_TITLE = "Code Gallery";
	public final static String LEFT_NAVIGATION_TITLE = "CODE GALLERY";
	public final static By CONTENT_DISPLAY = By.xpath("//ul[@class='post-list']");
	public final static By CONTENT_LOADING = By.xpath("//ul[@class='post-list loading']");
	//left navigation
	public final static By LEFT_NAVIGATION_RATING = By.xpath("//div[@id='filter-ratings']/h4");
	public final static By LEFT_NAVIGATION_DATE = By.xpath("//div[@id='filter-date']/h4");
	public final static By LEFT_NAVIGATION_TAGS = By.xpath("//div[@id='filter-tags']/h4");
	public final static By LEFT_NAVIGATION_LANGUAGES = By.xpath("//div[@id='filter-languages']/h4");
	public final static By LEFT_NAVIGATION_RESET = By.id("reset-filters-button");
	//pagination elements
	public final static By PAGINATION_BUTTONS = By.xpath("//div[last()][@class='pagination-buttons']");
	public final static By PAGINATION_CURRENT_BUTTON = By.xpath("//div[last()]/span[@class='pagination-current pagination-number']");
	public final static By PAGINATION_GALLERY_TITLE = By.xpath("//div[@id='content']//h3[last()]");
	public final static By PAGINATION_NEXT_BUTTON = By.xpath("//div[last()]/a[@class='pagination-next pagination-button']");
	public final static By PAGINATION_PREVIOUS_BUTTON = By.xpath("//div[last()]/a[@class='pagination-prev pagination-button']");
	public final static By PAGINATION_FIRST_BUTTON = By.xpath("//div[last()]/a[@class='pagination-first pagination-button']");
	public final static By PAGINATION_LAST_BUTTON = By.xpath("//div[last()]/a[@class='pagination-last pagination-button']");
	public final static By PAGINATION_LAST_BUTTON_DISABLE = By.xpath("//div[last()]/span[@class='pagination-last disabled pagination-button']"); 
	public final static By CONTRIBUTE_BUTTON = By.id("contribute-button");
	//sorting elements
	public final static By SORTING_LIST = By.id("sort_by");
	public final static By SORTING_HIGH = By.xpath("//option[@value='rating-high']");
	public final static By SORTING_LOW = By.xpath("//option[@value='rating-low']");
	public final static By SORTING_NEW = By.xpath("//option[@value='date-new']");
	public final static By SORTING_OLD = By.xpath("//option[@value='date-old']");
	public final static By SORTING_POPULARITY_MOST = By.xpath("//option[@value='pop-most']");
	public final static By SORTING_POPULARITY_LEAST = By.xpath("//option[@value='pop-least']");
	public final static By SORTING_TALKED_MOST = By.xpath("//option[@value='most-talked-about']");
	public final static By SORTING_TALKED_LEAST = By.xpath("//option[@value='least-talked-about']");
	//test choice of each filter
	public final static By RATING_CHOICE = By.id("rating-5");
	public final static By DATE_CHOICE = By.id("date-2011");
	public final static By TAGS_CHOICE = By.id("tag-3");
	public final static By LANGUAGES_CHOICE = By.id("language-Java");
	public final static By RESET_CHOICE = By.id("reset-filters-button");	
	public final static int PAGINATION_TEST_PAGENUM_BUTTON = 2;
	//elements in 'add to code gallery' page
	public final static String ADD_CONTENT_TITLE = "Add to Code Gallery";
	public final static By ADD_CONTENT_TITLE_BY = By.xpath("//h1");
	public final static By ADD_TITLE = By.id("gallery_code_title");
	public final static By ADD_DESCRIPTION = By.id("gallery_code_description_markdown");
	public final static By ADD_IMAGE = By.id("gallery_code_image");
	public final static By ADD_FILE_UPLOAD = By.id("gallery_code_uploads");
	public final static By ADD_TAGS_LIST = By.id("autocomplete_gallery_code_tags_list");
	public final static By ADD_POPULAR_TAGS = By.xpath("//a[@class='popular-tags']");
	public final static By ADD_LANGUAGES_JAVA = getLanguage("Java");
	public final static By ADD_LANGUAGES_C_= getLanguage("C_");
	public final static By ADD_LANGUAGES_VB_NET = getLanguage("VB.NET");
	public final static By ADD_LANGUAGES_PHP = getLanguage("PHP");
	public final static By ADD_LANGUAGES_RUBY = getLanguage("Ruby");
	public final static By ADD_LANGUAGES_FLEX = getLanguage("Flash___Flex___ActionScript");
	public final static By ADD_LANGUAGES_PYTHON = getLanguage("Python");
	public final static By ADD_LANGUAGES_COLD_FUSION = getLanguage("Cold_Fusion");
	public final static By ADD_LANGUAGES_JS = getLanguage("JavaScript");
	public final static By ADD_LANGUAGES_OTHER = getLanguage("Other");
	public final static By ADD_CREATE_BUTTON = By.xpath("//input[@value='Create']");
	public final static By ADD_RESULT_FLAG = By.xpath("//div[@class='help']");
	//test for add code gallery
	public final static String ADD_TEST_TITLE = "test-moshen";
	public final static String ADD_TEST_DESCRIPTION = "THIS IS A TEST!";
	public final static By ADD_TEST_TAG = By.xpath("//a[@title='7 items tagged with Genesis']");
	public final static By ADD_TAGS_CLICKABLE = By.xpath("//div[@style='display: block;']");
	public static By getTestPageNum(int num)
	{
		num = num-1;
		return By.xpath("//div[last()]/a[@class='pagination-number']["+num+"]");
	}
	public static By getCurrentPageNum(int num)
	{
		return By.xpath("//div[last()][@class='pagination-buttons']/span[text()="+num+"]");
	}
	public static By getLanguage(String language)
	{
		return By.id("gallery_code_languages_"+language);
	}
}
