package com.omniture.uiautomation.devconn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.omniture.uiautomation.devconn.ui.APIExplorerUI;

public class APIExplorerPage extends DevConPage{

	public void fillUsername(String userName)
	{
		this.clear(APIExplorerUI.USERNAME);
		this.type(APIExplorerUI.USERNAME,
				userName);	
	}
	public void fillSecret(String secret)
	{
		this.clear(APIExplorerUI.SECRET);
		this.type(APIExplorerUI.SECRET,
				secret);
	}
	public void selectAPI(String apiSelect)
	{
		this.selectByValue(APIExplorerUI.API_LIST, apiSelect);
	}
	public void selectMethod(String methodSelect)
	{
		this.selectByValue(APIExplorerUI.METHOD_LIST, methodSelect);
	}
	public void selectEnvironment(String environment)
	{
		this.selectByValue(APIExplorerUI.ENVIRONMENT_LIST, environment);
	}
	public void selectREST()
	{
		this.click(APIExplorerUI.REQUEST_REST);
	}
	public void selectSOAP()
	{
		this.click(APIExplorerUI.REQUEST_SOAP);
	}
	public void fillparameter()
	{
		
	}
	public void fillContent(String content)
	{
		this.clear(APIExplorerUI.REQUEST_TEXT);
		this.type(APIExplorerUI.REQUEST_TEXT,
				content);
	}
	public void checkResult()
	{
	//	String content;
	//	WebElement element = findElement(APIExplorerUI.REQUEST_RESULT);
	//	content = element.getText();
	//	this.assertElementTextNotContain(APIExplorerUI.REQUEST_RESULT, "errors");
	}
}
