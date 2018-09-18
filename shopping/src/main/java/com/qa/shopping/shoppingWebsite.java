package com.qa.shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class shoppingWebsite {
	
	@FindBy(id="search_query_top")
	private WebElement searchbox;
	
	public void searchFor (String text)
	{
		searchbox.sendKeys(text);
		searchbox.submit();
	}
	
	
	

}
