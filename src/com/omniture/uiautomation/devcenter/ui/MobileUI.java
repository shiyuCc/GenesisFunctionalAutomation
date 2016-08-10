package com.omniture.uiautomation.devcenter.ui;

import org.openqa.selenium.By;

public class MobileUI extends DevCenterUI{
	
	//Link in pro env
	public static By iOSLink = By.xpath("//li/a[.='iOS (iPhone, iPad, iPod)']");
	public static By androidLink = By.xpath("//li/a[.='Android']");
	public static By symbianLink = By.xpath("//li/a[.='Symbian']");
	
	//Links in beta env
	public static By publicDownload = By.xpath("//a[.='Public Download']");
	public static By authenticationDownload = By.xpath("//a[.='Authentication Required Download']");
	public static By mobileDownload = By.xpath("//a[.='Mobile Required Download']");
	public static By appForIOS = By.xpath("//a[.='App Measurement for iOS']");
	public static By appForAndroid = By.xpath("//a[.='App Measurement for Android']");
}
