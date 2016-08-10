package com.omniture.uiautomation.devcenter.ui;

import org.openqa.selenium.By;

public class Scene7UI extends DevCenterUI{
	
	public static By getLink(String linkName){
		
		return By.xpath("//td/a[.='"+linkName+"']");
		
	}
	
	public static By flashSDK = getLink("Flash SDK Version 3.3.1");
	public static By html5SDKForWin = getLink("HTML5 SDK Version 2.0.3 (WIN)");
	public static By html5SDKForMac = getLink("HTML5 SDK Version 2.0.3 (MAC)");
	public static By scene7SolutionForWin = getLink("Scene7 Solutions Accelerator SDK 1.0.145907 for Windows");
	public static By scene7SolutionForMac = getLink("Scene7 Solutions Accelerator SDK 1.0.145907 for OSX");
	
}
