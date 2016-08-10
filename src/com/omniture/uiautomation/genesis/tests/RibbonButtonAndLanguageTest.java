package com.omniture.uiautomation.genesis.tests;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.genesis.GenesisTest;
import com.omniture.uiautomation.genesis.ui.GenesisConsoleUI;
import com.omniture.uiautomation.utils.ScreenShotUtil;


public class RibbonButtonAndLanguageTest extends GenesisTest {
	
	@Test
	public void testRibbonButtonAndLanguage() {
		String pathPrefix = ScreenShotUtil.getInstance().getTimeName()+"RibbonButtonAndLanguageTest\\";
		HashMap<String,String> languageToChinese = new HashMap<String,String>();
		languageToChinese.put("support", "技术支持");
		languageToChinese.put("configure", "配置");
		
		String wizardName = helper.generateUniqueName();
		integrationPage.navigateToAddIntegration();
		integrationPage.dragProdcut("Facebook Demographics for Apps and Websites");
		this.addToBeCleanObject(wizardName);
		wizardPage.performFacebook(wizardName,"Age","eVar 1");
		
		consolePage.navigateToConsole();
		if(!consolePage.checkLanguage("en_US"))
			consolePage.switchLanguage("en_US");
		
		consolePage.assertBasicConsoleDisplay(pathPrefix);
		
		//Click "Browse Showcase" button in the right of ribbon bar	Check page turn to showcase page. Check page turn to showcase page.
		consolePage.click(GenesisConsoleUI.BROWSE_SHOWCASE_IN_RIBBON_BUTTON);
		consolePage.waitUntilPageLoad();
		showcasePage.assertShowcasePage(pathPrefix);
		
		//Navigate to console page	
		consolePage.navigateToConsole();
		
		//Click "+Add New" button in the right of ribbon bar(If only a little integrations existed,the button will not display)	Check page turn to add integration page.
		//Check page turn to add integration page.
		
		
		ArrayList<By> waitList = new ArrayList<By>();
		waitList.add(GenesisConsoleUI.ADD_NEW_IN_RIBBON_BUTTON);
		waitList.add(GenesisConsoleUI.ADD_NEW_IN_LEFT_RIBBON_BUTTON);
		WebElement shownButton = consolePage.waitUntilOneOfElements(waitList);
		
		//consolePage.waitUntilElement(GenesisConsoleUI.ADD_NEW_IN_RIBBON_BUTTON);
		
		//WebElement shownButton = consolePage.findElement(GenesisConsoleUI.ADD_NEW_IN_LEFT_RIBBON_BUTTON);
		
		shownButton.click();
		//consolePage.click(GenesisConsoleUI.ADD_NEW_IN_RIBBON_BUTTON);
		consolePage.waitUntilPageLoad();
		consolePage.sleep(10000);
		integrationPage.assertIntegrationPage(pathPrefix);
		
		consolePage.navigateToConsole();
		consolePage.switchLanguage("zh_CN");
		consolePage.assertBasicConsoleDisplay(languageToChinese,pathPrefix);
		
		consolePage.navigateToConsole();
		consolePage.switchLanguage("en_US");
	}
}