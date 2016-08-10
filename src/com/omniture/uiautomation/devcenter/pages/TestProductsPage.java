package com.omniture.uiautomation.devcenter.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;

import com.omniture.uiautomation.devcenter.ui.DevCenterUI;
import com.omniture.uiautomation.devcenter.ui.MyProductsUI;

public class TestProductsPage extends DevCenterPage{

	public void assertPageDisplay(){
		this.assertTitle(DevCenterUI.titleOfGenesisPage, DevCenterUI.GENESIS_DEFAULT_TITLE);
		this.assertElementExists(DevCenterUI.companyDropDown);
		this.assertElementExists(MyProductsUI.addProductLink);
		//this.assertElementExists(MyProductsUI.ProductName);		
	}
	
	public void addProduct(String name){
		this.click(MyProductsUI.addProductLink);
		this.sleep(5000);
		this.waitUntilPageLoad();
		this.assertTitle(MyProductsUI.titleOfAddProductPage, MyProductsUI.ADDPRODUCT_TITLE);
		this.assertElementExists(MyProductsUI.informationTab);
		this.type(MyProductsUI.productNameTextbox, name);
		this.type(MyProductsUI.productVersionTextbox,"1.0");
		this.type(MyProductsUI.technicalContactNameTextbox, "shichen");
		this.type(MyProductsUI.technicalContactEmailTextbox, "shichen@adobe.com");
		this.type(MyProductsUI.customerSupportEmailTextbox, "shichen@adobe.com");
		this.sleep(5000);
		this.click(MyProductsUI.saveButton);
		this.waitUntilElement(MyProductsUI.addProductLink);
		}
	
	public void assertProductAddedSuccessful(String name){
		this.sleep(5000);
		this.assertTitle(MyProductsUI.successfulMessage, MyProductsUI.ADDPRODUCT_MESSAGE);
		this.assertElementExists(MyProductsUI.getProductName(name));
		this.assertElementExists(MyProductsUI.editProductButton(name));
		this.assertElementExists(MyProductsUI.deleteProductButton(name));
	}
	
	public void editProduct(String name){
		
			this.click(MyProductsUI.productActionButton);
			this.click(MyProductsUI.editProductButton(name));
			
		//to handle an exception occurs in ie browser
			try {
				this.waitUntilPageLoad();
			} catch (UnhandledAlertException e) {
				this.getLocator().alert().dismiss();
			}
			
			this.sleep(5000);
		
		
		//check page ui
		ArrayList<By> list = new ArrayList<By>();
		list.add(MyProductsUI.informationTab);
		list.add(MyProductsUI.variableTab);
		list.add(MyProductsUI.scriptTab);
		list.add(MyProductsUI.resourceTab);
		list.add(MyProductsUI.accessTab);
		list.add(MyProductsUI.authTab);
		list.add(MyProductsUI.reportTab);
		list.add(MyProductsUI.faqTab);
		this.assertElementsExist(list);
		
		//variable tab
		this.click(MyProductsUI.variableTab);
		this.assertElementExists(MyProductsUI.addVariableLink);
		
		//add a variable
		this.click(MyProductsUI.addVariableLink);
		this.waitUntilElement(MyProductsUI.addVariableWindow);
		this.type(MyProductsUI.variableName, "test variable");
		this.selectByValue(MyProductsUI.variableType, "prop");
		this.selectByValue(MyProductsUI.requiredDropDown, "yes");
		this.selectByValue(MyProductsUI.accessDropDown, "import");
		this.click(MyProductsUI.saveButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.ADD_VARIABLE_MESSAGE);
		
		//delete a variable
		this.click(MyProductsUI.deleteButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.DELETE_VARIABLE_MESSAGE);
		
		//resource tab
		this.click(MyProductsUI.resourceTab);
		this.assertElementExists(MyProductsUI.addResourceLink);
		
		//add a resource
		this.click(MyProductsUI.addResourceLink);
		this.waitUntilElement(MyProductsUI.addResourceWindow);
		this.type(MyProductsUI.resourceName, "test resource");
		this.type(MyProductsUI.resourceDescription, "resource just for testing");
		this.type(MyProductsUI.linkUrl, "www.yahoo.com");
		this.click(MyProductsUI.saveButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.ADD_RESOURCE_MESSAGE);
		
		//delete a resource
		this.click(MyProductsUI.deleteButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.DELETE_RESOURCE_MESSAGE);
		
		//access tab
		this.click(MyProductsUI.accessTab);
		this.assertElementExists(MyProductsUI.addAccessLink);
		
		//add access
		this.click(MyProductsUI.addAccessLink);
		this.waitUntilElement(MyProductsUI.addAccessWindow);
		this.selectByValue(MyProductsUI.accessElement, "browser_type");
		this.click(MyProductsUI.saveButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.ADD_ACCESS_MESSAGE);
		
		//delete access
		this.click(MyProductsUI.deleteButton);
		this.waitUntilElement(DevCenterUI.successfulMessage);
		this.assertElementTextContain(DevCenterUI.successfulMessage, MyProductsUI.DELETE_ACCESS_MESSAGE);
		
		//script tab
		this.click(MyProductsUI.scriptTab);
		this.assertElementExists(MyProductsUI.addScriptLink);
		
		//auth tab
		this.click(MyProductsUI.authTab);
		this.assertElementExists(MyProductsUI.typeDropDown);
		this.assertElementExists(MyProductsUI.addAuthLink);
		this.assertElementExists(MyProductsUI.testAuthButton);
		
		//report tab
		this.click(MyProductsUI.reportTab);
		this.assertElementExists(MyProductsUI.addBookmarkLink);
		this.assertElementExists(MyProductsUI.addDashboardLink);
		
		//faq tab
		this.click(MyProductsUI.faqTab);
		this.assertElementExists(MyProductsUI.addFAQLink);
		
		
	}
	
	public void deleteProduct(String name){
		this.waitUntilElement(MyProductsUI.getProductName(name));
		this.click(MyProductsUI.productActionButton);
		this.click(MyProductsUI.deleteProductButton(name));
		this.sleep(5000);
		this.getLocator().alert().accept();
		this.waitUntilPageLoad();
	}
	
	public void assertProductDeletedSuccessful(String name){
		this.assertElementNotExists(MyProductsUI.deleteProductButton(name));
		
	}
	
	
	
	
	
}
