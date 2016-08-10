package com.omniture.uiautomation.devcenter.ui;

import org.openqa.selenium.By;

public class MyProductsUI extends DevCenterUI{
	public static By addProductLink = By.cssSelector("div.add_prod_div");
	public static String ADDPRODUCT_MESSAGE = "Your product was created successfully";
	public static By successfulMessage = By.xpath("//div[@id='content']/div");
	public static By productActionButton = By.cssSelector("img.action_dd_image");
	
	public static By getProductName(String productName){
		return By.xpath("//div[@class='product_card_toolbar' and contains(.,'"+productName+"')]");
	}
	
	public static By editProductButton(String productName){
		return By.xpath("//div[@class='product_card_toolbar' and contains(.,'"+productName+"')]/div/div/div/ul/li/a/span[.='Edit']");
	}
	
	public static By deleteProductButton(String productName){
		return By.xpath("//div[@class='product_card_toolbar' and contains(.,'"+productName+"')]/div/div/div/ul/li/a/span[.='Delete']");
	}
	
	//Add Product UI
	public static String ADDPRODUCT_TITLE = "Add Product";
	public static By titleOfAddProductPage = By.xpath("//div[@class='content_header tabs']/h1");
	
	public static By productNameTextbox = By.xpath("//input[@id='prod_name']");
	public static By productVersionTextbox = By.xpath("//input[@id='prod_version']");
	public static By technicalContactNameTextbox = By.xpath("//input[@id='contact_name']");
	public static By technicalContactEmailTextbox = By.xpath("//input[@id='contact_email']");
	public static By customerSupportEmailTextbox = By.xpath("//input[@id='support_email']");
	public static By saveButton = By.xpath("//button[.='Save']");
	
	//Edit Product UI
	public static By getTab(String tabName){
		return By.xpath("//div[.='"+tabName+"']");
	}
	
	public static By informationTab = getTab("Information");
	public static By variableTab = getTab("Variables (0)");
	public static By scriptTab = getTab("Scripts (0)");
	public static By resourceTab = getTab("Resources (0)");
	public static By accessTab = getTab("Access (0)");
	public static By authTab = getTab("Auth");
	public static By reportTab = getTab("Reports");
	public static By faqTab = getTab("FAQs (0)");
	
	//variable tab ui
	public static By addVariableLink = By.xpath("//a[.='Add Variable']");
	public static By addVariableWindow = By.cssSelector("div.chrome");
	public static By variableName = By.xpath("//input[@name='variableName']");
	public static By variableType = By.xpath("//select[@name='variableType']");
	public static By requiredDropDown = By.xpath("//select[@name='required']");
	public static By accessDropDown = By.xpath("//select[@name='access']");
	public static By subVariableBox = By.cssSelector("div.aside evar_boxes_div");
	public static By subVariableType = By.xpath("//img[@name='custom']");
	public static By deleteButton = By.xpath("//img[@title='Delete']");
	
	public static String ADD_VARIABLE_MESSAGE = "Variable successfully created";
	public static String DELETE_VARIABLE_MESSAGE = "Variable successfully deleted";
	
	//script tab ui
	public static By addScriptLink = By.xpath("//a[.='Add Script']");
	
	//resource tab ui
	public static By addResourceLink = By.xpath("//a[.='Add Resource']");
	public static By addResourceWindow = By.cssSelector("div.chrome");
	public static By resourceName = By.xpath("//input[@id='title_edit']");
	public static By resourceDescription = By.xpath("//input[@id='description_edit']");
	public static By linkUrl = By.xpath("//input[@id='linkUrl_edit']");
	
	public static String ADD_RESOURCE_MESSAGE = "Resource successfully created";
	public static String DELETE_RESOURCE_MESSAGE = "Resource successfully deleted";
	
	//access tab ui
	public static By addAccessLink = By.xpath("//a[.='Add Access Request']");
	public static By addAccessWindow = By.cssSelector("div.chrome");
	public static By accessElement = By.xpath("//select[@id='access_new_element']");
	
	public static String ADD_ACCESS_MESSAGE = "Successfully created access request";
	public static String DELETE_ACCESS_MESSAGE = "Access request successfully deleted";
	
	//auth tab ui
	public static By typeDropDown = By.xpath("//select[@name='authType']");
	public static By addAuthLink = By.xpath("//a[.='Add Authentication Parameter']");
	public static By testAuthButton = By.xpath("//button[@id='test_auth']");
	
	//report tab ui
	public static By addDashboardLink = By.xpath("//a[.='Add Dashboard']");
	public static By addBookmarkLink = By.xpath("//a[.='Add Bookmark']");
	
	//faq tab ui
	public static By addFAQLink = By.xpath("//a[.='Add FAQ']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
