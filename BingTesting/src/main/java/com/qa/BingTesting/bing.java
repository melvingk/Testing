package com.qa.BingTesting;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class bing {
	
	@FindBy(id="sb_form_q")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"sb_form_go\"]")
	private WebElement searchButton;
	
	public void searchFor (String text)
	{
		searchbox.sendKeys(text);
		searchbox.submit();
	}
	

}
