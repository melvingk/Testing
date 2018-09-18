package com.qa.shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dress {
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/h1/span[1]")
	private WebElement  dresssItem;
	
	public WebElement dressItem()
	{
		return dresssItem; 
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div/div[2]/h5/a")
	private WebElement dresspic;
	
	public WebElement dressPic()
	{
		return dresspic;
	}

}
