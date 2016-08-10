package com.omniture.uiautomation.devconn.tests;

import org.junit.Test;

import com.omniture.uiautomation.devconn.pages.DevConPage;
import com.omniture.uiautomation.devconn.ui.DevConUI;
import com.omniture.uiautomation.tests.DeveloperTest;


public class DevConTest extends DeveloperTest{
	DevConPage devConPage = new DevConPage();
	@Test
	public void testLogin()
	{
		devConPage.login();
		devConPage.assertDevConDisplay();
		devConPage.logout();
		devConPage.assertDevConDisplay();
	}
	@Test
	public void testSearch()
	{		
		devConPage.navToHomePage();
		devConPage.waitUntilPageLoad();
		devConPage.assertDevConDisplay();
		devConPage.click(DevConUI.SEARCH_BOX);
		devConPage.clear(DevConUI.SEARCH_BOX);
		devConPage.type(DevConUI.SEARCH_BOX,
				DevConUI.SEARCH_BOX_TEST);
		devConPage.findElement(DevConUI.SEARCH_BOX).submit();
		devConPage.waitUntilPageLoad();
		devConPage.assertDevConDisplay();

	}
	@Test
	public void testFootbar()
	{
		devConPage.navToHomePage();
		devConPage.waitUntilPageLoad();
		devConPage.assertDevConDisplay();
		devConPage.assertFootbar(DevConUI.FOOTBAR_DOCUMENTATION);
		devConPage.assertFootbar(DevConUI.FOOTBAR_GET_STARTED);
		devConPage.assertFootbar(DevConUI.FOOTBAR_GALLERY);
		devConPage.assertFootbar(DevConUI.FOOTBAR_BLOG);
		devConPage.assertFootbar(DevConUI.FOOTBAR_FORUM);
	}
	@Test
	public void testLanguage()
	{
		devConPage.navToHomePage();
		devConPage.waitUntilPageLoad();
		devConPage.assertDevConDisplay();
		devConPage.switchLanguage(DevConUI.LANGUAGE_ENGLISH_URL);
		devConPage.assertLanguageSwithed("Gallery","Login","Get Started","FORUM");
		devConPage.switchLanguage(DevConUI.LANGUAGE_GERMAN_URL);
		devConPage.assertLanguageSwithed("Galerie","Anmeldung","Erste Schritte","FORUM");
		devConPage.switchLanguage(DevConUI.LANGUAGE_SPANISH_URL);
		devConPage.assertLanguageSwithed("Galería","Usuario","Comenzar","FORO");
		devConPage.switchLanguage(DevConUI.LANGUAGE_FRENCH_URL);
		devConPage.assertLanguageSwithed("Galerie","Connexion","Mise en route","FORUM");
		devConPage.switchLanguage(DevConUI.LANGUAGE_PORTUGUESE_URL);
		devConPage.assertLanguageSwithed("Galeria","Login","Introdução","FÓRUM");
		devConPage.switchLanguage(DevConUI.LANGUAGE_JAPANESE_URL);
		devConPage.assertLanguageSwithed("ギャラリー","ログイン","使用の開始","フォーラム");
		devConPage.switchLanguage(DevConUI.LANGUAGE_KOREAN_URL);
		devConPage.assertLanguageSwithed("갤러리","로그인","Enterprise API","포럼");
		devConPage.switchLanguage(DevConUI.LANGUAGE_SIMPLE_CHINESE_URL);
		devConPage.assertLanguageSwithed("库","登录","入门","论坛");
		devConPage.switchLanguage(DevConUI.LANGUAGE_TRADITIONAL_CHINESE_URL);
		devConPage.assertLanguageSwithed("庫","登入","快速入門","論壇");

	}
}
