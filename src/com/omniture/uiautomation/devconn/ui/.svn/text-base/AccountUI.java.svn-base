package com.omniture.uiautomation.devconn.ui;

import org.openqa.selenium.By;

public class AccountUI extends DevConUI {

	public static final By NOTICE_MESSAGE = By.xpath("//div[@class='notice message']");
	public static final By USER_LINK =  By.xpath("//a[@href='/"+getLanguageEnvironment()+"/my-account']");
	//left navigation
	public static final By LEFT_NAVIGATION = By.xpath("//ul[@id='sidenav']/li");
	public static final By UPDATE_PROFILE = getLeftNavigation("/edit");
	public static final By CHANGE_PASSWORD = getLeftNavigation("/password");
	public static final By VIEW_PROFILE = getLeftNavigation("");
	//view porfile
	public static final By VIEW_PROFILE_USERNAME = By.xpath("//h1");
	public static final By VIEW_PROFILE_USERINFO = By.xpath("//dl[@class='user-info']");
	//edit profile
	public static final String UPDATE_PROFILE_TITLE = "Edit Profile";
	public static final By UPDATE_PROFILE_ICON = By.id("sf_guard_user_icon");
	public static final By UPDATE_PROFILE_NICKNAME = By.id("sf_guard_user_nickname");
	public static final By UPDATE_PROFILE_EMAIL = By.id("sf_guard_user_email_address");
	public static final By UPDATE_PROFILE_FIRST_NAME = By.id("sf_guard_user_first_name");
	public static final By UPDATE_PROFILE_LAST_NAME = By.id("sf_guard_user_last_name");
	public static final By UPDATE_PROFILE_BLOG = By.id("sf_guard_user_blog_rss_feed");
	public static final By UPDATE_PROFILE_SELECTIONS = By.xpath("//fieldset/ul[@class='checkbox_list']");
	public static final By UPDATE_PROFILE_RELATIONSHIP = By.id("sf_guard_user_relationship");
	public static final By UPDATE_PROFILE_COMPANY = By.id("sf_guard_user_company_name");
	public static final By UPDATE_PROFILE_JOB = By.id("sf_guard_user_job_title");
	public static final By UPDATE_PROFILE_DEPARTMENT = By.id("sf_guard_user_relationship");
	public static final By UPDATE_PROFILE_INDUSTRY = By.id("sf_guard_user_department_function");
	public static final By UPDATE_PROFILE_WEBSITE = By.id("sf_guard_user_industry");
	public static final By UPDATE_PROFILE_MARKET = By.id("sf_guard_user_website");
	public static final By UPDATE_PROFILE_BUSINESS = By.id("sf_guard_user_key_markets");
	public static final By UPDATE_PROFILE_REVENUE = By.id("sf_guard_user_business_description");
	public static final By UPDATE_PROFILE_ADDRESS = By.id("sf_guard_user_yearly_revenue");
	public static final By UPDATE_PROFILE_ADDRESS2 = By.id("sf_guard_user_address");
	public static final By UPDATE_PROFILE_CITY = By.id("sf_guard_user_address2");
	public static final By UPDATE_PROFILE_STATE = By.id("sf_guard_user_state");
	public static final By UPDATE_PROFILE_ZIP = By.id("sf_guard_user_zip");
	public static final By UPDATE_PROFILE_STUDENT = By.id("sf_guard_user_is_student");
	public static final By UPDATE_PROFILE_WEB_SERVIECE_USERNAME = By.id("sf_guard_user_web_services_username");
	public static final By UPDATE_PROFILE_WEB_SERVIECE_NAME = By.id("sf_guard_user_web_services_shared_secret");
	public static final By UPDATE_PROFILE_SAVE = By.xpath("//input[@class='button']");
	
	//change password
	public static final By PASSWORD_TEXTBOX = By.id("sf_guard_user_password");
	public static final By PASSWORD_AGAIN_TEXTBOX = By.id("sf_guard_user_password_again");
	public static final By PASSWORD_SAVE = By.id("register-button");
	
	
	public static By getLeftNavigation(String tag)
	{
		return By.xpath("//ul[@id='sidenav']/li//a[@href='/"+getLanguageEnvironment()+"/my-account"+tag+"']");
	}
}
