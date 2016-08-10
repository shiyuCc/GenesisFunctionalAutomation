package com.omniture.uiautomation.devcenter.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.omniture.uiautomation.devcenter.ui.CustomerSupportUI;
import com.omniture.uiautomation.devcenter.ui.DevCenterUI;


public class CustomerSupportPage extends DevCenterPage{
	
	public void assertPageDisplay(){
		this.assertTitle(DevCenterUI.titleOfPage, DevCenterUI.CUSTOMER_SUPPORT_TITLE);
		this.assertElementExists(DevCenterUI.companyDropDown);
		this.assertElementExists(CustomerSupportUI.ticketStatus);
		this.assertElementExists(CustomerSupportUI.activityTab);
		this.assertElementExists(CustomerSupportUI.incidentTab);
		
		this.click(CustomerSupportUI.activityTab);
		ArrayList<By> list = new ArrayList<By>();
		list.add(CustomerSupportUI.dataInTab);
		list.add(CustomerSupportUI.dataOutTab);
		list.add(CustomerSupportUI.changeLogTab);
		list.add(CustomerSupportUI.dateLimit);
		list.add(CustomerSupportUI.logInfo);
		
		this.assertElementsExist(list);
		
	}

}
