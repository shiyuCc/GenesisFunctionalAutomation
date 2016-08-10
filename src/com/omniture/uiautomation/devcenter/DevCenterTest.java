package com.omniture.uiautomation.devcenter;


import org.junit.After;
import org.junit.Before;

import com.omniture.uiautomation.framework.SeleniumTest;
import com.omniture.uiautomation.pages.DeveloperPage;
import com.omniture.uiautomation.tests.DeveloperTest;;

	public class DevCenterTest extends DeveloperTest{
		
	public DevCenterTest() {
		
	}

	@Before
	public void setUp() {
		super.setUp();
		
		DeveloperPage dp = new DeveloperPage();
		if(dp.isLogined()==false)
			dp.login();		
	}
	
	@After
	public void tearDown() {
		// clean up
		
		super.tearDown();
	}
	

}
