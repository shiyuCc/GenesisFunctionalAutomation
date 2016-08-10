package com.omniture.uiautomation.genesis.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.genesis.ui.GenesisWizardUI;

public class GenesisWizardPage extends GenesisPage{
	
	//used for common welcome page
	private void performWelcomePage()
	{
		this.waitUntilPageLoad();
		this.waitUntilElement(GenesisWizardUI.DIALOG_CONTAINER);
		this.assertElementExists(GenesisWizardUI.DIALOG_CONTAINER);
		this.waitUntilElement(GenesisWizardUI.PAYMENT_CHECK);
		this.assertElementExists(GenesisWizardUI.PAYMENT_CHECK);
		//this.getDriver().switchTo().window(this.getDriver().getWindowHandle());
		//System.out.println(this.findElement(GenesisWizardUI.PAYMENT_CHECK).isSelected());
		this.mouseTo(GenesisWizardUI.PAYMENT_CHECK);
	    this.click(GenesisWizardUI.PAYMENT_CHECK);
	    //System.out.println(this.findElement(GenesisWizardUI.PAYMENT_CHECK).isSelected());
		
	    this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
	    this.assertElementExists(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
	}
	
	//prepared for Optimost
	public void performOptimost(String wizardName)
	{
		performWelcomePage();
		//step1
		this.waitUntilElement(GenesisWizardUI.NAME_TEXT);
		this.clear(GenesisWizardUI.NAME_TEXT);
		this.type(GenesisWizardUI.NAME_TEXT, wizardName);
	
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//step2
		this.waitUntilElement(GenesisWizardUI.ACCOUNT_TEXT);
		this.clear(GenesisWizardUI.ACCOUNT_TEXT);
		this.type(GenesisWizardUI.ACCOUNT_TEXT, "abcdefg");
	
	    this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//step3
		this.waitUntilElement(GenesisWizardUI.PRIVACY_CHECK);
		this.click(GenesisWizardUI.PRIVACY_CHECK);
		this.sleep(100);

		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//step4
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		this.sleep(3000);
		
		//step5
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		this.sleep(3000);
		
		//step6
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		this.waitUntilPageLoad();
	}
	
	//prepared for facebook
	@SuppressWarnings("unchecked")
	public boolean performFacebook(String wizard,String product_metric,String siteCatalyst_eVar)
	{
		boolean dashboardCanBeTestedFlag = false;
		performWelcomePage();
		//Verify "report suite" "name textbox" "email textbox" display.
		ArrayList<By> list = new ArrayList<By>();
		list.add(GenesisWizardUI.MAIL_INPUT);
		list.add(GenesisWizardUI.REPORT_SUITE);
		list.add(GenesisWizardUI.NAME_TEXT);
		this.waitUntilElements(list);
		list.clear();
		this.assertElementExists(GenesisWizardUI.MAIL_INPUT);
		this.assertElementExists(GenesisWizardUI.REPORT_SUITE);
		this.assertElementExists(GenesisWizardUI.NAME_TEXT);
		
		//Enter <<<integration name>>> in "name text"
		
		this.clear(GenesisWizardUI.NAME_TEXT);
		
		this.type(GenesisWizardUI.NAME_TEXT, wizard);
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		
		//Click "next" button.
		this.click(GenesisWizardUI.NEXT_BUTTON);

		//Verify "Facebook Code Selection" block display. Click "PHP Measurement Library" radio button. Click "next" button.
		list.add(GenesisWizardUI.JS_RADIO);
		list.add(GenesisWizardUI.PHP_RADIO);
		this.waitUntilElements(list);
		list.clear();
		//this.sleep(100000);
		this.click(GenesisWizardUI.PHP_RADIO);
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//Verify "Facebook Metric" drop-down,"SiteCatalyst eVar" drop-down,
		//"How it will appear in SiteCatalyst  " textbox,"delete" button,"Add another metric" link display.
		list.add(GenesisWizardUI.METRIC_DROPDOWN);
		list.add(GenesisWizardUI.EVAR_DROPDOWN);
		list.add(GenesisWizardUI.HOW_APPEAR_INPUT);
		list.add(GenesisWizardUI.DELETE_METRIC_BUTTON);
		list.add(GenesisWizardUI.ADD_METRIC_BUTTON);
		this.waitUntilElements(list);
		list.clear();
		this.assertElementsExist(list);
		
		//Click "Facebook Metric" drop-down and select <<<metric1>>>, Click "SiteCatalyst eVar" and select <<<evar1>>>
		String metricValue = product_metric.toLowerCase();
		String evarValue = siteCatalyst_eVar.replace(" ", "");
		this.selectByValue(GenesisWizardUI.METRIC_DROPDOWN, metricValue);
		this.selectByValue(GenesisWizardUI.EVAR_DROPDOWN, evarValue);
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//Verify checkbox display. Check whether checkbox exist,if yes,click checkbox and "next" button;if no,just click "next" button.
		//Check <<<integration name>>> display,<<<metric1>>>&<<<evar1>>> mapped
		/*
		 * the former implemention
		 */
		/*
		try
		{
			this.waitUntilElementClickable(GenesisWizardUI.DASHBOARD_CHECKBOX);
			this.click(GenesisWizardUI.DASHBOARD_CHECKBOX);
		}
		catch(Exception e)
		{
		}
		finally
		{
			this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
			this.click(GenesisWizardUI.NEXT_BUTTON);
		}
		*/
		
		/*
		 * The optimized one
		 */
		ArrayList<By> byList = new ArrayList<By>();
		byList.add(GenesisWizardUI.PICTURE_TO_WAIT_IN_WIZRD_STEP_FOUR);
		byList.add(GenesisWizardUI.DASHBOARD_CHECKBOX);
		this.waitUntilOneOfElements(byList);
		
		//this.waitUntilElement(GenesisWizardUI.PICTURE_TO_WAIT_IN_WIZRD_STEP_FOUR);
		List<WebElement> elelist = this.findElements(GenesisWizardUI.DASHBOARD_CHECKBOX);
		if(!elelist.isEmpty())
		{
			dashboardCanBeTestedFlag = true;
			this.waitUntilElementClickable(GenesisWizardUI.DASHBOARD_CHECKBOX);
			this.click(GenesisWizardUI.DASHBOARD_CHECKBOX);
		}
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		this.waitUntilElement(GenesisWizardUI.INTEGRATION_NAME);
		this.assertElementsTextContain(GenesisWizardUI.INTEGRATION_NAME, wizard);
		this.assertElementsTextContain(GenesisWizardUI.INTEGRATION_NAME, product_metric);
		this.assertElementsTextContain(GenesisWizardUI.INTEGRATION_NAME, siteCatalyst_eVar);
		
		//Click "save" button
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		//verify "You have successfully configured the Facebook Demographics for Apps and Websites integration in the current report suite. " display.
		//Click "finish" button.
		this.waitUntilElement(GenesisWizardUI.HINT_TEXT);
		this.sleep(2000);
		this.assertElementTextContain(GenesisWizardUI.HINT_TEXT, "successfully");
		this.waitUntilElementClickable(GenesisWizardUI.NEXT_BUTTON);
		//sleep until the button is clickable.
		this.sleep(500);
		this.click(GenesisWizardUI.NEXT_BUTTON);
		
		return dashboardCanBeTestedFlag;
	}
}
