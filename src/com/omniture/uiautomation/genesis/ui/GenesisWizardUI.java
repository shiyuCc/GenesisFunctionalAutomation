package com.omniture.uiautomation.genesis.ui;

import org.openqa.selenium.By;

public class GenesisWizardUI extends GenesisUI{

	//defined for common use
	public static By WIZARD_WINDOW = By.cssSelector("div.dialog.container");
	public static By PAYMENT_CHECK = By.name("accept_payment");
	public static By NEXT_BUTTON = By.xpath("//button[@class='default' or @class=' default']");
	
	//defined for Optimost
	public static By NAME_TEXT = By.id("name_txt");
	public static By ACCOUNT_TEXT = By.id("account_id");
	public static By PRIVACY_CHECK = By.id("privacy_notice");
	
	//defined for Facebook
	//dialog container. when activate, class name changes from dialog container hidden to dialog container
	public static By DIALOG_CONTAINER = By.xpath("//div[@class='dialog container']");
	public static By MAIL_INPUT = By.id("email");
	public static By REPORT_SUITE = By.name("wiz_rs_id");
	public static By JS_RADIO = By.id("code_type_js");
	public static By PHP_RADIO = By.xpath("//input[@id='code_type_php']");
	
	public static By METRIC_DROPDOWN = By.xpath("//td[@class='input_header']/select");
	public static By EVAR_DROPDOWN = By.id("evar_row_0");
	public static By HOW_APPEAR_INPUT = By.name("age_scname");
	public static By DELETE_METRIC_BUTTON = By.name("delete_btn");
	public static By ADD_METRIC_BUTTON = By.xpath("//div[@class='textcontainer']");
	public static By DASHBOARD_CHECKBOX = By.name("dashboards[2784]");
	public static By INTEGRATION_NAME = By.xpath("//td[@class='summary_info']");
	public static By HINT_TEXT = By.xpath("//td[@class='blk11']");
	
	//wait for picture show instead of checkbox in the 4th step of facebook wizard
	public static By PICTURE_TO_WAIT_IN_WIZRD_STEP_FOUR = By.cssSelector("img.wizard-right");
}
