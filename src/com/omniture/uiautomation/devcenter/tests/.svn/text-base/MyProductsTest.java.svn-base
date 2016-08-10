package com.omniture.uiautomation.devcenter.tests;

import org.junit.Test;

import com.omniture.uiautomation.devcenter.DevCenterTest;
import com.omniture.uiautomation.devcenter.pages.TestProductsPage;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.ui.DeveloperUI;

public class MyProductsTest extends DevCenterTest{
	
	TestProductsPage testProductsPage = new TestProductsPage();
	@Test
	
	public void testMyProductsPage(){
		
		String name = helper.generateUniqueName();
		this.addToBeCleanObject(name);
		
		testProductsPage.navToHomePage();
		testProductsPage.navTo(DeveloperUI.DEV_CENTER);
		testProductsPage.navToLeftTab(DevCenterUI.GENESIS);
		testProductsPage.assertPageDisplay();
		testProductsPage.addProduct(name);
		testProductsPage.assertProductAddedSuccessful(name);
		testProductsPage.editProduct(name);
		testProductsPage.navToLeftTab(DevCenterUI.GENESIS);
		testProductsPage.deleteProduct(name);
		testProductsPage.assertProductDeletedSuccessful(name);
		
	}
	
	@Override
	public void clean(Object obj) {
		String s = obj.toString();
		testProductsPage.deleteProduct(s);
		testProductsPage.waitUntilPageLoad();
	}

}